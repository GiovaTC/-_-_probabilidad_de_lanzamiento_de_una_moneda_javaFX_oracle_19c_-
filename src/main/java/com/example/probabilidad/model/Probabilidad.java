package com.example.probabilidad.model;

import java.util.Date;

public class Probabilidad {

    private String evento;
    private double probabilidad;
    private Date fecha;

    public Probabilidad(String evento, double probabilidad) {
        this.evento = evento;
        this.probabilidad = probabilidad;
        this.fecha = new Date();
    }

    public String getEvento() {
        return evento;
    }

    public double getProbabilidad() {
        return probabilidad;
    }

    public Date getFecha() {
        return fecha;
    }
}
