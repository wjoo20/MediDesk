/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.entity;

/**
 *
 * @author daniel
 */
public class Especialidad {
    private int id_especialidad;
    private String nombre;

    public Especialidad(int id_especialidad, String nombre) {
        this.id_especialidad = id_especialidad;
        this.nombre = nombre;
    }

    public Especialidad() {
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String toString(){
    
    return this.nombre;
    }
    
    
    
}
