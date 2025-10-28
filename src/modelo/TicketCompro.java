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
public class TicketCompro {
   
   private LocalDate fechaCompra;
     private LocalDateTime horaInicio;
     private int monto;
     private int dni;
     private int codLugar;
     

    public TicketCompro(LocalDate fechaCompra, LocalDateTime horaInicio, int monto, int dni, int codLugar) {
        this.fechaCompra = fechaCompra;
        this.horaInicio = horaInicio;
        this.monto = monto;
        this.dni = dni;
        this.codLugar = codLugar;
    }

    
     
     public TicketCompro(LocalDate fechaCompra, LocalDateTime horaInicio, int monto, int dni) {
        this.fechaCompra = fechaCompra;
        this.horaInicio = horaInicio;
        this.monto = monto;
        this.dni = dni;
    }

   
    public TicketCompro() {
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(int codLugar) {
        this.codLugar = codLugar;
    }

    
    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "TicketCompro{" + "fechaCompra=" + fechaCompra + ", horaInicio=" + horaInicio + ", monto=" + monto + ", dni=" + dni + ", codLugar=" + codLugar + '}';
    }

 

    

   
     
     
   
}
