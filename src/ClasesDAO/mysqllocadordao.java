package ClasesDAO;

import java.util.List;

import Clases.Locador;
import Controlador.HibernateSession;
import interDAO.locadordao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.jdbc.spi.SqlExceptionHelper;

public class mysqllocadordao implements locadordao{
    private Session session;
    
    public mysqllocadordao() {  
    }
	
	@Override
	public void insertar(Locador a) {
	try {
            session = null;
            session= HibernateSession.getSession();
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
            session = null;
            session= HibernateSession.getSession();
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
            session = null;
            session= HibernateSession.getSession();
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
                session = null;
                session= HibernateSession.getSession();
                System.out.println("Exito");
                retorno = (Locador) session.get(Locador.class, id);
                session.close();
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
                
            }
            return retorno;
    }
  
    public Locador obtenerpordni(double dni) {
        Locador retorno = null;
        String consulta="SELECT * From locatorio L where L.dni=:dni";
            try {
                session = null;
                session= HibernateSession.getSession();
                System.out.println("Exito");
                retorno = (Locador) session.get(Locador.class, consulta);
                
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
            }
            return retorno;
    }
}
