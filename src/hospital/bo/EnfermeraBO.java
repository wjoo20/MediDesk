/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.EnfermeraDAO;
import hospital.db.Conexion;
import hospital.entity.Paciente;
import java.sql.Connection;
import javax.swing.JTable;

/**
 *
 * @author Fiorella
 */
public class EnfermeraBO {
    
    private String mensaje = "";
    private EnfermeraDAO edao = new EnfermeraDAO();
    
    //Listar cita
    public void listarCita(JTable tabla, String especialidad, String date) {
        Connection conn  = Conexion.getConnection();
        edao.listarCita(conn, tabla, especialidad, date);
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Listar triaje
    public void listarTriaje(JTable tabla, String especialidad, String date) {
        Connection conn  = Conexion.getConnection();
        edao.listarTriaje(conn, tabla, especialidad, date);
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Listar paciente (txt)
    public Paciente listarPaciente(String value) {
        Connection conn  = Conexion.getConnection();
        Paciente p = edao.listarPaciente(conn, value);  
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;
    }
    
}
