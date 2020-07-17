/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.entity.Cita;
import hospital.entity.Especialidad;
import hospital.entity.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author daniel
 */
public class Admision_citaDAO {
       private String mensaje = "";
      
    public String agregarCita(Connection con, Cita cit,int dato){
        PreparedStatement pst =null;
        String sql ="INSERT INTO CITA (CITA_IDCITA,CITA_TIPO,CITA_ESTADO,CITA_FECHA,MEDICO_MED_IDMEDICO,PACIENTE_PAC_DNI)"+
                "VALUES(SEQ_CITA.NEXTVAL,?,?,TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'),?,?)";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1, cit.getTipo());
        pst.setString(2, cit.getEstado());
        pst.setString(3, cit.getFecha());
        pst.setInt(4, dato);
        pst.setInt(5, cit.getDni_paciente());
 
        mensaje="CITA GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO GUARDAR CITA CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }
    
    public String modificarCita(Connection con,Cita cit,int cita_id){
        PreparedStatement pst =null;
        String sql ="UPDATE cita set cita_fecha=TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'),MEDICO_MED_IDMEDICO=?,PACIENTE_PAC_DNI=?"+
                "where CITA_IDCITA=?";
        try{
        pst=con.prepareStatement(sql);
        pst.setString(1, cit.getFecha());
      pst.setInt(2, cit.getIdMedico());
   pst.setInt(3, cit.getDni_paciente());
     pst.setInt(4, cita_id);
        mensaje="CITA ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO ACTUALIZAR CITA CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }    
    public String cancelarCita(Connection con,Cita cit,int cita_id){
    
    PreparedStatement pst =null;
    String sql="UPDATE cita set CITA_ESTADO='C'"+
                "where CITA_IDCITA=?";
            try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, cita_id);
  
        
        mensaje="CANCELADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO CANCELAR CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }
        
   
    public void listarCita(Connection conn,JTable tabla){
        DefaultTableModel model;
        String [] columnas={"Id","Dni del paciente","Medico","Especialidad","Tipo","Estado","Fecha","Hora"};
        model = new DefaultTableModel(null,columnas);
        String sql="SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,TO_CHAR(c.CITA_FECHA,'YYYY-MM-DD'),TO_CHAR(c.CITA_FECHA,'HH24:MI:SS') FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad) order by c.CITA_IDCITA";
        String [] filas = new String[8];
        Statement st = null;
        ResultSet rs=null;
        
        
        try {
            st = conn.createStatement();
            rs=st.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0;i<8;i++) {
                    filas[i]=rs.getString(i+1);
                    
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla");
        }
    }
        public void buscarCita(Connection conn,JTable tabla,String buscar_dni){
        DefaultTableModel model;
        String [] columnas={"Id","Dni del paciente","Medico","Especialidad","Tipo","Estado","Fecha","Hora"};
        model = new DefaultTableModel(null,columnas);

        String sql = "SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,TO_CHAR(c.CITA_FECHA,'YYYY-MM-DD'),TO_CHAR(c.CITA_FECHA,'HH24:MI:SS') FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad) WHERE PAC_DNI LIKE '"+buscar_dni+"%' order by c.CITA_IDCITA";       
           PreparedStatement pst;
         ResultSet rs ;    
        String datos[] =new String [8];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
              
            while (rs.next()){
                for (int i = 0; i < 8; i++) {
                    datos[i] = rs.getString(i+1);
                }
                model.addRow(datos);
            }
             tabla.setModel(model);
             pst.close();
             rs.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
       
    }
        
       public void listar_especialidades(Connection conn,JComboBox box){
           DefaultComboBoxModel value=new DefaultComboBoxModel();
        PreparedStatement ps = null;
        ResultSet rs = null;
   
        Especialidad dat=null;
        String sql="SELECT * FROM especialidad";

        value.addElement(new Especialidad(0,"Selecciones una especialidad"));
        try{
      
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
          box.setModel(value);
            while(rs.next()){
              value.addElement(new Especialidad(rs.getInt(1),rs.getString(2)));
                
                
         
            }rs.close();
        } catch (SQLException e) {
               System.out.println(e.toString());
        }
       
    }     
           public void listar_medicos(Connection conn,JComboBox box,int id){
      DefaultComboBoxModel value=new DefaultComboBoxModel();
   
        PreparedStatement pst = null;
         ResultSet rs = null;   

          Medico med= null;
    value.addElement(new Medico(0,"Selecciones un medico"));
        try{
             pst=conn.prepareStatement("SELECT MED_IDMEDICO,MED_APELLIDOS FROM medico where ESPE_ESPE_IDESPE=?");
             pst.setInt(1, id);
            rs = pst.executeQuery();
          
            box.setModel(value);
               
            while(rs.next()){
          value.addElement(new Medico(rs.getInt("MED_IDMEDICO"),rs.getString("MED_APELLIDOS")));
           
            }
        } catch (SQLException e) {
               System.out.println(e.toString());
        }
        
    }  
                   public Cita listar_editar_cita(Connection conn,int cita_id,Medico med){
   Cita cit=new Cita();
  
        PreparedStatement pst = null;
         ResultSet rs = null;   

          try{
             pst=conn.prepareStatement("SELECT c.PACIENTE_PAC_DNI,c.CITA_FECHA,m.ESPE_ESPE_IDESPE FROM cita c join medico m on (c.MEDICO_MED_IDMEDICO=m.MED_IDMEDICO) where CITA_IDCITA=?");
             pst.setInt(1, cita_id);
            rs = pst.executeQuery();
          
        while(rs.next()) {
                cit.setDni_paciente(rs.getInt("PACIENTE_PAC_DNI"));
                med.setIdEspecialidad(rs.getInt("ESPE_ESPE_IDESPE"));
                cit.setFecha(rs.getString("CITA_FECHA"));
                
            }         
        } catch (SQLException e) {
               System.out.println(e.toString());
          
        }
        return cit;
    } 
                   public void listar_estado(Connection conn,JTable tabla,char estado){
DefaultTableModel model;
        String [] columnas={"Id","Dni del paciente","Medico","Especialidad","Tipo","Estado","Fecha","Hora"};
        model = new DefaultTableModel(null,columnas);
                       PreparedStatement pst = null;
         ResultSet rs = null;   
        String sql="SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,TO_CHAR(c.CITA_FECHA,'YYYY-MM-DD'),TO_CHAR(c.CITA_FECHA,'HH24:MI:SS') FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad) WHERE c.CITA_ESTADO=? order by c.CITA_IDCITA";
            String [] filas = new String[8];     
        try { 
 
             pst=conn.prepareStatement(sql);
        pst.setString(1, String.valueOf(estado));
            rs=pst.executeQuery(sql);
            while (rs.next()) {                
                for (int i = 0;i<8;i++) {
                    filas[i]=rs.getString(i+1);
                    
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
              pst.close();
             rs.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
                   
                   }
                   
}
