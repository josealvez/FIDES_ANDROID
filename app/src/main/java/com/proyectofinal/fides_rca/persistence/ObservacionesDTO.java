package com.proyectofinal.fides_rca.persistence;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

public class ObservacionesDTO {

    @SerializedName("idObservacion")
    @Expose
    private long idObservacion;
    @SerializedName("descripcion")
    @Expose
    private String descripcion;
    @SerializedName("latitud")
    @Expose
    private String latitud;
    @SerializedName("longitud")
    @Expose
    private String longitud;
    @SerializedName("altitud")
    @Expose
    private long altitud;
    @SerializedName("fechaHora")
    @Expose
    private Date fechaHora;
    @SerializedName("fechaHoraString")
    @Expose
    private String fechaHoraString;
    @SerializedName("validFecha")
    @Expose
    private Date validFecha;
    @SerializedName("validFechaString")
    @Expose
    private String validFechaString;
    @SerializedName("validComents")
    @Expose
    private String validComents;

    @SerializedName("idCriticidad")
    @Expose
    private long idCriticidad;
    @SerializedName("idCriticidadNombre")
    @Expose
    private String idCriticidadNombre;
    @SerializedName("idFenomeno")
    @Expose
    private long idFenomeno;
    @SerializedName("idFenomenoNombre")
    @Expose
    private String idFenomenoNombre;
    @SerializedName("idLocalidad")
    @Expose
    private long idLocalidad;
    @SerializedName("idLocalidadNombre")
    @Expose
    private String idLocalidadNombre;
    @SerializedName("idUsuarioAlta")
    @Expose
    private long idUsuarioAlta;
    @SerializedName("idUsuarioAltaNombre")
    @Expose
    private String idUsuarioAltaNombre;
    @SerializedName("idUsuarioVali")
    @Expose
    private long idUsuarioVali;
    @SerializedName("idUsuarioValiNombre")
    @Expose
    private String idUsuarioValiNombre;
    @SerializedName("idCaract")
    @Expose
    private long idCaract;
    @SerializedName("idCaractNombre")
    @Expose
    private String idCaractNombre;
    @SerializedName("listaCaract")
    @Expose
    private ArrayList<ObsCaracteristicasDTO> listaCaract;
    @SerializedName("datoNumeroCaract")
    @Expose
    private long datoNumeroCaract;
    @SerializedName("datoTextoCaract")
    @Expose
    private String datoTextoCaract;

    public ObservacionesDTO() {
        super();
        // TODO Auto-generated constructor stub
    }


