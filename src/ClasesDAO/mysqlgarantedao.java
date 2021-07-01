package ClasesDAO;

import java.util.List;

import Clases.Garante;
import Controlador.HibernateSession;
import interDAO.garantedao;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqlgarantedao implements garantedao {
    private Session session;
    
    public mysqlgarantedao() {
    }
    
	@Override
	public void insertar(Garante g) {
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
        }catch (PersistenceException e) {
                JOptionPane.showMessageDialog(null,"EL DNI INGRESADO YA EXISTE");
        }	
	}

	@Override
	public void modificar(Garante g) {
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
	public void eliminar(Garante g) {
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
	public List<Garante> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Garante obtener(Long id) {
	Garante retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                System.out.println("Exito");
                retorno = (Garante) session.get(Garante.class, id);
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
            }
            return retorno;
	}
        
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
