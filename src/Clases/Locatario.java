/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.util.ArrayList;
import java.util.List;

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
        private List<TrabajoIndependiente> trabajoIndependiente;

    public long getDni() {
        return dni;
    }

        
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
     
    public List<TrabajoIndependiente> getTrabajoIndependiente() {
        return trabajoIndependiente;
    }

    public void setTrabajoIndependiente(List<TrabajoIndependiente> trabajoIndependiente) {
        this.trabajoIndependiente = trabajoIndependiente;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Locatario(String actividadALaQueSeDedica, boolean estudiante, String usuario, String contrasenia, RelacionDeDependencia dependencia, List<TrabajoIndependiente> trabajoIndependiente, long dni, String nombre, String apellido, String estadoCivil, String domicilio, String telefono, String correoElectronico) {
        super(dni, nombre, apellido, estadoCivil, domicilio, telefono, correoElectronico);
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
        this.estudiante = estudiante;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.dependencia = dependencia;
        this.trabajoIndependiente = trabajoIndependiente;
    }

    @Override
    public String toString() {
        return "Locatario{" + "actividadALaQueSeDedica=" + actividadALaQueSeDedica + ", estudiante=" + estudiante + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", dependencia=" + dependencia + ", trabajoIndependiente=" + trabajoIndependiente + '}';
    }

    public Locatario() {
    }
         
}
