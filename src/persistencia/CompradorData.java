/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modelo.Comprador;
import modelo.Conexion;

/**
 *
 * @author Capotes
 */
public class CompradorData {
    
    private Connection conn = null;

    
    public CompradorData() {
    }
    
    
    public CompradorData(Conexion conexion) {
        
        this.conn= conexion.buscarConexion();
    }
    
    
    public void guardarComprador(Comprador compr){
        String query= "INSERT INTO `comprador`(`dni`, `nombre`, `fechaDeNacimiento`, `contraseña`, `medioDePago`) VALUES (?,?,?,?,?)";
        try{
        PreparedStatement ps= conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        LocalDate fechaUtil = compr.getFechaNac();
        java.sql.Date fechaSQL = java.sql.Date.valueOf(fechaUtil);
        ps.setInt(1, compr.getDni());
        ps.setString(2, compr.getNombre());
        ps.setDate(3, fechaSQL);
        ps.setString(4, compr.getPassword());
        ps.setString(5, compr.getMedioDePago());
        ps.executeUpdate();
        
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error de conexion");
        }
    
    
}
