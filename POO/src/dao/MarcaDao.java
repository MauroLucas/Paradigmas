package dao;
import java.util.List;

import org.hibernate.HibernateException;

import datos.Maratonista;
import datos.Marca;
public class MarcaDao extends Dao {
	
	@SuppressWarnings("unchecked")
	public List<Marca> traerMarca(Maratonista maratonista)throws HibernateException{
		List<Marca> lista;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Marca m inner join fetch m.maratonista where m.maratonista.idMaratonista=" + maratonista.getidMaratonista()).list();
		}finally {
			session.close();
		}
		return lista;
	}

}
