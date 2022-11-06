package com.proyectofinal.fides_rca;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.proyectofinal.fides_rca.interfaces.ObservacionApiService;
import com.proyectofinal.fides_rca.interfaces.RegistroApiService;
import com.proyectofinal.fides_rca.persistence.ObservacionesDTO;
import com.proyectofinal.fides_rca.persistence.RegistrosDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Listar extends AppCompatActivity {


    //Menu lateral
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.inicio:
                i = new Intent(getApplicationContext(), Principal.class);
                return true;
            case R.id.ingresar:
                i = new Intent(getApplicationContext(), Registrar.class);
                return true;
            case R.id.modificar:
                i = new Intent(getApplicationContext(), Modificar.class);
                startActivity(i);
                return true;
            case R.id.listar:
                i = new Intent(getApplicationContext(), Listar.class);
                startActivity(i);
                return true;
            case R.id.ayuda:
                i = new Intent(getApplicationContext(), Ayuda.class);
                startActivity(i);
                return true;
            case R.id.info:
                i = new Intent(getApplicationContext(), Informacion.class);
                startActivity(i);
                return true;
            case R.id.usuario:
                i = new Intent(getApplicationContext(), Usuario.class);
                startActivity(i);
                return true;
            case R.id.salir:
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                //finish();
                return true;

            //default:
        }
        return super.onOptionsItemSelected(item);
    }
    ////////////////////////////////////////////////////////////////////////////////
    ListView lstReg;
    TextView txtDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);

        lstReg = (ListView) findViewById(R.id.lstReg);
        txtDatos = (TextView) findViewById(R.id.txtDatos);

        getRegistros();

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private void getRegistros(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getResources().getString(R.string.baseURL))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RegistroApiService registroApiService = retrofit.create(RegistroApiService.class);
        Call<List<RegistrosDTO>> call = registroApiService.getDatosRegistros();


        call.enqueue(new Callback<List<RegistrosDTO>>() {
            @Override
            public void onResponse(Call<List<RegistrosDTO>> call, Response<List<RegistrosDTO>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(Listar.this, "Error de conexion", Toast.LENGTH_LONG).show();
                    return;
                }
                List<RegistrosDTO> registroList = response.body();
                for(RegistrosDTO registro: registroList){
                    String content = "";
                    content += "Id:"+ registro.getIdRegistro()+"\n";
                    content += "Parametro: "+ registro.getParametro()+"\n";
                    content += "Casillas: "+ registro.getIdCasillaNombre()+"\n";
                    content += "Formulario: "+ registro.getIdFormularioNombre()+"\n";
                    content += "Unidad: "+ registro.getUnidad_medida()+"\n";
                    content += "Valor: "+ registro.getValor()+"\n";
                    content += "Localidad: "+ registro.getIdLocalidadNombre()+"\n";
                    content += "Fecha: "+ registro.getFechaHoraString()+"\n";
                    content += "----------------------------------------\n";

                    txtDatos.append(content);

                }
            }

            @Override
            public void onFailure(Call<List<RegistrosDTO>> call, Throwable t) {
                Toast.makeText(Listar.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
