/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.CitaDAO;
import hospital.db.Conexion;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author Fiorella
 */
public class CitaBO {
    private String mensaje = "";
    private CitaDAO cdao = new CitaDAO();
    
    public void listarCita(JTable tabla, String especialidad) {
        Connection conn  = Conexion.getConnection();
        cdao.listarCita(conn, tabla, especialidad);
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
