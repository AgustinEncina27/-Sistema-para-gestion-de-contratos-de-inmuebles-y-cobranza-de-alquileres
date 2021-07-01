package ClasesDAO;

import java.util.List;

import Clases.Locatario;
import Controlador.HibernateSession;
import interDAO.locatariodao;
import javax.persistence.PersistenceException;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class mysqllocatariodao implements locatariodao {
        private Session session;

    public mysqllocatariodao() {  
    }
	
	public void insertar(Locatario g) { 
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

	
	public void modificar(Locatario g) {
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

	
	public void eliminar(Locatario g) {
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


	public List<Locatario> obtenerTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Locatario obtener(Long id) {
	Locatario retorno = null;
            try {     
                session = null;
                session= HibernateSession.getSession();
                retorno = (Locatario) session.get(Locatario.class, id);
            } catch (NullPointerException e){
                JOptionPane.showMessageDialog(null,"EL DNI INGRESADO NO EXISTE");
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
