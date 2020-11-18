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
public class Garante extends Persona{
        private String actividadALaQueSeDedica;
	private RelacionDeDependencia dependencia;
	private List<TrabajoIndependiente> trabajoIndependiente;

    public List<TrabajoIndependiente> getTrabajoIndependiente() {
        return trabajoIndependiente;
    }

    public void setTrabajoIndependiente(List<TrabajoIndependiente> trabajoIndependiente) {
        this.trabajoIndependiente = trabajoIndependiente;
    }

   

    public void setDni(long dni) {
        this.dni = dni;
    }

    

        
    public String getActividadALaQueSeDedica() {
        return actividadALaQueSeDedica;
    }

    public void setActividadALaQueSeDedica(String actividadALaQueSeDedica) {
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
    }

    public RelacionDeDependencia getDependencia() {
        return dependencia;
    }

    public void setDependencia(RelacionDeDependencia dependencia) {
        this.dependencia = dependencia;
    }

    public Garante(String actividadALaQueSeDedica, RelacionDeDependencia dependencia, List<TrabajoIndependiente> trabajoIndependiente, long dni, String nombre, String apellido, String estadoCivil, String domicilio, String telefono, String correoElectronico) {
        super(dni, nombre, apellido, estadoCivil, domicilio, telefono, correoElectronico);
        this.actividadALaQueSeDedica = actividadALaQueSeDedica;
        this.dependencia = dependencia;
        this.trabajoIndependiente = trabajoIndependiente;
    }

   
    public Garante() {
    }
           
}
