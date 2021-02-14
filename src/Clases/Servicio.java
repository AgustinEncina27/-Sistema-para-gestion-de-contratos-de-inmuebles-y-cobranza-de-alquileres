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
public class Servicio {
    private long idServicio;
    private String nombre;
    private double costo;

    public Servicio(String nombre, double costo) {  
        this.nombre = nombre;
        this.costo = costo;
    }
    
    public Servicio(long id,String nombre, double costo) {  
        this.idServicio=id;
        this.nombre = nombre;
        this.costo = costo;
    }
    

    public long getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(long idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Servicio() {
    }

    @Override
    public String toString() {
        return "idServicio=" + idServicio + ", nombre=" + nombre + ", costo=" + costo;
    }

    
}
