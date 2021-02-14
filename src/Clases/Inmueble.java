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
public abstract class Inmueble {
    private long idInmueble;
    private String localidad;
    private String direccion;
    private String tamanio;
    private List <Locador> locador;

    
    public long getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(long idInmueble) {
        this.idInmueble = idInmueble;
    }
    
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public List<Locador> getLocador() {
        return locador;
    }

    public void setLocador(List<Locador> locador) {
        this.locador = locador;
    }

    public Inmueble(String localidad, String direccion, String tamanio, List<Locador> locador) {
        this.localidad = localidad;
        this.direccion = direccion;
        this.tamanio = tamanio;
        this.locador = locador;
    }
    public Inmueble(String localidad, String direccion, String tamanio) {
        this.localidad = localidad;
        this.direccion = direccion;
        this.tamanio = tamanio;
    }
    public Inmueble() {
    }
    
    public void agregar (Locador e){
        locador= new ArrayList<Locador>();
        this.locador.add(e);
    }

    
    
    
}
