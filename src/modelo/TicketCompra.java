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
   private int dni;
   private LocalDateTime horaInicio;
   private int codLugar;
    private String medioDePago;

    public TicketCompra(LocalDate fechaCompra, int monto, int dni, LocalDateTime horaInicio, int codLugar,String medioPago) {
        this.fechaCompra = fechaCompra;
        this.monto = monto;
        this.dni = dni;
        this.horaInicio = horaInicio;
        this.codLugar = codLugar;
        this.medioDePago= medioDePago;
    }

    public TicketCompra(int id_ticket, LocalDate fechaCompra, int monto, int dni, LocalDateTime horaInicio, int codLugar) {
        this.id_ticket = id_ticket;
        this.fechaCompra = fechaCompra;
        this.monto = monto;
        this.dni = dni;
        this.horaInicio = horaInicio;
        this.codLugar = codLugar;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(int codLugar) {
        this.codLugar = codLugar;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    @Override
    public String toString() {
        return "TicketCompra{" + "id_ticket=" + id_ticket + ", fechaCompra=" + fechaCompra + ", monto=" + monto + ", dni=" + dni + ", horaInicio=" + horaInicio + ", codLugar=" + codLugar + ", medioDePago=" + medioDePago + '}';
    }

   
   



}