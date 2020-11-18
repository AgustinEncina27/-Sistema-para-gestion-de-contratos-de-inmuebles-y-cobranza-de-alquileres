package ClasesDAO;

import java.util.List;

import Clases.Locatario;
import interDAO.locatariodao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqllocatariodao implements locatariodao {
        private final SessionFactory sessionFactory;

    public mysqllocatariodao(SessionFactory sessionFactory) {
        this.sessionFactory = (SessionFactory) sessionFactory;
    }
	
	public void insertar(Locatario g) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
		
	}

	
	public void modificar(Locatario g) {
	try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
		
	}

	
	public void eliminar(Locatario g) {
	try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(g);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
		
	}


	public List<Locatario> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Locatario obtener(Long id) {
	Locatario retorno = null;
            try {
                Session session = sessionFactory.openSession();
                System.out.println("Exito");
                retorno = (Locatario) session.get(Locatario.class, id);
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
                
            }
            return retorno;
	}

}
