package com.proyectofinal.fides_rca.persistence;

public class LoginDTO {
    private String email;
    private String password;
    private String nombre;

    public LoginDTO() { super(); }

    public LoginDTO(String usu, String pass) {
        super();
        this.email = usu;
        this.password = pass;
}

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO [email=" + email + ", password=" + password + ", password=" + nombre + "]";
    }


}
