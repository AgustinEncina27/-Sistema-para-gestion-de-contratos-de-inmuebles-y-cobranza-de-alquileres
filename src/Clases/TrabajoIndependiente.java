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
public class TrabajoIndependiente {
    private long idTrabajoIndependiente;
    private byte[] comprobante;

    public long getIdTrabajoIndependiente() {
        return idTrabajoIndependiente;
    }

    public void setIdTrabajoIndependiente(long idTrabajoIndependiente) {
        this.idTrabajoIndependiente = idTrabajoIndependiente;
    }

    public byte[] getComprobante() {
        return comprobante;
    }

    public void setComprobante(byte[] comprobante) {
        this.comprobante = comprobante;
    }

    public TrabajoIndependiente(byte[] comprobante) {
        this.comprobante = comprobante;
    }

    public TrabajoIndependiente() {
    }
}
