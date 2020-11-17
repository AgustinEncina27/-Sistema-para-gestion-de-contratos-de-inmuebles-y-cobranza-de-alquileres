/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Errores;

/**
 *
 * @author Agustin
 */
public class NotificacionError extends Exception {
    public NotificacionError(String mensaje){
        super(mensaje);
    }
}
