package test;
import negocio.ClienteABM;
import datos.Cliente;

public class TestElimniarPrestamoCliente {

	public static void main(String[] args) throws Exception {
		ClienteABM abm = new ClienteABM();
		Cliente c = abm.traerClienteYPrestamo((long)1);
		c.getPrestamos().clear();
		System.out.println(c.getPrestamos());
		abm.modificar(c);

	}

}
