package test;
import negocio.ClienteABM;
public class TestTraerCliente {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			long id=1;
			System.out.println(abm.traerCliente(id).getPrestamos());
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
