/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.RegistroDAO;
import hospital.db.Conexion;
import hospital.entity.Administrador;
import hospital.entity.Enfermera;
import hospital.entity.Farmaceutico;
import hospital.entity.Medico;
import hospital.entity.Usuario;
import java.sql.Connection;

/**
 *
 * @author PC
 */
public class RegistroBO {
    private String mensaje = "";
    private RegistroDAO rdao = new RegistroDAO();
    
    public void regUser(Usuario user){
        Connection conn = Conexion.getConnection();
        try {
            rdao.regUser(conn, user);
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
    }
    
    public String regAdm(Administrador adm){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = rdao.regAdm(conn, adm);
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
    
    public String regEnf(Enfermera enf){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = rdao.regEnf(conn, enf);
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
    
    public String regFarm(Farmaceutico farm){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = rdao.regFarm(conn, farm);
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
    
    public String regMed(Medico med){
        Connection conn = Conexion.getConnection();
        try {
            mensaje = rdao.regMed(conn, med);
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
}
