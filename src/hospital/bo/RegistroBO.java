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
import java.security.MessageDigest;
import java.sql.Connection;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;

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
    
    public int getIdAdm(Administrador adm){
        Connection conn = Conexion.getConnection();
        int id = rdao.getIdAdm(conn,adm);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    public int getIdEsp(String espe){
        Connection conn = Conexion.getConnection();
        int id = rdao.getIdEsp(conn,espe);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    public int getIdMed(Medico med){
        Connection conn = Conexion.getConnection();
        int id = rdao.getIdMed(conn,med);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    public int getIdEnf(Enfermera enf){
        Connection conn = Conexion.getConnection();
        int id = rdao.getIdEnf(conn,enf);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    public int getIdFarm(Farmaceutico farm){
        Connection conn = Conexion.getConnection();
        int id = rdao.getIdFarm(conn,farm);
        try {           
            conn.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());      
        }
        return id;
    }
    
    public String encrypt(String pass){
        String secretKey = "MediDesk";
        String epass = this.ecnode(secretKey, pass);
        return epass;
    }
    
    public String ecnode(String secretKey, String cadena) {
        String encriptacion = "";
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
            byte[] BytesKey = Arrays.copyOf(llavePassword, 24);
            SecretKey key = new SecretKeySpec(BytesKey, "DESede");
            Cipher cifrado = Cipher.getInstance("DESede");
            cifrado.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = cadena.getBytes("utf-8");
            byte[] buf = cifrado.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }
        return encriptacion;
    }
}
