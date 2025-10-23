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
public class Comprador {
  
            private int dni;
            private String nombre;
            private LocalDate fechaNac;
            private String password;
            private String medioDePago;
            private boolean estado;
            
 
    public Comprador() {
    }

    public Comprador(int dni, String nombre, LocalDate fechaNac, String password, String medioDePago, boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.password = password;
        this.medioDePago = medioDePago;
        this.estado = estado;
    }
    
    
  

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMedioDePago() {
        return medioDePago;
    }

    public void setMedioDePago(String medioDePago) {
        this.medioDePago = medioDePago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Comprador{" + "dni=" + dni + ", nombre=" + nombre + ", fechaNac=" + fechaNac + ", password=" + password + ", medioDePago=" + medioDePago + ", estado=" + estado + '}';
    }
    
    
    
}
