/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;

import hospital.entity.Enfermera;
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
 * @author Fiorella
 */
public class EnfermeraDAO {
    
    private String mensaje;
    
    //Listar cita
    public void listarCita (Connection conn, JTable tabla, String especialidad, String date) {
       
        DefaultTableModel model;
        String [] columnas = {"ID","NOMBRES","APELLIDOS","DNI","MEDICO","TIPO","ESTADO"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT C.CITA_IDCITA, P.PAC_NOMBRES, P.PAC_APELLIDOS, P.PAC_DNI, M.MED_APELLIDOS, C.CITA_TIPO, C.CITA_ESTADO FROM CITA C JOIN PACIENTE P ON(C.PACIENTE_PAC_DNI=P.PAC_DNI) JOIN MEDICO M ON (C.MEDICO_MED_IDMEDICO=M.MED_IDMEDICO) WHERE M.ESPE_ESPE_IDESPE IN (SELECT E.ESPE_IDESPECIALIDAD FROM ESPECIALIDAD E JOIN MEDICO M ON (E.ESPE_IDESPECIALIDAD=M.ESPE_ESPE_IDESPE) WHERE E.ESPE_NOMBRE = ?) AND TO_DATE(CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY') AND C.CITA_ESTADO = 'P'";
        //filas
        String [] filas = new String[7];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, especialidad);
            pst.setString(2, date);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                    System.out.println(rs.getString(i+1));
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los valores en la tabla" );
        }
    }
    
