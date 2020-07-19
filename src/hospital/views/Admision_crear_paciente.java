
package hospital.views;

import hospital.bo.AdmisionBO;
import hospital.entity.Administrador;
import hospital.entity.Paciente;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admision_crear_paciente extends javax.swing.JFrame {

    private static Administrador adm;
    AdmisionBO Apbo = new AdmisionBO();
    
    public Admision_crear_paciente(Administrador adm) {
       
        initComponents();
        this.setLocationRelativeTo(null);
        this.adm = adm;
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        txtDni.setBackground(new java.awt.Color(0,0,0,1));
        txtNombres.setBackground(new java.awt.Color(0,0,0,1));
        txtApellidos.setBackground(new java.awt.Color(0,0,0,1));
        txtEdad.setBackground(new java.awt.Color(0,0,0,1));
        txtCorreo.setBackground(new java.awt.Color(0,0,0,1));
        txtDireccion.setBackground(new java.awt.Color(0,0,0,1));
        txtTelefono.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgrGenero = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtDni = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        rbtMasculino = new javax.swing.JRadioButton();
        rbtFemenino = new javax.swing.JRadioButton();
        txtEdad = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 460));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(40, 240, 220));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/Fondo(300x460).png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 460));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrar.setBackground(new java.awt.Color(0, 51, 51));
        btnRegistrar.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/check-16(verde).png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/close-32(blanco).png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        btnLimpiar.setBackground(new java.awt.Color(0, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/eraser-16.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, -1, 30));

        btnCancelar.setBackground(new java.awt.Color(0, 51, 51));
        btnCancelar.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cancel-16(rojo).PNG"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, -1, 30));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE PACIENTES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 350, 10));

        txtDni.setBackground(new java.awt.Color(28, 28, 28));
        txtDni.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.setOpaque(false);
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 350, 30));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 350, 10));

        txtNombres.setBackground(new java.awt.Color(28, 28, 28));
        txtNombres.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);
        txtNombres.setOpaque(false);
        jPanel2.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 350, 30));

        txtApellidos.setBackground(new java.awt.Color(28, 28, 28));
        txtApellidos.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        txtApellidos.setOpaque(false);
        jPanel2.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 350, 30));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 350, 10));

        rbtMasculino.setBackground(new java.awt.Color(51, 51, 51));
        btgrGenero.add(rbtMasculino);
        rbtMasculino.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        rbtMasculino.setForeground(new java.awt.Color(255, 255, 255));
        rbtMasculino.setText("MASCULINO");
        jPanel2.add(rbtMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, 30));

        rbtFemenino.setBackground(new java.awt.Color(51, 51, 51));
        btgrGenero.add(rbtFemenino);
        rbtFemenino.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        rbtFemenino.setForeground(new java.awt.Color(255, 255, 255));
        rbtFemenino.setText("FEMENINO");
        jPanel2.add(rbtFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, 30));

        txtEdad.setBackground(new java.awt.Color(28, 28, 28));
        txtEdad.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(255, 255, 255));
        txtEdad.setBorder(null);
        jPanel2.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 50, 30));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 50, 10));

        jLabel25.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("EDAD:");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 90, 30));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DNI:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 80, 30));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NOMBRES:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 130, 80, 30));

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("APELLIDOS:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 170, 90, 30));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("GÉNERO:");
        jLabel10.setToolTipText("");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 70, 30));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CORREO:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 250, 70, 30));

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("DIRECCION:");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 100, 30));

        jLabel24.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("TELEFONO:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 100, 30));

        txtTelefono.setBackground(new java.awt.Color(28, 28, 28));
        txtTelefono.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtTelefono.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefono.setBorder(null);
        txtTelefono.setOpaque(false);
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 350, 30));

        txtDireccion.setBackground(new java.awt.Color(28, 28, 28));
        txtDireccion.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(255, 255, 255));
        txtDireccion.setBorder(null);
        txtDireccion.setOpaque(false);
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 350, 30));

        txtCorreo.setBackground(new java.awt.Color(28, 28, 28));
        txtCorreo.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.setOpaque(false);
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 350, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 350, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 350, 10));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 350, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        
        if(txtDni.getText().isEmpty() || txtApellidos.getText().isEmpty()
            || txtNombres.getText().isEmpty() || txtEdad.getText().isEmpty()
            || txtCorreo.getText().isEmpty()  || txtDireccion.getText().isEmpty() 
            || txtTelefono.getText().isEmpty()||(rbtFemenino.isSelected()==false && 
                rbtMasculino.isSelected()==false)
        ){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
            
        }else{
            char genero;
                if (rbtMasculino.isSelected()){
                    genero = 'M';
                }else{
                    genero = 'F';
            }    
            
            Paciente pac  = new Paciente();
                pac.setDni(Integer.parseInt(txtDni.getText()));
                pac.setNombres(txtNombres.getText());
                pac.setApellidos(txtApellidos.getText());
                pac.setGenero(genero);
                pac.setEdad(Integer.parseInt(txtEdad.getText()));
                pac.setCorreo(txtCorreo.getText());
                pac.setDireccion(txtDireccion.getText());
                pac.setTelefono(Integer.parseInt(txtTelefono.getText()));
                pac.setTriaje("N");
                pac.setIdAdministrador(adm.getIdAdministrador());
                
                String mensaje = Apbo.agregarPaciente(pac);
                JOptionPane.showMessageDialog(null, mensaje);
                limpiar();   
        
                Admision_generar_cita r = new Admision_generar_cita(adm);
                r.setVisible(true);
                this.setVisible(false);                      
            }   

    }//GEN-LAST:event_btnRegistrarMouseClicked

    public void limpiar(){
        
        txtDni.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        btgrGenero.clearSelection();
        txtEdad.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        
    }   
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        this.setState(Login.ICONIFIED);
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        
        Admision_paciente lo = new Admision_paciente(adm);
        lo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admision_crear_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admision_crear_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admision_crear_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admision_crear_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admision_crear_paciente(adm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgrGenero;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JRadioButton rbtFemenino;
    private javax.swing.JRadioButton rbtMasculino;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
