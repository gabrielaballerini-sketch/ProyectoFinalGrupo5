/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import persistencia.LugarData;
import persistencia.PeliculaData;


public class ProyectoFinalGrupo5 {


    
    public static void main(String[] args) {

        
        LocalDateTime horaInicio= LocalDateTime.of(2025, 10, 21, 20, 30,0);
        LocalDateTime horaFin= LocalDateTime.of(2025, 10, 21, 22, 30,0);
                
                
        Funcion nueva= new Funcion(1,"Tron", "Ingles", false, true, horaInicio,horaFin,20,5, 9000.00 );

        Connection conection=null;
       
    
        Conexion.buscarConexion();
 

        Lugar lugares=new Lugar(1, 152, 11, true);

        LugarData lugar=new LugarData();
        
        //lugar.guardarLugar(lugares);
     
        LocalDate estreno = LocalDate.of(2025, 4, 15);
        Pelicula peli1= new Pelicula("Jhon wick 4","Chad Stahelski"," Reeves","Ek","Accion",estreno,true);
        PeliculaData pelidata= new PeliculaData();
        //pelidata.guardarPelicula(peli1);
        Pelicula peli2= new Pelicula("Jhon wick 3","Chad ","Keanu ","EE.UU","Accion",estreno,true);
        pelidata.guardarPelicula(peli2);
        
        pelidata.actualizarPelicula(peli1);
        //pelidata.borrarPelicula("Jhon wick 4");
        
 }
}
