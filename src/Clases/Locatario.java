/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.ArrayList;

/**
 *
 * @author Agustin
 */
public class Locatario extends Persona {
        private String actividadALaQueSeDedica;
	private boolean estudiante;
	private String usuario;
	private String contrasenia;
	private RelacionDeDependencia dependencia;
        private ArrayList<TrabajoIndependiente> trabajoIndependiente;

    public String getActividadALaQueSeDedica() {
        return actividadALaQueSeDedica;
    }

    public void setActividadALaQueSeDedica(String actividadALaQueSeDedica) {
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
    }

    public boolean isEstudiante() {
        return estudiante;
    }

    public void setEstudiante(boolean estudiante) {
        this.estudiante = estudiante;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public RelacionDeDependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(RelacionDeDependencia dependencia) {
        this.dependencia = dependencia;
    }
     
    public ArrayList<TrabajoIndependiente> getTrabajoIndependiente() {
        return trabajoIndependiente;
    }

    public void setTrabajoIndependiente(ArrayList<TrabajoIndependiente> trabajoIndependiente) {
        this.trabajoIndependiente = trabajoIndependiente;
    }

    public long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(long idPersona) {
        this.idPersona = idPersona;
    }
    

    public Locatario(String actividadALaQueSeDedica, boolean estudiante, String usuario, String contrasenia, RelacionDeDependencia dependencia, ArrayList<TrabajoIndependiente> trabajoDependiente, long idPersina, String nombre, String apellido, double dni, String estadoCivil, String domicilio, String telefono, String correoElectronico) {
        super(idPersina, nombre, apellido, dni, estadoCivil, domicilio, telefono, correoElectronico);
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
        this.estudiante = estudiante;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.dependencia = dependencia;
        this.trabajoIndependiente = trabajoDependiente;
    }

    public Locatario() {
    }

   

    
             
}
