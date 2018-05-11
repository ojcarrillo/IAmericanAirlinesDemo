/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IAmericanAirlines.model;

/**
 *
 * @author andres
 */
public class Vuelo {
    private String silla,nroVuelo,origen,destino,fechaInicio,fechaFin,puertaEmbarque,grupo;

    public Vuelo(String silla, String nroVuelo, String origen, String destino, String fechaInicio, String fechaFin, String puertaEmbarque, String grupo) {
        this.silla = silla;
        this.nroVuelo = nroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puertaEmbarque = puertaEmbarque;
        this.grupo = grupo;
    }

    public Vuelo() {
        this.silla = "";
        this.nroVuelo = "";
        this.origen = "";
        this.destino = "";
        this.fechaInicio = "";
        this.fechaFin = "";
        this.puertaEmbarque = "";
        this.grupo = "";
    }

    public String getSilla() {
        return silla;
    }

    public void setSilla(String silla) {
        this.silla = silla;
    }

    public String getNroVuelo() {
        return nroVuelo;
    }

    public void setNroVuelo(String nroVuelo) {
        this.nroVuelo = nroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPuertaEmbarque() {
        return puertaEmbarque;
    }

    public void setPuertaEmbarque(String puertaEmbarque) {
        this.puertaEmbarque = puertaEmbarque;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
}
