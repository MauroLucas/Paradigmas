package test;
import modelo.Funciones;
import negocio.ClienteABM;
public class TestTraerClientes {

	public static void main(String[] args) {
		try {
			ClienteABM abm=new ClienteABM();
			System.out.println(Funciones.imprimirLista(abm.traerCliente()));
			

			
		}catch(Exception e) {
			
		}
		
	}

}
