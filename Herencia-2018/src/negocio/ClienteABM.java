package negocio;
import java.util.List;

import org.hibernate.HibernateException;

import dao.ClienteDao;
import datos.Cliente;
import datos.PersonaFisica;
import datos.PersonaJuridica;
public class ClienteABM {
	
	public static ClienteABM instance = null;
	
	protected ClienteABM() {}
	
	public static ClienteABM getInstance() {
		if(instance==null) {
			instance = new ClienteABM();
		}
		return instance;
	}
	public int agregarPersonaJuridica(String nroCliente,String razonSocial,String cuit)throws Exception {
		if(ClienteDao.getInstance().traer(nroCliente)!=null)throw new Exception("Numero de Cliente existente");
		PersonaJuridica cliente = new PersonaJuridica(nroCliente,razonSocial,cuit);
		return ClienteDao.getInstance().agregar(cliente);
	}
	
	public int agregarPersonaFisica(String nroCliente,String apellido,String nombre,int dni)throws Exception {
		if(ClienteDao.getInstance().traer(nroCliente)!=null)throw new Exception("Numero de Cliente existente");
		if(ClienteDao.getInstance().traer(dni)!=null)throw new Exception("DNI existente");
		PersonaFisica cliente = new PersonaFisica(nroCliente,apellido,nombre, dni);
		return ClienteDao.getInstance().agregar(cliente);
	}
	
	public void actualizar(Cliente objeto) {
		
		
	}
	
	public void eliminar(Cliente objeto) {
		
		
		
	}
	
	public Cliente traer(long idCliente) {
		return ClienteDao.getInstance().traer(idCliente);
	}
	
	public List<Cliente> traer(){
		return ClienteDao.getInstance().traer();
	}
	
	public Cliente traer(String nroCliente){
		return ClienteDao.getInstance().traer(nroCliente);
	}
	
	public PersonaFisica traer(int dni){
		return ClienteDao.getInstance().traer(dni);
	}
	

}
