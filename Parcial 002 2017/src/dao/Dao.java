package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
public class Dao {
	protected static Session session;
	private Transaction tx;
	
	protected void iniciaOperacion() throws HibernateException{
		session = HibernateUtil.getSessionFactory().openSession();
		tx = session.beginTransaction();
	}
	
	protected void manejaException(HibernateException he) throws HibernateException{
		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos",he);
	}
	
	public<E> long agregar(E objeto) throws HibernateException{
		long id=0;
		try {
			iniciaOperacion();
			id=Integer.parseInt(session.save(objeto).toString());
			tx.commit();
		}catch(HibernateException he) {
			manejaException(he);
			throw he;
		}finally {
			session.close();
		}
		return id;
	}
	
	public <E> void actualizar(E objeto)throws HibernateException{
		try {
			iniciaOperacion();
			session.update(objeto);
			tx.commit();
		}catch(HibernateException he) {
			manejaException(he);
			throw he;
		}finally {
			session.close();
		}
		
	}
	
	public <E> void eliminar(E objeto)throws HibernateException{
		try {
			iniciaOperacion();
			session.delete(objeto);
			tx.commit();
		}catch(HibernateException he) {
			manejaException(he);
			throw he;
		}finally {
			session.close();
		}
		
	}

}
