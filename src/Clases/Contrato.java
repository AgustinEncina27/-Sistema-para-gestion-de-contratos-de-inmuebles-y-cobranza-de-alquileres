/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Agustin
 */
public abstract class Contrato {
    private long idContrato;
    private Date fechaDeInicioDelContrato;
    private Date fechaDeFinalDelContrato;
    private int valorBaseDelRecargoProporcional;
    private int recargoFijo;
    private Locador locador;
    private List <Locatario> locatario;
    private Inmueble inmueble;
    private List <Servicio> servicio;
    private Cronograma cronograma;

    public Contrato(long idContrato, Date fechaDeInicioDelContrato, Date fechaDeFinalDelContrato, int valorBaseDelRecargoProporcional, int recargoFijo, Locador locador, List<Locatario> locatario, Inmueble inmueble, List<Servicio> servicio, Cronograma cronograma) {
        this.idContrato = idContrato;
        this.fechaDeInicioDelContrato = fechaDeInicioDelContrato;
        this.fechaDeFinalDelContrato = fechaDeFinalDelContrato;
        this.valorBaseDelRecargoProporcional = valorBaseDelRecargoProporcional;
        this.recargoFijo = recargoFijo;
        this.locador = locador;
        this.locatario = locatario;
        this.inmueble = inmueble;
        this.servicio = servicio;
        this.cronograma = cronograma;
    }

    public long getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(long idContrato) {
        this.idContrato = idContrato;
    }

    public Date getFechaDeInicioDelContrato() {
        return fechaDeInicioDelContrato;
    }

    public void setFechaDeInicioDelContrato(Date fechaDeInicioDelContrato) {
        this.fechaDeInicioDelContrato = fechaDeInicioDelContrato;
    }

    public Date getFechaDeFinalDelContrato() {
        return fechaDeFinalDelContrato;
    }

    public void setFechaDeFinalDelContrato(Date fechaDeFinalDelContrato) {
        this.fechaDeFinalDelContrato = fechaDeFinalDelContrato;
    }

    public int getValorBaseDelRecargoProporcional() {
        return valorBaseDelRecargoProporcional;
    }

    public void setValorBaseDelRecargoProporcional(int valorBaseDelRecargoProporcional) {
        this.valorBaseDelRecargoProporcional = valorBaseDelRecargoProporcional;
    }

    public int getRecargoFijo() {
        return recargoFijo;
    }

    public void setRecargoFijo(int recargoFijo) {
        this.recargoFijo = recargoFijo;
    }

    public Locador getLocador() {
        return locador;
    }

    public void setLocador(Locador locador) {
        this.locador = locador;
    }

    public List<Locatario> getLocatario() {
        return locatario;
    }

    public void setLocatario(List<Locatario> locatario) {
        this.locatario = locatario;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public List<Servicio> getServicio() {
        return servicio;
    }

    public void setServicio(List<Servicio> servicio) {
        this.servicio = servicio;
    }

    public Cronograma getCronograma() {
        return cronograma;
    }

    public void setCronograma(Cronograma cronograma) {
        this.cronograma = cronograma;
    }

    public Contrato() {
    }
        
        
}
