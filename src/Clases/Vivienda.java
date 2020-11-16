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
public class Vivienda extends Inmueble {
    private int banio;
    private int habitaciones;
    private int cocina;
    private int living;
    private int garage;
    private String expensas;
    private double costoExpensas;

    public Vivienda(int banio, int habitaciones, int cocina, int living, int garage, String expensas, double costoExpensas, String localidad, String direccion, String tamanio, ArrayList<Locador> locador) {
        super(localidad, direccion, tamanio, locador);
        this.banio = banio;
        this.habitaciones = habitaciones;
        this.cocina = cocina;
        this.living = living;
        this.garage = garage;
        this.expensas = expensas;
        this.costoExpensas = costoExpensas;
    }

    public int getBanio() {
        return banio;
    }

    public void setBanio(int banio) {
        this.banio = banio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCocina() {
        return cocina;
    }

    public void setCocina(int cocina) {
        this.cocina = cocina;
    }

    public int getLiving() {
        return living;
    }

    public void setLiving(int living) {
        this.living = living;
    }

    public int getGarage() {
        return garage;
    }

    public void setGarage(int garage) {
        this.garage = garage;
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

    public Vivienda() {
    }
    
    
    
}
