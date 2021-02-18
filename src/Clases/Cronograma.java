/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
/**
 *
 * @author Agustin
 */
public class Cronograma {
    private long idCronograma;
    private List<Cuota> cuota;

    public Cronograma(long idCronograma, ArrayList<Cuota> cuota) {
        this.idCronograma = idCronograma;
        this.cuota = cuota;
    }

    public Cronograma() {
       cuota= new ArrayList<Cuota>();
    }

    public long getIdCronograma() {
        return idCronograma;
    }

    public void setIdCronograma(long idCronograma) {
        this.idCronograma = idCronograma;
    }

    public List<Cuota> getCuota() {
        return cuota;
    }

    public void setCuota(List<Cuota> cuota) {
        this.cuota = cuota;
    }
    
    public void cargarlista(int recargo,int montototal,Date fechaini, Date fechafin, Date fechapago,boolean pagado ){
        cuota.add(new Cuota(recargo, montototal, fechaini, fechafin, fechapago, pagado));
    }
}
