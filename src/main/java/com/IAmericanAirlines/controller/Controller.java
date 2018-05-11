/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IAmericanAirlines.controller;

import com.IAmericanAirlines.model.Reserva;
import com.IAmericanAirlines.model.Response;

/**
 *
 * @author andres
 */
public interface Controller {
    
    public Reserva consultarReserva(String idReserva);
    public Response cancelarReserva(String idReserva);
    public Response crearReserva(Reserva reserva);
    
}
