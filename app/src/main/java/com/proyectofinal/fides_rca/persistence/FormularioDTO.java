package com.proyectofinal.fides_rca.persistence;

public class FormularioDTO {

    private long idFormulario;
    private String nombre;
    private String metodo_medicion;
    private String comentarios;

    public FormularioDTO() {
    }

    public FormularioDTO(long idFormulario, String nombre, String metodo_medicion, String comentarios) {
        this.idFormulario = idFormulario;
        this.nombre = nombre;
        this.metodo_medicion = metodo_medicion;
        this.comentarios = comentarios;
    }

    public long getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(long idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMetodo_medicion() {
        return metodo_medicion;
    }

    public void setMetodo_medicion(String metodo_medicion) {
        this.metodo_medicion = metodo_medicion;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    @Override
    public String toString() {
        return "FormularioDTO{" +
                "idFormulario=" + idFormulario +
                ", nombre='" + nombre + '\'' +
                ", metodo_medicion='" + metodo_medicion + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
