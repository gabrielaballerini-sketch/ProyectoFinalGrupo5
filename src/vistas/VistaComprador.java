/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Comprador;
import modelo.Conexion;
import persistencia.CompradorData;

/**
 *
 * @author Capotes
 */
public class VistaComprador extends javax.swing.JInternalFrame {

    
    
 private Connection con=null;
 
 private CompradorData compradorData;


         
    public VistaComprador() {
        initComponents();
       
        con= Conexion.buscarConexion();
        
        compradorData=new CompradorData();
        
        
        
    }

        
   





    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jtPassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jrEstado = new javax.swing.JRadioButton();
        jcMedio = new javax.swing.JComboBox<>();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Datos del comprador");

        jLabel2.setText("Nombre");

        jLabel3.setText("DNI");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel5.setText("Password");

        jtDNI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDNIFocusLost(evt);
            }
        });

        jLabel6.setText("Medio de pago");

        jLabel7.setText("Estado");

        jrEstado.setText("Activo");

        jcMedio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija una opcion", "Efectivo", "Debito", "Credito" }));
        jcMedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcMedioActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtNombre)
                                .addComponent(jtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                .addComponent(jrEstado)
                                .addComponent(jcMedio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jrEstado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed


         try {
            
                String nombre=jtNombre.getText().trim();
              int dni=Integer.parseInt(jtDNI.getText());
             
                    
                    if (jtNombre.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "no se pueden dejar campos vacios");

                if ( !jtNombre.getText().matches("[a-zA-Z ]+")) {

                    JOptionPane.showMessageDialog(null, "Solo se permiten letras en NOMBRE");
                    return;
                }

            }
         
                            
        java.util.Date sfecha = jDateChooser1.getDate();
        LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        
        String password=jtPassword.getText();
        
        String medio=(String) jcMedio.getSelectedItem();
        
        Boolean estado=jrEstado.isSelected();
        
        Comprador comprador=new Comprador(dni,nombre,fechaNac,password,medio,estado);
        
        
        compradorData.guardarComprador(comprador);
                
         } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido");
         }
       
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jcMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcMedioActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
      
        
        
         int dni=Integer.parseInt(jtDNI.getText());
        
        for (Comprador comprador1 : compradorData.listarCompradores()){
            
            if(comprador1.getDni()==dni){
                
                
                  
        
         try {
            
                String nombre=jtNombre.getText().trim();
              
             
                    
                    if (jtNombre.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "no se pueden dejar campos vacios");

                if ( !jtNombre.getText().matches("[a-zA-Z ]+")) {

                    JOptionPane.showMessageDialog(null, "Solo se permiten letras en NOMBRE");
                    return;
                }

            }
         
                            
        java.util.Date sfecha = jDateChooser1.getDate();
        LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        
        
        String password=jtPassword.getText();
        
        String medio=(String) jcMedio.getSelectedItem();
        
        Boolean estado=jrEstado.isSelected();
        
        Comprador comprador=new Comprador(dni,nombre,fechaNac,password,medio,estado);
        
        
        compradorData.actualizarComprador(comprador);
                
         } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido");
         }
       
        
        
            }else{
                
                  JOptionPane.showMessageDialog(this, "No existe su DNI en el sistema, debe Registrarse");
                
            }}
        
        
        
        
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jtDNIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDNIFocusLost
       
        
        int dni=Integer.parseInt(jtDNI.getText());
        
        for (Comprador comprador : compradorData.listarCompradores()){
            
            if(comprador.getDni()==dni){
                
            jtNombre.setText(comprador.getNombre());
            
             LocalDate fechaNac=comprador.getFechaNac();
             
                           
            Date fechaConvertida = Date.from(fechaNac.atStartOfDay(ZoneId.systemDefault()).toInstant());

              jDateChooser1.setDate(fechaConvertida);
              
              
              jtPassword.setText(comprador.getPassword());
              
              jrEstado.setSelected(comprador.isEstado());
                
            }
            
        }
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jtDNIFocusLost


     
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> jcMedio;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPassword;
    // End of variables declaration//GEN-END:variables


    
    






}








