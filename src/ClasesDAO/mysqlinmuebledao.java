package ClasesDAO;

import java.util.List;

import Clases.Inmueble;
import Controlador.HibernateSession;
import interDAO.inmuebledao;
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class mysqlinmuebledao implements inmuebledao{
    private Session session;
    
    
    public mysqlinmuebledao() {   
    }

	@Override
	public void insertar(Inmueble g) {
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
	public void modificar(Inmueble g) {
	try {
            session = null;
            session= HibernateSession.getSession();
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
            session = null;
            session= HibernateSession.getSession();
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
                List <Inmueble> inmuebles = null;
                try {
                    session = null;
            session= HibernateSession.getSession();
                    Query  q = session.createQuery(" FROM INMUEBLE ");
                    inmuebles= q.list();
                } catch (Exception e) {
                }
                System.out.println(inmuebles);
		return inmuebles;	
	}

 
	public List<Inmueble> obtener(String a) {
                Session session = null;
                Transaction tr= null;
                List<Inmueble> inmuebles= null;
                try {
                    session = null;
                    session= HibernateSession.getSession();
                    tr=session.beginTransaction();
                    tr.setTimeout(2);
                    inmuebles= session.createCriteria(Inmueble.class).add(Restrictions.like("localidad", a+"%")).list();
                } catch (Exception e) {
                    e.printStackTrace();
                }
		return inmuebles;
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

    @Override
    public Inmueble obtener(Long id) {
        Inmueble retorno = null;
            try {
                session = null;
                session= HibernateSession.getSession();
                System.out.println("Exito");
                retorno = (Inmueble) session.get(Inmueble.class, id);
            } catch (HibernateException hibernateException) {
                System.out.println(hibernateException);
                System.out.println("Fallo");
            }
            return retorno;
    }

}
