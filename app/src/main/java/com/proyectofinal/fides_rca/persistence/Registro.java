package com.proyectofinal.fides_rca.persistence;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "registro_table")
public class Registro {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    private int id;

    @ColumnInfo(name="fecha")
    private String fecha;

    @NonNull
    @ColumnInfo(name="formulario")
    private String formulario;

    @NonNull
    @ColumnInfo(name="casillas")
    private String casillas;

    @NonNull
    @ColumnInfo(name="localidad")
    private String localidad;

    @NonNull
    @ColumnInfo(name="parametro")
    private String parametro;

    @NonNull
    @ColumnInfo(name="unidad_medida")
    private String unidad_medida;

    @NonNull
    @ColumnInfo(name="valor")
    private double valor;

    public Registro(int id, String fecha, @NonNull String formulario, @NonNull String casillas, @NonNull String localidad, @NonNull String parametro, @NonNull String unidad_medida, double valor) {
        this.id = id;
        this.fecha = fecha;
        this.formulario = formulario;
        this.casillas = casillas;
        this.localidad = localidad;
        this.parametro = parametro;
        this.unidad_medida = unidad_medida;
        this.valor = valor;
    }

    public Registro() {
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id=" + id +
                ", fecha='" + fecha + '\'' +
                ", formulario='" + formulario + '\'' +
                ", casillas='" + casillas + '\'' +
                ", localidad='" + localidad + '\'' +
                ", parametro='" + parametro + '\'' +
                ", unidad_medida='" + unidad_medida + '\'' +
                ", valor=" + valor +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @NonNull
    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(@NonNull String formulario) {
        this.formulario = formulario;
    }

    @NonNull
    public String getCasillas() {
        return casillas;
    }

    public void setCasillas(@NonNull String casillas) {
        this.casillas = casillas;
    }

    @NonNull
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(@NonNull String localidad) {
        this.localidad = localidad;
    }

    @NonNull
    public String getParametro() {
        return parametro;
    }

    public void setParametro(@NonNull String parametro) {
        this.parametro = parametro;
    }

    @NonNull
    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(@NonNull String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
