/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.Admision_pacienteDAO;
import hospital.entity.Paciente;
import java.sql.Connection;
import hospital.db.Conexion;
import java.sql.SQLException;
import javax.swing.JTable;

/**
 *
 * @author daniel
 */
public class Admision_pacienteBO {
        private String mensaje = "";
    private Admision_pacienteDAO Apdao = new Admision_pacienteDAO();
    
    public String agregarPaciente(Paciente pac){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Apdao.agregarPaciente(conn, pac);
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
    public String modificarPaciente(Paciente pac){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Apdao.modificarPaciente(conn, pac);
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
    public String eliminarPaciente(Paciente pac){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Apdao.eliminarPaciente(conn, pac);
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
    
    public void listarPaciente(JTable tabla){
    Connection conn = Conexion.getConnection();
    Apdao.listarPaciente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
    
}
