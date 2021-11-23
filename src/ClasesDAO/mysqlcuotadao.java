package ClasesDAO;

import java.util.List;

import Clases.Cuota;
import Clases.Inmueble;
import Clases.Locatario;
import Controlador.HibernateSession;
import interDAO.cuotadao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.persistence.criteria.CriteriaBuilder;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class mysqlcuotadao implements cuotadao{
    private Session session;
    
    public mysqlcuotadao() {   
    }
	@Override
	public void insertar(Cuota g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Cuota g) {
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
	public void eliminar(Cuota g) {
		// TODO Auto-generated method stub
		
	}


	public List<Cuota> obtenerTodos(long a) {
		List <Cuota> cuotas = null;
                try {
                session = null;
                session= HibernateSession.getSession();
                String consulta="SELECT cu From Contrato c INNER JOIN c.locatario l INNER JOIN c.cronograma cro INNER JOIN cro.cuota cu WHERE l.dni="+a;
                    Query  q = session.createQuery(consulta);
                    cuotas= q.list();
                } catch (Exception e) {
                }
		return cuotas;
	}

	@Override
	public Cuota obtener(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public List<Cuota> obtenerTodos() {
        return null;
        
    }

}
