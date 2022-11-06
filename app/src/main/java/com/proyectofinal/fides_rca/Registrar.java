package com.proyectofinal.fides_rca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.proyectofinal.fides_rca.interfaces.CasillaApiService;
import com.proyectofinal.fides_rca.interfaces.FormularioApiService;
import com.proyectofinal.fides_rca.persistence.CasillasDTO;
import com.proyectofinal.fides_rca.persistence.FormularioDTO;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Registrar extends AppCompatActivity {

    ArrayList<FormularioDTO> listaFormulario = new ArrayList<>();
    ArrayList<CasillasDTO> listaCasilla = new ArrayList<>();

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
                startActivity(i);
                return true;
            case R.id.ingresar:
                i = new Intent(getApplicationContext(), Registrar.class);
                startActivity(i);
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
    Spinner spForm;
    Spinner spCasilla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        spForm = (Spinner) findViewById(R.id.spinnerFormulario);
        //Spinner spParam = (Spinner) findViewById(R.id.spinnerParametro);
        //Spinner spUnidad = (Spinner) findViewById(R.id.spinnerUnidad);
        spCasilla =  (Spinner) findViewById(R.id.spinnerCasilla);
        //Spinner spLocalidad = (Spinner) findViewById(R.id.spinnerLocalidad);
        EditText txtVal = (EditText) findViewById(R.id.txtValor);
        EditText txtParam = (EditText) findViewById(R.id.txtParam);
        EditText txtUnidad = (EditText) findViewById(R.id.txtUnidad);
        Button btnAceptar = (Button) findViewById(R.id.btnAceptar);
        Button btnCancelar = (Button) findViewById(R.id.btnCancelar);

        getFormularios();
        getCasillas();

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validamos informacion
                Boolean ingresoOK = true;

                if(spForm.getSelectedItem().toString() =="Seleccionar"){
                    Toast.makeText(Registrar.this, "Debe seleccionar un Formulario!", Toast.LENGTH_SHORT).show();
                    ingresoOK = false;
                }
                if(spCasilla.getSelectedItem().toString() =="Seleccionar"){
                    Toast.makeText(Registrar.this, "Debe seleccionar una Casilla!", Toast.LENGTH_SHORT).show();
                    ingresoOK = false;
                }
                /*if(spParam.getSelectedItem().toString() =="Seleccionar"){
                    Toast.makeText(Registrar.this, "Debe seleccionar un Parametro!", Toast.LENGTH_SHORT).show();
                    ingresoOK = false;
                }
                if(spUnidad.getSelectedItem().toString() =="Seleccionar"){
                    Toast.makeText(Registrar.this, "Debe seleccionar una unidad de medida!", Toast.LENGTH_SHORT).show();
                    ingresoOK = false;
                }*/
                if(txtParam.getText().toString().isEmpty()){
                    txtParam.setError("Dato obligatorio.");
                    ingresoOK = false;
                }
                if(txtUnidad.getText().toString().isEmpty()){
                    txtUnidad.setError("Dato obligatorio.");
                    ingresoOK = false;
                }
                if(txtVal.getText().toString().isEmpty()){
                    txtVal.setError("Dato obligatorio.");
                    ingresoOK = false;
                }
                /*if(spLocalidad.getSelectedItem().toString() =="Seleccionar"){
                    Toast.makeText(Registrar.this, "Debe seleccionar una unidad de medida!", Toast.LENGTH_SHORT).show();
                    ingresoOK = false;
                }*/

                //Creamos el Intent
                Intent intent =
                        new Intent(Registrar. this ,
                                Modificar.class);
                //Creamos la información a pasar entre actividades
                Bundle b = new Bundle();


                b.putString("Formulario", spForm.getSelectedItem().toString());
                for (FormularioDTO f:listaFormulario) {
                    if(f.getNombre().trim()==spForm.getSelectedItem().toString().trim()){
                        b.putLong("FormularioId", f.getIdFormulario());
                    }
                }
                b.putString("Casillas", spCasilla.getSelectedItem().toString());
                for (CasillasDTO c:listaCasilla) {
                    if(c.getNombre().trim()==spCasilla.getSelectedItem().toString().trim()){
                        b.putLong("CasillasId", c.getId());
                    }
                }
                b.putString("Parametro", txtParam.getText().toString());
                b.putString("Unidad", txtUnidad.getText().toString());
                b.putString("Valor", txtVal.getText().toString());
                /*b.putString("Localidad", spLocalidad.getSelectedItem().toString());
                for (LocalidadDTO l:listaLocalidad) {
                    if(l.getNombre().trim()==spinnerL.getSelectedItem().toString().trim()){
                        b.putLong("LocalidadId",l.getId());
                    }
                }*/
                /*b.putString("Criticidad", spinnerCr.getSelectedItem().toString());
                for (CriticidadDTO cr:listaCriticidad) {
                    if(cr.getNombre().trim()==spinnerCr.getSelectedItem().toString().trim()){
                        b.putLong("CriticidadId",cr.getIdCriticidad());
                    }
                }*/

                //Añadimos la información al intent
                intent.putExtras(b);
                if(ingresoOK== true){
                    startActivity(intent);
                }




            }



        });
    }

    //cargamos spinners desde la BD
    public void getFormularios(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getResources().getString(R.string.baseURL))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        FormularioApiService formularioApiService = retrofit.create(FormularioApiService.class);
        Call<List<FormularioDTO>> call = formularioApiService.getDatosFormularios();

        call.enqueue(new Callback<List<FormularioDTO>>() {
            @Override
            public void onResponse(Call<List<FormularioDTO>> call, Response<List<FormularioDTO>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(Registrar.this, "Error de conexion", Toast.LENGTH_LONG).show();
                    return;
                }
                List<FormularioDTO> formularioList = response.body();
                List<String> list = new ArrayList<>();
                list.add("Seleccionar");
                for(FormularioDTO formulario:formularioList){
                    list.add(formulario.getNombre());
                    //listaFenomeno.put(fenomeno.getNombre(),fenomeno.getIdFenomeno());
                    listaFormulario.add(formulario);
                }
                ArrayAdapter<String> adapterF = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, list);
                spForm.setAdapter(adapterF);
            }

            @Override
            public void onFailure(Call<List<FormularioDTO>> call, Throwable t) {
                Toast.makeText(Registrar.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }



    public void getCasillas(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getResources().getString(R.string.baseURL))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        CasillaApiService casillaApiService = retrofit.create(CasillaApiService.class);
        Call<List<CasillasDTO>> call = casillaApiService.getDatosCasillas();

        call.enqueue(new Callback<List<CasillasDTO>>() {
            @Override
            public void onResponse(Call<List<CasillasDTO>> call, Response<List<CasillasDTO>> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(Registrar.this, "Error de conexion", Toast.LENGTH_LONG).show();
                    return;
                }
                List<CasillasDTO> casillasList = response.body();
                List<String> list = new ArrayList<>();
                list.add("Seleccionar");
                for(CasillasDTO c:casillasList){
                    list.add(c.getNombre());
                    //listaCaract.put(c.getNombre(),c.getId());
                    listaCasilla.add(c);
                }
                ArrayAdapter<String> adapterC = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_spinner_item, list);
                spCasilla.setAdapter(adapterC);

            }

            @Override
            public void onFailure(Call<List<CasillasDTO>> call, Throwable t) {
                Toast.makeText(Registrar.this, t.getMessage(), Toast.LENGTH_LONG).show();

            }
        });
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}