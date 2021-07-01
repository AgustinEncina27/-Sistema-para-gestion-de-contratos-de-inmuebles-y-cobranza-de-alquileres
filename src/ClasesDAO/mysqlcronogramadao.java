package ClasesDAO;

import java.util.List;

import Clases.Cronograma;
import Controlador.HibernateSession;
import interDAO.cronogramadao;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqlcronogramadao implements cronogramadao {
    private Session session;
    
    public mysqlcronogramadao() {
    }
    
	@Override
	public void insertar(Cronograma g) {
		try {
            session = null;
            session= HibernateSession.getSession();
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
	public void modificar(Cronograma g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Cronograma g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cronograma> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cronograma obtener(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
