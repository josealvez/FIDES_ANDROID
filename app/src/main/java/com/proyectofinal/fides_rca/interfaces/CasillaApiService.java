package com.proyectofinal.fides_rca.interfaces;

import com.proyectofinal.fides_rca.persistence.CasillasDTO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CasillaApiService {

    @GET("rest/caracteristicas/todos")
    Call<List<CasillasDTO>> getDatosCasillas();
}
