/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Clases.Locador;
import Errores.NotificacionError;
import javax.persistence.PersistenceException;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Persistencia {
private final String configuracion = "Hibernate/hibernate.cfg.xml";
    private SessionFactory factory;  // PERMITE CREAR CONECCIONES A LA BSE DE DATOS CADA VEZ QUE NECESITEMOS
    private Session sesion;
    private Configuration config;
public Persistencia()throws NotificacionError {

        try{
           this.CrearConexion();
        }catch(HibernateException e){

           throw new NotificacionError (e.getMessage());

        }


    }
private void CrearConexion() throws NotificacionError {
        try{
          config = new Configuration();
          config.configure(this.configuracion);
          System.out.println("configuracion exitosa");
          this.factory = config.buildSessionFactory();
        }catch(HibernateException e) {
            System.out.println(e.getMessage());
            throw new NotificacionError (e.getMessage());
        }
    }
protected void desconectar() throws NotificacionError {
		/*
		 * Primero se cierra la sesiÃ³n.
		 */
		this.cerrarSesion();

		/*
		 * Se cierra la conexiÃ³n a la base de datos desde el sessionFactory.
		 */
		if (this.factory != null) {
			if (this.factory.isOpen()) {
				this.factory.close();
			}
		}
	}
        
protected void cerrarSesion() throws NotificacionError {
		try {
			if (this.sesion != null) {
				if (this.sesion.isConnected()) {
					this.sesion.disconnect();
				}

				if (this.sesion.isOpen()) {
					this.sesion.close();
				}
			}
		} catch (HibernateException e) {
			throw new NotificacionError(e.getMessage());
		}

    }

public void GuardarOActualizarInstancia(Object instancia) throws NotificacionError{
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
            throw new NotificacionError(e.getMessage());
        }
    }

public void comprobarSesion() throws NotificacionError{
       this.ComprobarSesion();
   }

 protected void ComprobarSesion() throws NotificacionError{
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
            throw new NotificacionError(mensaje);
     }
}
 
public Locador buscarLocadorDNI(double dni) throws NotificacionError {
		String textoConsulta = "From Locador E where E.dni = :dni";

		/*
		 * Se comprueba la conexiÃ³n.
		 */
		this.comprobarSesion();

		Locador locador = null;

		Transaction tx = this.sesion.beginTransaction();

		try {
			Query<Locador> consulta = this.sesion.createQuery(textoConsulta, Locador.class);
			consulta.setParameter("dni", dni);
			tx.commit();

		} catch (PersistenceException e) {
			tx.rollback();
			throw new NotificacionError(e.getMessage());
		}

		return locador;
	}

}