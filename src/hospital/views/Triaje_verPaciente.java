/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.views;

import hospital.bo.EnfermeraBO;
import hospital.db.Conexion;
import hospital.entity.Enfermera;
import hospital.entity.Paciente;
import java.awt.Image;
import java.sql.DriverManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Fiorella
 */
public class Triaje_verPaciente extends javax.swing.JFrame {

    /**
     * Creates new form Triaje_verPaciente
     */
    private EnfermeraBO ebo = new EnfermeraBO();    
    public Triaje_cita tc = new Triaje_cita();
    private static Enfermera enf;
    public static String dni;
    public static String especialidad;
    public static String date;
    private static int dniE;
    public Triaje_verPaciente(Enfermera enf, String dni, String especialidad, String date) {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon smile = new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png"));
        Icon img = new ImageIcon(smile.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(),Image.SCALE_DEFAULT));
        lblLogo.setIcon(img);
        setIconImage(new ImageIcon(getClass().getResource("/hospital/views/images/logo-64.png")).getImage());        
        lblCorreoUsuario.setText(enf.getCorreo());
        this.enf = enf;  
        this.dni= dni;
        this.especialidad = especialidad;
        this.date = date;
        this.listar_paciente(); 
        this.showbtnRealizarTriaje();
    }
    
    public Paciente listar_paciente() {
        Paciente p = ebo.listarPaciente(dni);
        txtDni.setText(String.valueOf(p.getDni()));
        txtNombres.setText(p.getNombres());
        txtApellidos.setText(p.getApellidos());
        txtCorreo.setText(p.getCorreo());
        txtTelefono.setText(String.valueOf(p.getTelefono()));
        txtDireccion.setText(p.getDireccion());
        txtGenero.setText(p.getGenero()+"");
        txtEdad.setText(String.valueOf(p.getDni()));
        txtTriaje.setText(p.getTriaje());
        return p;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblCorreoUsuario = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        btnRealizarTriaje = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTriaje = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

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
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 70, -1));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/balance_white_(16px).png"))); // NOI18N
        jLabel14.setText("Triaje");
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
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/user-64(verde).png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 70));

        lblCorreoUsuario.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        lblCorreoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCorreoUsuario.setText("USUARIO");
        jPanel2.add(lblCorreoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, -1));

        jLabel28.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/exit-32(blanco).png"))); // NOI18N
        jLabel28.setText("Cerrar Sesión");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 150, 400));

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

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/back-32(blanco).png"))); // NOI18N
        jLabel18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, -1, 40));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/minimize-32(blanco).png"))); // NOI18N
        Minimizar.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel4.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, -1, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 60));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel1.setText("Datos del paciente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 180, 30));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/weight _black_(16).png"))); // NOI18N
        jLabel2.setText("Triaje");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 130, 20));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 210, 10));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/dni_black_(16).png"))); // NOI18N
        jLabel5.setText("DNI");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 60, 20));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 210, 10));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cough_black_(16).png"))); // NOI18N
        jLabel7.setText("Nombres");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 20));

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 210, 10));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/cough_black_(16).png"))); // NOI18N
        jLabel9.setText("Apellidos");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 20));

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, 10));

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/mail_black_(16).png"))); // NOI18N
        jLabel13.setText("Correo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 20));

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 210, 10));

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/phone_black_(16).png"))); // NOI18N
        jLabel19.setText("Teléfono");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 90, 20));

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, 10));

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/home_bw_(16).png"))); // NOI18N
        jLabel21.setText("Dirección");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 100, 20));

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 210, 10));

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/gender_black_(16).png"))); // NOI18N
        jLabel23.setText("Género");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 100, 20));

        jSeparator8.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator8.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, 210, 10));

        jLabel25.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/years_black_(16).png"))); // NOI18N
        jLabel25.setText("Edad");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 100, 20));

        jSeparator9.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 210, 10));

        btnRealizarTriaje.setBackground(new java.awt.Color(51, 51, 51));
        btnRealizarTriaje.setFont(new java.awt.Font("Maiandra GD", 0, 12)); // NOI18N
        btnRealizarTriaje.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/views/images/balance_color_(16).png"))); // NOI18N
        btnRealizarTriaje.setText("REALIZAR TRIAJE");
        btnRealizarTriaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRealizarTriajeMouseClicked(evt);
            }
        });
        jPanel1.add(btnRealizarTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, 210, -1));

        txtDni.setEditable(false);
        txtDni.setBackground(new java.awt.Color(255, 255, 255));
        txtDni.setForeground(new java.awt.Color(0, 0, 0));
        txtDni.setBorder(null);
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 210, -1));

        txtNombres.setEditable(false);
        txtNombres.setBackground(new java.awt.Color(255, 255, 255));
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        txtNombres.setBorder(null);
        jPanel1.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 210, -1));

        txtApellidos.setEditable(false);
        txtApellidos.setBackground(new java.awt.Color(255, 255, 255));
        txtApellidos.setForeground(new java.awt.Color(0, 0, 0));
        txtApellidos.setBorder(null);
        jPanel1.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 210, -1));

        txtCorreo.setEditable(false);
        txtCorreo.setBackground(new java.awt.Color(255, 255, 255));
        txtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        txtCorreo.setBorder(null);
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 210, -1));

        txtTelefono.setEditable(false);
        txtTelefono.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefono.setBorder(null);
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 210, -1));

        txtDireccion.setEditable(false);
        txtDireccion.setBackground(new java.awt.Color(255, 255, 255));
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 210, -1));

        txtGenero.setEditable(false);
        txtGenero.setBackground(new java.awt.Color(255, 255, 255));
        txtGenero.setForeground(new java.awt.Color(0, 0, 0));
        txtGenero.setBorder(null);
        jPanel1.add(txtGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 210, -1));

        txtEdad.setEditable(false);
        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        txtEdad.setBorder(null);
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, 210, -1));

        txtTriaje.setEditable(false);
        txtTriaje.setBackground(new java.awt.Color(255, 255, 255));
        txtTriaje.setForeground(new java.awt.Color(0, 0, 0));
        txtTriaje.setBorder(null);
        jPanel1.add(txtTriaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 210, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 800, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseMoved
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(40,240,220)));
    }//GEN-LAST:event_jLabel4MouseMoved

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Triaje_inicio r = new Triaje_inicio(enf);
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
        Triaje_cita ac = new Triaje_cita(enf, especialidad, date );
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
        Triaje_tablaTriaje ap = new Triaje_tablaTriaje(enf);
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseExited
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102,102,102)));
    }//GEN-LAST:event_jLabel14MouseExited

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"¿Desea Salir?","Exit",dialog);
        if(result==0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Triaje_cita r = new Triaje_cita(enf, especialidad, date);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void btnRealizarTriajeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRealizarTriajeMouseClicked
        // TODO add your handling code here:    
        this.dni = txtDni.getText();
        Triaje_formularioTriaje r = new Triaje_formularioTriaje(enf, dni, dniE, especialidad, date);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRealizarTriajeMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked

        setExtendedState(ICONIFIED );
    }//GEN-LAST:event_MinimizarMouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        Login lo = new Login();
        lo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel28MouseClicked
    
    public void showbtnRealizarTriaje() {
        if(txtTriaje.getText().charAt(0) == 'N') {
            btnRealizarTriaje.show(true);
        }
        else {
            btnRealizarTriaje.show(false);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Triaje_verPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Triaje_verPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Triaje_verPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Triaje_verPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Triaje_verPaciente(enf,dni, especialidad, date).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Minimizar;
    private javax.swing.JButton btnRealizarTriaje;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel lblCorreoUsuario;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTriaje;
    // End of variables declaration//GEN-END:variables
}
