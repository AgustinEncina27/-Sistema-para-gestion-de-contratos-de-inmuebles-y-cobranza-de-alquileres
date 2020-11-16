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
public class Cronograma {
    private long idCronograma;
    private ArrayList<Cuota> cuota;

    public Cronograma(long idCronograma, ArrayList<Cuota> cuota) {
        this.idCronograma = idCronograma;
        this.cuota = cuota;
    }

    public long getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(long idCronograma) {
        this.idCronograma = idCronograma;
    }

    public ArrayList<Cuota> getCuota() {
        return cuota;
    }

    public void setCuota(ArrayList<Cuota> cuota) {
        this.cuota = cuota;
    }
    
    
}
