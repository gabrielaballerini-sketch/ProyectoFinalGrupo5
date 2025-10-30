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
import java.util.HashSet;
import javax.swing.JOptionPane;
import modelo.Comprador;
import modelo.Conexion;
import modelo.Pelicula;

/**
 *
 * @author Capotes
 */
public class PeliculaData {
    
    
    private Connection con=null;

 
    public PeliculaData() {

       con= Conexion.buscarConexion();

    }
   
    public void guardarPelicula(Pelicula peli){
    String sql = "INSERT INTO `pelicula`(`titulo`, `director`, `actores`, `origen`, `genero`, `estreno`, `enCartelera`) VALUES (?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, peli.getTitulo());
            ps.setString(2, peli.getDirector());
            ps.setString(3,peli.getActores());
            ps.setString(4, peli.getOrigen());
            ps.setString(5, peli.getGenero());
             LocalDate estreno = peli.getEstreno();
            ps.setDate(6,Date.valueOf(estreno));
            ps.setBoolean(7, peli.isEnCartelera());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se gurado la pelicula correctamente");
            
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"ERROR al guardar una pelicula");
        
        }
    }
    
    public Pelicula buscarPeliculaPorTitulo(String titulo) {
    
   
    
    
    String sql = "SELECT `titulo`, `director`, `actores`, `origen`, `genero`, `estreno`, `enCartelera` FROM `pelicula` WHERE titulo= ?";
    Pelicula peli= null;
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        
        ps.setString(1,titulo); 
        
        
        ResultSet rs = ps.executeQuery(); {
            
            
            if (rs.next()) { 
                  peli = new Pelicula();
                
                peli.setTitulo(rs.getString("titulo"));
                peli.setDirector(rs.getString("director"));
                peli.setActores(rs.getString("actores"));
                peli.setOrigen(rs.getString("origen"));
                peli.setGenero(rs.getString("genero"));
                
               
                Date fecha = rs.getDate("estreno");
                peli.setEstreno(fecha.toLocalDate()); 
                
                peli.setEnCartelera(rs.getBoolean("enCartelera"));
            }else{
                JOptionPane.showMessageDialog(null,"Esa pelicula no esta disponible");
                
            }
        }
        
    } catch (SQLException ex) {
        System.err.println(" Error al buscar película por título: " );
       
    }
    
    return peli; 
}
    
    public void actualizarPelicula(Pelicula peli) {
    
   String sql = "UPDATE `pelicula` SET  `director`=?, `actores`=?, `origen`=?,`genero`=?, `estreno`=?, `enCartelera`=? WHERE `titulo` = ?";
    
    //Pelicula peliActualizar = buscarPeliculaPorTitulo(titulo);
   
    try {
        PreparedStatement ps = con.prepareStatement(sql);
     
        
        ps.setString(7, peli.getTitulo());
        ps.setString(1, peli.getDirector());
        ps.setString(2, peli.getActores());
        ps.setString(3, peli.getOrigen());
        ps.setString(4, peli.getGenero());
        
        ps.setDate(5, Date.valueOf(peli.getEstreno())); 
        ps.setBoolean(6, peli.isEnCartelera());
         
        
         int fila = ps.executeUpdate();
         if(fila==1){
         JOptionPane.showMessageDialog(null,"Pelicula Actualizada");
             }
         
         
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR BS PELICULA actual");
        }
    }
    
        public void borrarPelicula(String titulo){
            String sql = " DELETE FROM pelicula WHERE titulo = ?";   
            
           try{ 
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1,titulo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se elimino la pelicula correctamente");
           }catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "No se elimino la pelicula");
           }
        }
        
        public ArrayList<Pelicula> listarPeliculas(){
       String query = "SELECT * FROM `pelicula` ";
       ArrayList <Pelicula> peliculas = new ArrayList();
        try {
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet resultado= ps.executeQuery();
             
             while (resultado.next()){
                 
              Pelicula  peli= new Pelicula();
              peli.setTitulo(resultado.getString("titulo"));
               peli.setDirector(resultado.getString("director"));
                peli.setActores(resultado.getString("actores"));
                 peli.setOrigen(resultado.getString("origen"));
                  peli.setGenero(resultado.getString("genero"));
                  peli.setEstreno(resultado.getDate("estreno").toLocalDate());
                  peli.setEnCartelera(resultado.getBoolean("encartelera"));
                  
              
              peliculas.add(peli);
             }   
             ps.close();
            
        } catch (SQLException ex){
         JOptionPane.showMessageDialog(null, "Error de conexion"+ ex.getMessage() );
        
        }
        return peliculas;
 
  }
}