    public long getAltitud() {
        return altitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public long getIdCriticidad() {
        return idCriticidad;
    }

    public long getIdFenomeno() {
        return idFenomeno;
    }

    public long getIdLocalidad() {
        return idLocalidad;
    }

    public long getIdObservacion() {
        return idObservacion;
    }

    public long getIdUsuarioAlta() {
        return idUsuarioAlta;
    }

    public long getIdUsuarioVali() {
        return idUsuarioVali;
    }

    public String getLatitud() {
        return latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public String getValidComents() {
        return validComents;
    }

    public Date getValidFecha() {
        return validFecha;
    }

    public void setAltitud(long altitud) {
        this.altitud = altitud;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setIdCriticidad(long idCriticidad) {
        this.idCriticidad = idCriticidad;
    }

    public void setIdFenomeno(long idFenomeno) {
        this.idFenomeno = idFenomeno;
    }

    public void setIdLocalidad(long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public void setIdObservacion(long idObservacion) {
        this.idObservacion = idObservacion;
    }

    public void setIdUsuarioAlta(long idUsuarioAlta) {
        this.idUsuarioAlta = idUsuarioAlta;
    }

    public void setIdUsuarioVali(long idUsuarioVali) {
        this.idUsuarioVali = idUsuarioVali;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public void setValidComents(String validComents) {
        this.validComents = validComents;
    }

    public void setValidFecha(Date validFecha) {
        this.validFecha = validFecha;
    }

    public String getFechaHoraString() {
        return fechaHoraString;
    }

    public void setFechaHoraString(String fechaHoraString) {
        this.fechaHoraString = fechaHoraString;
    }

    public String getValidFechaString() {
        return validFechaString;
    }

    public void setValidFechaString(String validFechaString) {
        this.validFechaString = validFechaString;
    }



    public String getIdCriticidadNombre() {
        return idCriticidadNombre;
    }



    public void setIdCriticidadNombre(String idCriticidadNombre) {
        this.idCriticidadNombre = idCriticidadNombre;
    }



    public String getIdFenomenoNombre() {
        return idFenomenoNombre;
    }



    public void setIdFenomenoNombre(String idFenomenoNombre) {
        this.idFenomenoNombre = idFenomenoNombre;
    }



    public String getIdLocalidadNombre() {
        return idLocalidadNombre;
    }



    public void setIdLocalidadNombre(String idLocalidadNombre) {
        this.idLocalidadNombre = idLocalidadNombre;
    }



    public String getIdUsuarioAltaNombre() {
        return idUsuarioAltaNombre;
    }



    public void setIdUsuarioAltaNombre(String idUsuarioAltaNombre) {
        this.idUsuarioAltaNombre = idUsuarioAltaNombre;
    }



    public String getIdUsuarioValiNombre() {
        return idUsuarioValiNombre;
    }



    public void setIdUsuarioValiNombre(String idUsuarioValiNombre) {
        this.idUsuarioValiNombre = idUsuarioValiNombre;
    }


    @Override
    public String toString() {
        return "ObservacionesDTO [idObservacion=" + idObservacion + ", descripcion=" + descripcion + ", latitud="
                + latitud + ", longitud=" + longitud + ", altitud=" + altitud + ", fechaHora=" + fechaHora
                + ", fechaHoraString=" + fechaHoraString + ", validFecha=" + validFecha + ", validFechaString="
                + validFechaString + ", validComents=" + validComents + ", idCriticidad=" + idCriticidad
                + ", idCriticidadNombre=" + idCriticidadNombre + ", idFenomeno=" + idFenomeno + ", idFenomenoNombre="
                + idFenomenoNombre + ", idLocalidad=" + idLocalidad + ", idLocalidadNombre=" + idLocalidadNombre
                + ", idUsuarioAlta=" + idUsuarioAlta + ", idUsuarioAltaNombre=" + idUsuarioAltaNombre
                + ", idUsuarioVali=" + idUsuarioVali + ", idUsuarioValiNombre=" + idUsuarioValiNombre + ", idCaract="
                + idCaract + ", idCaractNombre=" + idCaractNombre + ", listaCaract=" + listaCaract
                + ", datoNumeroCaract=" + datoNumeroCaract + ", datoTextoCaract=" + datoTextoCaract + "]";
    }



    public long getIdCaract() {
        return idCaract;
    }



    public void setIdCaract(long idCcaract) {
        this.idCaract = idCcaract;
    }



    public String getIdCaractNombre() {
        return idCaractNombre;
    }



    public void setIdCaractNombre(String idCaractNombre) {
        this.idCaractNombre = idCaractNombre;
    }



    public ArrayList<ObsCaracteristicasDTO> getListaCaract() {
        if(this.listaCaract == null) {
            this.listaCaract = new ArrayList<ObsCaracteristicasDTO>();
        }
        return listaCaract;
    }



    public void setListaCaract(ArrayList<ObsCaracteristicasDTO> listaCaract) {
        this.listaCaract = listaCaract;
    }



    public long getDatoNumeroCaract() {
        return datoNumeroCaract;
    }



    public void setDatoNumeroCaract(long datoNumeroCaract) {
        this.datoNumeroCaract = datoNumeroCaract;
    }



    public String getDatoTextoCaract() {
        return datoTextoCaract;
    }



    public void setDatoTextoCaract(String datoTextoCaract) {
        this.datoTextoCaract = datoTextoCaract;
    }





    public ObservacionesDTO(long idObservacion, String descripcion, String latitud,
                            String longitud, long altitud, Date fechaHora, String fechaHoraString, Date validFecha,
                            String validFechaString, String validComents, long idCriticidad, String idCriticidadNombre,
                            long idFenomeno, String idFenomenoNombre, long idLocalidad, String idLocalidadNombre,
                            long idUsuarioAlta, String idUsuarioAltaNombre, long idUsuarioVali, String idUsuarioValiNombre) {
        super();
        this.idObservacion = idObservacion;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
        this.fechaHora = fechaHora;
        this.fechaHoraString = fechaHoraString;
        this.validFecha = validFecha;
        this.validFechaString = validFechaString;
        this.validComents = validComents;
        this.idCriticidad = idCriticidad;
        this.idCriticidadNombre = idCriticidadNombre;
        this.idFenomeno = idFenomeno;
        this.idFenomenoNombre = idFenomenoNombre;
        this.idLocalidad = idLocalidad;
        this.idLocalidadNombre = idLocalidadNombre;
        this.idUsuarioAlta = idUsuarioAlta;
        this.idUsuarioAltaNombre = idUsuarioAltaNombre;
        this.idUsuarioVali = idUsuarioVali;
        this.idUsuarioValiNombre = idUsuarioValiNombre;
    }

    public ObservacionesDTO(long idObservacion, String descripcion, String latitud,
                            String longitud, long altitud, Date fechaHora,
                            long idCriticidad,
                            long idFenomeno, long idLocalidad,
                            long idUsuarioAlta) {
        super();
        this.idObservacion = idObservacion;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
        this.fechaHora = fechaHora;
        this.validFecha = validFecha;
        this.idCriticidad = idCriticidad;
        this.idFenomeno = idFenomeno;
        this.idLocalidad = idLocalidad;
        this.idUsuarioAlta = idUsuarioAlta;
    }


}
