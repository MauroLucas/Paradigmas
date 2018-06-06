package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import dao.ClienteDao;
import datos.Cliente;

public class ClienteABM {
	ClienteDao dao = new ClienteDao();
	public Cliente traerCliente(int idCliente) {
		Cliente c = dao.traerCliente(idCliente);
		return c;
	}
	
	public Cliente traerCliente(long dni) {
		Cliente c=dao.traerCliente(dni);
		return c;
	}
	
	public int agregar(String apellido, String nombre, long dni, GregorianCalendar fechaDeNacimiento) {
		Cliente c = new Cliente(apellido,nombre,dni,fechaDeNacimiento);
		return dao.agregar(c);
	}
	
	public void modificar(Cliente c) {
		dao.actualizar(c);
	}
	
	public void eliminar(long idCliente) {
		Cliente c = dao.traerCliente(idCliente);
		dao.eliminar(c);
	}
	
	public List<Cliente> traerCliente(){
		return dao.traerCliente();
	}
	
	

}
