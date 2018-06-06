package test;
import funciones.Funciones;
import negocio.PrestamoABM;
import negocio.ClienteABM;
import datos.Prestamo;
import java.util.Set;
public class TestAgregarPrestamo {

	public static void main(String[] args) {
		PrestamoABM abm = new PrestamoABM();
		ClienteABM abm2 = new ClienteABM();
		//System.out.println(Funciones.imprimirLista(abm.traerPrestamoYCuotas(8).getCuotas()));
        try {
			Set<Prestamo> p =  abm2.traerClienteYPrestamo((long)1).getPrestamos();
			for(Prestamo presta : p ) {
				System.out.println(p);
				System.out.println(Funciones.imprimirLista(abm.traerPrestamoYCuotas(presta.getIdPrestamo()).getCuotas()));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
