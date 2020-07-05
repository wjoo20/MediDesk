/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.entity.Cita;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Admision_citaDAO {
       private String mensaje = "";
    public String agregarCita(Connection con, Cita cit){
        PreparedStatement pst =null;
        String sql ="INSERT INTO CITA (CITA_IDCITA,CITA_TIPO,CITA_ESTADO,CITA_FECHA,MEDICO_MED_IDMEDICO,TRIAJE_TRI_IDTRIAJE,PACIENTE_PAC_DNI)"+
                "VALUES(?,?,?,?,?,?,?)";
        try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, cit.getIdCita());
        pst.setString(2, cit.getTipo());
        pst.setString(3, cit.getEstado());
        pst.setString(4, cit.getFecha());
        pst.setInt(5, cit.getIdMedico());
        pst.setInt(6, 2);
        pst.setInt(7, cit.getDni_paciente());
 
        mensaje="CITA GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO GUARDAR CITA CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }
    
    public String modificarCita(Connection con,Cita cit){
        PreparedStatement pst =null;
        String sql ="UPDATE cita set "+
                "where CITA_IDCITA=?";
        try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, cit.getDni_paciente());
        pst.setString(2, cit.getTipo());
        pst.setString(3, cit.getEstado());
        pst.setString(4, cit.getFecha());
     
 
        mensaje="CITA ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO ACTUALIZAR CITA CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }    
    public String eliminarCita(Connection con,Cita cit){
    
    PreparedStatement pst =null;
    String sql="DELETE FROM CITA WHERE CITA_IDCITA=?";
            try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, cit.getDni_paciente());
  
        
        mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO ELIMINAR CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }
        
   
    public void listarCita(Connection conn,JTable tabla){
        DefaultTableModel model;
        String [] columnas={"Id Cita","Dni del paciente","Medico","Especialidad","Tipo","Estado","Fecha"};
        model = new DefaultTableModel(null,columnas);
        String sql="SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,c.CITA_FECHA FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad)";
        String [] filas = new String[7];
        Statement st = null;
        ResultSet rs=null;
        
        
        try {
            st = conn.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0;i<7;i++) {
                    filas[i]=rs.getString(i+1);
                    
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
}
