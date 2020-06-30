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
public class Receta {
    
    private int idReceta;
    private int idCita;
    private String indicaciones;

    public Receta() {
    }

    public Receta(int idReceta, int idCita, String indicaciones) {
        this.idReceta = idReceta;
        this.idCita = idCita;
        this.indicaciones = indicaciones;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }
    
    
}
