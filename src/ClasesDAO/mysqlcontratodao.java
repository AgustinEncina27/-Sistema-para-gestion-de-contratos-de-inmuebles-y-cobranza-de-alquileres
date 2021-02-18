package ClasesDAO;

import java.util.List;

import Clases.Contrato;
import Clases.Servicio;
import interDAO.contratodao;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqlcontratodao implements contratodao{
        private final SessionFactory sessionFactory;
        private Session session;
        
        public mysqlcontratodao(SessionFactory sessionFactory) {
        this.sessionFactory = (SessionFactory) sessionFactory;
        }
        
	@Override
	public void insertar(Contrato g) {
		try {
                session = sessionFactory.openSession();
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
	public void modificar(Contrato g) {
		try {
                    session = sessionFactory.openSession();
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
	public void eliminar(Contrato g) {
		try {
                    Session session = sessionFactory.openSession();
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
	public List<Contrato> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contrato obtener(Long id) {
		Contrato retorno = null;
                try {
                    session = sessionFactory.openSession();
                    System.out.println("Exito");
                    retorno = (Contrato) session.get(Contrato.class, id);
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
