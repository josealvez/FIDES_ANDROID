package com.proyectofinal.fides_rca.persistence;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class RegistrosDTO {

 /*   @SerializedName("Casilla")
    @Expose
    private String casilla;

    @SerializedName("Parametro")
    @Expose
    private String parametro;*/

    private HashMap<String,String> casillas;

    private String descripcion;

    private String nombre;

    public RegistrosDTO() {
        super();
    }

    public RegistrosDTO(HashMap<String,String> casillas, String descripcion,String nombre) {
        super();
        this.casillas = casillas;
        this.descripcion = descripcion;
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return "RegistrosDTO{" +
                "casillas=" + casillas +
                ", descripcion=" + descripcion +
                ", nombre='" + nombre + '\'' +
                '}';

        /*"RegistrosDTO{" +
                "idRegistro=" + idRegistro +
                ", fechaHora=" + fechaHora +
                ", fechaHoraString='" + fechaHoraString + '\'' +
                ", idUsuarioAlta=" + idUsuarioAlta +
                ", idUsuarioAltaNombre='" + idUsuarioAltaNombre + '\'' +
                ", idFormulario=" + idFormulario +
                ", idFormularioNombre='" + idFormularioNombre + '\'' +
                ", idCasilla=" + idCasilla +
                ", idCasillaNombre='" + idCasillaNombre + '\'' +
                ", parametro='" + parametro + '\'' +
                ", valor=" + valor +
                ", unidad_medida='" + unidad_medida + '\'' +
                ", idLocalidad=" + idLocalidad +
                ", idLocalidadNombre='" + idLocalidadNombre + '\'' +
                '}';*/
    }

    public HashMap<String,String> getCasillas() {
        return casillas;
    }

    public void setCasillas(HashMap<String,String> casillas) {
        this.casillas = casillas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
