/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;




public class Funcion {

 
    
    private int idFuncion;
    private String titulo;
    private String idioma;
    private boolean es3D;
    private boolean subtitulada;
    private LocalDateTime horaDeInicio;
    private LocalDateTime horaDeFin;
    private int lugaresDisponibles;
    private Sala sala;
    private double precioLugar;

    public Funcion(int idFuncion, String titulo, String idioma, boolean es3D, boolean subtitulada, LocalDateTime horaDeInicio, LocalDateTime horaDeFin, int lugaresDisponibles, Sala sala, double precioLugar) {
        this.idFuncion = idFuncion;
        this.titulo = titulo;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
        this.lugaresDisponibles = lugaresDisponibles;
        this.sala = sala;
        this.precioLugar = precioLugar;
    }

    public Funcion() {
    }

    
    
    
    public Funcion(String titulo, String idioma, boolean es3D, boolean subtitulada, LocalDateTime horaDeInicio, LocalDateTime horaDeFin, int lugaresDisponibles, Sala sala, double precioLugar) {
        this.titulo = titulo;
        this.idioma = idioma;
        this.es3D = es3D;
        this.subtitulada = subtitulada;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
        this.lugaresDisponibles = lugaresDisponibles;
        this.sala = sala;
        this.precioLugar = precioLugar;
    }

    public int getIdFuncion() {
        return idFuncion;
    }

    public void setIdFuncion(int idFuncion) {
        this.idFuncion = idFuncion;
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

    public int getLugaresDisponibles() {
        return lugaresDisponibles;
    }

    public void setLugaresDisponibles(int lugaresDisponibles) {
        this.lugaresDisponibles = lugaresDisponibles;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala nroSala) {
        this.sala = nroSala;
    }

  


    public double getPrecioLugar() {
        return precioLugar;
    }

    public void setPrecioLugar(double precioLugar) {
        this.precioLugar = precioLugar;
    }

    @Override
    public String toString() {
        return "Funcion{" + "idFuncion=" + idFuncion + ", titulo=" + titulo + ", idioma=" + idioma + ", es3D=" + es3D + ", subtitulada=" + subtitulada + ", horaDeInicio=" + horaDeInicio + ", horaDeFin=" + horaDeFin + ", lugaresDisponibles=" + lugaresDisponibles + ", sala=" + sala + ", precioLugar=" + precioLugar + '}';
    }

    

  

}
