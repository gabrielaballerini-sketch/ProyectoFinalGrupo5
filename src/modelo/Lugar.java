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
 
    private int idFuncion;
    private int codLugar;
    private int fila;
    private int numero;
    private boolean estado;

    public Lugar(int idFuncion, int codLugar, int fila, int numero, boolean estado) {
       

        this.idFuncion = idFuncion;
        this.codLugar = codLugar;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
    }

    public Lugar(int idFuncion, int fila, int numero, boolean estado) {
        this.idFuncion = idFuncion;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
    }
    
    
    
    
    

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
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
        return "Lugar{" + "idFuncion=" + idFuncion + ", codLugar=" + codLugar + ", fila=" + fila + ", numero=" + numero + ", estado=" + estado + '}';
    }
      

}
