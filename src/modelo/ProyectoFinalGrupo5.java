/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
public class ProyectoFinalGrupo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
<<<<<<< Updated upstream
        // TODO code application logic here
=======
        
        LocalDateTime horaInicio= LocalDateTime.of(2025, 10, 21, 20, 30,0);
        LocalDateTime horaFin= LocalDateTime.of(2025, 10, 21, 22, 30,0);
                
                
        Funcion nueva= new Funcion(1,"Tron", "Ingles", false, true, horaInicio,horaFin,5, 9000.00 );
        Connection conection=null;
       
    
        Conexion.buscarConexion();
        
        
        Lugar lugares=new Lugar(1, 152, 11, true);
        
        LugarData lugar=new LugarData();
        
        lugar.guardarLugar(lugares);
        
        
>>>>>>> Stashed changes
    }
    
}
