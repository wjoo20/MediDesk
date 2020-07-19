
package hospital.views;

import hospital.entity.Administrador;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admision_inicio extends javax.swing.JFrame {

    private static Administrador adm; 
    
    public Admision_inicio(Administrador adm) {
        
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon smile = new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png"));
        Icon img = new ImageIcon(smile.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),Image.SCALE_DEFAULT));
        lblLogo.setIcon(img);
        //rsscalelabel.RSScaleLabel.setScaleLabel(fondo,"src\\hospital\\views\\imagesa\\Deep Space.png");
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        this.adm = adm;
        lblNombre.setText(adm.getNombres());
        lblApellido.setText(adm.getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblLogo1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cita-16(blanco).png"))); // NOI18N
        jLabel10.setText("Citas");
        jLabel10.setToolTipText("");
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 215, 70, -1));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/paciente-16(blanco).png"))); // NOI18N
        jLabel14.setText("Pacientes");
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

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/user-64(verde).png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 70));

        lblNombre.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNombre.setText("USUARIO");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 140, -1));

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/exit-32(blanco).png"))); // NOI18N
        jLabel8.setText("Cerrar Sesión");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        lblApellido.setFont(new java.awt.Font("Maiandra GD", 3, 14)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(255, 255, 255));
        lblApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApellido.setText("USUARIO");
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 140, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 400));

        fondo.setBackground(new java.awt.Color(51, 51, 51));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/calendar (1).png"))); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        fondo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 130, 130));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cough (1).png"))); // NOI18N
        jLabel6.setToolTipText("");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 240, 220));
        jLabel1.setText("Pacientes");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 90, -1));

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(40, 240, 220));
        jLabel13.setText("Citas");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        fondo.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 50, -1));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/Deep Space.jpg"))); // NOI18N
        fondo.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 400));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 800, 400));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("MediDesk");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/close-32(blanco).png"))); // NOI18N
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, -1, -1));

        lblLogo1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        lblLogo1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel4.add(lblLogo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        
        Admision_cita ac = new Admision_cita(adm);
        ac.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        
        Admision_paciente ap = new Admision_paciente(adm);
        ap.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
        Admision_inicio r = new Admision_inicio(adm);
        r.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        Admision_cita ac = new Admision_cita(adm);
        ac.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        Admision_paciente ap = new Admision_paciente(adm);
        ap.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
        Admision_cita ac = new Admision_cita(adm);
        ac.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        Admision_paciente ap = new Admision_paciente(adm);
        ap.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
       
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
       
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel14MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseMoved
      
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel14MouseMoved

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
        
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
        
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
        
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited

    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
    
    }//GEN-LAST:event_jLabel12MouseMoved

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        Login lo = new Login();
        lo.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jLabel8MouseClicked
                
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
            java.util.logging.Logger.getLogger(Admision_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admision_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admision_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admision_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admision_inicio(adm).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
