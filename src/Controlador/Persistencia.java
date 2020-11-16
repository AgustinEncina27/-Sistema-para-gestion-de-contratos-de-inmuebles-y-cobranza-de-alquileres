/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Errores.NotificarError;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Persistencia {
private final String configuracion = "Hibernate/hibernate.cfg.xml";
    private SessionFactory factory;  // PERMITE CREAR CONECCIONES A LA BSE DE DATOS CADA VEZ QUE NECESITEMOS
    private Session sesion;
    private Configuration config;
public Persistencia()throws NotificarError {

        try{
           this.CrearConexion();
        }catch(HibernateException e){

           throw new NotificarError (e.getMessage());

        }


    }
private void CrearConexion() throws NotificarError {

        try{



 
          config = new Configuration();
          config.configure(this.configuracion);
          System.out.println("configuracion exitosa");
          this.factory = config.buildSessionFactory();
        }catch(HibernateException e) {
            System.out.println(e.getMessage());
            throw new NotificarError (e.getMessage());

        }

    }

public void GuardarOActualizarInstancia(Object instancia) throws NotificarError{

        //se comprueba la sesion
        this.ComprobarSesion();

        Transaction tx= this.sesion.beginTransaction();

        try{
            this.sesion.saveOrUpdate(instancia);
            tx.commit();          // finaliza la transaccion guardando

        }catch(HibernateException e){

            // si hay algun error rollback elimina las instancias creadas hasta el momento
            System.out.println(e.getMessage());
            tx.rollback();
            throw new NotificarError(e.getMessage());

        }

    }

public void comprobarSecion() throws NotificarError{
       this.ComprobarSesion();
   }

    protected void ComprobarSesion() throws NotificarError{
        String mensaje = null;
        try{
            if (this.factory.isClosed()){
                //se intenta abrir la conexion;
                this.CrearConexion();
            }
            if (this.sesion == null || !this.sesion.isConnected()){
                this.sesion = this.factory.openSession();
            }
        }catch (HibernateException e){
            mensaje = "Se ha interrumpido la conexión con la base de datos";
            throw new NotificarError(mensaje);
        }

    
}
}

