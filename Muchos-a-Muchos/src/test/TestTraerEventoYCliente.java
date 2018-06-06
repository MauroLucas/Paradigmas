package test;
import negocio.EventoABM;
public class TestTraerEventoYCliente {

	public static void main(String[] args) {
		EventoABM abmEvento = new EventoABM();
		System.out.println(abmEvento.traerEventoYClientes("partido2").getClientes());
		

	}

}
