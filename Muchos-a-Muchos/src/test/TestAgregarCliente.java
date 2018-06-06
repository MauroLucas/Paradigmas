package test;
import negocio.ClienteABM;
public class TestAgregarCliente {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			abm.agregar("pereyra", "mauro", 38301299);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
