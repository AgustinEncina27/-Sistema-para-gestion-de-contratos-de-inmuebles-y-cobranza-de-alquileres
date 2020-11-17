/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Clases.Locador;
import ClasesDAO.mysqllocadordao;
import interDAO.locadordao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.eclipse.persistence.sessions.factories.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class Controlador {
   FileInputStream entrada;
   FileOutputStream salida;
   File archivo;
   private final locadordao locadordao;

    public Controlador(org.hibernate.SessionFactory sessionFactory) {
        this.locadordao = new mysqllocadordao(sessionFactory);
    }

    public byte[]AbrirAImagen(File archivo ){
    byte[] bytesImg= new byte[10241000];
    try {
            entrada = new FileInputStream(archivo);
            entrada.read(bytesImg);
        } catch (Exception e) {
    }
    return bytesImg;
    }
    public void InsertarLocador(Locador a) {
		locadordao.insertar(a);
	}
    public Locador BuscarPorDni(double a){
        Locador lectura = locadordao.obtenerpordni(a);
        return lectura;
    }
    
    public void ActualizarLocador(Locador a) {
                locadordao.modificar(a);
	}
    public void EliminarLocador(Locador a) {
                locadordao.eliminar(a);
	}
    public Locador ObtenerLocador(Long a){
        Locador lectura = locadordao.obtener(a);
        return lectura;
    }
}
