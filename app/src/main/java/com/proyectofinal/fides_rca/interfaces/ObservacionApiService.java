package com.proyectofinal.fides_rca.interfaces;


import com.proyectofinal.fides_rca.persistence.Observacion;
import com.proyectofinal.fides_rca.persistence.ObservacionesDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ObservacionApiService {
    @GET("ROM_CanarySoftware/observacion/{id}")
    Call<Observacion> find(@Path("id") String id);

    @GET("todos")
    Call<Observacion> obtenerDatos();

    @GET("todos")
    Call<ObservacionR> getObservaciones();

    @GET("rest/observaciones/todos")
    Call<List<ObservacionesDTO>> getDatosObservaciones();

    @POST("rest/observaciones/agregar")
    Call<ObservacionesDTO> postObservacion(@Body ObservacionesDTO observacionesDTO);

}
