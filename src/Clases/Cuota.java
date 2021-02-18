/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;

/**
 *
 * @author Agustin
 */
public class Cuota {
    private int numeroCuota;
    private int montoDeRecargo;
    private int montoTotalAPagar;
    private Date primerFechaDePago;
    private Date segundaFechaDePago;
    private Date fechaPago;
    private boolean pagado;

    

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public int getMontoDeRecargo() {
        return montoDeRecargo;
    }

    public void setMontoDeRecargo(int montoDeRecargo) {
        this.montoDeRecargo = montoDeRecargo;
    }

    public int getMontoTotalAPagar() {
        return montoTotalAPagar;
    }

    public void setMontoTotalAPagar(int montoTotalAPagar) {
        this.montoTotalAPagar = montoTotalAPagar;
    }

    public Date getPrimerFechaDePago() {
        return primerFechaDePago;
    }

    public void setPrimerFechaDePago(Date primerFechaDePago) {
        this.primerFechaDePago = primerFechaDePago;
    }

    public Date getSegundaFechaDePago() {
        return segundaFechaDePago;
    }

    public void setSegundaFechaDePago(Date segundaFechaDePago) {
        this.segundaFechaDePago = segundaFechaDePago;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }
    
    public Cuota(int montoDeRecargo, int montoTotalAPagar, Date primerFechaDePago, Date segundaFechaDePago, Date fechaPago, boolean pagado) {
        this.numeroCuota = numeroCuota;
        this.montoDeRecargo = montoDeRecargo;
        this.montoTotalAPagar = montoTotalAPagar;
        this.primerFechaDePago = primerFechaDePago;
        this.segundaFechaDePago = segundaFechaDePago;
        this.fechaPago = fechaPago;
        this.pagado = pagado;
    }

    public Cuota() {
    }

    @Override
    public String toString() {
        return "Cuota{" + "numeroCuota=" + numeroCuota + ", montoDeRecargo=" + montoDeRecargo + ", montoTotalAPagar=" + montoTotalAPagar + ", primerFechaDePago=" + primerFechaDePago + ", segundaFechaDePago=" + segundaFechaDePago + ", fechaPago=" + fechaPago + ", pagado=" + pagado + '}';
    }
    
    
}
