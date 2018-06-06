package test;
import modelo.Funciones;
import negocio.ClienteABM;
public abstract class TestTraerCliente {

	public static void main(String[] args) {
		ClienteABM abm = new ClienteABM();
		System.out.println(Funciones.imprimirLista(abm.traerCliente()));
		

	}

}
