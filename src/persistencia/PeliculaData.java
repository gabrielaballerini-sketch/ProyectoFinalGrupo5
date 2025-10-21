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
import javax.swing.JOptionPane;
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
            
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR BS PELICULA");
        
        }
    }
    
    public Pelicula buscarPeliculaPorTitulo(String titulo) {
    
   
    
    
    String sql = "SELECT `id_pelicula`, `titulo`, `director`, `actores`, `origen`, `genero`, `estreno`, `enCartelera` FROM `pelicula` WHERE `titulo= ?";
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
                
               
                Date fechaSQL = rs.getDate("estreno");
                peli.setEstreno(fechaSQL.toLocalDate()); 
                
                peli.setEnCartelera(rs.getBoolean("enCartelera"));
            }
        }
        
    } catch (SQLException ex) {
        System.err.println(" Error al buscar película por título: " );
       
    }
    
    return peli; 
}
    
    public void actualizarPelicula(String titulo) {
    
   String sql = "UPDATE `pelicula` SET  `director`=?, `actores`=?, `origen`=?,`genero`=?, `estreno`=?, `enCartelera`=? WHERE `titulo`=?";
    
    Pelicula peliActualizar = buscarPeliculaPorTitulo(titulo);
    
    try {
        PreparedStatement ps = con.prepareStatement(sql);
     
        
        ps.setString(1, peliActualizar.getTitulo());
        ps.setString(2, peliActualizar.getDirector());
        ps.setString(3, peliActualizar.getActores());
        ps.setString(4, peliActualizar.getOrigen());
        ps.setString(5, peliActualizar.getGenero());
        ps.setDate(6, Date.valueOf(peliActualizar.getEstreno())); 
        ps.setBoolean(7, peliActualizar.isEnCartelera());
         
        
         ps.executeUpdate();
         JOptionPane.showMessageDialog(null,"Pelicula Actualizada");
         ps.close();
        }catch(SQLException ex){
        JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR BS PELICULA actual");
        }
    }
}
