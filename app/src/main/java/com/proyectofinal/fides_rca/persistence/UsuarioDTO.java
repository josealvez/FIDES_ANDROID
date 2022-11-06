package com.proyectofinal.fides_rca.persistence;

public class UsuarioDTO {

    private String Nombre;
    private String Apellido;
    private boolean Estado;

//	--------------



    public UsuarioDTO() {
        super();
    }
    public UsuarioDTO(long id, boolean estado, String nombre, String apellido) {
        super();
        this.Estado = estado;
        this.Nombre = nombre;
        this.Apellido = apellido;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }

    @Override
    public String toString() {
        return "UsuarioDTO [estado="
                + Estado + ", nombre=" + Nombre + ", apellido=" + Apellido + "]";
    }


}
