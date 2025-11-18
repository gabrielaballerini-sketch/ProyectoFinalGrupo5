
package vistas1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Funcion;
import modelo.Pelicula;
import modelo.Sala;
import persistencia.FuncionData;
import persistencia.LugarData;
import persistencia.PeliculaData;
import persistencia.SalaData;

/**
 *
 * @author fatimaalcaraz
 */
public class vistaFuncion extends javax.swing.JInternalFrame {

  
  private FuncionData funData;
  private Pelicula peli;
  private PeliculaData peliData;
  private SalaData salaData;
  private LugarData lugardata;
  
    public vistaFuncion() {
        initComponents();
        funData= new FuncionData();
        
        peli= new Pelicula();
        peliData= new PeliculaData();
        salaData= new SalaData();
        cargarComboPelicula();
        cargarComboSala();
        lugardata=new LugarData();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbIdioma = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rb3D = new javax.swing.JRadioButton();
        rbSubtitilo = new javax.swing.JRadioButton();
        cbHorario = new javax.swing.JComboBox<>();
        cbSala = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        comboPelicula = new javax.swing.JComboBox<>();

        jLabel1.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Funciones");

        jLabel3.setText("Idioma");

        cbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingles", "Español", "Portugues" }));

        jLabel4.setText("Es 3D");

        jLabel5.setText("Subtitulada");

        jLabel6.setText("Hora de Inicio");

        jLabel8.setText("Numero de Sala");

        cbHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18/11/2025 20:10", "18/11/2025 22:40", "18/11/2025 00:20", "19/11/2025 16:30", "19/11/2025 18:50", "19/11/2025 20:10", "19/11/2025 22:40", "19/11/2025 00:20", "20/11/2025 16:30", "20/11/2025 18:50", "20/11/2025 20:10", "20/11/2025 22:40", "20/11/2025 00:20", "21/11/2025 16:30", "21/11/2025 18:50", "21/11/2025 20:10", "21/11/2025 22:40", "21/11/2025 00:20", "24/11/2025 16:30", "24/11/2025 18:50", "24/11/2025 20:10", "24/11/2025 22:40", "24/11/2025 00:20", "25/11/2025 16:30", "25/11/2025 18:50", "25/11/2025 20:10", "25/11/2025 22:40", "25/11/2025 00:20", "26/11/2025 16:30", "26/11/2025 18:50", "26/11/2025 20:10", "26/11/2025 22:40", "26/11/2025 00:20" }));

        btnGuardar.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbSala, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)
                                    .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbIdioma, 0, 169, Short.MAX_VALUE)
                                    .addComponent(rb3D)
                                    .addComponent(rbSubtitilo)
                                    .addComponent(comboPelicula, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(75, 75, 75))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98))))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(rb3D))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(rbSubtitilo))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       
     Pelicula peli =(Pelicula) comboPelicula.getSelectedItem();
        String idioma= (String) cbIdioma.getSelectedItem();
        boolean es3D= rb3D.isSelected();
        boolean subtitulada= rbSubtitilo.isSelected();
               
       String horaString= (String)cbHorario.getSelectedItem();
       
       
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
       
        LocalDateTime horaInicio= LocalDateTime.parse(horaString, formato);
        
              
        LocalDateTime horaFin = horaInicio.plusMinutes(105);
        
        
        Sala sala= (Sala) cbSala.getSelectedItem();
        
        
       
        boolean ocupada=false;
        
        for (Funcion aux : funData.listarFunciones()) {
            
            if (aux.getSala().getNroSala()==sala.getNroSala() && aux.getHoraDeInicio().isEqual(horaInicio )){
            
                ocupada=true;
                
              
                
                break;
                
            
            }
        }
        
        if(ocupada){
        
          JOptionPane.showInternalMessageDialog(this, "Sala ocupada");
        }
        else{
                
                               
                Funcion funcion = new Funcion(peli.getTitulo(),idioma,es3D,subtitulada,horaInicio,horaFin,sala);
            
               funData.GuardarProyeccion(funcion);
       
       
                 //AGREGADOOOO 
                lugardata.generarLugaresBatch(funcion,5,8);
                
                        
                
            }
                        
            
        

        
        
        
     
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
          dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbHorario;
    private javax.swing.JComboBox<String> cbIdioma;
    private javax.swing.JComboBox<Sala> cbSala;
    private javax.swing.JComboBox<Pelicula> comboPelicula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton rb3D;
    private javax.swing.JRadioButton rbSubtitilo;
    // End of variables declaration//GEN-END:variables

private void cargarComboPelicula(){
    LocalDate hoy= LocalDate.now();

    for (Pelicula lista : peliData.listarPeliculas()) {
        if(!lista.getEstreno().isAfter(hoy)){
        comboPelicula.addItem(lista);
        }
    }
    
    
}

private void cargarComboSala(){
    
    for (Sala sala : salaData.listarSalas()) {
        cbSala.addItem(sala);
        
    }

}

/* PROBANDO CAMBIOS */





}
