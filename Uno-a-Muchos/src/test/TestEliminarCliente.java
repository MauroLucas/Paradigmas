package test;
import negocio.ClienteABM;
public class TestEliminarCliente {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			
			abm.eliminar((long)1);
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
