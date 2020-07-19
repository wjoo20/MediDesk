/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author PC
 */
public class RegistroDAO {
    private String mensaje = "";
    
    public void regUser(Connection con, Usuario user){
        PreparedStatement pst = null;

        String sql = "INSERT INTO USUARIO (US_CORREO, US_CLAVE, US_TIPO) "
                    + "VALUES(?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getCorreo());
            pst.setString(2, user.getClave());
            pst.setString(3, user.getTipo()+"");

            System.out.println("USUARIO GUARDADO CORRECTAMENTE");
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            System.out.println("NO SE PUDO GUARDAR USUARIO CORRECTAMENTE \n " + e.getMessage());
        }
    }
    
    public String regAdm(Connection con, Administrador adm){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ADMINISTRADOR (ADM_DNI, ADM_NOMBRES, ADM_APELLIDOS, ADM_GENERO, ADM_EDAD, USUARIO_US_IDUSUARIO) "
                + "VALUES(?,?,?,?,?,?)";

        try {
            pst = con.prepareStatement(sql);
 
            pst.setInt(1, adm.getDni());
            pst.setString(2, adm.getNombres());
            pst.setString(3, adm.getApellidos());
            pst.setString(4, adm.getGenero()+"");
            pst.setInt(5, adm.getEdad());
            pst.setInt(6, adm.getIdUsuario());           
            pst.execute();      
            pst.close();
            mensaje = "ADMINISTRADOR GUARDADO CORRECTAMENTE";
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR ADMINISTRADOR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String regMed(Connection con, Medico med){
        PreparedStatement pst = null;
        String sql = "INSERT INTO MEDICO (MED_DNI, MED_NOMBRES, MED_APELLIDOS, MED_GENERO, MED_EDAD, MED_CMP, USUARIO_US_IDUSUARIO, ESPE_ESPE_IDESPE) "
                + "VALUES(?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);

            pst.setInt(1, med.getDni());
            pst.setString(2, med.getNombres());
            pst.setString(3, med.getApellidos());
            pst.setString(4, med.getGenero()+"");
            pst.setInt(5, med.getEdad());
            pst.setInt(6, med.getCmp());
            pst.setInt(7, med.getIdUsuario());
            pst.setInt(8, med.getIdEspecialidad());          
            pst.execute();           
            pst.close();
            mensaje = "MÉDICO GUARDADO CORRECTAMENTE";
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR MÉDICO CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String regFarm(Connection con, Farmaceutico farm){
        PreparedStatement pst = null;
        String sql = "INSERT INTO FARMACEUTICO (FARM_DNI, FARM_NOMBRES, FARM_APELLIDOS, FARM_GENERO, FARM_EDAD, USUARIO_US_IDUSUARIO) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, farm.getDni());
            pst.setString(2, farm.getNombres());
            pst.setString(3, farm.getApellidos());
            pst.setString(4, farm.getGenero()+"");
            pst.setInt(5, farm.getEdad());
            pst.setInt(6, farm.getIdUsuario());         
            pst.execute();
            pst.close();
            mensaje = "FARMACEUTICO GUARDADO CORRECTAMENTE";
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR FARMACEUTICO CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String regEnf(Connection con, Enfermera enf){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ENFERMERA (ENF_DNI, ENF_NOMBRES, ENF_APELLIDOS, ENF_GENERO, ENF_EDAD, USUARIO_US_IDUSUARIO) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, enf.getDni());
            pst.setString(2, enf.getNombres());
            pst.setString(3, enf.getApellidos());
            pst.setString(4, enf.getGenero()+"");
            pst.setInt(5, enf.getEdad());
            pst.setInt(6, enf.getIdUsuario());           
            pst.execute();
            pst.close();
            mensaje = "ENFERMERA(O) GUARDADA(O) CORRECTAMENTE";
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR ENFERMERA(O) CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public int getIdAdm(Connection con, Administrador adm){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT ADM_IDADMINISTRADOR FROM ADMINISTRADOR WHERE ADM_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, adm.getDni());
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("ADM_IDADMINISTRADOR");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdAdm DAO: " + e.getMessage());
        }
        return id;
    }
    
    public int getIdEsp(Connection con, String esp){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT ESPE_IDESPECIALIDAD FROM ESPECIALIDAD WHERE ESPE_NOMBRE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, esp);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("ESPE_IDESPECIALIDAD");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdEsp DAO: " + e.getMessage());
        }
        return id;
    }
    
    public int getIdMed(Connection con, Medico med){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT MED_IDMEDICO FROM MEDICO WHERE MED_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, med.getDni());
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("MED_IDMEDICO");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdMed DAO: " + e.getMessage());
        }
        return id;
    }
    
    public int getIdEnf(Connection con, Enfermera enf){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT ENF_IDENFERMERA FROM MEDICO WHERE ENF_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, enf.getDni());
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("ENF_IDENFERMERA");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdEnf DAO: " + e.getMessage());
        }
        return id;
    }
    
    public int getIdFarm(Connection con, Farmaceutico farm){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT FARM_IDFARMACEUTICO FROM MEDICO WHERE FARM_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, farm.getDni());
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("FARM_IDFARMACEUTICO");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdFarm DAO: " + e.getMessage());
        }
        return id;
    }
}
