/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.List;

/**
 *
 * @author Agustin
 */
public class Factura {
    private long idFactura;
    private Locatario loca;
    private int valorBaseDelRecargoProporcional;
    private int recargoFijo;
    private List <Cuota> cuotas;

    public Factura(long idFactura, Locatario loca, int valorBaseDelRecargoProporcional, int recargoFijo, List<Cuota> cuotas) {
        this.idFactura = idFactura;
        this.loca = loca;
        this.valorBaseDelRecargoProporcional = valorBaseDelRecargoProporcional;
        this.recargoFijo = recargoFijo;
        this.cuotas = cuotas;
    }

    public Factura() {
    }

    public long getIdFactura() {
        return idFactura;
    }

    public Locatario getLoca() {
        return loca;
    }

    public int getValorBaseDelRecargoProporcional() {
        return valorBaseDelRecargoProporcional;
    }

    public int getRecargoFijo() {
        return recargoFijo;
    }

    public List<Cuota> getCuotas() {
        return cuotas;
    }

    public void setIdFactura(long idFactura) {
        this.idFactura = idFactura;
    }

    public void setLoca(Locatario loca) {
        this.loca = loca;
    }

    public void setValorBaseDelRecargoProporcional(int valorBaseDelRecargoProporcional) {
        this.valorBaseDelRecargoProporcional = valorBaseDelRecargoProporcional;
    }

    public void setRecargoFijo(int recargoFijo) {
        this.recargoFijo = recargoFijo;
    }

    public void setCuotas(List<Cuota> cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", loca=" + loca + ", valorBaseDelRecargoProporcional=" + valorBaseDelRecargoProporcional + ", recargoFijo=" + recargoFijo + ", cuotas=" + cuotas + '}';
    }

    

    
    
    
}
