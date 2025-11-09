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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
     
     public List<Lugar> lugaresXfuncion(int idFuncion){
     List<Lugar> lista = new ArrayList();
            String sql = "SELECT * FROM lugardeasiento WHERE idFuncion = ?";
     try {
         PreparedStatement ps = con.prepareStatement(sql);
         
               ps.setInt(1, idFuncion);
               
           ResultSet rs = ps.executeQuery();
           
           
           while(rs.next()){
               
            Lugar lugar = new Lugar();
               
           lugar.setCodLugar(rs.getInt("codLugar")); 
           lugar.setFila(rs.getInt("fila"));
           lugar.setNumero(rs.getInt("numero"));
           lugar.setEstado(rs.getBoolean("estado"));
            
           Funcion f = new Funcion();
           f.setIdFuncion(idFuncion);
           
           lugar.setFuncion(f);
           
              lista.add(lugar); 
           }
           
         ps.close();
           
           
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "ERROR AL OBTENER LUGARES");
     }
            
            

     return lista;
     }

    public void actualizarEstado(int codLugar, boolean estado){
     
        String sql = "UPDATE lugardeasiento SET estado=?  WHERE codLugar =? ";
        
     try {
         PreparedStatement ps = con.prepareStatement(sql);
         
         ps.setBoolean(1, estado);
         ps.setInt(2, codLugar);
        
         
         ps.executeUpdate();
         
     } catch (SQLException ex) {
         
      JOptionPane.showMessageDialog(null, "ERROR EN LA ACTUALIZACION");
      
     }
     
     
     }
    
    public void generarLugaresBatch(Funcion funcion, int filas, int columnas) {
    
    String sql = "INSERT INTO lugardeasiento (idFuncion, fila, numero, estado) VALUES (?, ?, ?, ?)";
    
    try (PreparedStatement ps = con.prepareStatement(sql)) { 
        
        for (int f = 1; f <= filas; f++) {
            for (int c = 1; c <= columnas; c++) {
                
                ps.setInt(1, funcion.getIdFuncion());
                ps.setInt(2, f);
                ps.setInt(3, c);
                ps.setBoolean(4, true); 
                
                ps.addBatch();
            }
        }
        
        ps.executeBatch(); 
        JOptionPane.showMessageDialog(null, "Se crearon 40 butacas disponibles.");
        
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al generar butacas con Batch: " + ex.getMessage());
    }
}
    
   

}