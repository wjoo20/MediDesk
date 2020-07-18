/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.views;

import hospital.bo.UsuarioBO;
import hospital.entity.Administrador;
import hospital.entity.Enfermera;
import hospital.entity.Farmaceutico;
import hospital.entity.Medico;
import hospital.entity.Usuario;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    private UsuarioBO ubo = new UsuarioBO();
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());
    }
    
    public boolean login(){
        Register r = new Register();
        String epass = r.encrypt(String.valueOf(jpassword.getPassword()));
        JOptionPane.showMessageDialog(null, ubo.login(epass,juser.getText())); 
        if(ubo.login(epass,juser.getText()).equals("Contraseña correcta")){
            return true;
        }else{
            return false;
        }   
    }
    
    public int getIdUser(Usuario user){
        
        return ubo.getIdUser(user);
    }
    
    public char getTipoUser(String user){
        
        return ubo.getTipoUser(user);
    }
    
    public Administrador createAdm(Usuario user){
        return ubo.createAdm(user);
    }
    
    public Medico createMed(Usuario user){
        return ubo.createMed(user);
    }
    
    public Enfermera createEnf(Usuario user){
        return ubo.createEnf(user);
    }
    
    public Farmaceutico createFarm(Usuario user){
        return ubo.createFarm(user);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        juser = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jpassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        showpass2 = new javax.swing.JCheckBox();
        Forget = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Usuario: ");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 120, -1));

        juser.setBackground(new java.awt.Color(51, 51, 51));
        juser.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        juser.setForeground(new java.awt.Color(204, 204, 204));
        juser.setBorder(null);
        juser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juserActionPerformed(evt);
            }
        });
        jPanel3.add(juser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 170, 30));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 230, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, -1));

        jpassword.setBackground(new java.awt.Color(51, 51, 51));
        jpassword.setForeground(new java.awt.Color(204, 204, 204));
        jpassword.setBorder(null);
        jPanel3.add(jpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 170, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 230, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/password-32.png"))); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/user-32.png"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/user-64(verde).png"))); // NOI18N
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, 90));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/login-16(verde).png"))); // NOI18N
        jLabel10.setText("Iniciar Sesión");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        showpass2.setBackground(new java.awt.Color(51, 51, 51));
        showpass2.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        showpass2.setForeground(new java.awt.Color(255, 255, 255));
        showpass2.setText("Showpass");
        showpass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showpass2MouseClicked(evt);
            }
        });
        showpass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpass2ActionPerformed(evt);
            }
        });
        jPanel3.add(showpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, 30));

        Forget.setBackground(new java.awt.Color(255, 255, 255));
        Forget.setFont(new java.awt.Font("Maiandra GD", 1, 12)); // NOI18N
        Forget.setForeground(new java.awt.Color(255, 255, 255));
        Forget.setText("Olvide mi Contraseña");
        Forget.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ForgetMouseMoved(evt);
            }
        });
        Forget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgetMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgetMouseExited(evt);
            }
        });
        jPanel3.add(Forget, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 460));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/close-32(blanco).png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, -1));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel4.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/Fondo-Login.PNG"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 460));

        btnRegistrar.setBackground(new java.awt.Color(62, 94, 106));
        btnRegistrar.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("REGISTRAR");
        jPanel4.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 650, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void juserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_juserActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del Login?","Exit",dialog);
        if(result == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
          if(login()){
              Usuario user = new Usuario();             
              user.setCorreo(juser.getText());             
              user.setClave(String.valueOf(jpassword.getPassword()));
              user.setTipo(getTipoUser(juser.getText()));
              user.setIdUsuario(getIdUser(user));
              System.out.println(user.getIdUsuario() + user.getCorreo() + user.getClave() + user.getTipo());
              switch (user.getTipo( )) {
                  case 'R':
                      {
                          Register r = new Register();
                          r.setVisible(true);
                          this.setVisible(false);
                          break;
                      }
                  case 'A':
                      {
                          Administrador adm = createAdm(user);
                          System.out.println("US(adm): "+"IdUser: "+adm.getIdUsuario()+"IdCorreo: "+adm.getCorreo()+"IdClave: "+adm.getClave()+
                        "IdTipo: "+adm.getTipo());
                System.out.println("ADM: "+adm.getIdAdministrador()+adm.getDni()+adm.getNombres()+adm.getApellidos()
                        +adm.getGenero()+adm.getEdad());
                          Admision_inicio r = new Admision_inicio(adm);
                          r.setVisible(true);
                          this.setVisible(false);
                          break;
                      }
                  case 'M':
                      {
                          Medico med = createMed(user);
                          Medico_inicio r = new Medico_inicio(med);
                          r.setVisible(true);
                          this.setVisible(false);
                          break;
                      }
                  case 'E':
                      {
                          Enfermera enf = createEnf(user);
                          System.out.println("US(adm): "+"IdUser: "+enf.getIdUsuario()+"IdCorreo: "+enf.getCorreo()+"IdClave: "+enf.getClave()+
                        "IdTipo: "+enf.getTipo());
                System.out.println("ENF: "+enf.getIdEnfermera()+enf.getDni()+enf.getNombres()+enf.getApellidos()
                        +enf.getGenero()+enf.getEdad());
                          Triaje_inicio r = new Triaje_inicio(enf);
                          r.setVisible(true);
                          this.setVisible(false);
                          break;
                      }
                  case 'F':
                      {
                          Farmaceutico farm = createFarm(user);
                          Farmacia farma = new Farmacia(farm);
                          farma.setVisible(true);
                          this.setVisible(false);
                          break;
                      }
                  default:
                      break;
              }                        
          }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked

        setExtendedState(ICONIFIED );
    }//GEN-LAST:event_MinimizarMouseClicked

    private void showpass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpass2MouseClicked
            if (showpass2.isSelected()) {
                     jpassword.setEchoChar((char)0); //password = showpass2
            } else {
                     jpassword.setEchoChar('•');
             }
    }//GEN-LAST:event_showpass2MouseClicked

    private void showpass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpass2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_showpass2ActionPerformed
int xx,xy;
    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed


    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged

    }//GEN-LAST:event_jLabel1MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
                xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void ForgetMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseMoved
        Forget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_ForgetMouseMoved

    private void ForgetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseExited
        Forget.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_ForgetMouseExited

    private void ForgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgetMouseClicked
        Recuperacion recu = new Recuperacion();
        recu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ForgetMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Forget;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField juser;
    private javax.swing.JCheckBox showpass2;
    // End of variables declaration//GEN-END:variables
}
