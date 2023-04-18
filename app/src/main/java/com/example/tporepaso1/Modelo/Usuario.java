package com.example.tporepaso1.Modelo;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String usuario, contrasenia;

    public Usuario(String usuario, String contrasenia) {

        this.usuario = usuario;

        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
