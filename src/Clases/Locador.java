/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Agustin
 */
public class Locador extends Persona {

    public Locador(long dni, String nombre, String apellido, String estadoCivil, String domicilio, String telefono, String correoElectronico) {
        super(dni, nombre, apellido, estadoCivil, domicilio, telefono, correoElectronico);
    }

    
    public void setDni(long dni) {
        this.dni = dni;
    }

 
    public Locador() {
    }
    
    
}
