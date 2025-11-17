/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Comprador;
import modelo.Conexion;
import modelo.Lugar;
import modelo.TicketCompra;

/**
 *
 * @author Capotes
 */
public class CompradorData {
    
    private Connection conn = null;

    
    
    
    public CompradorData() {
        
        conn= Conexion.buscarConexion();
    }
    
    
    public void guardarComprador(Comprador compr){
        
        String query= "INSERT INTO `comprador`(`dni`, `nombre`, `fechaDeNacimiento`, `contraseña`, `estado`) VALUES (?,?,?,?,?)";
        try{
        PreparedStatement ps= conn.prepareStatement(query);
        LocalDate fechaUtil = compr.getFechaNac();
        java.sql.Date fechaSQL = java.sql.Date.valueOf(fechaUtil);
        ps.setInt(1, compr.getDni());
        ps.setString(2, compr.getNombre());
        ps.setDate(3, fechaSQL);
        ps.setString(4, compr.getPassword());
        ps.setBoolean(5, compr.isEstado());
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Comprador agregado con exito");
        ps.close();
        
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error de conexion"+ ex.getMessage());
        }
    }
    
   public Comprador buscarComprador(int dni){
       
       String query= "SELECT * FROM `comprador` WHERE dni = ?";
      Comprador compr= null;
       try{
         PreparedStatement ps= conn.prepareStatement(query);
       
         ps.setInt(1, dni);
         ResultSet resultado= ps.executeQuery();

             if (resultado.next()){

                compr= new Comprador();
                 compr.setDni(dni);
                 compr.setNombre(resultado.getString("nombre"));
                 compr.setFechaNac(resultado.getDate("fechaDeNacimiento").toLocalDate());
                 compr.setPassword(resultado.getString("contraseña"));
                 compr.setEstado(resultado.getBoolean("estado"));
                 
             }
            
            ps.close();
       
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
        return compr;
    }
 
    public ArrayList<Comprador> listarCompradores(){
       String query = "SELECT * FROM `comprador` ";
       ArrayList <Comprador> compradores = new ArrayList();
        try {
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet resultado= ps.executeQuery();
             
             while (resultado.next()){
                 
              Comprador compr= new Comprador();
              compr.setDni(resultado.getInt("dni"));
              compr.setNombre(resultado.getString("nombre"));
              compr.setFechaNac(resultado.getDate("fechaDeNacimiento").toLocalDate());
              compr.setPassword(resultado.getString("contraseña"));         
              compr.setEstado(resultado.getBoolean("estado"));
              
              
              compradores.add(compr);
              
             }   
             
              //JOptionPane.showMessageDialog(null, "Debe registrarse, no se encuentra el DNI" );
             ps.close();
             
             
             
            
        } catch (SQLException ex){
         JOptionPane.showMessageDialog(null, "Error de conexion"+ ex.getMessage() );
        
        }
        return compradores;
 
  }
    
    
   
    
    
    
    
    
    
    
    
    public void actualizarComprador(Comprador compr){
    
    String query= "UPDATE `comprador` SET`nombre`= ? ,`fechaDeNacimiento`= ? ,`contraseña`= ? WHERE dni= ? ";
   
    try{
        PreparedStatement ps= conn.prepareStatement(query);
        ps.setString(1, compr.getNombre());
        ps.setDate(2,Date.valueOf(compr.getFechaNac()));
        ps.setString(3, compr.getPassword());
        ps.setInt(4, compr.getDni());
        int filas = ps.executeUpdate();
        
         if (filas == 1) {

                JOptionPane.showMessageDialog(null, "Comprador actualizado");

            }
         ps.close();
    
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "Error al conectar"+ ex.getMessage());
     }
    }
    
    public void eliminarComprador(int dni){
        
        String query= "DELETE FROM `comprador` WHERE dni= ? ";
       
        try {
            PreparedStatement ps= conn.prepareStatement(query);
            ps.setInt(1, dni);
            int exito= ps.executeUpdate();
            if(exito ==1){
                JOptionPane.showMessageDialog(null, "Comprador eliminado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar "+ ex.getMessage());
        }
    
    
    }
    
    public void bajaLogica(int dni){
        
        String query= "UPDATE `comprador` SET `estado`= 0 WHERE dni= ? AND estado= 1" ;
        try {
        PreparedStatement ps = conn.prepareStatement(query); 
        ps.setInt(1, dni);
        int exito=ps.executeUpdate();
        if(exito ==1){
            JOptionPane.showMessageDialog(null, "Comprador dado de baja");
           } else if(exito == 0){
               JOptionPane.showMessageDialog(null, "No se encontró el Comprador");
           }
        
       
        } catch (SQLException ex){
            System.out.println("Error al conectar"+ ex.getMessage());
               
        }
    }
}
