package test;
import negocio.EventoABM;
import negocio.ClienteABM;
public class TestAgregarClienteAEvento {

	public static void main(String[] args) {
		try {
			EventoABM abmEvento = new EventoABM();
			ClienteABM abmCliente = new ClienteABM();
			abmEvento.agregarCliente(abmEvento.traerEventoYClientes(3), abmCliente.traerCliente(38301299));
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
