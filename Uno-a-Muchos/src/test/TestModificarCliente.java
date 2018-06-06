package test;
import negocio.ClienteABM;
import datos.Cliente;
public class TestModificarCliente {

	public static void main(String[] args) {
		try {
			ClienteABM abm = new ClienteABM();
			Cliente c = abm.traerCliente(38301299);
			c.setDni(38301299);
			abm.modificar(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
