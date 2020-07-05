/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.Admision_citaDAO;
import hospital.db.Conexion;
import hospital.entity.Cita;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author daniel
 */
public class Admision_citaBO {
         private String mensaje = "";
    private Admision_citaDAO Acdao = new Admision_citaDAO();
    
    public String agregarCita(Cita cit){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Acdao.agregarCita(conn, cit);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String modificarCita(Cita cit){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Acdao.modificarCita(conn, cit);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    public String eliminarCita(Cita cit){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Acdao.eliminarCita(conn, cit);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }finally{
            try {
                if(conn != null){
                    conn.close();
                }
            } catch (Exception e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    public void listarCita(JTable tabla){
    Connection conn = Conexion.getConnection();
    Acdao.listarCita(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
}
