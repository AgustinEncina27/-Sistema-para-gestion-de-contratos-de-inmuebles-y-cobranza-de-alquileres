/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Clases.Locador;
import Errores.NotificacionError;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Controlador {
    private Persistencia persistencia;
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
public byte[]AbrirAImagen(File archivo ){
        byte[] bytesImg= new byte[10241000];
    try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
    }
    return bytesImg;
    }
public Controlador(Persistencia per) {
        this.persistencia = per;
    }

public void desconectarBaseDatos() throws NotificacionError {
        this.persistencia.desconectar();
    }

public Locador BuscarLocadorDNI(double dni) throws NotificacionError {
    Locador lo;
    lo=this.persistencia.buscarLocadorDNI(dni);
    System.err.println(lo);
    return lo;
}

public void crear(Object lol) throws NotificacionError {
		this.persistencia.GuardarOActualizarInstancia(lol);
}

}
