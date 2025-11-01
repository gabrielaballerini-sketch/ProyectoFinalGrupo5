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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import modelo.Conexion;
import modelo.Sala;
import org.mariadb.jdbc.Statement;


/**
 *
 * @author Capotes
 */
public class SalaData {
    
         
    private Connection con=null;

    public SalaData() {
        
        con= Conexion.buscarConexion();
        
    }

  public void guardarSala (Sala sala){
  
  String sql=" INSERT INTO `salas`( `apta3D`, `capacidad`, `estado`) VALUES (?,?,?)";
  
  try{
  
  PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

  

  ps.setBoolean(1,sala.isApta3D());
  ps.setInt(2, sala.getCapacidad());
  ps.setBoolean(3, sala.isEstado());
  
  ps.executeUpdate();
  
   ResultSet rs=ps.getGeneratedKeys(); 
    
    if(rs.next()){
 
     sala.setNroSala(rs.getInt(1));
    
    JOptionPane.showMessageDialog(null, "Sala guardada con exito");
    
    }
  
       
 
  ps.close();
  
  
  }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
  
  }
          
  
  }
  
  
  
  
  
  public void modificarSala(Sala sala){
  
  
  
  String sql="UPDATE `salas` SET apta3D=?,capacidad=? where nroSala=?";
  
  
  try{
  
  PreparedStatement ps=con.prepareStatement(sql);
  
  ps.setBoolean(1, sala.isApta3D());
  ps.setInt(2, sala.getCapacidad());
  ps.setInt(3, sala.getNroSala());
  
  int exito=ps.executeUpdate();
  
  if(exito==1){
  
  JOptionPane.showMessageDialog(null, "Sala modificada");
  
    }
  
            
      
  }catch(SQLException ex){
  
  JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
      
  }
  
  
  
  
  }
  
  
   public Sala buscarSala(int numsala){
   
   
   Sala sala=null;
   
   String sql="SELECT apta3D, capacidad, estado FROM `salas` WHERE nroSala=? ";
   
   
   try{
   
   
   PreparedStatement ps=con.prepareStatement(sql);
   
   ps.setInt(1, numsala);
   
   ResultSet rs=ps.executeQuery();
   
   
   if(rs.next()){
   
   
   sala=new Sala();
   
   sala.setNroSala(numsala);
   sala.setApta3D(rs.getBoolean("apta3D"));
   sala.setCapacidad(rs.getInt("capacidad"));
   sala.setEstado(rs.getBoolean("estado"));
   
   
     
    
   
   
   }else{
   
   
   JOptionPane.showMessageDialog(null, "No existe una sala con ese número");
   ps.close();
   }
   
   
   
     
  }catch(SQLException ex){
  
  JOptionPane.showMessageDialog(null, "No existe sala con ese número");
      
  }
        return sala;
  
       
       
   
   
   
   }
  
  
   
   
   public List <Sala> listarSalas(){
       
       String sql="SELECT nroSala, `apta3D`, `capacidad`, `estado` FROM `salas`";
       
       
       ArrayList<Sala> listaSalas=new ArrayList<>();
       
       try{
       
       
       PreparedStatement ps=con.prepareStatement(sql);
       
       ResultSet rs=ps.executeQuery();
       
       
       while(rs.next()){
           
           
           Sala sala1=new Sala();
           
           sala1.setNroSala(rs.getInt("nroSala"));
           sala1.setApta3D(rs.getBoolean("apta3D"));
          sala1.setCapacidad(rs.getInt("capacidad"));
          sala1.setEstado(rs.getBoolean("estado"));
          
          listaSalas.add(sala1);
          ps.close();
          
           
           
       }
       
       
       
       
       
       
       }catch(SQLException ex){
  
  JOptionPane.showMessageDialog(null, "Error al acceder a las listas");
       
       
       
       
       
   
   
   
   }
   return listaSalas;
  

       

    }
   
   
   
   public void eliminarSala(int nroSala){
   
   String sql="UPDATE salas SET estado=0 WHERE nroSala=?";
   
   try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, nroSala);
        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Sala dada de baja correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No existe una sala con ese número");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla: " + ex.getMessage());
    }
   
      
   
   
   
   }
           
           
   
   
   
   
       
       
       
   
   }
   
   
   
   
   
   




    
    
    

