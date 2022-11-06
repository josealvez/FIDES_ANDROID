package com.proyectofinal.fides_rca;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Modificar extends AppCompatActivity {



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
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);

        Spinner spForm = (Spinner) findViewById(R.id.spinnerFormulario);
        EditText txtParam = (EditText) findViewById(R.id.txtParametro);
        EditText txtMed = (EditText) findViewById(R.id.txtMedida);
        EditText txtVal = (EditText) findViewById(R.id.txtValor);
        Button btnAceptar = (Button) findViewById(R.id.btnAceptar);
        Button btnCancelar = (Button) findViewById(R.id.btnCancelar);
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