    //Listar triaje
    public void listarTriaje(Connection conn, JTable tabla, String especialidad, String date) {
        DefaultTableModel model;
        String [] columnas = {"DNI","NOMBRES","APELLIDOS","TALLA","PESO","TEMPERATURA","PRESIÓN ARTERIAL"};
        model = new DefaultTableModel(null,columnas);
        //Sentencia SQL
        String sql = "SELECT P.PAC_DNI, P.PAC_NOMBRES, P.PAC_APELLIDOS, P.PAC_TALLA, P.PAC_PESO, P.PAC_TEMPERATURA, P.PAC_PRESION \n" +
                    "FROM PACIENTE P JOIN CITA C ON (P.PAC_DNI = C.PACIENTE_PAC_DNI) \n" +
                    "WHERE C.MEDICO_MED_IDMEDICO IN \n" +
                    "    (SELECT M.MED_IDMEDICO \n" +
                    "    FROM MEDICO M JOIN ESPECIALIDAD E ON (M.ESPE_ESPE_IDESPE = E.ESPE_IDESPECIALIDAD)\n" +
                    "    WHERE E.ESPE_NOMBRE = ?)\n" +
                    "AND TO_DATE(CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY') \n" +
                    "AND P.PAC_TRIAJE = 'S'";
        //filas
        String [] filas = new String[7];
        //conexion
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, especialidad);
            pst.setString(2, date);
            rs = pst.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < 7; i++) {
                    filas[i] = rs.getString(i+1);
                    System.out.println(rs.getString(i+1));
                }
                model.addRow(filas);
            }
            tabla.setModel(model);
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pueden mostrar los valores en la tabla" + e.getMessage());
        }
    }
    
    //Listar paciente (txt)
    public Paciente listarPaciente(Connection conn, String value) {
        Paciente p = new Paciente();
        //Sentencia SQL
        String sql = "SELECT PAC_DNI, PAC_NOMBRES, PAC_APELLIDOS, PAC_CORREO, PAC_TELEFONO, PAC_DIRECCION, PAC_GENERO, PAC_EDAD, PAC_TRIAJE FROM PACIENTE WHERE PAC_DNI = ?";
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, value);
            rs = pst.executeQuery();
            while(rs.next()) {
                p.setDni(rs.getInt("PAC_DNI"));
                p.setNombres(rs.getString("PAC_NOMBRES"));
                p.setApellidos(rs.getString("PAC_APELLIDOS"));
                p.setCorreo(rs.getString("PAC_CORREO"));
                p.setTelefono(rs.getInt("PAC_TELEFONO"));
                p.setDireccion(rs.getString("PAC_DIRECCION"));
                p.setGenero(rs.getString("PAC_GENERO").charAt(0));
                p.setEdad(rs.getInt("PAC_EDAD"));
                p.setTriaje(rs.getString("PAC_TRIAJE"));              
            }           
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pueden obtener los valores" + e.getMessage());
        }
        return p;
        
    }
    
    //Agregar triaje(Paciente)
    public String agregarTriajePaciente(Connection con, Paciente pac, String dni) {
        PreparedStatement pst = null;
        String sql = "UPDATE PACIENTE SET PAC_TALLA = ?, PAC_PESO = ?, PAC_TEMPERATURA = ?, PAC_PRESION = ?, PAC_TRIAJE = 'S' WHERE PAC_DNI = ? ";
                
        try {
            pst = con.prepareStatement(sql);
            pst.setDouble(1, pac.getTalla());
            pst.setDouble(2, pac.getPeso());
            pst.setDouble(3, pac.getTemperatura());
            pst.setDouble(4, pac.getPresion());
            pst.setInt(5, Integer.valueOf(dni));
            mensaje = "";
            pst.execute();
            pst.close();
        } 
        catch (SQLException e) {
            mensaje = "No se pudo realizar el triaje \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    //Eliminar triaje(Paciente)
    public String eliminarTriajePaciente(Connection con, String dni) {
        PreparedStatement pst = null;
        String sql = "UPDATE PACIENTE SET PAC_TALLA = NULL, PAC_PESO = NULL, PAC_TEMPERATURA = NULL, PAC_PRESION = NULL, PAC_TRIAJE = 'N' WHERE PAC_DNI = ? ";
                
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, Integer.valueOf(dni));
            mensaje = "";
            pst.execute();
            pst.close();
        } 
        catch (SQLException e) {
            mensaje = "No se pudo eliminar(update) en tabla paciente \n" + e.getMessage();
        }
        
        return mensaje;
    }
    
    //Obtener el idEnfermera
    public int getIdEnf(Connection con,Enfermera enf,Integer dni){        
        int id = 0;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT ENF_IDENFERMERA FROM ENFERMERA WHERE ENF_DNI = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1,dni);
            rs = pst.executeQuery();
            if(rs.next()){
                id = rs.getInt("ENF_IDENFERMERA");
            }
            rs.close();
            pst.close();
        } catch (SQLException e) {
            System.out.println("Error en getIdEnf DAO: " + e.getMessage());
        }
        System.out.println(id);
        return id;
    }
    
    //Obtener el idCita
    public int getIdCita(Connection con, String dni, String especialidad, String date) {
        int id = 0; 
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT C.CITA_IDCITA FROM CITA C JOIN MEDICO M ON (C.MEDICO_MED_IDMEDICO = M.MED_IDMEDICO) WHERE M.ESPE_ESPE_IDESPE = (SELECT ESPE_IDESPECIALIDAD FROM ESPECIALIDAD WHERE ESPE_NOMBRE = ?)\n" +
        "AND PACIENTE_PAC_DNI = ? AND TO_DATE(CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, especialidad);
            pst.setString(2, dni);
            pst.setString(3, date);
            rs = pst.executeQuery();
            if(rs.next()) {
                id = rs.getInt("CITA_IDCITA");
            }
            rs.close();
            pst.close();
        } 
        catch (SQLException e) {
            System.out.println("Error en getIdCita DAO: " + e.getMessage());
        }
        return id;        
    }
    
    //Obtener el idTriaje2.0
    public int getIdTriaje2(Connection con, String dni, String especialidad, String date) {
        int id = 0; 
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "SELECT C.TRIAJE_TRI_IDTRIAJE FROM CITA C JOIN MEDICO M ON (C.MEDICO_MED_IDMEDICO = M.MED_IDMEDICO) WHERE M.ESPE_ESPE_IDESPE = (SELECT ESPE_IDESPECIALIDAD FROM ESPECIALIDAD WHERE ESPE_NOMBRE = ?)\n" +
        "AND PACIENTE_PAC_DNI = ? AND TO_DATE(CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, especialidad);
            pst.setString(2, dni);
            pst.setString(3, date);
            rs = pst.executeQuery();
            if(rs.next()) {
                id = rs.getInt("TRIAJE_TRI_IDTRIAJE");
            }
            rs.close();
            pst.close();
        } 
        catch (SQLException e) {
            System.out.println("Error en getIdTriaje2.0 DAO: " + e.getMessage());
        }
        return id;        
    }
    
    //Obtener el idTriaje
    public int getidTriaje(Connection con) {
        int id = 0;
        Statement st = null;
        ResultSet rs = null;
        String sql = "SELECT MAX(TRI_IDTRIAJE) FROM TRIAJE";
        try {
            st = con.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()) {
                id = rs.getInt("MAX(TRI_IDTRIAJE)");
            }
            rs.close();
            st.close();
        } 
        catch (SQLException e) {
            System.out.println("Error en getIdTriaje " + e.getMessage());
        }
        return id;
    }
    
    //Update tabla cita 
    public String updateTablaCita(Connection con, Integer idTriaje, Integer idCita) {
        PreparedStatement pst = null;
        String sql = "UPDATE CITA SET TRIAJE_TRI_IDTRIAJE = ? WHERE CITA_IDCITA = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idTriaje);
            pst.setInt(2, idCita);
            mensaje = "Tabla cita actualizada correctamente.";
            pst.execute();
            pst.close();
        } 
        catch (SQLException e) {
            mensaje = "No se pudo introducir el idTriaje en la tabla Cita." + e.getMessage();
        }
        return mensaje;
    }
    
    //EliminaridCita en tabla cita 
    public String eliminarTablaCita(Connection con, Integer dni, String date, String especialidad) {
        PreparedStatement pst = null;
        String sql = "UPDATE CITA SET TRIAJE_TRI_IDTRIAJE = NULL WHERE (PACIENTE_PAC_DNI = ?) AND (TO_DATE(CITA_FECHA, 'DD/MM/YY') = TO_DATE(?, 'DD/MM/YY')) AND (MEDICO_MED_IDMEDICO IN(SELECT MED_IDMEDICO FROM MEDICO WHERE ESPE_ESPE_IDESPE = (SELECT ESPE_IDESPECIALIDAD FROM ESPECIALIDAD WHERE ESPE_NOMBRE  = ?)))";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, dni);
            pst.setString(2, date);
            pst.setString(3, especialidad);
            mensaje = " ";
            pst.execute();
            pst.close();
        } 
        catch (SQLException e) {
            mensaje = "No se pudo nullear el idTriaje en la tabla Cita." + e.getMessage();
        }
        return mensaje;
    }
    
    //Eliminar registro en tabla triaje(por fin!!!)
    public String eliminarTablaTriaje (Connection con, Integer idTriaje) {
        PreparedStatement pst = null;
        String sql = "DELETE FROM TRIAJE WHERE TRI_IDTRIAJE = ?";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, idTriaje);
            mensaje = "";
            pst.execute();
            pst.close();
        } catch (SQLException e) {
            mensaje = "No se pudo eliminar registro en la tabla triaje"+e.getMessage();
        }
        return mensaje;
    }
    
    //Insertar tabla Triaje 
    public String agregarTablaTriaje(Connection con,Enfermera enf,Integer id) {
        PreparedStatement pst = null;
        String sql = "INSERT INTO TRIAJE (ENFERMERA_ENF_IDENFERMERA) VALUES (?)";
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            mensaje = "Valores insertados en triaje con éxito.";
            pst.execute();
            pst.close();
        } 
        catch (SQLException e) {
            mensaje = "No se pudo insertar en la tabla TRIAJE " + e.getMessage();
        }
        return mensaje;
    }
    
    
    
    
}
