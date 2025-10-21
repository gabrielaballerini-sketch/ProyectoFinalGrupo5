/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import persistencia.LugarData;

public class ProyectoFinalGrupo5 {


    
    public static void main(String[] args) {
        
        
        Connection conection=null;
       
    
        Conexion.buscarConexion();
        
        
        Lugar lugares=new Lugar(12, 152, 11, true);
        
        LugarData lugar=new LugarData();
        
        lugar.guardarLugar(lugares);
        
        
        
    }
    
}
