/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.views.Farmacia_medicamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROPIETARIO
 */
public class RecuperacionDAO {
    PreparedStatement pst;
    ResultSet rs;
    public void Recuperar_pass(Connection conn, String nueva_clave, String correo){

        String sql = "update usuario set us_clave = ? where us_correo = ?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, nueva_clave);
            pst.setString(2, correo);
            rs = pst.executeQuery();
            conn.commit();

             pst.close();
             rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
