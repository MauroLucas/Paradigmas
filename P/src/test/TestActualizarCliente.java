package test;

import negocio.ClienteABM;
import datos.Cliente;

public class TestActualizarCliente {

	public static void main(String[] args) {
		try {
			long id = 4;
			ClienteABM abm = new ClienteABM();
			Cliente c = abm.traerCliente(38301287);
			c.setDni(38301298);
			abm.modificar(c);
		}
		catch(Exception e) {
			System.out.println("Error: " + e);
		}
		

	}

}
