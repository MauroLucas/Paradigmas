package test;
import funciones.Funciones;
import negocio.ClienteABM;
public class TraerClienteYEventos {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		System.out.println(Funciones.imprimirLista(abm.traerClienteYEventos(2).getEventos()));

	}

}
