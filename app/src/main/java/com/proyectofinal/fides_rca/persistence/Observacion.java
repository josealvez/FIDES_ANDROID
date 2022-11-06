package com.proyectofinal.fides_rca.persistence;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "observacion_table")
public class Observacion {
    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;

    @NonNull
    @ColumnInfo(name="descripcion")
    private String descripcion;

    @NonNull
    @ColumnInfo(name="criticidad")
    private String criticidad;

    @ColumnInfo(name="fecha")
    private String fecha;
    @ColumnInfo(name="hora")
    private String hora;

    @NonNull
    @ColumnInfo(name="fenomeno")
    private String fenomeno;

    @NonNull
    @ColumnInfo(name="caracteristicas")
    private String caracteristicas;

    @NonNull
    @ColumnInfo(name="localidad")
    private String localidad;

    @NonNull
    @ColumnInfo(name="departamento")
    private String departamento;

    @NonNull
    @ColumnInfo(name="zona")
    private String zona;

    public Observacion() {
    }

    public Observacion(@NonNull String descripcion, @NonNull String criticidad, @NonNull String fenomeno, @NonNull String caracteristicas, @NonNull String localidad, @NonNull String departamento, @NonNull String zona) {
        this.descripcion = descripcion;
        this.criticidad = criticidad;
        this.fenomeno = fenomeno;
        this.caracteristicas = caracteristicas;
        this.localidad = localidad;
        this.departamento = departamento;
        this.zona = zona;
    }

    public Observacion(int id, @NonNull String descripcion, @NonNull String criticidad, String fecha, String hora, @NonNull String fenomeno, @NonNull String caracteristicas, @NonNull String localidad, @NonNull String departamento, @NonNull String zona) {
        this.id = id;
        this.descripcion = descripcion;
        this.criticidad = criticidad;
        this.fecha = fecha;
        this.hora = hora;
        this.fenomeno = fenomeno;
        this.caracteristicas = caracteristicas;
        this.localidad = localidad;
        this.departamento = departamento;
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Observacion{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", criticidad='" + criticidad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", fenomeno='" + fenomeno + '\'' +
                ", caracteristicas='" + caracteristicas + '\'' +
                ", localidad='" + localidad + '\'' +
                ", departamento='" + departamento + '\'' +
                ", zona='" + zona + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(@NonNull String descripcion) {
        this.descripcion = descripcion;
    }

    @NonNull
    public String getCriticidad() {
        return criticidad;
    }

    public void setCriticidad(@NonNull String criticidad) {
        this.criticidad = criticidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @NonNull
    public String getFenomeno() {
        return fenomeno;
    }

    public void setFenomeno(@NonNull String fenomeno) {
        this.fenomeno = fenomeno;
    }

    @NonNull
    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(@NonNull String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @NonNull
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(@NonNull String localidad) {
        this.localidad = localidad;
    }

    @NonNull
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(@NonNull String departamento) {
        this.departamento = departamento;
    }

    @NonNull
    public String getZona() {
        return zona;
    }

    public void setZona(@NonNull String zona) {
        this.zona = zona;
    }
}
