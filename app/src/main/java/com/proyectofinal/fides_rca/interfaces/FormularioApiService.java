package com.proyectofinal.fides_rca.interfaces;

import com.proyectofinal.fides_rca.persistence.FormularioDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FormularioApiService {

    @GET("rest/formulario/todos")
    Call<List<FormularioDTO>> getDatosFormularios();
}
