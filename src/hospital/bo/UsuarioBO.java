/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.UsuarioDAO;
import hospital.db.Conexion;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class UsuarioBO {
    private String mensaje = "";
    private UsuarioDAO udao = new UsuarioDAO();
    
    public String login(String p, String user){
        Connection conn = Conexion.getConnection();
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
    
    public int getIdUser(String user){
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
}
