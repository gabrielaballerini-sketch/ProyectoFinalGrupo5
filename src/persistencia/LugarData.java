/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Funcion;
import modelo.Lugar;

public class LugarData {

   
 private Connection con=null;


    public LugarData() {

       con= Conexion.buscarConexion();

    }

    public void guardarLugar(Lugar lugar) {

        String sql = " INSERT INTO lugardeasiento (fila, numero, estado, idFuncion) VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, lugar.getFila());
            ps.setInt(2, lugar.getNumero());

            ps.setBoolean(3, lugar.isEstado());
            ps.setInt(4, lugar.getFuncion().getIdFuncion());
            
            
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()) {
            
            lugar.setCodLugar(rs.getInt(1));
            
            JOptionPane.showMessageDialog(null, "Lugar guardado con exito");
            
        
            
            }
                
                ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer conexion");
        }

    }
    
    public Lugar buscarLugar(int codLugar) {
        
        String sql ="SELECT codLugar, fila, numero, estado, idFuncion FROM lugardeasiento WHERE codLugar=?";
        Lugar lugar =new Lugar();
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, codLugar);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
        
        lugar.setCodLugar(codLugar);
        lugar.setFila(rs.getInt("fila"));
        lugar.setNumero(rs.getInt("numero"));
        lugar.setEstado(rs.getBoolean("estado"));
      
         
         Funcion funcion=new Funcion();
        
        funcion.setIdFuncion((rs.getInt("idFuncion")));
        
        //lugar.setFuncion(funcion);
        
         // lugar.getFuncion.(rs.getInt("idFuncion"));
         
       //  lugar.setFuncion(rs.getInt("idFuncion"));
        
        
        
        
        }else{
        JOptionPane.showMessageDialog(null, "no se encotro el lugar");
        }
        ps.close();


        }catch(SQLException e){
        JOptionPane.showMessageDialog(null, "no se pudo conectar a la BD");
        
        }
        
        return lugar;
        }
    
    public void actualizarLugar(Lugar lugar){
    
        String sql="UPDATE `lugardeasiento` SET `fila`=?,`numero`=?,`estado`=?,`idFuncion`=? WHERE codLugar = ?";
    
      
        try{
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, lugar.getFila());
        ps.setInt(2, lugar.getNumero());
        ps.setBoolean(3, lugar.isEstado());
        
        
        
        
        ps.setInt(4, lugar.getFuncion().getIdFuncion());
        ps.setInt(5, lugar.getCodLugar());
        ps.executeUpdate();
     
        ps.close();
        
         JOptionPane.showMessageDialog(null, "Lugar actualizado correctamente");
      
        
        }catch(SQLException E){
        
          JOptionPane.showMessageDialog(null, "no se pudo conectar a la BD");
        
        }
    
    
    
    }
    public void bajaLogica( Lugar lugar){
        
        String sql="UPDATE lugardeasiento SET estado=0  WHERE codLugar= ?";
        
        try{
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setInt(1, lugar.getCodLugar());
               
               ps.executeUpdate();
               
               ps.close();
               
                JOptionPane.showMessageDialog(null, "baja del lugar exitosa");
    
        }catch(SQLException E ){
        
         JOptionPane.showMessageDialog(null, "no se pudo conectar a la BD");
        }
    
    }
     public void eliminarLugar(Lugar lugar){
             
       String query=" Delete from lugardeasiento where codLugar=? "; 
    
     try {
        PreparedStatement ps = con.prepareStatement(query);
   
         ps.setInt(1, lugar.getCodLugar());
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, "Lugar eliminado");
       
        } catch (SQLException e){
           
               JOptionPane.showMessageDialog(null, "no se pudo conectar a la BD");
        } 
    }
     
     



    
}