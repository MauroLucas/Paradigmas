package negocio;
import org.hibernate.Hibernate;

import dao.ClienteDao;
import datos.Cliente;
public class ClienteABM {
	ClienteDao dao = new ClienteDao();
	
	public Cliente traerCliente(long idCliente) {
		return dao.traerCliente(idCliente);
	}
	public Cliente traerCliente(int dni) {
		return dao.traerCliente(dni);
	}
	
	public int agregar(String apellido,String nombre,int dni)throws Exception {
		
		if(dao.traerCliente(dni)!=null) {
			throw new Exception("Dni existente");
		}
		Cliente cliente = new Cliente(apellido,nombre,dni);
		return dao.agregar(cliente);
		
	}
	
	public void modificar(Cliente cliente)throws Exception {
		if(dao.traerCliente(cliente.getDni())!=null) {
			throw new Exception("Ya existe un cliente con ese dni");
		}
		dao.actualizar(cliente);
	}
	
	public void eliminar(Cliente cliente)throws Exception{
		dao.eliminar(cliente);
	}
	
	public Cliente traerClienteYEventos(long idCliente) {
		
		return dao.traerClienteYEventos(idCliente);
	}

}
