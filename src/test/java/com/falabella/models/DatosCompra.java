package com.falabella.models;

public class DatosCompra {
    private String email;
    private String departamento;
    private String ciudad;
    private String barrio;
    private String direccion;
    private String complementodireccion;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComplementodireccion() {
        return complementodireccion;
    }

    public void setComplementodireccion(String complementodireccion) {
        this.complementodireccion = complementodireccion;
    }
}
