/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import VistaPrincipal.VistaPrincipal;



public class Main {
     public static void main(String[] args) throws Exception {                
       Controlador controlador=new Controlador();
       VistaPrincipal v= new VistaPrincipal(controlador);
       v.setVisible(true);
    }
}
