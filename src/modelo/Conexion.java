/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Capotes
 */
public class Conexion {
    
   
    private static String usuario="root";
    private static String url ="jdbc:mariadb://localhost:3306/proyectocinegrupo5";
    private static String password = "";
    private static Connection miConexion= null;

    public Conexion() {
        
    }
    

 

   
    
      
    public Connection buscarConexion () {
        if(miConexion ==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                miConexion = DriverManager.getConnection(url,usuario, password);
            } catch (ClassNotFoundException ex) {
                System.out.println("No es posible establecer connection");
                //JOptionPane.showMessageDialog(null,"No es posible establecer la conexion...");
            }catch (SQLException ex){
                System.out.println("No es posible conectarse a la base de datos");
                //JOptionPane.showMessageDialog(null, "Base de datos no encontrada...");
                }
            
        }
        return miConexion;
    }
}
    
    

