package test;
import negocio.*;
import datos.*;
import java.util.GregorianCalendar;
public class TestAgregarPrestamo {

	public static void main(String[] args) {
		try {
			PrestamoABM abmPrestamo = new PrestamoABM();
			GregorianCalendar fecha = new GregorianCalendar();
			double monto = 19000;
			double interes = 10;
			int cantCuotas=50;
			ClienteABM abmCliente = new ClienteABM();
			abmPrestamo.agregar(fecha, monto, interes, cantCuotas, abmCliente.traerCliente((long)1));
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
