/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.Admision_citaDAO;
import hospital.db.Conexion;
import hospital.entity.Cita;
import hospital.entity.Medico;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author daniel
 */
public class Admision_citaBO {
         private String mensaje = "";
    private Admision_citaDAO Acdao = new Admision_citaDAO();
    
    public String agregarCita(Cita cit,int dato){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Acdao.agregarCita(conn, cit,dato);
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
    public String modificarCita(Cita cit,int cita_id){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Acdao.modificarCita(conn, cit,cita_id);
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
    public String cancelarCita(Cita cit,int cita_id){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Acdao.cancelarCita(conn, cit,cita_id);
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
               public void buscarCita(JTable tabla,String buscar_dni){
    Connection conn = Conexion.getConnection();
    Acdao.buscarCita(conn, tabla,buscar_dni);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
        public void listar_especialidades(JComboBox box){
    Connection conn = Conexion.getConnection();
    Acdao.listar_especialidades(conn,box);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   
    }
                public void listar_medicos(JComboBox box,int id){
    Connection conn = Conexion.getConnection();
    Acdao.listar_medicos(conn,box,id);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   
    }
                    public Cita listar_editar_cita(int cita_id,Medico med){
    Connection conn = Conexion.getConnection();
    Cita cit=Acdao.listar_editar_cita(conn, cita_id,med);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
   return cit;
    }
                    public void listar_estado(JTable tabla,char estado){
              Connection conn = Conexion.getConnection();
    Acdao.listar_estado(conn,tabla,estado);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                    
                    
                    }
}
