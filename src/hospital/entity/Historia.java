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
public class Historia {
    
    private int idHistoria;
    private String fechaApertura;

    public Historia() {
    }

    public Historia(int idHistoria, String fechaApertura) {
        this.idHistoria = idHistoria;
        this.fechaApertura = fechaApertura;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
    
    
}
