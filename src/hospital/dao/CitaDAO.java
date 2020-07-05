/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fiorella
 */
public class CitaDAO {
    
    public void listarCita (Connection conn, JTable tabla, String especialidad) {
        
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRES","APELLIDOS","DNI","MEDICO","TIPO","ESTADO"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT C.CITA_IDCITA, P.PAC_NOMBRES, P.PAC_APELLIDOS, P.PAC_DNI, M.MED_APELLIDOS, C.CITA_TIPO, C.CITA_ESTADO FROM CITA C JOIN PACIENTE P ON(C.PACIENTE_PAC_DNI=P.PAC_DNI) JOIN MEDICO M ON (C.MEDICO_MED_IDMEDICO=M.MED_IDMEDICO) WHERE M.MED_IDMEDICO = (SELECT E.ESPE_IDESPECIALIDAD FROM ESPECIALIDAD E JOIN MEDICO M ON (E.ESPE_IDESPECIALIDAD=M.ESPE_ESPE_IDESPE) WHERE E.ESPE_NOMBRE = ?)";
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
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los valores en la tabla" );
        }
    }
    
}
