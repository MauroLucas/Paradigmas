package negocio;

import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;

import dao.ClienteDao;
import dao.PrestamoDao;
import datos.Cliente;
import datos.Prestamo;
public class ClienteABM {
	ClienteDao dao = new ClienteDao();
	PrestamoDao daoPrestamo = new PrestamoDao();
	
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
	
	public Cliente traerClienteYPrestamo(long idCliente) {
		return dao.traerClienteYPrestamos(idCliente);
	}
	
	public Cliente traerClienteYPrestamo(int dni)throws HibernateException{
		 return dao.traerClienteYPrestamos(dni);
	 }
	
	public Cliente traerClientePrestamosYCuotas(int dni)throws HibernateException{
		 return dao.traerClientePrestamosYCuotas(dni);
	 }
	
	public int agregar(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento)throws Exception {
		
		if(dao.traerCliente(dni)!=null)throw new Exception("Dni existente");
		Cliente c = new Cliente(apellido,nombre,dni,fechaDeNacimiento);
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
	
	
	
	

}
