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
public class Medico extends Usuario {
    
    private int idMedico;
    private int dni;
    private String nombres;
    private String apellidos;
    private char genero;
    private int edad;
    private int cmp;
    private int idEspecialidad;

    public Medico() {
    }

    public Medico(int idMedico, int dni, String nombres, String apellidos, char genero, int edad, int cmp, int idEspecialidad, int idUsuario, String correo, String clave, char tipo) {
        super(idUsuario, correo, clave, tipo);
        this.idMedico = idMedico;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
        this.cmp = cmp;
        this.idEspecialidad = idEspecialidad;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
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

    public int getCmp() {
        return cmp;
    }

    public void setCmp(int cmp) {
        this.cmp = cmp;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
        
}
