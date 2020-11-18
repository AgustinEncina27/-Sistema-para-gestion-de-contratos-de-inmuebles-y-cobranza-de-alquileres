package ClasesDAO;

import java.util.List;

import Clases.Inmueble;
import interDAO.inmuebledao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqlinmuebledao implements inmuebledao{
    private final SessionFactory sessionFactory;
    
    public mysqlinmuebledao(SessionFactory sessionFactory) {
        this.sessionFactory = (SessionFactory) sessionFactory;
    }

	@Override
	public void insertar(Inmueble g) {
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

	@Override
	public void modificar(Inmueble g) {
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

	@Override
	public void eliminar(Inmueble g) {
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

	@Override
	public List<Inmueble> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inmueble obtener(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
