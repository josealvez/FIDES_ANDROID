package com.proyectofinal.fides_rca.persistence;

public class CasillasDTO {

    private long id;
    private String nombre;
    private String parametro;
    private String unidad_medida;
    private String tipo_valor;

    public CasillasDTO() {
    }

    public CasillasDTO(long id, String nombre, String parametro, String unidad_medida, String tipo_valor) {
        this.id = id;
        this.nombre = nombre;
        this.parametro = parametro;
        this.unidad_medida = unidad_medida;
        this.tipo_valor = tipo_valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getParametro() {
        return parametro;
    }

    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    public String getUnidad_medida() {
        return unidad_medida;
    }

    public void setUnidad_medida(String unidad_medida) {
        this.unidad_medida = unidad_medida;
    }

    public String getTipo_valor() {
        return tipo_valor;
    }

    public void setTipo_valor(String tipo_valor) {
        this.tipo_valor = tipo_valor;
    }

    @Override
    public String toString() {
        return "CasillasDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", parametro='" + parametro + '\'' +
                ", unidad_medida='" + unidad_medida + '\'' +
                ", tipo_valor='" + tipo_valor + '\'' +
                '}';
    }
}
