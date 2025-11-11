/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import persistencia.CompradorData;
import persistencia.FuncionData;
import persistencia.LugarData;
import persistencia.PeliculaData;
import persistencia.SalaData;
import persistencia.TicketCompraData;


public class ProyectoFinalGrupo5 {


    
    public static void main(String[] args) {

        
       LocalDateTime horaInicio= LocalDateTime.of(2025, 10, 21, 20, 30,0);
       LocalDateTime horaFin= LocalDateTime.of(2025, 10, 21, 22, 30,0);
       
              Sala sal = new Sala(4,true,40,true); 
        Funcion nueva= new Funcion("Tron", "Esp", true, true, horaInicio,horaFin,sal);
        
        /*
        Funcion nue = new Funcion("Huye","ingles",true,true,horaInicio,horaFin,12,5,10000.9);
        Funcion nue1 = new Funcion("Alien 3","ingles",true,true,horaInicio,horaFin,12,5,10000.9);
        Funcion nue2 = new Funcion("Depredador","ingles",true,true,horaInicio,horaFin,12,5,10000.9);
        Funcion nue3 = new Funcion("Anna","ingles",true,true,horaInicio,horaFin,12,5,10000.9);
        Funcion nue4 = new Funcion("El Conjuro 2","ingles",true,true,horaInicio,horaFin,12,5,10000.9);
        FuncionData funData = new FuncionData();
        funData.GuardarProyeccion(nue);
        funData.GuardarProyeccion(nue1);
        funData.GuardarProyeccion(nue2);
        funData.GuardarProyeccion(nue3);
        funData.GuardarProyeccion(nue4); */
        
        //funData.modificarFuncion(nueva);
        //Funcion aux = funData.BuscarFuncion(7);
        //System.out.println(aux.toString());
        //funData.EliminarFuncion(5);
        
        
        LocalDate fechaNac = LocalDate.of(2001, 4, 15);
        //LocalDate fechaNac1 = LocalDate.of(1999, 3, 12);
       CompradorData comdata = new CompradorData();
             /*
        Comprador com= new Comprador(23541841,"Ramon",fechaNac1,"root","Debito",true);
        Comprador com1= new Comprador(13321841,"Franco",fechaNac,"42cj","Debito",false);
        Comprador com2= new Comprador(22321841,"Ezequiel",fechaNac,"4332cj","Debito",true);
        
        
        //for (Comprador lis : comdata.listarCompradores()) {
                //System.out.println(lis);
       // }
      
                                        
        //comdata.actualizarComprador(com);
        //comdata.bajaLogica(43321841);
        //comdata.eliminarComprador(43321841);
        
        Connection conection=null;
        Conexion.buscarConexion();
 

        
        LugarData lugardata=new LugarData();
        //lugardata.guardarLugar(lugar);
        //lugardata.actualizarLugar(lugar);
        
     /*
        LocalDate estreno = LocalDate.of(2025, 4, 15);
        LocalDate estreno1 = LocalDate.of(2025, 3, 20);
    Pelicula peli1= new Pelicula("Huye","Chad S","Pao","Eu","Terro",estreno,true);
    Pelicula peli2= new Pelicula("Alien 3","Chd S","Patricio","Eu","Terro",estreno,true);
    Pelicula peli3= new Pelicula("Depredador","Chad S","Patricio","Eu","Terro",estreno1,true);
    Pelicula peli4= new Pelicula("Anna","Ch S","Patricio","Et","Terro",estreno1,true);
    Pelicula peli5= new Pelicula("El Conjuro 2","hadS","Patio","Eu","Terro",estreno1,false);
    Pelicula peli6= new Pelicula("Jhon wick","Chad ","anu ","EkU","Accion",estreno,true);
        PeliculaData pelidata= new PeliculaData();
        pelidata.guardarPelicula(peli1);
        pelidata.guardarPelicula(peli2);
        pelidata.guardarPelicula(peli3);
        pelidata.guardarPelicula(peli4);
        pelidata.guardarPelicula(peli5);
        pelidata.guardarPelicula(peli6);  */
       
        //pelidata.guardarPelicula(peli2);
       // pelidata.actualizarPelicula(peli1);
        //pelidata.borrarPelicula("Jhon wick 4");
       
       
       
        Sala sal1 = new Sala(2,false,50,true);
        Sala sal2 = new Sala(6,false,50,true);
        Sala sal3 = new Sala(7,true,50,true);
        Sala sal4 = new Sala(8,false,45,false);
        SalaData sadata= new SalaData();
        //sadata.guardarSala(sal);
        //sadata.modificarSala(sal4);
        
        Lugar lugar=new Lugar(6, 45, 21, true);
        LocalDate fecha= LocalDate.now();
        
        Comprador com3= new Comprador(51321841,"Rob",fechaNac,"432cj",true);
       // comdata.guardarComprador(com3);
       //Comprador aux = comdata.buscarComprador(51321841);
      // System.out.println(aux.toString());
       
        //TicketCompra ticket= new TicketCompra(fecha,9000, com3, nueva, lugar, "debito" );
        TicketCompraData ticketData= new TicketCompraData();
        //ticketData.comprarTicket(ticket);
        //TicketCompra tick1= ticketData.buscarTicket(12);
       // System.out.println(tick1.getComprador1().getDni());

 }
}
