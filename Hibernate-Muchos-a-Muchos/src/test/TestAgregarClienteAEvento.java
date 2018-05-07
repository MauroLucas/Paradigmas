package test;
import negocio.ClienteABM;
import negocio.EventoABM;
import datos.Cliente;
import datos.Evento;
public class TestAgregarClienteAEvento {

	public static void main(String[] args) throws Exception {
	    ClienteABM clienteabm = new ClienteABM();
	    EventoABM eventoABM = new EventoABM();
	    
	    
	    Evento e = eventoABM.traerEvento((long)3);
	    Cliente c = clienteabm.traerCliente(38301299);
	    
	    e.agregar(c);
	    eventoABM.modificar(e);

	}

}
