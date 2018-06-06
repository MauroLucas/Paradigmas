package test;
import datos.Cliente;
import negocio.ClienteABM;
import datos.Cliente;
import datos.Contacto;
public class TestTraerClienteYContacto {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		long id=1;
		Cliente cliente = abm.traerClienteYContaco(id);
		System.out.println(cliente);
		System.out.println("\n");
		System.out.println(cliente.getContacto());
		
		
		

	}

}
