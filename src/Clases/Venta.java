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
public class Venta extends Contrato{

    public Venta(long idContrato, Date fechaDeInicioDelContrato, Date fechaDeFinalDelContrato, int valorBaseDelRecargoProporcional, int recargoFijo, Locador locador, List<Locatario> locatario, Inmueble inmueble, List<Servicio> servicio, Cronograma cronograma) {
        super(idContrato, fechaDeInicioDelContrato, fechaDeFinalDelContrato, valorBaseDelRecargoProporcional, recargoFijo, locador, locatario, inmueble, servicio, cronograma);
    }

    

    public Venta() {
    }
    
}
