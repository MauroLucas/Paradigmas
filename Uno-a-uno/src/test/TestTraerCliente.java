package test;
import negocio.ClienteABM;
public class TestTraerCliente {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			
			System.out.println(abm.traerCliente(12345678));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
