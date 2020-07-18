
package hospital.bo;

import hospital.dao.AdmisionDAO;
import hospital.entity.Paciente;
import java.sql.Connection;
import hospital.db.Conexion;
import hospital.entity.Cita;
import hospital.entity.Medico;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class AdmisionBO {
    
    private String mensaje = "";
    private AdmisionDAO Adao = new AdmisionDAO(); 
    
    public String agregarPaciente(Paciente pac){
        
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Adao.agregarPaciente(conn, pac);
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
    
    public String modificarPaciente(Paciente pac,String pac_dni){
        
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Adao.modificarPaciente(conn, pac,pac_dni);
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
    
    public String eliminarPaciente(String pac_dni){
       
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Adao.eliminarPaciente(conn, pac_dni);
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
        Adao.listarPaciente(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }   
    }
       
    public Paciente listar_editar_paciente(String pac_dni) {
        
        Connection conn  = Conexion.getConnection();
        Paciente pac = Adao.listar_editar_paciente(conn, pac_dni);  
        try {
            conn.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pac;
    }
          
    public void buscarPaciente(JTable tabla,String buscar_dni){
    
        Connection conn = Conexion.getConnection();
        Adao.buscarPaciente(conn, tabla,buscar_dni);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }    
    }
               
    public String agregarCita(Cita cit,int dato){
       
        Connection conn = Conexion.getConnection();
        try {
            mensaje = Adao.agregarCita(conn, cit,dato);
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
            mensaje = Adao.modificarCita(conn, cit,cita_id);
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
            mensaje = Adao.cancelarCita(conn, cit,cita_id);
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
        Adao.listarCita(conn, tabla);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }    
    }
             
    public void buscarCita(JTable tabla,String buscar_dni,char estado){
    
        Connection conn = Conexion.getConnection();
        Adao.buscarCita(conn, tabla,buscar_dni,estado);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
      
    public void listar_especialidades(JComboBox box){
   
        Connection conn = Conexion.getConnection();
        Adao.listar_especialidades(conn,box);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } 
    }
                
    public void listar_medicos(JComboBox box,int id){
    
        Connection conn = Conexion.getConnection();
        Adao.listar_medicos(conn,box,id);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }
                   
    public Cita listar_editar_cita(int cita_id,Medico med){
        
        Connection conn = Conexion.getConnection();
        Cita cit=Adao.listar_editar_cita(conn, cita_id,med);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cit;
    }
                    
    public void listar_estado(JTable tabla,char estado,String pac_dni){
        
        Connection conn = Conexion.getConnection();
        Adao.listar_estado(conn,tabla,estado,pac_dni);
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
  
    }
}
