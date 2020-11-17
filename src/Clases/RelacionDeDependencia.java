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
public class RelacionDeDependencia {
    private long id;
    private byte[] reciboDeSueldo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public byte[] getReciboDeSueldo() {
        return reciboDeSueldo;
    }

    public void setReciboDeSueldo(byte[] reciboDeSueldo) {
        this.reciboDeSueldo = reciboDeSueldo;
    }

    public RelacionDeDependencia(byte[] reciboDeSueldo) {
        this.reciboDeSueldo = reciboDeSueldo;
    }

    public RelacionDeDependencia() {
    }
    
}
