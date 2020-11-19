/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Clases.*;
import ClasesDAO.*;
import interDAO.*;
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
   private final inmuebledao inmuebledao;
   private final locatariodao locatariodao;
   private final garantedao garantedao;

    public Controlador(org.hibernate.SessionFactory sessionFactory) {
        this.locadordao = new mysqllocadordao(sessionFactory);
        this.inmuebledao = new mysqlinmuebledao(sessionFactory);
        this.garantedao= new mysqlgarantedao(sessionFactory);
        this.locatariodao= new mysqllocatariodao(sessionFactory);
    }

    public byte[]AbrirAImagen(File archivo ){
    byte[] bytesImg= new byte[1024*1000];
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
    
    

    public void Insertarinmueble(Inmueble g) {
		inmuebledao.insertar(g);
    }
    public void Actualizarinmueble(Inmueble g) {
                inmuebledao.modificar(g);
	}
    public void Eliminarinmueble(Inmueble g) {
                inmuebledao.eliminar(g);
	}
    public Inmueble Obtenerinmueble(Long a){
        Inmueble lectura = inmuebledao.obtener(a);
        return lectura;
    }
    
    
    public void InsertarLocatoria(Locatario g) {
		locatariodao.insertar(g);
    }
    public void ActualizarLocatoria(Locatario g) {
                locatariodao.modificar(g);
	}
    public void EliminarLocatoria(Locatario g) {
                locatariodao.eliminar(g);
	}
    public Locatario ObtenerLocatario(Long a){
        Locatario lectura = locatariodao.obtener(a);
        return lectura;
    }
    public void desconectarBaseDatosLocatario(){
		this.locatariodao.desconectar();
	}
    
    
    public void InsertarGarante(Garante g) {
		garantedao.insertar(g);
    }
    public void ActualizarGarante(Garante g) {
                garantedao.modificar(g);
    }
    public void EliminarGarante(Garante g) {
                garantedao.eliminar(g);
	}
    public Garante ObtenerGarante(Long a){
        Garante lectura = garantedao.obtener(a);
        return lectura;
    }
    public void desconectarBaseDatosGarante(){
		this.garantedao.desconectar();
	}  
}
