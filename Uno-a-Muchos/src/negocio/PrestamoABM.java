package negocio;
import dao.PrestamoDao;
import datos.*;
import java.util.GregorianCalendar;
import java.util.List;
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

}
