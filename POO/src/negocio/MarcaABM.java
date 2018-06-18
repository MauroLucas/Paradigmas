package negocio;
import java.util.List;

import org.hibernate.HibernateException;

import dao.MarcaDao;
import datos.Maratonista;
import datos.Marca;
public class MarcaABM {
	MarcaDao dao = new MarcaDao();
	public List<Marca> traerMarca(Maratonista maratonista)throws Exception{
		if(maratonista==null)throw new Exception("El maratonista no existe");
		return dao.traerMarca(maratonista);
	}

}
