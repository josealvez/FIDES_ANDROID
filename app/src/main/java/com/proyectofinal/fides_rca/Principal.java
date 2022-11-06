package com.proyectofinal.fides_rca;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Principal extends AppCompatActivity {
    //UsuarioDTO nombreUsuario;
    String nombreUsuario;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        //agregarFab();
        //Declaramos objetos
        //ImageView imgSearch = (ImageView) findViewById(R.id.imgSearch);
        //TextView lblSearch = (TextView) findViewById(R.id.lblSearch);
        ImageView imgList = (ImageView) findViewById(R.id.imgList);
        //TextView lblList = (TextView) findViewById(R.id.lblList);
        //ImageView imgHelp = (ImageView) findViewById(R.id.imgHelp);
       // TextView lblHelp = (TextView) findViewById(R.id.lblHelp);
        //ImageView imgInfo = (ImageView) findViewById(R.id.imgInfo);
        //TextView lblInfo = (TextView) findViewById(R.id.lblInfo);
        //ImageView imgUser = (ImageView) findViewById(R.id.imgUser);
        //TextView lblUser = (TextView) findViewById(R.id.lblUser);
        //ImageView imgSalir = (ImageView) findViewById(R.id.imgSalir);
        //TextView lblSalir = (TextView) findViewById(R.id.lblSalir);
        TableRow tblIngresar = (TableRow) findViewById(R.id.tblIngresar);
        ImageView imgIngresar = (ImageView) findViewById(R.id.imgIngresar);
        TableRow tblListar = (TableRow) findViewById(R.id.tblListar);
        TableRow tblModificar = (TableRow) findViewById(R.id.tblModificar);
        ImageView imgModificar = (ImageView) findViewById(R.id.imgModificar);
        //TableRow tblAyuda = (TableRow) findViewById(R.id.tblAyuda);
        //TableRow tblInfo = (TableRow) findViewById(R.id.tblInfo);
        //TableRow tblUsuario = (TableRow) findViewById(R.id.tblUsuario);

        //recibimos intent con nombre de usuario logueado
        Bundle bundle = this .getIntent().getExtras();
        Intent intent = getIntent();
        nombreUsuario = bundle.getString("UserName");

        ////////////////////////////////////////////////////////////////////////////////////
        //Declaramos acciones
        tblIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Registrar.class);
                startActivity(i);

            }
        });
        tblModificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Modificar.class);
                startActivity(i);
            }
        });
        tblListar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Listar.class);
                startActivity(i);
            }
        });
        /*tblInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Informacion.class);
                startActivity(i);
            }
        });*/
        /*tblUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Usuario.class);
                startActivity(i);

            }
        });*/

        /*imgSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, BuscarObs.class);
                startActivity(i);

            }
        });*/
        /*lblSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, BuscarObs.class);
                startActivity(i);
            }
        });*/
        /*imgList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, VerObs.class);
                startActivity(i);
            }
        });*/
        /*lblList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, VerObs.class);
                startActivity(i);
            }
        });*/
        /*imgHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Ayuda.class);
                startActivity(i);

            }
        });*/
        /*lblHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Ayuda.class);
                startActivity(i);
            }
        });*/
        /*imgInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Informacion.class);
                startActivity(i);
            }
        });*/
        /*lblInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Informacion.class);
                startActivity(i);
            }
        });*/
        /*imgUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Usuario.class);
                Bundle b = new Bundle();
                b.putString("UserName", nombreUsuario);
                i.putExtras(b);
                startActivity(i);

            }
        });*/
        /*lblUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this, Usuario.class);
                Bundle b = new Bundle();
                b.putString("UserName", nombreUsuario);
                i.putExtras(b);
                startActivity(i);
            }
        });*/
        /*imgSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
        /*lblSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });*/
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
        ////////////////////////////////////////////////////////////////////////////////////////

    }
    /*public void agregarFab(){
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Principal.this,IngresarObs.class);
                startActivity(i);
            }
        });

    }*/


}