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
public class Casa extends Vivienda {

    public Casa(int banio, int habitaciones, int cocina, int living, int garage, String expensas, double costoExpensas, String localidad, String direccion, String tamanio, ArrayList<Locador> locador) {
        super(banio, habitaciones, cocina, living, garage, expensas, costoExpensas, localidad, direccion, tamanio, locador);
    }

    public Casa() {
    }

    @Override
    public String toString() {
        return "Casa";
    }
    
    
    
}
