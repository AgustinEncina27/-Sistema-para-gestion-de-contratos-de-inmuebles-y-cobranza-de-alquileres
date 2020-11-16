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
        Cliente cli= new Cliente();
        cli.setNombre("Carlitos");
        per.GuardarOActualizarInstancia(cli);
        Controlador control= new Controlador();
        VistaPrincipal v1= new VistaPrincipal();
        v1.setVisible(true);
    }
}
