package test;
import negocio.ContactoABM;
import datos.Cliente;
import negocio.ClienteABM;
public class TestAgregarContacto {

	public static void main(String[] args) {
		try {
			ContactoABM abm = new ContactoABM();
			ClienteABM abmCliente = new ClienteABM();
			Cliente cliente = abmCliente.traerCliente(12345673);
			abm.agregar("m_l_pereyra@hotmail.com", "1131027532", "42941004",cliente);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
