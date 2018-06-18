package dao;
import datos.Maratonista;
import java.util.List;
import org.hibernate.HibernateException;

public class MaratonistaDao extends Dao {
	
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerMaratonistas()throws HibernateException{
		List<Maratonista> maratonistas = null;
		try {
			iniciaOperacion();
			maratonistas = session.createQuery("from Maratonista m order by m.idMaratonista asc").list();
		}finally {
			session.close();
		}
		return maratonistas;
	}
	
	public Maratonista traerMaratonista(int nroChip)throws HibernateException {
		Maratonista objeto = null;
		try {
			iniciaOperacion();
			objeto =(Maratonista) session.createQuery("from Maratonista m where m.nroChip=" + nroChip).uniqueResult();
		}finally {
			session.close();
		}
		return objeto;
	}
	
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerClasificacion()throws HibernateException{
		List<Maratonista> lista;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Maratonista m order by m.tiempo asc").list();
		}finally {
			session.close();
		}
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerClasificacion(char sexo)throws HibernateException{
		List<Maratonista> lista;
		try {
			iniciaOperacion();
			lista = session.createQuery("from Maratonista m where m.sexo like '" + sexo +"'" + "order by m.tiempo asc").list();
		}finally {
			session.close();
		}
		return lista;
	}

}
