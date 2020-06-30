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
public class Enfermera extends Usuario {
    
    private int idEnfermera;
    private String dni;
    private String nombres;
    private String apellidos;
    private char genero;
    private int edad;

    public Enfermera() {
        
    }
      
    public Enfermera(int idEnfermera, String dni, String nombres, String apellidos, char genero, int edad) {
        this.idEnfermera = idEnfermera;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }

    public int getIdEnfermera() {
        return idEnfermera;
    }

    public void setIdEnfermera(int idEnfermera) {
        this.idEnfermera = idEnfermera;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
