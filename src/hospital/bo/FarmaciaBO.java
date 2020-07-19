/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.bo;

import hospital.dao.FarmaciaDAO;
import hospital.db.Conexion;
import hospital.entity.Farmaceutico;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JTable;
/**
 *
 * @author PROPIETARIO
 */
public class FarmaciaBO {
    private String mensaje = "";
    private FarmaciaDAO farma = new FarmaciaDAO();

    public void Mostrar_Pacientes(JTable tablepacientes) {
        Connection conn  = Conexion.getConnection();
        farma.Mostrar_Pacientes(conn, tablepacientes);
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void Buscar_Pacientes(JTable tablepacientes,String buscar) {
        Connection conn  = Conexion.getConnection();
        farma.Buscar_Pacientes(conn, tablepacientes,buscar);
        try {
            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void ConfirmarEntrega(JTable tablepacientes, Farmaceutico farm) {
        Connection conn  = Conexion.getConnection();
        farma.ConfirmarEntrega(conn, tablepacientes, farm);

        try {

            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void Mostrar_Medicamento(JTable tablemedicamentos) {
        Connection conn  = Conexion.getConnection();
        farma.Mostrar_Medicamentos(conn, tablemedicamentos);

        try {

            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void Buscar_Medicamento(JTable tablemedicamentos, String buscar) {
        Connection conn  = Conexion.getConnection();
        farma.Buscar_Medicamentos(conn, tablemedicamentos,buscar);

        try {

            conn.close();
        } 
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
