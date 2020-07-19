/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.entity.Medicamentos;
import hospital.entity.Paciente;
import hospital.entity.Patologia;
import hospital.entity.Receta;
import hospital.views.Medico_paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class MedicoDAO {
    //Listar cita
    private String mensaje = "";
    public void mostrarCitas (Connection conn, JTable tabla, String date, int idMed) {
       
        DefaultTableModel model;
        String [] columnas = {"ID","Hora","Apellidos","Nombres","DNI","N° de Historia"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT C.CITA_IDCITA, TO_CHAR(C.CITA_FECHA,'HH24:MI'), P.PAC_APELLIDOS, P.PAC_NOMBRES, P.PAC_DNI, NVL(H.HIST_IDHISTORIA,0)\n" +
                        "FROM PACIENTE P JOIN CITA C ON(P.PAC_DNI=C.PACIENTE_PAC_DNI) LEFT OUTER JOIN HISTORIA H ON (P.PAC_DNI=H.PACIENTE_PAC_DNI)\n" +
                        "WHERE TO_DATE(C.CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')\n" +
                        "AND C.CITA_ESTADO = 'P' \n" +
                        "AND P.PAC_TRIAJE = 'S'\n" +
                        "AND C.MEDICO_MED_IDMEDICO = ?";
        //filas
        String [] filas = new String[6];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setInt(2, idMed);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 6; i++) {
                    filas[i] = rs.getString(i+1);
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en MedicoDAO(mostrarCitas): " + e.getMessage() );
        }
    }
    
    public void listarAtenciones (Connection conn, JTable tabla, String date, int idMed) {
       
        DefaultTableModel model;
        String [] columnas = {"Hora","Apellidos","Nombres","DNI","N° de Historia"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT TO_CHAR(C.CITA_FECHA,'HH24:MI'), P.PAC_APELLIDOS, P.PAC_NOMBRES, P.PAC_DNI, H.HIST_IDHISTORIA\n" +
                        "FROM PACIENTE P JOIN CITA C ON(P.PAC_DNI=C.PACIENTE_PAC_DNI) JOIN HISTORIA H ON (P.PAC_DNI=H.PACIENTE_PAC_DNI)\n" +
                        "WHERE TO_DATE(C.CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')\n" +
                        "AND C.CITA_ESTADO = 'R'\n" +
                        "AND C.MEDICO_MED_IDMEDICO =?";
        //filas
        String [] filas = new String[5];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, date);
            pst.setInt(2, idMed);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    filas[i] = rs.getString(i+1);
                    System.out.println(rs.getString(i+1));
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en MedicoDAO(listarAtenciones): " + e.getMessage() );
        }
    }
    
    public String crearHistoria(Connection con, String date, String dni){
        PreparedStatement pst = null;
        String sql = "INSERT INTO HISTORIA (HIST_FECHAAPERTURA, PACIENTE_PAC_DNI) "
                + "VALUES(?,?)";
        try {
            pst = con.prepareStatement(sql);
 
            pst.setString(1,date);
            pst.setString(2,dni);         
            pst.execute();      
            pst.close();
            mensaje = "HISTORIA CREADA CORRECTAMENTE";
        } catch (SQLException e) {
            mensaje = "NO SE PUDO GUARDAR HISTORIA \n " + e.getMessage();
        }
        return mensaje;
    }
    
    public Paciente crearPaciente(Connection con, String dni){
        Paciente pac = new Paciente();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM PACIENTE WHERE PAC_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, dni);
            rs = pst.executeQuery();           
            if(rs.next()){
                pac.setDni(rs.getInt("PAC_DNI"));
                pac.setNombres(rs.getString("PAC_NOMBRES"));
                pac.setApellidos(rs.getString("PAC_APELLIDOS"));
                pac.setCorreo(rs.getString("PAC_CORREO"));
                pac.setTelefono(rs.getInt("PAC_TELEFONO"));
                pac.setDireccion(rs.getString("PAC_DIRECCION"));
                pac.setGenero(rs.getString("PAC_GENERO").charAt(0));
                pac.setEdad(rs.getInt("PAC_EDAD"));
                pac.setTalla(rs.getInt("PAC_TALLA"));
                pac.setPeso(rs.getDouble("PAC_PESO"));
                pac.setTemperatura(rs.getDouble("PAC_TEMPERATURA"));
                pac.setPresion(rs.getDouble("PAC_PRESION"));
                pac.setTriaje(rs.getString("PAC_TRIAJE"));
                pac.setIdAdministrador(rs.getInt("ADM_ADM_IDADM"));
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en crearPaciente DAO: " + e.getMessage());
        }
        return pac;
    }
    
    public void listarPatologia(Connection conn,JComboBox jpat){
        DefaultComboBoxModel val = new DefaultComboBoxModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        String sql="SELECT * FROM PATOLOGIA";
        val.addElement("Seleccione una patología");
        try{    
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            jpat.setModel(val);
            while(rs.next()){ 
              val.addElement(rs.getString(2));
            }
            rs.close();
        } catch (SQLException e) {
               System.out.println(e.toString());
        }    
    }  
    
    public void listarMedicamentos(Connection conn,JComboBox jmed){
        DefaultComboBoxModel val = new DefaultComboBoxModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        String sql="SELECT * FROM MEDICAMENTO";
        val.addElement("Seleccione un medicamento");
        try{    
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            jmed.setModel(val);
            while(rs.next()){
              val.addElement(rs.getString(2));
            }
            rs.close();
        } catch (SQLException e) {
               System.out.println(e.toString());
        }    
    }
    
    public int getIdPat(Connection con, String pato){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT PAT_IDPATOLOGIA FROM PATOLOGIA WHERE PAT_DESCRIPCION = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, pato);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("PAT_IDPATOLOGIA");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdPat DAO: " + e.getMessage());
        }
        return id;
    }
    
    public int getIdMed(Connection con, String med){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT ME_IDMEDICAMENTO FROM MEDICAMENTO WHERE ME_NOMBRE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, med);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("ME_IDMEDICAMENTO");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdMed DAO: " + e.getMessage());
        }
        return id;
    }
    
    public void updatePaciente(Connection con, int dni) {
        PreparedStatement pst = null;
        String sql = "UPDATE PACIENTE SET PAC_TRIAJE = 'N' WHERE PAC_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, dni);
            pst.execute();
            pst.close();
            System.out.println("Paciente actualizado");
        } 
        catch (SQLException e) {
            System.out.println("Error en updatePaciente DAO: " + e.getMessage());
        }
    }
    
    public void updateCita(Connection con, int idCita) {
        PreparedStatement pst = null;
        String sql = "UPDATE CITA SET CITA_ESTADO = 'R' WHERE CITA_IDCITA = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCita);
            pst.execute();
            pst.close();
            System.out.println("Cita actualizada");
        } 
        catch (SQLException e) {
            System.out.println("Error en updateCita DAO: " + e.getMessage());
        }
    }
    
    public void crearHis_Pat(Connection con, String his, int idPat, int idCita) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO HISTORIA_PATOLOGIA (HISTORIA_HIST_IDHISTORIA, PATOLOGIA_PAT_IDPATOLOGIA, CITA_CITA_IDCITA) VALUES (?,?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, his);
            pst.setInt(2, idPat);
            pst.setInt(3, idCita);          
            pst.execute();
            pst.close();
            System.out.println("His_pat creado");
        } 
        catch (SQLException e) {
            System.out.println("Error en crearHis_Pat DAO: " + e.getMessage());        
        }
    }
    
    public void crearReceta(Connection con, int idCita, String indi) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO RECETA (REC_INDICACIONES, CITA_CITA_IDCITA) VALUES (?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, indi);
            pst.setInt(2, idCita);
            pst.execute();
            pst.close();
            System.out.println("Receta creada");
        } 
        catch (SQLException e) {
            System.out.println("Error en crearReceta DAO: " + e.getMessage());        
        }
    }
    
    public int getIdReceta(Connection con, int idCita){
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT REC_IDRECETA FROM RECETA WHERE CITA_CITA_IDCITA = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idCita);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("REC_IDRECETA");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdReceta DAO: " + e.getMessage());
        }
        return id;
    }
    
    public void crearRec_Med(Connection con, int idRec, int idMed) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO REC_ME (RECETA_REC_IDRECETA, MEDICAMENTO_ME_IDMEDICAMENTO) VALUES (?,?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idRec);
            pst.setInt(2, idMed);
            pst.execute();
            pst.close();
            System.out.println("Rec_me creado");
        } 
        catch (SQLException e) {
            System.out.println("Error en crearRec_Med DAO: " + e.getMessage());        
        }
    }
    
    public void Buscar_Patologias(Connection conn, JComboBox pat, String buscar){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();      
        String sql = "SELECT * FROM PATOLOGIA WHERE PAT_DESCRIPCION LIKE '%"+buscar+"%'";
        try {
            PreparedStatement pst = null;
            ResultSet rs = null;
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                System.out.println("1111");
                modelo.addElement(rs.getString("PAT_DESCRIPCION"));
            }
            pat.setModel(modelo);
            pst.close();
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Medico_paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
