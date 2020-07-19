package hospital.bo;

import hospital.dao.UsuarioDAO;
import hospital.db.Conexion;
import hospital.entity.Administrador;
import hospital.entity.Enfermera;
import hospital.entity.Farmaceutico;
import hospital.entity.Medico;
import hospital.entity.Usuario;
import java.sql.Connection;
import java.sql.SQLException;


public class UsuarioBO {
    private String mensaje;
    private UsuarioDAO udao = new UsuarioDAO();
        
    public String login(String p, String user){
        Connection conn = Conexion.getConnection();//Conexion a la base de datos
        String pass = udao.login(conn,user);
        try {
            if(pass == null){
                mensaje = "Usuario y/o contraseña incorrecta";
            }
            else if(p.equals(pass)){
                mensaje = "BIENVENIDO(A)!";
            }else{
                mensaje = "Usuario y/o contraseña incorrecta";
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return mensaje;
    }
    
    public int getIdUser(Usuario user){
        Connection conn = Conexion.getConnection();
        int id = udao.getIdUser(conn,user);
        try {           
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return id;
    }
    
    public char getTipoUser(String user){
        Connection conn = Conexion.getConnection();
        char tipo = udao.getTipoUser(conn,user);
        try {           
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return tipo;
    }
    
    public Administrador createAdm(Usuario user){
        Connection conn = Conexion.getConnection();
        Administrador adm = udao.createAdm(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return adm;
    }
    
    public Medico createMed(Usuario user){
        Connection conn = Conexion.getConnection();
        Medico med = udao.createMed(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return med;
    }
    
    public Enfermera createEnf(Usuario user){
        Connection conn = Conexion.getConnection();
        Enfermera enf = udao.createEnf(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return enf;
    }
    
    public Farmaceutico createFarm(Usuario user){
        Connection conn = Conexion.getConnection();
        Farmaceutico farm = udao.createFarm(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return farm;
    }
}
