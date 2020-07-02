/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.entity.Administrador;
import hospital.entity.Enfermera;
import hospital.entity.Medico;
import hospital.entity.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author PC
 */
public class RegistroDAO {
    private String mensaje = "";
    
    public void regUser(Connection con, Usuario user){
        PreparedStatement pst = null;
        String sql = "INSERT INTO USUARIO (US_IDUSUARIO, US_CORREO, US_CLAVE, US_TIPO) "
                + "VALUES(?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, user.getIdUsuario());
            pst.setString(2, user.getCorreo());
            pst.setString(3, user.getClave());
            pst.setString(4, user.getTipo()+"");

            System.out.println("USUARIO GUARDADO CORRECTAMENTE");
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            System.out.println("NO SE PUDO GUARDAR USUARIO CORRECTAMENTE \n " + e.getMessage());
        }
    }
    
    public String regAdm(Connection con, Administrador adm){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ADMINISTRADOR (ADM_IDADMINISTRADOR, ADM_DNI, ADM_NOMBRES, ADM_APELLIDOS, ADM_GENERO, ADM_EDAD, USUARIO_US_IDUSUARIO) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, adm.getIdAdministrador());
            pst.setInt(2, adm.getDni());
            pst.setString(3, adm.getNombres());
            pst.setString(4, adm.getApellidos());
            pst.setString(5, adm.getGenero()+"");
            pst.setInt(6, adm.getEdad());
            pst.setInt(7, adm.getIdUsuario());
            mensaje = "ADMINISTRADOR GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR ADMINISTRADOR CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String regMed(Connection con, Medico med){
        PreparedStatement pst = null;
        String sql = "INSERT INTO MEDICO (MED_IDMEDICO, MED_DNI, MED_NOMBRES, MED_APELLIDOS, MED_GENERO, MED_EDAD, MED_CMP, USUARIO_US_IDUSUARIO, ESPE_ESPE_IDESPE) "
                + "VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, med.getIdMedico());
            pst.setInt(2, med.getDni());
            pst.setString(3, med.getNombres());
            pst.setString(4, med.getApellidos());
            pst.setString(5, med.getGenero()+"");
            pst.setInt(6, med.getEdad());
            pst.setInt(7, med.getCmp());
            pst.setInt(8, med.getIdUsuario());
            pst.setInt(9, med.getIdEspecialidad());
            mensaje = "MÉDICO GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR MÉDICO CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String regFarm(Connection con, String farm){
        PreparedStatement pst = null;
        String sql = "INSERT INTO FARMACEUTICO (FARM_IDFARMACEUTICO, FARM_DNI, FARM_NOMBRES, FARM_APELLIDOS, FARM_GENERO, FARM_EDAD, USUARIO_US_IDUSUARIO) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, farm.getIdFarmaceutico());
            pst.setInt(2, farm.getDni());
            pst.setString(3, farm.getNombres());
            pst.setString(4, farm.getApellidos());
            pst.setString(5, farm.getGenero()+"");
            pst.setInt(6, farm.getEdad());
            pst.setInt(7, farm.getIdUsuario());
            mensaje = "FARMACEUTICO GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR FARMACEUTICO CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public String regEnf(Connection con, Enfermera enf){
        PreparedStatement pst = null;
        String sql = "INSERT INTO ENFERMERA (ENF_IDENFERMERA, ENF_DNI, ENF_NOMBRES, ENF_APELLIDOS, ENF_GENERO, ENF_EDAD, USUARIO_US_IDUSUARIO) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, enf.getIdEnfermera());
            pst.setInt(2, enf.getDni());
            pst.setString(3, enf.getNombres());
            pst.setString(4, enf.getApellidos());
            pst.setString(5, enf.getGenero()+"");
            pst.setInt(6, enf.getEdad());
            pst.setInt(7, enf.getIdUsuario());
            mensaje = "ENFERMERA(O) GUARDADA(O) CORRECTAMENTE";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR ENFERMERA(O) CORRECTAMENTE \n " + e.getMessage();
        }
        return mensaje;
    }
}
