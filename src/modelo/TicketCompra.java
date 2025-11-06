/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Capotes
 */
public class TicketCompra {
   
    private int id_ticket;
   private LocalDate fechaCompra;
   private int cantidad;
    private int precio;
   private Comprador comprador1;
   private Funcion funcion1;
   private Lugar lugar1  ;
    private String medioDePago;

    public TicketCompra(int id_ticket, LocalDate fechaCompra, int cantidad, int precio, Comprador comprador1, Funcion funcion1, Lugar lugar1, String medioDePago) {
        this.id_ticket = id_ticket;
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.comprador1 = comprador1;
        this.funcion1 = funcion1;
        this.lugar1 = lugar1;
        this.medioDePago = medioDePago;
    }

    public TicketCompra(LocalDate fechaCompra, int cantidad, int precio, Comprador comprador1, Funcion funcion1, Lugar lugar1, String medioDePago) {
        this.fechaCompra = fechaCompra;
        this.cantidad = cantidad;
        this.precio = precio;
        this.comprador1 = comprador1;
        this.funcion1 = funcion1;
        this.lugar1 = lugar1;
        this.medioDePago = medioDePago;
    }

  
    public TicketCompra() {
        
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Comprador getComprador1() {
        return comprador1;
    }

    public void setComprador1(Comprador comprador1) {
        this.comprador1 = comprador1;
    }

    public Funcion getFuncion1() {
        return funcion1;
    }

    public void setFuncion1(Funcion funcion1) {
        this.funcion1 = funcion1;
    }

    public Lugar getLugar1() {
        return lugar1;
    }

    public void setLugar1(Lugar lugar1) {
        this.lugar1 = lugar1;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    @Override
    public String toString() {
        return "TicketCompra{" + "id_ticket=" + id_ticket + ", fechaCompra=" + fechaCompra + ", cantidad=" + cantidad + ", precio=" + precio + ", comprador1=" + comprador1 + ", funcion1=" + funcion1 + ", lugar1=" + lugar1 + ", medioDePago=" + medioDePago + '}';
    }
    
    
    
 }

   
