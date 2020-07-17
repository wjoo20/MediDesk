/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;
import hospital.entity.Administrador;
import hospital.entity.Paciente;
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
public class Admision_pacienteDAO {
    private String mensaje = "";   
    private static Administrador adm;
    public String agregarPaciente(Connection con,Paciente pac){
        PreparedStatement pst =null;
        String sql ="INSERT INTO PACIENTE (PAC_DNI,PAC_NOMBRES,PAC_APELLIDOS,PAC_CORREO,PAC_TELEFONO,PAC_DIRECCION,PAC_GENERO,PAC_EDAD,PAC_TRIAJE,ADM_ADM_IDADM)"+
                "VALUES(?,?,?,?,?,?,?,?,?,?)";
        try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, pac.getDni());
        pst.setString(2, pac.getNombres());
        pst.setString(3, pac.getApellidos());
        pst.setString(4, pac.getCorreo());
        pst.setInt(5, pac.getTelefono());
        pst.setString(6, pac.getDireccion());
        pst.setString(7, String.valueOf(pac.getGenero()));
        pst.setInt(8,pac.getEdad());
        pst.setString(9, pac.getTriaje());
        pst.setInt(10, pac.getIdAdministrador());
        mensaje="PACIENTE GUARDADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO GUARDAR PACIENTE CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }
 
       /*public String dd(){
       
       
    Admision_paciente adp=new Admision_paciente(adm);
      int selection =  adp.tbPaciente.getSelectedRow();
       String sec=adp.tbPaciente.getValueAt(selection, 0).toString();
               return sec;
       } */
    public String modificarPaciente(Connection con,Paciente pac,String pac_dni){
        PreparedStatement pst =null;
        String sql ="UPDATE paciente set PAC_DNI=?,PAC_NOMBRES=?,PAC_APELLIDOS=?,PAC_CORREO=?,PAC_TELEFONO=?,PAC_DIRECCION=?,PAC_GENERO=?,PAC_EDAD=?,ADM_ADM_IDADM=?"+
                "where PAC_DNI=?";
   
        try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, pac.getDni());
        pst.setString(2, pac.getNombres());
        pst.setString(3, pac.getApellidos());
        pst.setString(4, pac.getCorreo());
        pst.setInt(5, pac.getTelefono());
        pst.setString(6, pac.getDireccion());
        pst.setString(7, String.valueOf(pac.getGenero()));
        pst.setInt(8,pac.getEdad());
        pst.setInt(9, pac.getIdAdministrador());
        pst.setInt(10, Integer.parseInt(pac_dni));
        mensaje="PACIENTE ACTUALIZADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO ACTUALIZAR PACIENTE CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }    
    public String eliminarPaciente(Connection con,String pac_dni){
    
    PreparedStatement pst =null;
    String sql="DELETE FROM PACIENTE WHERE PAC_DNI=?";
            try{
        pst=con.prepareStatement(sql);
        pst.setInt(1, Integer.parseInt(pac_dni));
  
        
        mensaje="ELIMINADO CORRECTAMENTE";
            pst.execute();
            pst.close();
        }catch(SQLException e){
        mensaje = "NO SE PUDO ELIMINAR CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }
        
   
    public void listarPaciente(Connection conn,JTable tabla){
        DefaultTableModel model;
        String [] columnas={"Dni","Nombres","Apellidos","Correo","Telefono","Direccion","Genero","Edad"};
        model = new DefaultTableModel(null,columnas);
        String sql="SELECT PAC_DNI,PAC_NOMBRES,PAC_APELLIDOS,PAC_CORREO,PAC_TELEFONO,PAC_DIRECCION,PAC_GENERO,PAC_EDAD FROM PACIENTE";
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
    
    public Paciente listar_editar_paciente(Connection conn, String pac_dni) {
        Paciente pac = new Paciente();
   
        String sql = "SELECT PAC_DNI, PAC_NOMBRES, PAC_APELLIDOS, PAC_CORREO, PAC_TELEFONO, PAC_DIRECCION, PAC_GENERO, PAC_EDAD, PAC_TRIAJE FROM PACIENTE WHERE PAC_DNI = ?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, pac_dni);
            rs = pst.executeQuery();
            while(rs.next()) {
                pac.setDni(rs.getInt("PAC_DNI"));
                pac.setNombres(rs.getString("PAC_NOMBRES"));
                pac.setApellidos(rs.getString("PAC_APELLIDOS"));
                pac.setCorreo(rs.getString("PAC_CORREO"));
                pac.setTelefono(rs.getInt("PAC_TELEFONO"));
                pac.setDireccion(rs.getString("PAC_DIRECCION"));
                pac.setGenero(rs.getString("PAC_GENERO").charAt(0));
                pac.setEdad(rs.getInt("PAC_EDAD"));
                pac.setTriaje(rs.getString("PAC_TRIAJE"));              
            }           
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo listar al paciente." + e.getMessage());
        }
        return pac;
        
    }
    public void buscarPaciente(Connection conn,JTable tabla,String buscar_dni){
        DefaultTableModel model;
        String [] columnas={"Dni","Nombres","Apellidos","Correo","Telefono","Direccion","Genero","Edad"};
        model = new DefaultTableModel(null,columnas);

        String sql = "SELECT PAC_DNI,PAC_NOMBRES,PAC_APELLIDOS,PAC_CORREO,PAC_TELEFONO,PAC_DIRECCION,PAC_GENERO,PAC_EDAD FROM PACIENTE WHERE PAC_DNI LIKE '"+buscar_dni+"%'";       
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
    
    }
    

