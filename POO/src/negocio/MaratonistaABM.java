package negocio;

import java.util.List;

import org.hibernate.HibernateException;

import dao.MaratonistaDao;
import dao.MarcaDao;
import datos.Maratonista;
import datos.Marca;


public class MaratonistaABM {
	
	MaratonistaDao dao = new MaratonistaDao();
	MarcaDao daoMarca = new MarcaDao();
	public List<Maratonista> traerMaratonistas(){
		
		return dao.traerMaratonistas();
	}
	
	public Maratonista traerMaratonista(int nroChip)throws Exception {
		Maratonista maratonista = dao.traerMaratonista(nroChip);
		if(maratonista==null)throw new Exception("Maratonista Inexistente");
		return maratonista;
	}
	
	public void actualizar(Maratonista maratonista){
		
		dao.actualizar(maratonista);
	}
	
	
	public void actualizarMaratonistas() {
		List<Maratonista> maratonistas = dao.traerMaratonistas();
		for(Maratonista m : maratonistas) {
			List<Marca> marcas = daoMarca.traerMarca(m);
			m.setTiempo(marcas.get(0).getHora(), marcas.get(1).getHora());
			actualizar(m);
			
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerClasificacion(){
		return dao.traerClasificacion();
	}
	
	@SuppressWarnings("unchecked")
	public List<Maratonista> traerClasificacion(char sexo)throws HibernateException{
		return dao.traerClasificacion(sexo);
	}

}
