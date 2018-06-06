package test;
import negocio.PrestamoABM;
import negocio.ClienteABM;
public class TestTraerPrestamosCliente {

	public static void main(String[] args) {
		PrestamoABM abm = new PrestamoABM();
		ClienteABM abmCliente = new ClienteABM();
		try {
			System.out.println(abm.traerPrestamo(abmCliente.traerCliente(12345678)));
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
