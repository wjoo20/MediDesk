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
    private final UsuarioDAO udao = new UsuarioDAO();
        Connection conn = Conexion.getConnection();
    public String login(String p, String user){
         //Conexion a la base de datos
        String pass = udao.login(conn,user);
        try {
            if(pass == null){
                mensaje = "Usuario incorrecto";
            }
            else if(p.equals(pass)){
                mensaje = "Contraseña correcta";
            }else{
                mensaje = "Contraseña incorrecta";
            }
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return mensaje;
    }
    
    public int getIdUser(Usuario user){
        
        int id = udao.getIdUser(conn,user);
        try {           
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return id;
    }
    
    public char getTipoUser(String user){
        
        char tipo = udao.getTipoUser(conn,user);
        try {           
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return tipo;
    }
    
    public Administrador createAdm(Usuario user){
        
        Administrador adm = udao.createAdm(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return adm;
    }
    
    public Medico createMed(Usuario user){
        
        Medico med = udao.createMed(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return med;
    }
    
    public Enfermera createEnf(Usuario user){
        
        Enfermera enf = udao.createEnf(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return enf;
    }
    
    public Farmaceutico createFarm(Usuario user){
        
        Farmaceutico farm = udao.createFarm(conn,user);
        try {   
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());      
        }
        return farm;
    }
}
