package com.proyectofinal.fides_rca.persistence;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class RegistrosDTO {

    @SerializedName("idRegistro")
    @Expose
    private long idRegistro;

    @SerializedName("fechaHora")
    @Expose
    private Date fechaHora;
    @SerializedName("fechaHoraString")
    @Expose
    private String fechaHoraString;

    @SerializedName("idUsuarioAlta")
    @Expose
    private long idUsuarioAlta;
    @SerializedName("idUsuarioAltaNombre")
    @Expose
    private String idUsuarioAltaNombre;

    @SerializedName("idFormulario")
    @Expose
    private long idFormulario;
    @SerializedName("idFormularioNombre")
    @Expose
    private String idFormularioNombre;

    @SerializedName("idCasilla")
    @Expose
    private long idCasilla;
    @SerializedName("idCasillaNombre")
    @Expose
    private String idCasillaNombre;

    @SerializedName("parametro")
    @Expose
    private String parametro;

    @SerializedName("valor")
    @Expose
    private double valor;

    @SerializedName("unidad_medida")
    @Expose
    private String unidad_medida;

    @SerializedName("idLocalidad")
    @Expose
    private long idLocalidad;
    @SerializedName("idLocalidadNombre")
    @Expose
    private String idLocalidadNombre;

    public RegistrosDTO() {
        super();
    }

    public RegistrosDTO(long idRegistro, Date fechaHora, String fechaHoraString, long idUsuarioAlta, String idUsuarioAltaNombre, long idFormulario, String idFormularioNombre, long idCasilla, String idCasillaNombre, String parametro, double valor, String unidad_medida, long idLocalidad, String idLocalidadNombre) {
        this.idRegistro = idRegistro;
        this.fechaHora = fechaHora;
        this.fechaHoraString = fechaHoraString;
        this.idUsuarioAlta = idUsuarioAlta;
        this.idUsuarioAltaNombre = idUsuarioAltaNombre;
        this.idFormulario = idFormulario;
        this.idFormularioNombre = idFormularioNombre;
        this.idCasilla = idCasilla;
        this.idCasillaNombre = idCasillaNombre;
        this.parametro = parametro;
        this.valor = valor;
        this.unidad_medida = unidad_medida;
        this.idLocalidad = idLocalidad;
        this.idLocalidadNombre = idLocalidadNombre;
    }

    @Override
    public String toString() {
        return "RegistrosDTO{" +
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
                '}';
    }

    public long getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(long idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public long getIdUsuarioAlta() {
        return idUsuarioAlta;
    }

    public void setIdUsuarioAlta(long idUsuarioAlta) {
        this.idUsuarioAlta = idUsuarioAlta;
    }

    public String getIdUsuarioAltaNombre() {
        return idUsuarioAltaNombre;
    }

    public void setIdUsuarioAltaNombre(String idUsuarioAltaNombre) {
        this.idUsuarioAltaNombre = idUsuarioAltaNombre;
    }

    public long getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(long idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getIdFormularioNombre() {
        return idFormularioNombre;
    }

    public void setIdFormularioNombre(String idFormularioNombre) {
        this.idFormularioNombre = idFormularioNombre;
    }

    public long getIdCasilla() {
        return idCasilla;
    }

    public void setIdCasilla(long idCasilla) {
        this.idCasilla = idCasilla;
    }

    public String getIdCasillaNombre() {
        return idCasillaNombre;
    }

    public void setIdCasillaNombre(String idCasillaNombre) {
        this.idCasillaNombre = idCasillaNombre;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public long getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public String getFechaHoraString() {
        return fechaHoraString;
    }

    public void setFechaHoraString(String fechaHoraString) {
        this.fechaHoraString = fechaHoraString;
    }

    public String getIdLocalidadNombre() {
        return idLocalidadNombre;
    }

    public void setIdLocalidadNombre(String idLocalidadNombre) {
        this.idLocalidadNombre = idLocalidadNombre;
    }
}
