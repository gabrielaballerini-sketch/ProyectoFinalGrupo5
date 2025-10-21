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
     Comprador comprador1 =new Comprador();

    public TicketCompro(LocalDate fechaCompra, LocalDate fechaFuncion, int monto) {
        this.fechaCompra = fechaCompra;
        this.fechaFuncion = fechaFuncion;
        this.monto = monto;
    }

    public TicketCompro() {
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
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

    public Comprador getComprador1() {
        return comprador1;
    }

    public void setComprador1(Comprador comprador1) {
        this.comprador1 = comprador1;
    }

    @Override
    public String toString() {
        return "TicketCompro{" + "fechaCompra=" + fechaCompra + ", fechaFuncion=" + fechaFuncion + ", monto=" + monto ;
    }
     
     
   
}
