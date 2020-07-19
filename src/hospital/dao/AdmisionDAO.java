
package hospital.dao;
import hospital.entity.Administrador;
import hospital.entity.Cita;
import hospital.entity.Especialidad;
import hospital.entity.Medico;
import hospital.entity.Paciente;
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

public class AdmisionDAO {
    
    private String mensaje = "";   
    
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
            JOptionPane.showMessageDialog(null, "No se puede listar la tabla \n "+e.getMessage());
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
        
    public String agregarCita(Connection con, Cita cit,int dato){
        
        PreparedStatement pst =null;
        String sql ="INSERT INTO CITA (CITA_TIPO,CITA_ESTADO,CITA_FECHA,MEDICO_MED_IDMEDICO,PACIENTE_PAC_DNI)"+
                "VALUES(?,?,TO_DATE(?, 'YYYY-MM-DD HH24:MI:SS'),?,?)";
        
        try{
            pst=con.prepareStatement(sql);
            pst.setString(1, cit.getTipo());
            pst.setString(2, cit.getEstado());
            pst.setString(3, cit.getFecha());
            pst.setInt(4, dato);
            pst.setInt(5, cit.getDni_paciente());
            mensaje="CITA GUARDADA CORRECTAMENTE";
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
            mensaje="CITA ACTUALIZADA CORRECTAMENTE";
                pst.execute();
                pst.close();
        }catch(SQLException e){
            mensaje = "NO SE PUDO ACTUALIZAR CITA CORRECTAMENTE \n " + e.getMessage();
        } return mensaje;
    }    
    public String cancelarCita(Connection con,Cita cit,int cita_id){
    
        PreparedStatement pst =null;
        String sql="UPDATE cita set CITA_ESTADO='C'"+"where CITA_IDCITA=?";
            
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
        String sql="SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,TO_CHAR(c.CITA_FECHA,'YYYY-MM-DD'),TO_CHAR(c.CITA_FECHA,'HH24:MI:SS') FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad) where c.CITA_ESTADO='P' order by c.CITA_IDCITA";
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
        
    public void buscarCita(Connection conn,JTable tabla,String buscar_dni,char estado){
        
        DefaultTableModel model;
        String [] columnas={"Id","Dni del paciente","Medico","Especialidad","Tipo","Estado","Fecha","Hora"};
        model = new DefaultTableModel(null,columnas);
        String sql = "SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,TO_CHAR(c.CITA_FECHA,'YYYY-MM-DD'),TO_CHAR(c.CITA_FECHA,'HH24:MI:SS') FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad) WHERE PAC_DNI LIKE '"+buscar_dni+"%' and CITA_ESTADO=? order by c.CITA_IDCITA";       
        PreparedStatement pst;
        ResultSet rs ;    
        String datos[] =new String [8];
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1,String.valueOf(estado ));
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
        String sql="SELECT * FROM especialidad";
        value.addElement(new Especialidad(0,"Seleccione una especialidad"));
        
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
        value.addElement(new Medico(0,"Seleccione un médico"));
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
                  
    public void listar_estado(Connection conn,JTable tabla,char estado,String buscar_dni){

        DefaultTableModel model;
        String [] columnas={"Id","Dni del paciente","Medico","Especialidad","Tipo","Estado","Fecha","Hora"};
        model = new DefaultTableModel(null,columnas);
        String sql="SELECT c.CITA_IDCITA,p.PAC_DNI,m.MED_APELLIDOS,e.ESPE_NOMBRE,c.CITA_TIPO,c.CITA_ESTADO,TO_CHAR(c.CITA_FECHA,'YYYY-MM-DD'),TO_CHAR(c.CITA_FECHA,'HH24:MI:SS') FROM CITA c join paciente p on (c.paciente_pac_dni=p.pac_dni) join medico m on (c.medico_med_idmedico=m.med_idmedico) join especialidad e on (m.espe_espe_idespe=e.espe_idespecialidad) WHERE c.CITA_ESTADO=? and p.PAC_DNI LIKE '"+buscar_dni+"%' order by c.CITA_IDCITA";
        String [] filas = new String[8];                       
        PreparedStatement pst = null;
        ResultSet rs = null;   
      
        try { 
            pst=conn.prepareStatement(sql);
            pst.setString(1, String.valueOf(estado));
            rs=pst.executeQuery();
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
    

