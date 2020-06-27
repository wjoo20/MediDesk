/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class UsuarioDAO {
    
    private String mensaje = "";
    
    public String login(Connection con){
        String user = "juniorosis20@gmail.com";
        String pass = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT US_CLAVE FROM USUARIO WHERE US_CORREO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            rs = pst.executeQuery();
            if(rs.next()){
                pass = rs.getString("US_CLAVE");
                System.out.println(pass);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en usuario DAO: " + e.getMessage());
        }
        return pass;
    }
    
    public static void main(String[] args){
        UsuarioDAO user = new UsuarioDAO();
        
        Connection conn = null;
        String login = "Proyecto";
        String clave = "123456";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url,login,clave);
            conn.setAutoCommit(false);
            if(conn != null){
                System.out.println("Conexión Exitosas");
            }else{
                System.out.println("Conexion es erronea");
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión Erronea " + e.getMessage());
        }
        user.login(conn);
    }
}
