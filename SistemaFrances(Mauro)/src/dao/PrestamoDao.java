package dao;
import datos.Cliente;
import java.util.List;
import java.util.ArrayList;
import org.hibernate.*;
import datos.*;
public class PrestamoDao {
	
	private static Session session;
	private Transaction tx;
	
	private void iniciaOperacion()throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	private void manejaExcepcion(HibernateException he)throws HibernateException{
		tx.rollback();
		throw new HibernateException("Error en la capa de acceso a datos",he);
	}
	
	public int agregar(Prestamo objeto) {
		int id = 0;
		try {
			iniciaOperacion();
			id = Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		} catch(HibernateException he) {
			manejaExcepcion(he);
			throw he;
		} finally {
			session.clear();
		}
		return id;
	}
	
	public void actualizar(Prestamo objeto) throws HibernateException{
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		}
		catch(HibernateException he){
			manejaExcepcion(he);
			throw he;
		}
		finally {
			session.close();
		}
		
	}
	
	public Prestamo traerPrestamo(long idPrestamo)throws HibernateException{
		Prestamo obj = null;
		try {
			iniciaOperacion();
			String hql = "from Prestamo p inner join fetch p.cliente c where p.idPrestamo=" + idPrestamo;
			obj = (Prestamo) session.createQuery(hql).uniqueResult();
		} finally {
			session.close();
		}
		return obj;
	}
	
	public boolean eliminar(Prestamo objeto) throws HibernateException {
		boolean seElimino = false;
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
			seElimino = true;
		} catch (HibernateException he) {
			manejaExcepcion(he);
		} finally {
			session.close();
		}
		
		return seElimino;
	}
	 @SuppressWarnings("unchecked")
	public List<Prestamo> traerPrestamo(Cliente cliente)throws HibernateException{
		List<Prestamo> lista = null;
		try {
			iniciaOperacion();
			String hql = "from Prestamo p inner join fetch p.cliente c where c.idCliente=" + cliente.getIdCliente();
			lista = session.createQuery(hql).list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	public Prestamo traerPrestamoYCuotas(long idPrestamo)throws HibernateException{
		Prestamo objeto=null;
		try {
			iniciaOperacion();
			objeto =(Prestamo) session.createQuery("from Prestamo p where p.idPrestamo=" +idPrestamo).uniqueResult();
			Hibernate.initialize(objeto.getCuotas());
		}finally {
			session.close();
			
		}
		return objeto;
	}

}
