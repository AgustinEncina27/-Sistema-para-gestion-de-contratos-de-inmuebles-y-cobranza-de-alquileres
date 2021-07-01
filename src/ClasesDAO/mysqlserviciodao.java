package ClasesDAO;

import Clases.Inmueble;
import Clases.Locatario;
import java.util.List;

import Clases.Servicio;
import Controlador.HibernateSession;
import interDAO.serviciodao;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class mysqlserviciodao implements serviciodao{
        private Session session;
        
        public mysqlserviciodao() {
        }
	
	public void insertar(Servicio g) {
		try {
                session = null;
                session= HibernateSession.getSession();
                session.beginTransaction();
                session.save(g);
                session.getTransaction().commit();
                session.close();
                System.out.println("Exito");
                JOptionPane.showMessageDialog(null,"SE AGREDO CON EXITO");
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
            }
		
	}

	@Override
	public void modificar(Servicio g) {
		try {
                    session = null;
                    session= HibernateSession.getSession();
                    session.beginTransaction();
                    session.update(g);
                    session.getTransaction().commit();
                    session.close();
                    System.out.println("Exito");
                    JOptionPane.showMessageDialog(null,"SE MODIFICO CON EXITO");
                } catch (HibernateException hibernateException) {
                    System.out.println(hibernateException);
                    System.out.println("Fallo");
                }
		
	}

	@Override
	public void eliminar(Servicio g) {
		try {
                    session = null;
                    session= HibernateSession.getSession();
                    session.beginTransaction();
                    session.delete(g);
                    session.getTransaction().commit();
                    session.close();
                    System.out.println("Exito");
                    JOptionPane.showMessageDialog(null,"SE ELIMINO CON EXITO");
                } catch (HibernateException hibernateException) {
                    System.out.println(hibernateException);
                    System.out.println("Fallo");
                }
	}

	@Override
	public List<Servicio> obtenerTodos() {
                Session session = null;
                Transaction tr= null;
		List <Servicio> servicio = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    servicio= session.createCriteria(Servicio.class).list();
                } catch (Exception e) {
                    e.printStackTrace();
                }
		return servicio;
	}

	@Override
	public Servicio obtener(Long id) {
		Servicio retorno = null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    System.out.println("Exito");
                    retorno = (Servicio) session.get(Servicio.class, id);
                } catch (HibernateException hibernateException) {
                    System.out.println(hibernateException);
                    System.out.println("Fallo");
                }
            return retorno;
	}

    @Override
    public void desconectar() {
        try {
			if (this.session != null) {
				if (this.session.isConnected()) {
					this.session.disconnect();
				}

				if (this.session.isOpen()) {
					this.session.close();
				}
			}
		} catch (HibernateException e) {
			System.out.println(e);
                         System.out.println("Fallo");
		}
    }

}
