/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.dao;


import hospital.entity.Farmaceutico;
import hospital.views.Farmacia_Pacientes;
import hospital.views.Farmacia_medicamentos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PROPIETARIO
 */

public class FarmaciaDAO {
            PreparedStatement pst = null;
        ResultSet rs = null;

public void Mostrar_Pacientes(Connection conn, JTable tablepacientes){
        DefaultTableModel tabla =new DefaultTableModel();
       tabla.addColumn("DNI");
       tabla.addColumn("Nombres");
       tabla.addColumn("Apellidos");
       tabla.addColumn("Edad");
        tabla.addColumn("Codigo");
        tabla.addColumn("Medicamento");
       tablepacientes.setModel(tabla);

        String sql = "select paciente_pac_dni,PAC_NOMBRES,PAC_APELLIDOS, PAC_EDAD,r.rec_idreceta,me_nombre from cita \n" +
"join receta r on (cita_idcita = r.cita_cita_idcita)\n" +
"join rec_me rm on (rm.receta_rec_idreceta =r.rec_idreceta)\n" +
"join medicamento on (me_idmedicamento =medicamento_me_idmedicamento) \n" +
"join paciente on (pac_dni = paciente_pac_dni)\n" +
"left join transaccion_receta tr on (rm.receta_rec_idreceta = tr.receta_rec_idreceta) where tr.receta_rec_idreceta is null";
        String datos[] =new String [6];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();



            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);     
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                
                tabla.addRow(datos);
            }
             tablepacientes.setModel(tabla);
             pst.close();
             rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

}
public void Buscar_Pacientes(Connection conn,JTable tablepacientes,String buscar){
        DefaultTableModel tabla =new DefaultTableModel();
       tabla.addColumn("DNI");
       tabla.addColumn("Nombres");
       tabla.addColumn("Apellidos");
       tabla.addColumn("Edad");
        tabla.addColumn("Codigo de Receta");
        tabla.addColumn("Medicamento");
       tablepacientes.setModel(tabla);

        String sql = "select paciente_pac_dni,PAC_NOMBRES,PAC_APELLIDOS, PAC_EDAD,r.rec_idreceta,me_nombre from cita \n" +
"join receta r on (cita_idcita = r.cita_cita_idcita)\n" +
"join rec_me rm on (rm.receta_rec_idreceta =r.rec_idreceta)\n" +
"join medicamento on (me_idmedicamento =medicamento_me_idmedicamento) \n" +
"join paciente on (pac_dni = paciente_pac_dni)\n" +
"left join transaccion_receta tr on (rm.receta_rec_idreceta = tr.receta_rec_idreceta) where tr.receta_rec_idreceta is null and paciente_pac_dni LIKE '%"+buscar+"%'";
        String datos[] =new String [6];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();


            
            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);     
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                datos[5] = rs.getString(6);
                
                tabla.addRow(datos);
            }
             tablepacientes.setModel(tabla);
             pst.close();
             rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

}
    public void ConfirmarEntrega(Connection conn,JTable tablepacientes, Farmaceutico farm) {                                
    int row = tablepacientes.getSelectedRow();
        String var = tablepacientes.getModel().getValueAt(row, 5).toString();

        String sql = "update medicamento set me_cantidad=me_cantidad-1 where me_nombre=?";

        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, var);
            rs = pst.executeQuery();
            conn.commit();
             pst.close();
             rs.close();
        }catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
       int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Entrega Confimada","Exit",dialog);
        if(result==0) {
                        Actualizar(conn,tablepacientes, farm);
      

        }
    }

public void Actualizar(Connection conn,JTable tablepacientes, Farmaceutico farm){
             int row = tablepacientes.getSelectedRow();
        String var2= tablepacientes.getModel().getValueAt(row,4).toString();
        String sql2= "INSERT INTO TRANSACCION_RECETA (RECETA_REC_IDRECETA, FARM_FARM_IDFARM) VALUES (?, ?)";
        System.out.println(var2);

        try {
            pst = conn.prepareStatement(sql2);
            pst.setInt(1, Integer.parseInt(var2));
            pst.setInt(2, farm.getIdFarmaceutico());

            rs = pst.executeQuery();
            conn.commit();

             pst.close();
             rs.close();
        }catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    public void Mostrar_Medicamentos(Connection conn, JTable tablemedicamentos) {
        DefaultTableModel tabla =new DefaultTableModel();
       tabla.addColumn("Codigo");
       tabla.addColumn("Nombre");
       tabla.addColumn("Unidades");
       tablemedicamentos.setModel(tabla);
        String sql = "SELECT me_idMedicamento,me_nombre,me_cantidad FROM medicamento";
        String datos[] =new String [3];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();


            
            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);     
                datos[2] = rs.getString(3);
                
                tabla.addRow(datos);
            }
             tablemedicamentos.setModel(tabla);
             pst.close();
             rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

}
public void Buscar_Medicamentos(Connection conn, JTable tablemedicamentos, String buscar){
        DefaultTableModel tabla =new DefaultTableModel();
       tabla.addColumn("Codigo");
       tabla.addColumn("Nombre");
       tabla.addColumn("Unidades");
       tablemedicamentos.setModel(tabla);
        String sql = "SELECT me_idMedicamento,me_nombre,me_cantidad FROM MEDICAMENTO where me_nombre LIKE '%"+buscar+"%'";
        String datos[] =new String [3];
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()){
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);     
                datos[2] = rs.getString(3);
                
                tabla.addRow(datos);
            }
             tablemedicamentos.setModel(tabla);
               pst.close();
             rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(Farmacia_medicamentos.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}

