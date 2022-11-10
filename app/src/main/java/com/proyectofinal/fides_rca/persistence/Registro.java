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

    @NonNull
    @ColumnInfo(name="formulario")
    private String formulario;

    @NonNull
    @ColumnInfo(name="casillas")
    private String casillas;

    @NonNull
    @ColumnInfo(name="parametro")
    private String parametro;

    public Registro(int id, String fecha, @NonNull String formulario, @NonNull String casillas, @NonNull String parametro) {
        this.id = id;
        this.formulario = formulario;
        this.casillas = casillas;
        this.parametro = parametro;
    }

    public Registro() {
    }

    @Override
    public String toString() {
        return "Registro{" +
                "id=" + id +
                ", formulario='" + formulario + '\'' +
                ", casillas='" + casillas + '\'' +
                ", parametro='" + parametro + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    public String getParametro() {
        return parametro;
    }

    public void setParametro(@NonNull String parametro) {
        this.parametro = parametro;
    }

}
