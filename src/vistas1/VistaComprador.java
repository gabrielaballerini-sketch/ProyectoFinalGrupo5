/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Comprador;
import persistencia.CompradorData;

/**
 *
 * @author Capotes
 */
public class VistaComprador extends javax.swing.JInternalFrame {

    CompradorData compradorData;

    public VistaComprador() {
        initComponents();
        
        btnActualizar.setEnabled(false);
        compradorData = new CompradorData();

    }

 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DNI = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jrEstado = new javax.swing.JRadioButton();
        jtNombre = new javax.swing.JTextField();
        jtDNI = new javax.swing.JTextField();
        jtPassword = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        DNI.setText("DNI:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Fecha de nacimiento:");

        jLabel1.setText("Contraseña:");

        jLabel5.setText("Estado:");

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Formulario Comprador");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrEstado)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 173, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(DNI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DNI)
                    .addComponent(jtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jrEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        
        if (jtNombre.getText().isEmpty()||jtPassword.getText().isEmpty()||jDateChooser1.getDate()==null
                ||jrEstado.isSelected()==false) {

                JOptionPane.showMessageDialog(null, "no se pueden dejar los campos vacios");
                return;
            }

         
        
        try {

            String nombre = jtNombre.getText().trim();
            
            int dni = Integer.parseInt(jtDNI.getText());
           

                     if (!jtNombre.getText().matches("[a-zA-Z ]+")) {

                JOptionPane.showMessageDialog(null, "Solo se permiten letras en NOMBRE");
                    return;
            }

           
            

            java.util.Date sfecha = jDateChooser1.getDate();
            LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            String password = jtPassword.getText();

            Boolean estado = jrEstado.isSelected();

            Comprador comprador = new Comprador(dni, nombre, fechaNac, password, estado);

            compradorData.guardarComprador(comprador);
            
            limpiarCampos();

        } catch (NumberFormatException nfe) {

            JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido");
        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
            if (jtNombre.getText().isEmpty()||jtPassword.getText().isEmpty()||jDateChooser1.getDate()==null
                ||jrEstado.isSelected()==false|| jtDNI.getText().isEmpty()) {

                JOptionPane.showMessageDialog(null, "no se pueden dejar los campos vacios");
                return;
            }
        int dni = Integer.parseInt(jtDNI.getText());

        for (Comprador comprador1 : compradorData.listarCompradores()) {

            if (comprador1.getDni() == dni) {

                try {

                    String nombre = jtNombre.getText().trim();

                    if (jtNombre.getText().isEmpty()) {

                        JOptionPane.showMessageDialog(null, "no se pueden dejar campos vacios");

                        if (!jtNombre.getText().matches("[a-zA-Z ]+")) {

                            JOptionPane.showMessageDialog(null, "Solo se permiten letras en NOMBRE");
                            return;
                        }

                    }

                    java.util.Date sfecha = jDateChooser1.getDate();
                    LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                    String password = jtPassword.getText();

                    Boolean estado = jrEstado.isSelected();

                    Comprador comprador = new Comprador(dni, nombre, fechaNac, password, estado);

                    compradorData.actualizarComprador(comprador);
                    
                    limpiarCampos();
                    
                } catch (NumberFormatException nfe) {

                    JOptionPane.showMessageDialog(this, "Debe ingresar un DNI válido");
                }

            } /*else {

                JOptionPane.showMessageDialog(this, "No existe su DNI en el sistema, debe Registrarse");

            }*/

        }


    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          if(jtDNI.getText().isEmpty()){
          
            JOptionPane.showMessageDialog(null,"POR FAVOR INGRESE UN DNI");
          
          }
          
        try {
            int dni = Integer.parseInt(jtDNI.getText().trim());
        
            
            for (Comprador aux : compradorData.listarCompradores()){
                
            
                if(aux.getDni()==dni){
                   

                jtNombre.setText(aux.getNombre());

                LocalDate fechaNac = aux.getFechaNac();

                Date fechaConvertida = Date.from(fechaNac.atStartOfDay(ZoneId.systemDefault()).toInstant());

                jDateChooser1.setDate(fechaConvertida);

                jtPassword.setText(aux.getPassword());

                jrEstado.setSelected(aux.isEstado());
                
                
                }
            }
         }catch(NumberFormatException ex){
                System.out.println("Datos ingresados no validos, del TXT.DNI ");
            
        }
          btnActualizar.setEnabled(true);
          btnRegistrar.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DNI;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtDNI;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPassword;
    // End of variables declaration//GEN-END:variables


    public void limpiarCampos(){
        
        jtDNI.setText("");
        jtNombre.setText("");
        jtPassword.setText("");
        jrEstado.setSelected(false);
        jDateChooser1.setDate(null);
    
    }
}
