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
public abstract class Persona {
        long dni;
        private String nombre;
	private String apellido;
	private String estadoCivil;
	private String domicilio;
	private String telefono;
	private String correoElectronico;

    

     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

   
    public Persona(long dni, String nombre, String apellido, String estadoCivil, String domicilio, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estadoCivil = estadoCivil;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public Persona() {
    }

    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", estadoCivil=" + estadoCivil + ", domicilio=" + domicilio + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + '}';
    }
        
        
}
