package com.example.jhon.recursos.models;

/**
 * Created by jhon on 23/09/16.
 */
public class Mascota {
    public static final int ENFERMO = 0;
    public static final int SANO = 1;
    public static final int URGENTE = 2;
    public static final int ADOPTADO = 3;

    String raza;
    String color;
    String descripcion;
    String urlImg;
    String nombre;
    int estado;
    String dineroNecesitado;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getDineroNecesitado() {
        return dineroNecesitado;
    }

    public void setDineroNecesitado(String dineroNecesitado) {
        this.dineroNecesitado = dineroNecesitado;
    }
}
