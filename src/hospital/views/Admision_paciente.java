
package hospital.views;

import hospital.bo.AdmisionBO;
import hospital.entity.Administrador;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Admision_paciente extends javax.swing.JFrame {

    private static Administrador adm;
    private AdmisionBO Abo = new AdmisionBO();
    
    public Admision_paciente(Administrador adm) {
        
        initComponents(); 
        this.setLocationRelativeTo(null);
        ImageIcon smile = new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png"));
        Icon img = new ImageIcon(smile.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),Image.SCALE_DEFAULT));
        lblLogo.setIcon(img);
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        this.adm = adm;
        lblNombre.setText(adm.getNombres());
        lblApellido.setText(adm.getApellidos());     
        Abo.listarPaciente(tbPaciente);      
        jButton4.show(false);
        jButton5.show(false); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscarDni = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbPaciente = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/home-16(blanco).PNG"))); // NOI18N
        jLabel4.setText("Inicio");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel4MouseMoved(evt);
            }
        });
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 185, -1, 20));

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cita-16(blanco).png"))); // NOI18N
        jLabel11.setText("Citas");
        jLabel11.setToolTipText("");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 70, -1));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/paciente-16(blanco).png"))); // NOI18N
        jLabel14.setText("Pacientes");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel14MouseMoved(evt);
            }
        });
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel14MouseExited(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/user-64(verde).png"))); // NOI18N
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 70));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/exit-32(blanco).png"))); // NOI18N
        jLabel5.setText("Cerrar Sesión");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        lblNombre.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("USUARIO");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 140, -1));

        lblApellido.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellido.setText("USUARIO");
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel8.setText("Pacientes");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 120, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/search_Icon.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, 20, 30));

        buscarDni.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        buscarDni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        buscarDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarDniMouseClicked(evt);
            }
        });
        buscarDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                buscarDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buscarDniKeyReleased(evt);
            }
        });
        jPanel3.add(buscarDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 270, 30));

        jButton3.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jButton3.setText("Crear Paciente");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 150, -1));

        jButton4.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jButton4.setText("Editar Paciente");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 150, -1));

        jButton5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jButton5.setText("Borrar Paciente");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 150, -1));

        tbPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacienteMouseClicked(evt);
            }
        });
        tbPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbPacienteKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tbPaciente);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 670, 140));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 800, 400));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MediDesk");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/close-32(blanco).png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/back-32(blanco).png"))); // NOI18N
        jLabel16.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
   
    }//GEN-LAST:event_jLabel15MouseClicked


    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
       
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        Admision_inicio r = new Admision_inicio(adm);
        r.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
       
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        Admision_cita ac = new Admision_cita(adm);
        ac.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
       
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        Admision_paciente ap = new Admision_paciente(adm);
        ap.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
      
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
       
        Admision_inicio r = new Admision_inicio(adm);
        r.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel16MouseClicked


    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
       
        Admision_crear_paciente r = new Admision_crear_paciente(adm);
        r.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        this.setState(Login.ICONIFIED);
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
    
        String pac_dni = this.pacienteDni();       
        Admision_editar_paciente Ad_ed_pa = new Admision_editar_paciente(adm,pac_dni);
        Ad_ed_pa.setVisible(true);
        this.setVisible(false);  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4MouseClicked
   
    public String pacienteDni(){
       
        int column = 0;
        int row = tbPaciente.getSelectedRow();
        String pac_dni = tbPaciente.getModel().getValueAt(row, column).toString();
        return pac_dni;
        
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
    
        String mensaje = Abo.eliminarPaciente(pacienteDni());
        JOptionPane.showMessageDialog(null, mensaje); 
        DefaultTableModel dtm = (DefaultTableModel) tbPaciente.getModel();
        int fila = tbPaciente.getSelectedRow();
        if (fila >= 0) {
            dtm.removeRow(fila);
        } 
        jButton4.show(false);
        jButton5.show(false);
                     // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void buscarDniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarDniMouseClicked
 
// TODO add your handling code here:
    }//GEN-LAST:event_buscarDniMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       
        Login lo = new Login();
        lo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void tbPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacienteMouseClicked

        jButton4.show(true);
        jButton5.show(true);
      // TODO add your handling code here:
    }//GEN-LAST:event_tbPacienteMouseClicked

    private void tbPacienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbPacienteKeyPressed
         // TODO add your handling code here:
    }//GEN-LAST:event_tbPacienteKeyPressed

    private void buscarDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarDniKeyPressed
   
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarDniKeyPressed

    private void buscarDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buscarDniKeyReleased
         
       String buscar_dni=buscarDni.getText();
       Abo.buscarPaciente(tbPaciente, buscar_dni);
       jButton4.show(false);
       jButton5.show(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarDniKeyReleased

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
            java.util.logging.Logger.getLogger(Admision_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admision_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admision_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admision_paciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admision_paciente(adm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscarDni;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblNombre;
    public static javax.swing.JTable tbPaciente;
    // End of variables declaration//GEN-END:variables
}
