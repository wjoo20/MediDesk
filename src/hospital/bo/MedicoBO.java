/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.MedicoDAO;
import hospital.db.Conexion;
import hospital.entity.Paciente;
import hospital.entity.Receta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author PC
 */
public class MedicoBO {
    private MedicoDAO mdao = new MedicoDAO();
    private String mensaje = "";
    
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
    
    public void listarAtenciones(JTable tabla, String date, int idMed) {
        Connection conn  = Conexion.getConnection();
        mdao.listarAtenciones(conn, tabla, date, idMed);
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public String crearHistoria(String date, String dni) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = mdao.crearHistoria(conn, date, dni);
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
    
    public Paciente crearPaciente(String dni){
        Connection conn = Conexion.getConnection();
        Paciente pac = mdao.crearPaciente(conn,dni);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return pac;
    }
    
    public void listarPatologia(JComboBox jpat){
    Connection conn = Conexion.getConnection();
    mdao.listarPatologia(conn,jpat);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void listarMedicamentos(JComboBox jmed){
    Connection conn = Conexion.getConnection();
    mdao.listarMedicamentos(conn,jmed);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public int getIdPat(String pato){
        Connection conn = Conexion.getConnection();
        int id = mdao.getIdPat(conn,pato);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    public int getIdMed(String medi){
        Connection conn = Conexion.getConnection();
        int id = mdao.getIdMed(conn,medi);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    public void updatePaciente(int dni) {
        Connection conn = Conexion.getConnection();
        try {
            mdao.updatePaciente(conn, dni);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void updateCita(int idCita) {
        Connection conn = Conexion.getConnection();
        try {
            mdao.updateCita(conn, idCita);
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void crearHis_Pat(String his, int idPat, int idCita) {
        Connection conn = Conexion.getConnection();
        try {
            mdao.crearHis_Pat(conn, his, idPat, idCita);           
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void crearReceta(int idCita, String indi) {
        Connection conn = Conexion.getConnection();
        try {
            mdao.crearReceta(conn, idCita, indi);           
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public int getIdReceta(int idCita){
        Connection conn = Conexion.getConnection();
        int id = mdao.getIdReceta(conn,idCita);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    public void crearRec_Med(int idRec, int idMed) {
        Connection conn = Conexion.getConnection();
        try {
            mdao.crearRec_Med(conn, idRec, idMed);           
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    public void Buscar_Patologias(JComboBox pat, String buscar) {
        Connection conn  = Conexion.getConnection();
        mdao.Buscar_Patologias(conn, pat, buscar);    
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
