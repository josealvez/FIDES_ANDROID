package com.proyectofinal.fides_rca;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Informacion extends AppCompatActivity {
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
//////////////////////////////////////////////////////////////////////////////////////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //botón de regresar
        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        /*TextView txtContacto =(TextView) findViewById(R.id.txtContacto);
        //al tocar el mail de contacto lo direcciona a su casilla de correo
        txtContacto.setOnClickListener(new View.OnClickListener() {
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
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}