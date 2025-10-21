/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

<<<<<<< HEAD

import java.time.LocalDate;
import java.util.ArrayList;


=======
<<<<<<< Updated upstream
=======

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;


>>>>>>> Stashed changes
>>>>>>> faty
/**
 *
 * @author Capotes
 */
public class Funcion {
<<<<<<< HEAD
=======
<<<<<<< Updated upstream
=======
>>>>>>> faty
 
    
    private int idFuncion;
    private String pelicula;
    private String idioma;
    private boolean es3D;
    private boolean subtitulada;
<<<<<<< HEAD
    private LocalDate horaDeInicio;
    private LocalDate horaDeFin;
=======
    private LocalDateTime horaDeInicio;
    private LocalDateTime horaDeFin;
>>>>>>> faty
    private ArrayList lugaresDisponibles;
    private int salaDeProyeccion;
    private double precioLugar;

<<<<<<< HEAD
    public Funcion(String pelicula, String idioma, boolean es3D, boolean subtitulada, LocalDate horaDeInicio, LocalDate horaDeFin, ArrayList lugaresDisponibles, int salaDeProyeccion, double precioLugar) {
        this.pelicula = pelicula;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
        this.lugaresDisponibles = lugaresDisponibles;
        this.salaDeProyeccion = salaDeProyeccion;
        this.precioLugar = precioLugar;
    }

    public Funcion(int idFuncion, String pelicula, String idioma, boolean es3D, boolean subtitulada, LocalDate horaDeInicio, LocalDate horaDeFin, ArrayList lugaresDisponibles, int salaDeProyeccion, double precioLugar) {
=======
    public Funcion(int idFuncion, String pelicula, String idioma, boolean es3D, boolean subtitulada, LocalDateTime horaDeInicio, LocalDateTime horaDeFin, int salaDeProyeccion, double precioLugar) {
>>>>>>> faty
        this.idFuncion = idFuncion;
        this.pelicula = pelicula;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
<<<<<<< HEAD
        this.lugaresDisponibles = lugaresDisponibles;
        this.salaDeProyeccion = salaDeProyeccion;
        this.precioLugar = precioLugar;
    }
    

    
    
    
=======
        this.salaDeProyeccion = salaDeProyeccion;
        this.precioLugar = precioLugar;
    }

    public Funcion(String pelicula, String idioma, boolean es3D, boolean subtitulada, LocalDateTime horaDeInicio, LocalDateTime horaDeFin, int salaDeProyeccion, double precioLugar) {
        this.pelicula = pelicula;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
       
        this.salaDeProyeccion = salaDeProyeccion;
        this.precioLugar = precioLugar;
    }

>>>>>>> faty
    
    
    public Funcion() {
       
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public void setEs3D(boolean es3D) {
        this.es3D = es3D;
    }

    public boolean isSubtitulada() {
        return subtitulada;
    }

    public void setSubtitulada(boolean subtitulada) {
        this.subtitulada = subtitulada;
    }

<<<<<<< HEAD
    public LocalDate getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(LocalDate horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public LocalDate getHoraDeFin() {
        return horaDeFin;
    }

    public void setHoraDeFin(LocalDate horaDeFin) {
        this.horaDeFin = horaDeFin;
    }

    public ArrayList getLugaresDisponibles() {
        return lugaresDisponibles;
    }
=======
    public LocalDateTime getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(LocalDateTime horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public LocalDateTime getHoraDeFin() {
        return horaDeFin;
    }

    public void setHoraDeFin(LocalDateTime horaDeFin) {
        this.horaDeFin = horaDeFin;
    }

>>>>>>> faty

    public void setLugaresDisponibles(ArrayList lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }

    public int getSalaDeProyeccion() {
        return salaDeProyeccion;
    }

    public void setSalaDeProyeccion(int salaDeProyeccion) {
        this.salaDeProyeccion = salaDeProyeccion;
    }

    public double getPrecioLugar() {
        return precioLugar;
    }

    public void setPrecioLugar(double precioLugar) {
        this.precioLugar = precioLugar;
    }

    @Override
    public String toString() {
        return "Funcion{" + "idFuncion=" + idFuncion + ", pelicula=" + pelicula + ", idioma=" + idioma + ", es3D=" + es3D + ", subtitulada=" + subtitulada + ", horaDeInicio=" + horaDeInicio + ", horaDeFin=" + horaDeFin + ", lugaresDisponibles=" + lugaresDisponibles + ", salaDeProyeccion=" + salaDeProyeccion + ", precioLugar=" + precioLugar + '}';
    }

    
    
    
    
    
    
<<<<<<< HEAD
=======
>>>>>>> Stashed changes
>>>>>>> faty
    
}
