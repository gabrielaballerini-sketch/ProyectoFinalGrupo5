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
    
   
    private String usuario;
    private String url;
    private String password;
    private static Connection conexion= null;
    

    public Conexion(String url, String usuario, String password) {
        this.usuario = usuario;
        this.url = url;
        this.password = password;
       
    }
      
    public Connection buscarConexion () {
        if(conexion ==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url,usuario, password);
            } catch (ClassNotFoundException ex) {
                System.out.println("No es posible establecer connection");
                //JOptionPane.showMessageDialog(null,"No es posible establecer la conexion...");
            }catch (SQLException ex){
                System.out.println("No es posible conectarse a la base de datos");
                //JOptionPane.showMessageDialog(null, "Base de datos no encontrada...");
                }
            
        }
        return conexion;
    }
}
    
    

