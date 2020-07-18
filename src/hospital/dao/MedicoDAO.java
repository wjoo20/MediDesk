/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class MedicoDAO {
    //Listar cita
    public void mostrarCitas (Connection conn, JTable tabla, String date, int idMed) {
       
        DefaultTableModel model;
        String [] columnas = {"Hora","Apellidos","Nombres","DNI","N° de Historia"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT TO_CHAR(C.CITA_FECHA,'HH24:MI'), P.PAC_APELLIDOS, P.PAC_NOMBRES, P.PAC_DNI, NVL(H.HIST_IDHISTORIA,0)\n" +
                        "FROM PACIENTE P JOIN CITA C ON(P.PAC_DNI=C.PACIENTE_PAC_DNI) LEFT OUTER JOIN HISTORIA H ON (P.PAC_DNI=H.PACIENTE_PAC_DNI)\n" +
                        "WHERE TO_DATE(C.CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')\n" +
                        "AND C.CITA_ESTADO = 'P' \n" +
                        "AND P.PAC_TRIAJE = 'S'\n" +
                        "AND C.MEDICO_MED_IDMEDICO = ?";
        //filas
        String [] filas = new String[5];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setInt(2, idMed);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en MedicoDAO(mostrarCitas): " + e.getMessage() );
        }
    }
    
    public void listarAtenciones (Connection conn, JTable tabla, String date, int idMed) {
       
        DefaultTableModel model;
        String [] columnas = {"Hora","Apellidos","Nombres","DNI","N° de Historia"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT TO_CHAR(C.CITA_FECHA,'HH24:MI'), P.PAC_APELLIDOS, P.PAC_NOMBRES, P.PAC_DNI, H.HIST_IDHISTORIA\n" +
                        "FROM PACIENTE P JOIN CITA C ON(P.PAC_DNI=C.PACIENTE_PAC_DNI) JOIN HISTORIA H ON (P.PAC_DNI=H.PACIENTE_PAC_DNI)\n" +
                        "WHERE TO_DATE(C.CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')\n" +
                        "AND C.CITA_ESTADO = 'R'\n" +
                        "AND C.MEDICO_MED_IDMEDICO =?";
        //filas
        String [] filas = new String[5];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setInt(2, idMed);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                    System.out.println(rs.getString(i+1));
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en MedicoDAO(listarAtenciones): " + e.getMessage() );
        }
    }
}
