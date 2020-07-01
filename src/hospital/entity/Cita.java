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
public class Cita {
    private int idCita;
    private int dni_paciente;
    private int idMedico;
    private String tipo;
    private String estado;
    private String fecha;
    private int idTriaje;

    public Cita() {
    }

    public Cita(int idCita, int dni_paciente, int idMedico, String tipo, String estado, String fecha, int idTriaje) {
        this.idCita = idCita;
        this.dni_paciente = dni_paciente;
        this.idMedico = idMedico;
        this.tipo = tipo;
        this.estado = estado;
        this.fecha = fecha;
        this.idTriaje = idTriaje;
    }

    public int getIdCita() {
        return idCita;
    }

    public int getDni_paciente() {
        return dni_paciente;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }

    public int getIdTriaje() {
        return idTriaje;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public void setDni_paciente(int dni_paciente) {
        this.dni_paciente = dni_paciente;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setIdTriaje(int idTriaje) {
        this.idTriaje = idTriaje;
    }
    
}
