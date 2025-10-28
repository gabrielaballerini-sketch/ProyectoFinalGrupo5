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
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Funcion;
import org.mariadb.jdbc.Statement;

/**
 *
 * @author Capotes
 */
public class FuncionData {
    
 
    private Connection con=null;

  
    public FuncionData() {

       con= Conexion.buscarConexion();

    }
    
    public void GuardarProyeccion(Funcion funcion){
    
    String sql="insert into funcion (titulo, idioma , es3D, subtitulada, horaInicio, horaFin,LugaresDisp, nroSala, precioDelLugar ) "
            + " VALUES (?,?,?,?,?,?,?,?,?)";
    
    
    try{
    
    PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
    ps.setString(1, funcion.getTitulo());
    ps.setString(2,funcion.getIdioma());
    ps.setBoolean(3, funcion.isEs3D());
    ps.setBoolean(4, funcion.isSubtitulada());
    
    ps.setTimestamp(5,Timestamp.valueOf(funcion.getHoraDeInicio()));
    ps.setTimestamp(6, Timestamp.valueOf(funcion.getHoraDeFin()));
    
        ps.setInt(7, funcion.getLugaresDisponibles());
   ps.setInt(8, funcion.getNroSala());
    ps.setDouble(9, funcion.getPrecioLugar());
    ps.executeUpdate();
   
    ResultSet rs=ps.getGeneratedKeys(); 
    
    if(rs.next()){
    funcion.setIdFuncion(rs.getInt(1));
    
    JOptionPane.showMessageDialog(null, "Funcion guardada");
    
    }
    
    ps.close();
    
    
    
    }catch (SQLException ex){
    
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
    }
            
         
    
    }
    
  
    
   
    public void modificarFuncion(Funcion funcion){

        
        String sql="UPDATE funcion SET titulo=? ,idioma=?,es3D=?,subtitulada=?,horaInicio=?,horaFin=?,LugaresDisp=?,nroSala=?,"
                + "precioDelLugar=? WHERE idFuncion=?";
                
                     
        
        
        
    try{
         
                
        
    PreparedStatement ps=con.prepareStatement(sql);
    ps.setString(1, funcion.getTitulo());
    ps.setString(2,funcion.getIdioma());
    ps.setBoolean(3, funcion.isEs3D());
    ps.setBoolean(4, funcion.isSubtitulada());
    
    
    ps.setTimestamp(5,Timestamp.valueOf(funcion.getHoraDeInicio()));
   
    ps.setTimestamp(6, Timestamp.valueOf(funcion.getHoraDeFin()));
    
    
    ps.setInt(7, funcion.getLugaresDisponibles());
   ps.setInt(8, funcion.getNroSala());
    ps.setDouble(9, funcion.getPrecioLugar());
    ps.setInt(10, funcion.getIdFuncion());
    
    int fila = ps.executeUpdate();
    
    if(fila==1){
    
    JOptionPane.showMessageDialog(null, "Funcion actualizada");
    
          }
    
    }catch (SQLException ex){
    
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
    }
                   
        }
                           
    

    
    public Funcion BuscarFuncion(int idFuncion){
        
      Funcion funcion = null;
      
        String sql="SELECT idFuncion, titulo, idioma, es3D, subtitulada, horaInicio, horaFin,"
                + " LugaresDisp,nroSala, precioDelLugar FROM `funcion` WHERE idFuncion=?";
        
        try{
        
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setInt(1, idFuncion);
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            
             funcion = new Funcion();
             funcion.setIdFuncion(idFuncion);
             funcion.setTitulo(rs.getString("titulo"));
             funcion.setIdioma(rs.getString("idioma"));
             funcion.setEs3D(rs.getBoolean("es3D"));
             funcion.setSubtitulada(rs.getBoolean("subtitulada"));
             
            
            Timestamp horaInicioSQL=rs.getTimestamp("horaInicio");
            Timestamp horaFinSQL=rs.getTimestamp("horaFin");

                        
            LocalDateTime horaInicio=horaInicioSQL.toLocalDateTime();
            LocalDateTime horaFin=horaFinSQL.toLocalDateTime();
            
                              
            funcion.setHoraDeInicio(horaInicio);
            
            funcion.setHoraDeFin(horaFin);
            
            
            funcion.setLugaresDisponibles(rs.getInt("lugaresDisp"));
            
            funcion.setNroSala(rs.getInt("nroSala"));
            
            funcion.setPrecioLugar(rs.getDouble("precioDelLugar"));
            
                         }else{
        JOptionPane.showMessageDialog(null, "No existe una funcion con ese ID");
        
        ps.close();
        
        }
        
        
                
        }catch (SQLException ex){
    
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ");
    }
        return funcion;




}
    
    
    
    
    public List<Funcion> listarFunciones() {
        
        String sql=" SELECT `idFuncion`, `titulo`, `idioma`, `es3D`, `subtitulada`, `horaInicio`, `horaFin`, `LugaresDisp`, `nroSala`, `precioDelLugar` FROM funcion";
        
        
        ArrayList<Funcion>funciones=new ArrayList<>();
        
        
        try{
        
        PreparedStatement ps=con.prepareStatement(sql);
        
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
        
            
            Funcion funcion=new Funcion();
            
            funcion.setIdFuncion(rs.getInt("idFuncion"));
            
            funcion.setTitulo(rs.getString("titulo"));
            
            funcion.setIdioma(rs.getString("idioma"));
            
            funcion.setSubtitulada(rs.getBoolean("subtitulada"));
            
            Timestamp horaInicioSQL=rs.getTimestamp("horaInicio");
            Timestamp horaFinSQL=rs.getTimestamp("horaFin");

                        
            LocalDateTime horaInicio=horaInicioSQL.toLocalDateTime();
            LocalDateTime horaFin=horaFinSQL.toLocalDateTime();
            
                              
            funcion.setHoraDeInicio(horaInicio);
            
            funcion.setHoraDeFin(horaFin);
            
            
            
            funcion.setLugaresDisponibles(rs.getInt("LugaresDisp"));
            
            funcion.setNroSala(rs.getInt("nroSala"));
            
            funcion.setPrecioLugar(rs.getDouble("precioDelLugar"));
            
        
            funciones.add(funcion);
        }
        
        
        
        
        
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
        
                
        }
      
        return funciones;
    
        
        
    }
    
    
    public void EliminarFuncion(int idFuncion){
    
    
    String sql="DELETE FROM funcion where idFuncion= ?";
    
    
    try{
    
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setInt(1,idFuncion );
    
    
    int filas = ps.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Funcion Eliminada ");

            }

            ps.close();
    
    
    
    
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD");
        }
    
                    
    }
      
}
    
    
    
    
    
