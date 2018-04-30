package negocio;

import dao.PrestamoDao;
import java.util.List;

import org.hibernate.HibernateException;

import datos.Cliente;
import datos.Cuota;
import datos.Prestamo;
import java.util.GregorianCalendar;

public class PrestamoABM {
	
	private PrestamoDao dao = new PrestamoDao();
	
	public Prestamo traerPrestamo(long idPrestamo) throws Exception{
		Prestamo p = dao.traerPrestamo(idPrestamo);
		if(p==null) throw new Exception("ERROR: El prestamo no existe.");
		return p;
	}
	
	public List<Prestamo> traerPrestamo(Cliente c) { 
		return dao.traerPrestamo(c);
	}
	
	public int agregar(GregorianCalendar fecha, double monto, double interes, int cantCuotas, Cliente cliente) throws Exception{
		if(cliente==null) throw new Exception("ERROR: El cliente no existe.");
		Prestamo p=new Prestamo(fecha,monto,interes,cantCuotas,cliente);
		return dao.agregar(p);
	}
	
	public void modificar(Prestamo p) throws Exception{
		dao.actualizar(p);
	}
	
	
}
	
