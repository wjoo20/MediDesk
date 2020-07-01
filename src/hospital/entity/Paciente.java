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
public class Paciente{
    private int dni;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private String direccion;
    private char genero;
    private int edad;
    private double talla;
    private double peso;
    private double temperatura;
    private double presion;
    private int idTriaje;
    private int idHistoria;
    private int idAdministrador;

    public Paciente() {
    }

    public Paciente(int dni, String nombres, String apellidos, String correo, String telefono, String direccion, char genero, int edad, double talla, double peso, double temperatura, double presion, int idTriaje, int idHistoria, int idAdministrador) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.genero = genero;
        this.edad = edad;
        this.talla = talla;
        this.peso = peso;
        this.temperatura = temperatura;
        this.presion = presion;
        this.idTriaje = idTriaje;
        this.idHistoria = idHistoria;
        this.idAdministrador = idAdministrador;
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

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public char getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public double getTalla() {
        return talla;
    }

    public double getPeso() {
        return peso;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getPresion() {
        return presion;
    }

    public int getIdTriaje() {
        return idTriaje;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public int getIdAdministrador() {
        return idAdministrador;
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

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public void setIdTriaje(int idTriaje) {
        this.idTriaje = idTriaje;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
    }
    
    
    
    
}
