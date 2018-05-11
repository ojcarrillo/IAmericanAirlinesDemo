/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IAmericanAirlines.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andres
 */
public class Reserva {
    
    private String idReserva;
    private List<Persona> pasajeros;
    private Vuelo vuelo;

    
    
    public Reserva() {
        this.idReserva = "";
        this.pasajeros = new ArrayList<Persona>();
        vuelo = new Vuelo();
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public List<Persona> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Persona> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    
}
