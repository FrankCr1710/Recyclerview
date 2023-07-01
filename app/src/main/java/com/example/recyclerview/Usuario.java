package com.example.recyclerview;

public class Usuario {
    private String username;
    private String password;
    private  String nombres;
    private  String  apellidos;
    private  String tipo;
    private  int id_escuela;

    public Usuario(String username, String nombres, String apellidos, String tipo) {
        this.username = username;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo = tipo;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId_escuela() {
        return id_escuela;
    }

    public void setId_escuela(int id_escuela) {
        this.id_escuela = id_escuela;
    }
}
