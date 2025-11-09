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
import java.sql.Timestamp;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Lugar;
import modelo.TicketCompra;

/**
 *
 * @author Capotes
 */
public class TicketCompraData {
    
 
    
    

    private Connection con = null;

    public TicketCompraData() {
        con = Conexion.buscarConexion();
    }

    public void comprarTicket(TicketCompra ticket) {

        String sql = "INSERT INTO `ticketcompra`(`fechaCompra`, `precio`, `dni`,`horaDelInicio`, `idFuncion`, `codLugar`) VALUES "
                + "(?,?,?,?,?,?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(ticket.getFechaCompra()));
            ps.setInt(2, ticket.getPrecio());
            ps.setInt(3, ticket.getComprador1().getDni());
            ps.setTimestamp(4, java.sql.Timestamp.valueOf(ticket.getFuncion1().getHoraDeInicio()));
            ps.setInt(5, ticket.getFuncion1().getIdFuncion());
            ps.setInt(6, ticket.getLugar1().getCodLugar());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ticket.setId_ticket(rs.getInt(1));

                JOptionPane.showMessageDialog(null, "Ticket reservado con exito ");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }

    }

    public void modificarTicket(TicketCompra ticket) {

        String sql = "UPDATE `ticketcompra` SET `horaDeInicio`=? WHERE id_ticket=? ";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setTimestamp(1, Timestamp.valueOf(ticket.getFuncion1().getHoraDeInicio()));
            ps.setInt(2, ticket.getId_ticket());

            int exito = ps.executeUpdate();

            if (exito == 1) {

                JOptionPane.showMessageDialog(null, "Ticket modificado");
            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }
    }

    public TicketCompra buscarTicket(int id_ticket) {

        TicketCompra ticketCompra = null;

        String sql = "SELECT `id_ticket`, `fechaCompra`, `precio`, `dni`, `horaDeInicio`, `codLugar` FROM `ticketcompra` WHERE id_ticket=?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id_ticket);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                ticketCompra = new TicketCompra();

                ticketCompra.setId_ticket(id_ticket);
                ticketCompra.setFechaCompra(rs.getDate("fechaCompra").toLocalDate());
                ticketCompra.setPrecio(rs.getInt("precio"));
                ticketCompra.getComprador1().setDni(rs.getInt("dni"));
                ticketCompra.getFuncion1().setHoraDeInicio(rs.getTimestamp("horaDeInicio").toLocalDateTime());
                ticketCompra.getLugar1().setCodLugar(rs.getInt("codLugar"));

            } else {

                JOptionPane.showMessageDialog(null, "No existe el ticket");

            }

            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");

        }
        return ticketCompra;

    }
    
   
         

}
