/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controlador.Controlador;
import VistaPrincipal.VistaPrincipal;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class Main {
     public static void main(String[] args) throws Exception {
        SessionFactory sessionFactory = null;
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate/hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
				.build();
	try {
            sessionFactory = new Configuration().configure("Hibernate/hibernate.cfg.xml").buildSessionFactory(registry);
                    System.out.println("configuracion exitosa");
	            
	}
	catch (Exception e) {
	    System.out.println("Error al crear factory: " + e.getMessage());

	    
	    StandardServiceRegistryBuilder.destroy( registry );
	}
                
       Controlador controlador=new Controlador(sessionFactory);
       VistaPrincipal v= new VistaPrincipal(controlador);
       v.setVisible(true);
    }
}
