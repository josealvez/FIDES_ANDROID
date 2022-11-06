package com.proyectofinal.fides_rca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.proyectofinal.fides_rca.interfaces.UsuarioApiService;
import com.proyectofinal.fides_rca.persistence.LoginDTO;
import com.proyectofinal.fides_rca.persistence.UsuarioDTO;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Retrofit mRestAdapter;
    private static final String TAG = "Error_ROM";
    TextView txtContacto;
    private EditText usu, pass;
    boolean registrado = false;
    public String userName;
    UsuarioDTO nombreUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declaramos componentes
        ImageView imgInfo = (ImageView) findViewById(R.id.logo);
        TextView lblInfo = (TextView) findViewById(R.id.titulo);
        //ImageView imgHelp = (ImageView) findViewById(R.id.imgHelp);
        //TextView lblHelp = (TextView) findViewById(R.id.ayuda);
        Button btnIngresar = (Button) findViewById(R.id.btnIngresar);
        //Button btnCancelar = (Button) findViewById(R.id.btnCancelar);
        usu = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        txtContacto = (TextView) findViewById(R.id.contacto);
        //TextView txtCuenta = (TextView) findViewById(R.id.cuenta);
        TextView txtOlvido = (TextView) findViewById(R.id.olvido);

        //Declaramos acciones
        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Principal.class);
                //consulta login de aplicacion eclipse
                if (validarIngreso()) {
                    attemptLogin();
                }

                //------------------------/********************---------------------

            }
        });

        //al tocar el icono o el texto abre Informacion
        /*imgInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Informacion.class);
                startActivity(i);
            }
        });*/
        /*lblInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Informacion.class);
                startActivity(i);
            }
        });*/
        //al tocar el icono o el texto abre Ayuda
       /* imgHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Ayuda.class);
                startActivity(i);

            }
        });*/
        /*lblHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Ayuda.class);
                startActivity(i);
            }
        });*/
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
        });

    }
////////////////////////////////////////////////////////////////////////////////////////////////

    private boolean validarIngreso() {
        boolean retorno = true;
        if (usu.getText().toString().isEmpty()) {
            usu.setError("Dato obligatorio.");
            retorno = false;
        }
        if (pass.getText().toString().isEmpty()) {
            pass.setError("Dato obligatorio.");
            retorno = false;
        }
        return retorno;
    }

    private void attemptLogin() {
        // Crear conexión al servicio REST
        mRestAdapter = new Retrofit.Builder()
                .baseUrl(getResources().getString(R.string.baseURL))
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Reset errors.
//        mFloatLabelUserId.setError(null);
//        mFloatLabelPassword.setError(null);

        // Store values at the time of the login attempt.
        String email = usu.getText().toString();
        String password = pass.getText().toString();

        //userName = usu.getText().toString();
        //nombreUsuario.getNombreUsuario(userName);

        boolean cancel = false;
        View focusView = null;

        // Check for a valid password, if the user entered one.
        /*if (TextUtils.isEmpty(password)) {
            pass.setError(getString(R.string.error_field_required));
            focusView = pass;
            cancel = true;
        } else if (!isPasswordValid(password)) {
            pass.setError(getString(R.string.error_invalid_password));
            focusView = pass;
            cancel = true;
        }*/

        // Verificar si el ID tiene contenido.
        /*if (TextUtils.isEmpty(userId)) {
            usu.setError(getString(R.string.error_field_required));
            focusView = usu;
            cancel = true;
        } else if (!isUserIdValid(userId)) {
            usu.setError(getString(R.string.error_invalid_user_id));
            focusView = usu;
            cancel = true;
        }*/

        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Mostrar el indicador de carga y luego iniciar la petición asíncrona.
            showProgress(true);
            UsuarioApiService usuarioApiService = mRestAdapter.create(UsuarioApiService.class);
            Call<UsuarioDTO> loginCall = usuarioApiService.login(new LoginDTO(email, password));
            loginCall.enqueue(new Callback<UsuarioDTO>() {
                @Override
                public void onResponse(Call<UsuarioDTO> call, Response<UsuarioDTO> response) {
                    // Procesar errores
                    if (!response.isSuccessful()) {
                        String error;
                        if (response.errorBody()
                                .contentType()
                                .subtype()
                                .equals("application/json")) {
                            //ApiError apiError = ApiError.fromResponseBody(response.errorBody());

                            error = "apiError.getMessage()";
                            Log.e(TAG, "attemptLogin() : 10" + error);
                        } else {
                            error = response.message();
                            Log.e(TAG, "attemptLogin() : 11" + error);
                        }

                        Log.e(TAG, "attemptLogin() : 12" + error);
                        Toast.makeText(MainActivity.this, "Credenciales ingresadas son incorrectas", Toast.LENGTH_LONG).show();
                        return;
                    } if (!response.body().isEstado()) {
                        Toast.makeText(MainActivity.this, "Credenciales ingresadas son incorrectas", Toast.LENGTH_LONG).show();
                        return; }

                    // Guardar usuario en preferenciasloginDTO
                    // SessionPrefs.get(LoginActivity.this).saveAffiliate(response.body());
                   UsuarioDTO respuestaAPI = response.body();
                    SharedPreferences prefs = getSharedPreferences("loginStatus", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();

                    editor.putString("getNombre", respuestaAPI.getNombre());
                 //   editor.putString("getApellido", respuestaAPI.getApellido());
                 //   editor.putLong("getId", usuarioDTO.getId());

                    editor.commit();

                    Toast.makeText(MainActivity.this, "Bienvenido a FIDES-RCA", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(MainActivity.this, Principal.class);
                    Bundle b = new Bundle();
                    b.putString("UserName", email);
                    i.putExtras(b);
                    startActivity(i);
                }

                @Override
                public void onFailure(Call<UsuarioDTO> call, Throwable t) {
                    Log.e(TAG, "attemptLogin() : 3" + t.getMessage());
                    Toast.makeText(MainActivity.this, "Credenciales ingresadas son incorrectas", Toast.LENGTH_LONG).show();

                }
            });
        }
    }

    private boolean isUserIdValid(String userId) {
        return userId.length() > 8;
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 8;
    }

    private void showProgress(boolean show) {
//        mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
//
//        int visibility = show ? View.GONE : View.VISIBLE;
//        mLogoView.setVisibility(visibility);
//        mLoginFormView.setVisibility(visibility);
    }
    public void onBackPressed (){
        finishAffinity();
    }
}
