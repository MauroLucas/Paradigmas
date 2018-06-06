package negocio;
import dao.PrestamoDao;
import datos.*;
import java.util.GregorianCalendar;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
public class PrestamoABM {
	
	PrestamoDao dao = new PrestamoDao();
	public Prestamo traerPrestamo(long idPrestamo) {
		return dao.traerPrestamo(idPrestamo);
	}
	
	public int agregar(GregorianCalendar fecha,double monto,double interes,int cantCuotas,Cliente cliente) {
		Prestamo p = new Prestamo(fecha,monto,interes,cantCuotas,cliente);
		return dao.agregar(p);
	}
	
	public List<Prestamo> traerPrestamo(Cliente cliente) {
		return dao.traerPrestamo(cliente);
	}
	
	public void modificar(Prestamo objeto) throws HibernateException{
		dao.actualizar(objeto);
		
	}
	
	public Prestamo traerPrestamoYCuotas(long idPrestamo)throws HibernateException{
		return dao.traerPrestamoYCuotas(idPrestamo);
	}

}
