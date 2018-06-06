package test;
import negocio.ClienteABM;
import funciones.Funciones;
public class TestTraerClienteYPrestamo {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			long id=1;
			System.out.println(Funciones.imprimirLista(abm.traerClienteYPrestamo(id).getPrestamos()));
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
