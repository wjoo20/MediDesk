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
public class Administrador extends Usuario{
    private int idAdministrador;
    private int dni;
    private String nombres;
    private String apellidos;
    private char genero;
    private int edad;

    public Administrador() {
    }

    public Administrador(int idAdministrador, int dni, String nombres, String apellidos, char genero, int edad, int idUsuario, String correo, String clave, char tipo) {
        super(idUsuario, correo, clave, tipo);
        this.idAdministrador = idAdministrador;
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.genero = genero;
        this.edad = edad;
    }

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public int getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    
}
