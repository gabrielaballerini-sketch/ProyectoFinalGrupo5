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
    
    private int codLugar;
      private int fila;
        private int numero;
        private boolean estado;
        private String funcion;

    public Lugar(int codLugar, int fila, int numero, boolean estado, String funcion) {
        this.codLugar = codLugar;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
        this.funcion = funcion;
    }
        
    public Lugar() {
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

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    @Override
    public String toString() {
        return "Lugar{" + "codLugar=" + codLugar + ", fila=" + fila + ", numero=" + numero + ", estado=" + estado + ", funcion=" + funcion + '}';
    }


        
    
}
