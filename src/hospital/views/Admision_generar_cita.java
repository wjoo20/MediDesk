
package hospital.views;

import hospital.bo.AdmisionBO;
import hospital.entity.Administrador;
import hospital.entity.Cita;
import hospital.entity.Especialidad;
import hospital.entity.Medico;
import hospital.entity.Paciente;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Admision_generar_cita extends javax.swing.JFrame {
    
    AdmisionBO Abo = new AdmisionBO();
    Especialidad espe=new Especialidad();
    private static Administrador adm;
    private static Medico med;
    private static int ic;
    private static Paciente p;
    private static String h;
    private static boolean flag = false;
    
    public Admision_generar_cita(Administrador adm) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.adm = adm;
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        Abo.listar_especialidades(cbEspecialidad);
        txtDni.setBackground(new java.awt.Color(0,0,0,1));
    }

    public Admision_generar_cita(Medico med, int idCita, Paciente pac, String historia) {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
        Abo.listar_especialidades(cbEspecialidad);
        txtDni.setBackground(new java.awt.Color(0,0,0,1));
        this.med = med;
        this.ic = idCita;
        this.p = pac;
        this.h = historia;
        this.flag = true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbEspecialidad = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbMedico = new javax.swing.JComboBox<>();
        jSpinnerDateEditor1 = new com.toedter.calendar.JSpinnerDateEditor();

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
        btnRegistrar.setText("GENERAR");
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
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
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
        jLabel1.setText("GENERAR CITA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 350, 10));

        txtDni.setBackground(new java.awt.Color(28, 28, 28));
        txtDni.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setBorder(null);
        txtDni.setOpaque(false);
        jPanel2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 350, 30));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DNI:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, -1, 30));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ESPECIALIDAD:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, 30));

        cbEspecialidad.setBorder(null);
        cbEspecialidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEspecialidadItemStateChanged(evt);
            }
        });
        jPanel2.add(cbEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 340, -1));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MEDICO:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, 30));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FECHA Y HORA:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, -1, 30));

        cbMedico.setBorder(null);
        cbMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMedicoItemStateChanged(evt);
            }
        });
        jPanel2.add(cbMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 340, -1));

        jSpinnerDateEditor1.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1594833060473L), null, null, java.util.Calendar.YEAR));
        jPanel2.add(jSpinnerDateEditor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        if(flag){
            Medico_paciente m = new Medico_paciente(med,ic, p, h);
            m.setVisible(true);
            this.setVisible(false);
            this.flag = false;
        }else{
            Admision_cita lo = new Admision_cita(adm);
            lo.setVisible(true);
            this.setVisible(false);
        }
        
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
       
        this.setState(Login.ICONIFIED);
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
         
        if(txtDni.getText().isEmpty() 
               ){
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
        }else{
           
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date = sdf.format(jSpinnerDateEditor1.getDate());
            
            Medico dep = (Medico)cbMedico.getSelectedItem();
            int dato = dep.getIdMedico();
            
            Cita cit  = new Cita();
            cit.setDni_paciente(Integer.parseInt(txtDni.getText()));
            if(this.flag){
                cit.setTipo("I");
            }
            else{
                cit.setTipo("N");
            }
            cit.setEstado("P");
            cit.setFecha(date);
   
            String mensaje = Abo.agregarCita(cit,dato);
            limpiar();
            JOptionPane.showMessageDialog(null, mensaje);
            if(flag){
                Medico_paciente m = new Medico_paciente(med,ic, p, h);
                m.setVisible(true);
                this.setVisible(false);
                this.flag = false;
            }else{
                Admision_inicio r = new Admision_inicio(adm);
                r.setVisible(true);
                this.setVisible(false);
            }                                   
        }     
        
    }//GEN-LAST:event_btnRegistrarMouseClicked
    
    public void limpiar(){
      
        txtDni.setText("");
        cbEspecialidad.setSelectedIndex(0);
        
    }
    private void cbMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMedicoItemStateChanged

        // TODO add your handling code here:
    }//GEN-LAST:event_cbMedicoItemStateChanged

    private void cbEspecialidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEspecialidadItemStateChanged
        
        Especialidad esper = (Especialidad)this.cbEspecialidad.getSelectedItem();
        int id=esper.getId_especialidad(); 
        Abo.listar_medicos(cbMedico,id);
// TODO add your handling code here:
    }//GEN-LAST:event_cbEspecialidadItemStateChanged

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
       
        limpiar();  
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarMouseClicked

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
            java.util.logging.Logger.getLogger(Admision_generar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admision_generar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admision_generar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admision_generar_cita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admision_generar_cita(adm).setVisible(true);
            }
        }
       
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbEspecialidad;
    private javax.swing.JComboBox<String> cbMedico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private com.toedter.calendar.JSpinnerDateEditor jSpinnerDateEditor1;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
