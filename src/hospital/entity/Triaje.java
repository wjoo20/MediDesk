/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.entity;

/**
 *
 * @author Fiorella
 */
public class Triaje extends Usuario {
    private int idTriaje;
    private int idEnfermera;

    public Triaje() {
    }
        
    public Triaje(int idTriaje, int idEnfermera) {
        this.idTriaje = idTriaje;
        this.idEnfermera = idEnfermera;
    }

    public int getIdTriaje() {
        return idTriaje;
    }

    public void setIdTriaje(int idTriaje) {
        this.idTriaje = idTriaje;
    }

    public int getIdEnfermera() {
        return idEnfermera;
    }

    public void setIdEnfermera(int idEnfermera) {
        this.idEnfermera = idEnfermera;
    }      
}