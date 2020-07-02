/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.entity;

/**
 *
 * @author PROPIETARIO
 */
public class Medicamentos {
    
    private int idmedicamento;
    private String nombre;
    private int cantidad;

public Medicamentos(){
    
}

    public Medicamentos(int idmedicamento, String nombre, int cantidad) {
        this.idmedicamento = idmedicamento;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getIdmedicamento() {
        return idmedicamento;
    }

    public void setIdmedicamento(int idmedicamento) {
        this.idmedicamento = idmedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}

