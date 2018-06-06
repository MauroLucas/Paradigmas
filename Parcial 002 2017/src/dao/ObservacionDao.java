package dao;
import org.hibernate.Hibernate;

import datos.Observacion;
public class ObservacionDao extends Dao {
	
	private static ObservacionDao instance = null;
	
	protected ObservacionDao() {}
	
	public static ObservacionDao getInstance() {
		if(instance==null) {
			instance = new ObservacionDao();
		}
		return instance;
	}
	
	public Observacion traerObservacion(int idObservacion) {
		Observacion objeto = null;
		try {
			iniciaOperacion();
			objeto = (Observacion)session.createQuery("from Observacion o where o.idObservacion="+idObservacion).uniqueResult();
			Hibernate.initialize(objeto.getObservador());
			Hibernate.initialize(objeto.getObjetoCeleste());
		}finally {
			session.close();
		}
		return objeto;
	}
   
}
