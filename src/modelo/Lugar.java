/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Capotes
 */
public class Lugar {
 
    private Funcion funcion;
    private int codLugar;
    private int fila;
    private int numero;
    private boolean estado;

    public Lugar(Funcion funcion, int codLugar, int fila, int numero, boolean estado) {
        this.funcion = funcion;
        this.codLugar = codLugar;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
    }

    public Lugar(int codLugar, int fila, int numero, boolean estado) {
        this.codLugar = codLugar;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
    }
    
    
    
    
   

    public Lugar() {
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }
    
    
       
    

    public int getCodLugar() {
        return codLugar;
    }

    public void setCodLugar(int codLugar) {
        this.codLugar = codLugar;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lugar{" + "funcion=" + funcion + ", codLugar=" + codLugar + ", fila=" + fila + ", numero=" + numero + ", estado=" + estado + '}';
    }

    
    
    
}
