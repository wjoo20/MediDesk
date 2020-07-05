package hospital.dao;

import hospital.entity.Administrador;
import hospital.entity.Enfermera;
import hospital.entity.Farmaceutico;
import hospital.entity.Medico;
import hospital.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
   
    public String login(Connection con, String user){
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
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en login DAO: " + e.getMessage());
        }
        return pass;
    }    

    public int getIdUser(Connection con, Usuario user){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT US_IDUSUARIO FROM USUARIO WHERE US_CORREO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getCorreo());
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
        PreparedStatement pst = null;
        ResultSet rs = null;
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
    
    public Administrador createAdm(Connection con, Usuario user){
        Administrador adm = new Administrador();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM ADMINISTRADOR A JOIN USUARIO U ON (A.USUARIO_US_IDUSUARIO=U.US_IDUSUARIO) WHERE USUARIO_US_IDUSUARIO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getIdUsuario());
            rs = pst.executeQuery();           
            if(rs.next()){
                adm.setIdAdministrador(rs.getInt("ADM_IDADMINISTRADOR"));
                adm.setDni(rs.getInt("ADM_DNI"));
                adm.setNombres(rs.getString("ADM_NOMBRES"));
                adm.setApellidos(rs.getString("ADM_APELLIDOS"));
                adm.setGenero(rs.getString("ADM_GENERO").charAt(0));
                adm.setEdad(rs.getInt("ADM_EDAD"));
                adm.setIdUsuario(rs.getInt("USUARIO_US_IDUSUARIO"));
                adm.setCorreo(rs.getString("US_CORREO"));
                adm.setClave(rs.getString("US_CLAVE"));
                adm.setTipo(rs.getString("US_TIPO").charAt(0));
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en createAdm DAO: " + e.getMessage());
        }
        return adm;
    }
    
    public Medico createMed(Connection con, Usuario user){
        Medico med = new Medico();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM MEDICO M JOIN USUARIO U ON (M.USUARIO_US_IDUSUARIO=U.US_IDUSUARIO) WHERE USUARIO_US_IDUSUARIO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getIdUsuario());
            rs = pst.executeQuery();           
            if(rs.next()){
                med.setIdMedico(rs.getInt("MED_IDMEDICO"));
                med.setDni(rs.getInt("MED_DNI"));
                med.setNombres(rs.getString("MED_NOMBRES"));
                med.setApellidos(rs.getString("MED_APELLIDOS"));
                med.setGenero(rs.getString("MED_GENERO").charAt(0));
                med.setEdad(rs.getInt("MED_EDAD"));
                med.setCmp(rs.getInt("MED_CMP"));
                med.setIdEspecialidad(rs.getInt("ESPE_ESPE_IDESPE"));
                med.setIdUsuario(rs.getInt("USUARIO_US_IDUSUARIO"));
                med.setCorreo(rs.getString("US_CORREO"));
                med.setClave(rs.getString("US_CLAVE"));
                med.setTipo(rs.getString("US_TIPO").charAt(0));
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en createMed DAO: " + e.getMessage());
        }
        return med;
    }
    
    public Enfermera createEnf(Connection con, Usuario user){
        Enfermera enf = new Enfermera();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM ENFERMERA E JOIN USUARIO U ON (E.USUARIO_US_IDUSUARIO=U.US_IDUSUARIO) WHERE USUARIO_US_IDUSUARIO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getIdUsuario());
            rs = pst.executeQuery();           
            if(rs.next()){
                enf.setIdEnfermera(rs.getInt("ENF_IDENFERMERA"));
                enf.setDni(rs.getInt("ENF_DNI"));
                enf.setNombres(rs.getString("ENF_NOMBRES"));
                enf.setApellidos(rs.getString("ENF_APELLIDOS"));
                enf.setGenero(rs.getString("ENF_GENERO").charAt(0));
                enf.setEdad(rs.getInt("ENF_EDAD"));
                enf.setIdUsuario(rs.getInt("USUARIO_US_IDUSUARIO"));
                enf.setCorreo(rs.getString("US_CORREO"));
                enf.setClave(rs.getString("US_CLAVE"));
                enf.setTipo(rs.getString("US_TIPO").charAt(0));
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en createEnf DAO: " + e.getMessage());
        }
        return enf;
    }
    
    public Farmaceutico createFarm(Connection con, Usuario user){
        Farmaceutico farm = new Farmaceutico();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM FARMACEUTICO F JOIN USUARIO U ON (F.USUARIO_US_IDUSUARIO=U.US_IDUSUARIO) WHERE USUARIO_US_IDUSUARIO = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getIdUsuario());
            rs = pst.executeQuery();           
            if(rs.next()){
                farm.setIdFarmaceutico(rs.getInt("FARM_IDFARMACEUTICO"));
                farm.setDni(rs.getInt("FARM_DNI"));
                farm.setNombres(rs.getString("FARM_NOMBRES"));
                farm.setApellidos(rs.getString("FARM_APELLIDOS"));
                farm.setGenero(rs.getString("FARM_GENERO").charAt(0));
                farm.setEdad(rs.getInt("FARM_EDAD"));
                farm.setIdUsuario(rs.getInt("USUARIO_US_IDUSUARIO"));
                farm.setCorreo(rs.getString("US_CORREO"));
                farm.setClave(rs.getString("US_CLAVE"));
                farm.setTipo(rs.getString("US_TIPO").charAt(0));
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en createFarm DAO: " + e.getMessage());
        }
        return farm;
    }
}
