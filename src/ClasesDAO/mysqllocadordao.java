package ClasesDAO;

import java.util.List;

import Clases.Locador;
import interDAO.locadordao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqllocadordao implements locadordao{
	private final SessionFactory sessionFactory;

    public mysqllocadordao(SessionFactory sessionFactory) {
        this.sessionFactory = (SessionFactory) sessionFactory;
    }
	
	@Override
	public void insertar(Locador a) {
	try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(a);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
	}

	@Override
	public void modificar(Locador a) {
	try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(a);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }	
	}

	@Override
	public void eliminar(Locador a) {
        try {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(a);
            session.getTransaction().commit();
            session.close();
            System.out.println("Exito");
        } catch (HibernateException hibernateException) {
            System.out.println(hibernateException);
            System.out.println("Fallo");
        }
		
	}

	@Override
	public List<Locador> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public Locador obtener(Long id) {
        Locador retorno = null;
            try {
                Session session = sessionFactory.openSession();
                System.out.println("Exito");
                retorno = (Locador) session.get(Locador.class, id);
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
                
            }
            return retorno;
    }
  
    public Locador obtenerpordni(double dni) {
        Locador retorno = null;
        String consulta="From locatorio L where L.dni=:dni";
            try {
                Session session = sessionFactory.openSession();
                System.out.println("Exito");
                retorno = (Locador) session.get(Locador.class, dni);
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
            }
            return retorno;
    }
}
