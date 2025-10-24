/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Capotes
 */
public class TicketCompro {
   
   private LocalDate fechaCompra;
     private LocalDate fechaFuncion;
     private int monto;
     private int dni;
     private int codLugar;
     

    public TicketCompro(LocalDate fechaCompra, LocalDate fechaFuncion, int monto, int dni, int codLugar) {
        this.fechaCompra = fechaCompra;
        this.fechaFuncion = fechaFuncion;
        this.monto = monto;
        this.dni = dni;
        this.codLugar = codLugar;
    }

    
     
     public TicketCompro(LocalDate fechaCompra, LocalDate fechaFuncion, int monto, int dni) {
        this.fechaCompra = fechaCompra;
        this.fechaFuncion = fechaFuncion;
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

    public LocalDate getFechaFuncion() {
        return fechaFuncion;
    }

    public void setFechaFuncion(LocalDate fechaFuncion) {
        this.fechaFuncion = fechaFuncion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

 

    @Override
    public String toString() {
        return "TicketCompro{" + "fechaCompra=" + fechaCompra + ", fechaFuncion=" + fechaFuncion + ", monto=" + monto + ", dni=" + dni + ", codLugar=" + codLugar + '}';
    }

   
     
     
   
}
