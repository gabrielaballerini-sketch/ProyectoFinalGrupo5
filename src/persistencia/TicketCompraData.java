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
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.TicketCompro;

/**
 *
 * @author Capotes
 */
public class TicketCompraData {
    private Connection con=null;

  
    public TicketCompraData() {
       con= Conexion.buscarConexion();
    }
    
    
    public void guardarTicket(TicketCompro tick){
        
        String sql = "INSERT INTO `tiketcompra`(`fechaDeCompra`, `fechaFuncion`, `monto`, `dni`) VALUES (?,?,?,?,?)";
   try{
        PreparedStatement  ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1,Date.valueOf(tick.getFechaCompra()));
            ps.setDate(2,Date.valueOf(tick.getFechaFuncion()));
            ps.setInt(3, tick.getMonto());
            ps.setInt(4, tick.getDni());
            
            ps.executeUpdate();
            
             ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {

                tick.setCodLugar(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ticket guradado");
            }
            
            ps.close();
        
   }catch(SQLException ex){
       JOptionPane.showMessageDialog(null,"Error en la base de datos ");
   }
    }
    
    public void actualizarTicket(){
        String sql = "UPDATE `tiketcompra` SET `fechaDeCompra`=?,`monto`=?,`dni`= ?, `codLugar` = ? WHERE fechaFuncion = ?";
        
    }
}
