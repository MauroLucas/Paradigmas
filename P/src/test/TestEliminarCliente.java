package test;
import negocio.ClienteABM;

public class TestEliminarCliente {

	public static void main(String[] args) {
		try {
		ClienteABM abm = new ClienteABM();
		System.out.println(abm.traerCliente(11111111));

	}
		catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
