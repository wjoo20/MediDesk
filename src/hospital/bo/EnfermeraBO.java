/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.EnfermeraDAO;
import hospital.db.Conexion;
import hospital.entity.Enfermera;
import hospital.entity.Paciente;
import java.sql.Connection;
import java.sql.SQLException;
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
        catch (SQLException e) {
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
        catch (SQLException e) {
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
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return p;
    }
    
    //Agregar triaje(Paciente)
    public String agregarTriajePaciente(Paciente pac, String dni) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarTriajePaciente(conn, pac, dni);           
        } 
        catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    //Eliminar triaje(Paciente)
    public String eliminarTriajePaciente(String dni) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarTriajePaciente(conn, dni);           
        } 
        catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    //Obtener el idEnfermera
    public int getIdEnf(Enfermera enf,Integer dni){
        Connection conn = Conexion.getConnection();
        int id = edao.getIdEnf(conn,enf, dni);
        try {           
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    //Obtener el idCita
    public int getIdCita(Integer dni, String especialidad, String date) {
        Connection conn = Conexion.getConnection();
        int id = edao.getIdCita(conn,String.valueOf(dni), especialidad, date);
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    //Obtener el idTriaje2.0
    public int getIdTriaje2(String dni, String especialidad, String date) {
        Connection conn = Conexion.getConnection();
        int id = edao.getIdTriaje2(conn,String.valueOf(dni), especialidad, date);
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    //Obtener el idTriaje
    public int getIdTriaje() {
        Connection conn = Conexion.getConnection();
        int id = edao.getidTriaje(conn);
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return id;
    }
    
    //Update tabla cita 
    public String updateTablaCita(Integer idTriaje, Integer idCita) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.updateTablaCita(conn, idTriaje, idCita);
        } 
        catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    //EliminaridCita en tabla cita 
    public String eliminarTablaCita(String dni, String date, String especialidad) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarTablaCita(conn,Integer.valueOf(dni), date, especialidad);
        } 
        catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    //Eliminar registro en tabla triaje(por fin!!!)
    public String eliminarTablaTriaje(Integer idTriaje) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.eliminarTablaTriaje(conn, idTriaje);
        } catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                mensaje = mensaje +" " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    //Insertar tabla Triaje
    public String agregarTablaTriaje(Enfermera enf,Integer id) {
        Connection conn = Conexion.getConnection();
        try {
            mensaje = edao.agregarTablaTriaje(conn, enf, id);           
        } 
        catch (Exception e) {
            mensaje = mensaje + " " + e.getMessage();
        }
        finally {
            try {
                if(conn != null) {
                    conn.close();
                }
            } 
            catch (SQLException e) {
                mensaje = mensaje + " " + e.getMessage();
            }
        }
        return mensaje;
    }
    
    
    
    
}
