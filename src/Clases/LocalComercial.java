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
public class LocalComercial extends Inmueble {
    private String expensas;
    private double costoExpensas;

    public LocalComercial(String expensas, double costoExpensas, String localidad, String direccion, String tamanio, ArrayList<Locador> locador) {
        super(localidad, direccion, tamanio, locador);
        this.expensas = expensas;
        this.costoExpensas = costoExpensas;
    }

    public LocalComercial() {
    }

    public String getExpensas() {
        return expensas;
    }

    public void setExpensas(String expensas) {
        this.expensas = expensas;
    }

    public double getCostoExpensas() {
        return costoExpensas;
    }

    public void setCostoExpensas(double costoExpensas) {
        this.costoExpensas = costoExpensas;
    }

    @Override
    public String toString() {
        return "Local Comercial";
    }
    
    
}
