package negocio;

import java.util.List;

import org.hibernate.HibernateException;

import dao.MaratonistaDao;
import dao.MarcaDao;
import datos.Maratonista;
import datos.Marca;
/**
 * Esta Clase define metodos de alta, bajas, modificaciones y otros metodos
 * especiales de consulta para acceder a los registros de la tabla maratonista en la BD
 * @author Mauro Lucas Pereyra
 * @version 15/04/2018
 *
 */

public class MaratonistaABM {
	
	MaratonistaDao dao = new MaratonistaDao();
	MarcaDao daoMarca = new MarcaDao();
	/**
	 * Método para obtener lista de maratonistas
	 * @return List<Maratonista> Retorna lista de maratonistas
	 */
	public List<Maratonista> traerMaratonistas(){
		
		return dao.traerMaratonistas();
	}
	/**
	 * Método para traer un Maratonista por Numero de Chip.
	 * @param nroChip - Valor ingresado como parametro
	 * @return maratonista - Retorna un Maratonisa
	 * @throws Exception
	 */
	public Maratonista traerMaratonista(int nroChip)throws Exception {
		Maratonista maratonista = dao.traerMaratonista(nroChip);
		if(maratonista==null)throw new Exception("Maratonista Inexistente");
		return maratonista;
	}
	/**
	 * Método Para actualizar un registro de maratonista
	 * @param maratonista
	 */
	public void actualizar(Maratonista maratonista){
		
		dao.actualizar(maratonista);
	}
	/**
	 * Método para actualizar el tiempo que tardo de inicio a fin de todos
	 * los maratonista y persistirlo en la BD
	 */
	
	public void actualizarMaratonistas() {
		List<Maratonista> maratonistas = dao.traerMaratonistas();
		for(Maratonista m : maratonistas) {
			List<Marca> marcas = daoMarca.traerMarca(m);
			m.setTiempo(marcas.get(0).getHora(), marcas.get(1).getHora());
			actualizar(m);
			
		}
		
	}
	/**
	 * Método para obtener una lista de Maratonista Clasificados.
	 * @return List<Marca> - Retorna una lista de Maratonista Clasificados.
	 */
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerClasificacion(){
		return dao.traerClasificacion();
	}
	/**
	 * Método para obtener una lista de Maratonista Clasificados por sexo
	 * @param sexo - Valor ingresado como parámetro
	 * @return List<Marca> - Retorna una lista de Maratonista Clasificados por sexo.
	 */
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerClasificacion(char sexo)throws HibernateException{
		return dao.traerClasificacion(sexo);
	}

}
