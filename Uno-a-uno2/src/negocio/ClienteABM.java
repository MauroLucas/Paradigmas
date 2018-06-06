package negocio;
import datos.Contacto;
import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	ClienteDao dao = new ClienteDao();
	
	
	public Cliente traerCliente(int dni)throws Exception {
		Cliente c=dao.traerCliente(dni);
		if(c==null) throw new Exception("Cliente inexistente");
		return c;
	}
	
	public Cliente traerCliente(long idCliente)throws Exception {
		Cliente c=dao.traerCliente(idCliente);
		if(c==null) throw new Exception("Cliente inexistente");
		return c;
	}
	
	public int agregar(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento,Contacto contacto)throws Exception {
		
		if(dao.traerCliente(dni)!=null)throw new Exception("Dni existente");
		Cliente c = new Cliente(apellido,nombre,dni,fechaDeNacimiento,contacto);
		return dao.agregar(c);
	}
	
	public void modificar(Cliente c)throws Exception {
		
		if(dao.traerCliente(c.getDni())!=null) {
			throw new Exception("Existe un cliente con ese dni");
		}
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente) throws Exception {
		Cliente c = traerCliente(idCliente);
		dao.eliminar(c);
	}
	
	public List<Cliente> traerCliente(){
		return dao.traerCliente();
	}
	
	public Cliente traerClienteYContaco(long idCliente) {
		return dao.traerClienteYContacto(idCliente);
	}
	
	

}
