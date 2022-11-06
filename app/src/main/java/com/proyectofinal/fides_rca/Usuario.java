package com.proyectofinal.fides_rca;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.proyectofinal.fides_rca.*;
import com.proyectofinal.fides_rca.interfaces.UsuarioApiService;
import com.proyectofinal.fides_rca.persistence.UsuarioDTO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Usuario extends AppCompatActivity {
    TextView txtUserName;
    TextView txtNombre;
    TextView txtApellido;
    TextView txtTipoUsuario;
    TextView txtEstado;
    TextView txtTipoDoc;
    TextView txtNroDoc;
    TextView txtDireccion;
    TextView txtCorreo;
    TextView txtDatos;
    //////////////////////////////////////////////////////////////////////////////////
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
/////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        //botón de regresar
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //TextView txtContacto =(TextView) findViewById(R.id.txtContacto);
        txtUserName = (TextView) findViewById(R.id.txtUserName);
        txtNombre = (TextView) findViewById(R.id.txtNombre);
        txtApellido = (TextView) findViewById(R.id.txtApellido);
        txtTipoUsuario = (TextView) findViewById(R.id.txtTipoUsuario);
        txtEstado = (TextView) findViewById(R.id.txtEstado);
        txtTipoDoc = (TextView) findViewById(R.id.txtTipoDoc);
        txtNroDoc = (TextView) findViewById(R.id.txtNroDoc);
        txtDireccion = (TextView) findViewById(R.id.txtDireccion);
        txtCorreo = (TextView) findViewById(R.id.txtCorreo);
        //txtDatos = (TextView)findViewById(R.id.txtDatos);

        SharedPreferences prefs = getSharedPreferences("datos_de_usuario",   Context.MODE_PRIVATE);
        String getNombreUsuario = prefs.getString("getNombreUsuario", ""); // prefs.getString("nombre del campo" , "valor por defecto")
        String getNombre = prefs.getString("getNombre", "");
        String email = prefs.getString("email", "");
        String getApellido = prefs.getString("getApellido", "");
        String getCorreo = prefs.getString("getCorreo", "");
        String getNumeroDocumento = prefs.getString("getNumeroDocumento", "");
        String getTipoDocumentoNombre = prefs.getString("getTipoDocumentoNombre", "");
        String getTipoUsuarioNombre = prefs.getString("getTipoUsuarioNombre", "");
        String getDireccion = prefs.getString("getDireccion", "");
        String getEstadoNombre = prefs.getString("getEstadoNombre", "");

        //recibimos intent con nombre de usuario logueado
    //    Intent intent = getIntent();
     //   Bundle bundle = this .getIntent().getExtras();
        txtUserName.setText(getNombreUsuario);
        txtNombre.setText(getNombre);
        txtApellido.setText(getApellido);
        txtTipoUsuario.setText(getTipoUsuarioNombre);
        txtTipoDoc.setText(getTipoDocumentoNombre);
        txtNroDoc.setText(getNumeroDocumento);
        txtDireccion.setText(getDireccion);
        txtCorreo.setText(getCorreo);
        txtEstado.setText(getEstadoNombre);

       // String nombreUsuario = txtUserName.getText().toString();
        //UsuarioDTO user = new UsuarioDTO();
        //user.setNombreUsuario(userName);

        //getDatosUsuario(nombreUsuario);






        //al tocar el mail de contacto lo direcciona a su casilla de correo
        /*txtContacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contacto = txtContacto.getText().toString();
                Intent emailIntent = new Intent(Intent.ACTION_SEND);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.putExtra(Intent.EXTRA_EMAIL, contacto);
                emailIntent.setType("message/rfc822");
                startActivity(Intent.createChooser(emailIntent, "Email "));
            }
        });*/
    }
    /////////////////////////////////////////////////////////////////////////////////////////
    private void getDatosUsuario(String nombreUsuario){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(getResources().getString(R.string.baseURL))
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UsuarioApiService usuarioApiService = retrofit.create(UsuarioApiService.class);
        Call<UsuarioDTO> call = usuarioApiService.getDatosUsuario(nombreUsuario);

        call.enqueue(new Callback<UsuarioDTO>() {
            @Override
            public void onResponse(Call<UsuarioDTO> call, Response<UsuarioDTO> response) {
                try{
                    if(response.isSuccessful()){
                        UsuarioDTO u = response.body();
                        /*txtDatos.append(u.getId() + u.getNombre() + u.getApellido() + u.getTipoUsuario() + u.getEstado() +
                                u.getTipoDocumento() + u.getNumeroDocumento() + u.getDireccion() + u.getCorreo());*/

                        txtNombre.setText(u.getNombre());
                        txtApellido.setText(u.getApellido());

                    }
                }catch (Exception e){
                    Toast.makeText(Usuario.this, e.getMessage(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<UsuarioDTO> call, Throwable t) {
                Toast.makeText(Usuario.this, "Error de conexion", Toast.LENGTH_LONG).show();
                Log.e("Error:", t.getMessage());

            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}