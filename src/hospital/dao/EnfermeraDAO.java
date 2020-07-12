/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.entity.Enfermera;
import hospital.entity.Paciente;
import hospital.views.Triaje_verPaciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fiorella
 */
public class EnfermeraDAO {
    
    //Listar cita
    public void listarCita (Connection conn, JTable tabla, String especialidad, String date) {
       
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRES","APELLIDOS","DNI","MEDICO","TIPO","ESTADO"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT C.CITA_IDCITA, P.PAC_NOMBRES, P.PAC_APELLIDOS, P.PAC_DNI, M.MED_APELLIDOS, C.CITA_TIPO, C.CITA_ESTADO FROM CITA C JOIN PACIENTE P ON(C.PACIENTE_PAC_DNI=P.PAC_DNI) JOIN MEDICO M ON (C.MEDICO_MED_IDMEDICO=M.MED_IDMEDICO) WHERE M.MED_IDMEDICO = (SELECT E.ESPE_IDESPECIALIDAD FROM ESPECIALIDAD E JOIN MEDICO M ON (E.ESPE_IDESPECIALIDAD=M.ESPE_ESPE_IDESPE) WHERE E.ESPE_NOMBRE = ?) AND TO_DATE(CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')";
        //filas
        String [] filas = new String[7];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, especialidad);
            pst.setString(2, date);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los valores en la tabla" );
        }
    }
    
    //Listar triaje
    public void listarTriaje(Connection conn, JTable tabla, String especialidad, String date) {
        DefaultTableModel model;
        String [] columnas = {"DNI","NOMBRES","APELLIDOS","TALLA","PESO","TEMPERATURA","PRESIÓN ARTERIAL"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT P.PAC_DNI, P.PAC_NOMBRES, P.PAC_APELLIDOS, P.PAC_TALLA, P.PAC_PESO, P.PAC_TEMPERATURA, P.PAC_PRESION FROM PACIENTE P JOIN CITA C ON (P.PAC_DNI = C.PACIENTE_PAC_DNI) WHERE C.MEDICO_MED_IDMEDICO = (SELECT M.MED_IDMEDICO FROM MEDICO M JOIN ESPECIALIDAD E ON (M.ESPE_ESPE_IDESPE = E.ESPE_IDESPECIALIDAD)WHERE E.ESPE_NOMBRE = ?)";
        //filas
        String [] filas = new String[7];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, especialidad);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los valores en la tabla" + e.getMessage());
        }
    }
    
    //Listar paciente (txt)
    public Paciente listarPaciente(Connection conn, String value) {
        Paciente p = new Paciente();
        //Sentencia SQL
        String sql = "SELECT PAC_DNI, PAC_NOMBRES, PAC_APELLIDOS, PAC_CORREO, PAC_TELEFONO, PAC_DIRECCION, PAC_GENERO, PAC_EDAD, PAC_TRIAJE FROM PACIENTE WHERE PAC_DNI = ?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, value);
            rs = pst.executeQuery();
            while(rs.next()) {
                p.setDni(rs.getInt("PAC_DNI"));
                p.setNombres(rs.getString("PAC_NOMBRES"));
                p.setApellidos(rs.getString("PAC_APELLIDOS"));
                p.setCorreo(rs.getString("PAC_CORREO"));
                p.setTelefono(rs.getInt("PAC_TELEFONO"));
                p.setDireccion(rs.getString("PAC_DIRECCION"));
                p.setGenero(rs.getString("PAC_GENERO").charAt(0));
                p.setEdad(rs.getInt("PAC_EDAD"));
                p.setTriaje(rs.getString("PAC_TRIAJE"));              
            }           
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pueden obtener los valores" + e.getMessage());
        }
        return p;
        
    }
    
    
    
}
