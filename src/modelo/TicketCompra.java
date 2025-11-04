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
    private int monto= 0;
   private Comprador comprador1;
   private Funcion funcion1;
   private Lugar lugar1  ;
    private String medioDePago;

    public TicketCompra(LocalDate fechaCompra, int monto, Comprador comprador1, Funcion funcion1,Lugar lugar1,String medioPago) {
        this.fechaCompra = fechaCompra;
        this.monto = monto;
        this.comprador1=comprador1;
        this.funcion1=funcion1;
        this.lugar1= lugar1;
        this.medioDePago= medioDePago;
    }

    public TicketCompra(int id_ticket, LocalDate fechaCompra, int monto, Comprador comprador1, Funcion funcion1, Lugar lugar1) {
        this.id_ticket = id_ticket;
        this.fechaCompra = fechaCompra;
        this.monto = monto;
        this.comprador1=comprador1;
        this.funcion1=funcion1;
         this.lugar1= lugar1;
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }
    
    
    
    
    

    public TicketCompra() {
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
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

    public TicketCompra(int id_ticket, LocalDate fechaCompra, Comprador comprador1, Funcion funcion1, Lugar lugar1, String medioDePago) {
        this.id_ticket = id_ticket;
        this.fechaCompra = fechaCompra;
        this.comprador1 = comprador1;
        this.funcion1 = funcion1;
        this.lugar1 = lugar1;
        this.medioDePago = medioDePago;
    }

    
   
   



}