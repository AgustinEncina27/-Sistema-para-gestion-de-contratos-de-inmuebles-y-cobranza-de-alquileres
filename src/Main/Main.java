/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import Controlador.Persistencia;
import Clases.Cliente;
import VistaPrincipal.VistaPrincipal;

public class Main {
    public static void main(String[] args) throws Exception {
        Persistencia per= new Persistencia();
        Controlador control= new Controlador();
        VistaPrincipal v1= new VistaPrincipal(control);
        v1.setVisible(true);
    }
}
