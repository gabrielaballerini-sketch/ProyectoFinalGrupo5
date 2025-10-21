/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

<<<<<<< HEAD
import java.sql.Connection;
import persistencia.LugarData;

=======
<<<<<<< Updated upstream
/**
 *
 * @author Capotes
 */
=======
import java.sql.Connection;
import java.time.LocalDateTime;
import persistencia.LugarData;

>>>>>>> Stashed changes
>>>>>>> faty
public class ProyectoFinalGrupo5 {


    
    public static void main(String[] args) {
<<<<<<< HEAD
        
        
=======
<<<<<<< Updated upstream
        // TODO code application logic here
=======
        
        LocalDateTime horaInicio= LocalDateTime.of(2025, 10, 21, 20, 30,0);
        LocalDateTime horaFin= LocalDateTime.of(2025, 10, 21, 22, 30,0);
                
                
        Funcion nueva= new Funcion(1,"Tron", "Ingles", false, true, horaInicio,horaFin,5, 9000.00 );
>>>>>>> faty
        Connection conection=null;
       
    
        Conexion.buscarConexion();
        
        
<<<<<<< HEAD
        Lugar lugares=new Lugar(12, 152, 11, true);
=======
        Lugar lugares=new Lugar(1, 152, 11, true);
>>>>>>> faty
        
        LugarData lugar=new LugarData();
        
        lugar.guardarLugar(lugares);
        
        
<<<<<<< HEAD
        
=======
>>>>>>> Stashed changes
>>>>>>> faty
    }
    
}
