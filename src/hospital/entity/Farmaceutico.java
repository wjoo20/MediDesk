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
public class Farmaceutico extends Usuario {
    private int idfarmaceutico;
    private int dni;
    private String nombres;
    private String apellidos;
    private char genero;
    private int edad;

    public Farmaceutico(){
        
    }

    public Farmaceutico(int idfarmaceutico, int dni, String nombres, String apellidos, char genero, int edad, int idUsuario, String correo, String clave, char tipo) {
        super(idUsuario, correo, clave, tipo);
        this.idfarmaceutico = idfarmaceutico;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }

    public int getIdFarmaceutico() {
        return idfarmaceutico;
    }

    public void setIdFarmaceutico(int idfarmaceutico) {
        this.idfarmaceutico = idfarmaceutico;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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