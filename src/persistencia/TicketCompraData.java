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
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import modelo.Comprador;
import modelo.Conexion;
import modelo.Funcion;
import modelo.Lugar;
import modelo.TicketCompra;

/**
 *
 * @author Capotes
 */
public class TicketCompraData {
    
 
    private LugarData lugdata = new LugarData(); 
    private FuncionData fundata = new FuncionData();
    private CompradorData comdata = new CompradorData();
    private Connection con = null;

    public TicketCompraData() {
        con = Conexion.buscarConexion();
        
        
    }

    public void comprarTicket(TicketCompra ticket) {

        String sql = "INSERT INTO `ticketcompra`(`fechaCompra`, `precio`, `dni`,`horaDeInicio`, `codLugar`,`medioPago`,idFuncion ) VALUES "
                + "(?,?,?,?,?,?,?)";

   
           
         // INSERT INTO `ticketcompra`(`fechaCompra`, `precio`, `dni`, `horaDeInicio`, `codLugar`, `medioPago`, `id_ticket`, `idFuncion`) 
         // VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]','[value-7]','[value-8]')
         
        
        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setDate(1, Date.valueOf(ticket.getFechaCompra()));
            ps.setInt(2, ticket.getPrecio());
            ps.setInt(3, ticket.getComprador1().getDni());
            
                   
            ps.setTimestamp(4, java.sql.Timestamp.valueOf(ticket.getFuncion1().getHoraDeInicio())); // horaDelInicio
             ps.setInt(5, ticket.getLugar1().getCodLugar());                       
             ps.setString(6,ticket.getMedioDePago() );      
               
               
            ps.setInt(7, ticket.getFuncion1().getIdFuncion());
        
       

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ticket.setId_ticket(rs.getInt(1));

                System.out.println("Ticket reservado con exito ");

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
   
        String sql = "SELECT `fechaCompra`, `precio`, `dni`, `horaDeInicio`, `codLugar`, `medioPago`, `id_ticket`, `idFuncion` FROM `ticketcompra` WHERE `id_ticket`=?";
            
        try {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id_ticket);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                ticketCompra = new TicketCompra();
                ticketCompra.setFechaCompra(rs.getDate("fechaCompra").toLocalDate());
                ticketCompra.setPrecio(rs.getInt("precio"));
                ticketCompra.setLugar1(new Lugar());
                ticketCompra.setFuncion1(new Funcion());
                ticketCompra.setComprador1(new Comprador());
                ticketCompra.getComprador1().setDni(rs.getInt("dni"));
                
                ticketCompra.getFuncion1().setHoraDeInicio(rs.getTimestamp("horaDeInicio").toLocalDateTime());
                ticketCompra.getLugar1().setCodLugar(rs.getInt("codLugar"));
                ticketCompra.setMedioDePago(rs.getString("medioPago"));
                ticketCompra.setId_ticket(id_ticket);
                ticketCompra.getFuncion1().setIdFuncion(rs.getInt("idFuncion"));
            } else {

                JOptionPane.showMessageDialog(null, "No existe el ticket");
            }
            
            ps.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");

        }
        return ticketCompra;
    }
    
    public ArrayList<TicketCompra> listaTicketsPorPelicula(String titulo){
       
        String query= "SELECT * FROM ticketcompra JOIN funcion  ON ticketcompra.idFuncion= funcion.idFuncion JOIN pelicula ON funcion.titulo= pelicula.titulo WHERE pelicula.titulo= ?";
        ArrayList <TicketCompra> tickets= new ArrayList();
        
        try{
        
        PreparedStatement ps = con.prepareStatement(query);
            ps.setString (1,titulo);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            TicketCompra ticket = new TicketCompra();
                ticket.setId_ticket(rs.getInt("id_ticket"));
                ticket.setFechaCompra(rs.getDate("fechaCompra").toLocalDate());
                ticket.setPrecio(rs.getInt("precio"));
                ticket.setComprador1(new Comprador());
                ticket.setFuncion1(new Funcion());
                ticket.setLugar1(new Lugar());
                
                ticket.getComprador1().setDni(rs.getInt("dni"));
                ticket.getFuncion1().setHoraDeInicio(rs.getTimestamp("horaDeInicio").toLocalDateTime());
                ticket.getLugar1().setCodLugar(rs.getInt("codLugar"));
                ticket.setMedioDePago(rs.getNString("medioPago"));
                ticket.getFuncion1().setIdFuncion(rs.getInt("idFuncion"));
                
                tickets.add(ticket);
            
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }
            
            return tickets;
    }
    
        public ArrayList<TicketCompra> listaTicketsPorFecha(LocalDate fecha){
            Date fecha1 = Date.valueOf(fecha);
            
        String query= "SELECT * FROM ticketcompra JOIN funcion  ON ticketcompra.idFuncion= funcion.idFuncion JOIN pelicula ON funcion.titulo= pelicula.titulo WHERE fechaCompra = ?";
        ArrayList <TicketCompra> tickets= new ArrayList();
        
        try{
        
        PreparedStatement ps = con.prepareStatement(query);
            ps.setDate(1,fecha1);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            
            TicketCompra ticket = new TicketCompra();
                ticket.setId_ticket(rs.getInt("id_ticket"));
                ticket.setFechaCompra(rs.getDate("fechaCompra").toLocalDate());
                ticket.setPrecio(rs.getInt("precio"));
                ticket.setComprador1(new Comprador());
                ticket.setFuncion1(new Funcion());
                ticket.setLugar1(new Lugar());
                
                ticket.getComprador1().setDni(rs.getInt("dni"));
                ticket.getFuncion1().setHoraDeInicio(rs.getTimestamp("horaDeInicio").toLocalDateTime());
                ticket.getLugar1().setCodLugar(rs.getInt("codLugar"));
                ticket.setMedioDePago(rs.getNString("medioPago"));
                ticket.getFuncion1().setIdFuncion(rs.getInt("idFuncion"));
                
                tickets.add(ticket);
            
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
        }
            
            return tickets;
    }
        
        
        
        
        
         public ArrayList<TicketCompra> compradorPorFecha(LocalDate fecha){
        
       String query = "SELECT ticketcompra.fechaCompra, ticketcompra.codLugar, ticketcompra.id_ticket, "  
       + " ticketcompra.dni, comprador.nombre  FROM ticketcompra join comprador ON ticketcompra.dni= comprador.dni WHERE ticketcompra.fechaCompra= ?";
       
       
     
       ArrayList <TicketCompra> tickets = new ArrayList();
        try {
             PreparedStatement ps = con.prepareStatement(query);
             
               ps.setDate(1,Date.valueOf(fecha));
             
             
             ResultSet resultado= ps.executeQuery();
             
                        
             while (resultado.next()){
                
           
            TicketCompra ticket=new TicketCompra();
                              
             ticket.setFechaCompra(resultado.getDate("fechaCompra").toLocalDate());
                   
              ticket.setComprador1(new Comprador());
               
              ticket.setLugar1(new Lugar());
              
              
               
               ticket.getLugar1().setCodLugar(resultado.getInt("codLugar"));
               ticket.setId_ticket(resultado.getInt("id_ticket"));
               
              ticket.getComprador1().setDni(resultado.getInt("dni"));
              ticket.getComprador1().setNombre(resultado.getString("nombre"));
                
                     
              
              
              tickets.add(ticket);
             }   
             ps.close();
            
        } catch (SQLException ex){
         JOptionPane.showMessageDialog(null, "Error de conexion"+ ex.getMessage() );
        
        }
        return tickets;
 
  }
    
        
        
        
            


         

}
