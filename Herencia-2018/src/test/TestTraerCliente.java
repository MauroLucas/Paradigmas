package test;
import negocio.ClienteABM;
import dao.ClienteDao;
import datos.Cliente;
import funciones.Funciones;
public class TestTraerCliente {

	public static void main(String[] args) {
		//System.out.println(Funciones.imprimirLista(ClienteABM.getInstance().traer()));
		//System.out.println(ClienteABM.getInstance().traer("102"));
		
		//System.out.println(ClienteABM.getInstance().traer((long)2).getNroCliente());
		System.out.println(ClienteDao.getInstance().traer(38301299));

	}

}
