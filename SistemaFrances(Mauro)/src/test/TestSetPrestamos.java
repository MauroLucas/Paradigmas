package test;
import datos.Prestamo;
import funciones.Funciones;
import datos.Cliente;
import java.util.GregorianCalendar;
import negocio.*;
public class TestSetPrestamos {

	public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();
		PrestamoABM abmPrestamo = new PrestamoABM();
		try {
			abmPrestamo.agregar(new GregorianCalendar(), 20000, 5, 12, abmCliente.traerCliente(38301299));
		   //Prestamo p = abmPrestamo.traerPrestamo(7);
		   //p.setCuotas();
		   //abmPrestamo.modificar(p);
		   
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
