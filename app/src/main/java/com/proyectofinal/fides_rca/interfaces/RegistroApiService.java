package com.proyectofinal.fides_rca.interfaces;

import com.proyectofinal.fides_rca.persistence.Observacion;
import com.proyectofinal.fides_rca.persistence.ObservacionesDTO;
import com.proyectofinal.fides_rca.persistence.Registro;
import com.proyectofinal.fides_rca.persistence.RegistrosDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface RegistroApiService {

    @GET("ROM_CanarySoftware/registro/{id}")
    Call<Registro> find(@Path("id") String id);

    @GET("todos")
    Call<Registro> obtenerDatos();

    @GET("todos")
    Call<RegistroR> getRegistros();

    @GET("rest/registros/todos")
    Call<List<RegistrosDTO>> getDatosRegistros();

    @POST("rest/registros/agregar")
    Call<RegistrosDTO> postRegistro(@Body RegistrosDTO registrosDTO);
}
