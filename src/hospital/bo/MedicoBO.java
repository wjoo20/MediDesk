/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.MedicoDAO;
import hospital.db.Conexion;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class MedicoBO {
    private MedicoDAO mdao = new MedicoDAO();
    
    //Listar cita
    public void mostrarCitas(JTable tabla, String date, int idMed) {
        Connection conn  = Conexion.getConnection();
        mdao.mostrarCitas(conn, tabla, date, idMed);
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
