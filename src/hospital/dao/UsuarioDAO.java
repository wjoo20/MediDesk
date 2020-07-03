package hospital.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    PreparedStatement pst;
    ResultSet rs ;
    public String login(Connection con, String user){
        String pass = null;
        String sql = "SELECT US_CLAVE FROM USUARIO WHERE US_CORREO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            rs = pst.executeQuery();
            if(rs.next()){
                pass = rs.getString("US_CLAVE");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en login DAO: " + e.getMessage());
        }
        return pass;
    }
    
    public int getIdUser(Connection con, String user){
        int id = 0;
    String sql = "SELECT US_IDUSUARIO FROM USUARIO WHERE US_CORREO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("US_IDUSUARIO");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdUser DAO: " + e.getMessage());
        }
        return id;
    }
    
    public char getTipoUser(Connection con, String user){
        char tipo = ' ';
        String sql = "SELECT US_TIPO FROM USUARIO WHERE US_CORREO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user);
            rs = pst.executeQuery();
            if(rs.next()){
                tipo = rs.getString("US_TIPO").charAt(0);
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdUser DAO: " + e.getMessage());
        }
        return tipo;
    }
}
