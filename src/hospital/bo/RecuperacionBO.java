/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.RecuperacionDAO;
import hospital.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author PROPIETARIO
 */
public class RecuperacionBO {
    private String mensaje = "";
    private RecuperacionDAO recu = new RecuperacionDAO();
    public void Recuperar_pass(String nueva_clave, String correo) {
        Connection conn  = Conexion.getConnection();
        recu.Recuperar_pass(conn, nueva_clave, correo);
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
