package negocio;
import java.util.List;

import org.hibernate.HibernateException;

import dao.MarcaDao;
import datos.Maratonista;
import datos.Marca;

/**
 * Esta Clase define métodos de alta, bajas, modificaciones y otros metodos
 * especiales de consulta para acceder a los registros de la tabla marca en la BD
 * @author Mauro Lucas Pereyra
 * @version 15/04/2018
 *
 */


public class MarcaABM {
	MarcaDao dao = new MarcaDao();
	
	/**
	 * Método para obtener la lista de marcas de un Maratonista.
	 * @param maratonista - Valor ingresado como parámetro
	 * @return List<Marca> - Retorna a lista de marcas de un Maratonista.
	 */
	
	public List<Marca> traerMarca(Maratonista maratonista)throws Exception{
		if(maratonista==null)throw new Exception("El maratonista no existe");
		return dao.traerMarca(maratonista);
	}

}
