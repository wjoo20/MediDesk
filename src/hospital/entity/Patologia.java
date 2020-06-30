/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.entity;

/**
 *
 * @author Jordan
 */
public class Patologia {
    
    private int idPatologia;
    private String descripcion;

    public Patologia() {
    }

    public Patologia(int idPatologia, String descripcion) {
        this.idPatologia = idPatologia;
        this.descripcion = descripcion;
    }

    public int getIdPatologia() {
        return idPatologia;
    }

    public void setIdPatologia(int idPatologia) {
        this.idPatologia = idPatologia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
