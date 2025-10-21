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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Lugar;

public class LugarData {

   
 private Connection con=null;

    // Conexion con=null;
// private Connection con =null;
    public LugarData() {

       con= Conexion.buscarConexion();

    }

    public void guardarLugar(Lugar lugar) {

        String sql = " INSERT INTO lugardeasiento fila, numero, estado, idFuncion VALUES (?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, lugar.getFila());
            ps.setInt(2, lugar.getNumero());

            ps.setBoolean(3, lugar.isEstado());
            ps.setInt(4, lugar.getIdFuncion());
            
            
            
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()) {
            
            lugar.setCodLugar(rs.getInt(1));
            
            JOptionPane.showMessageDialog(null, "Lugar reservado con exito");
            
            ps.close();
            
            }
                
                

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer conexion");
        }

    }



    
}
