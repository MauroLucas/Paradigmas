package test;
import java.util.Hashtable;

import dao.ProfesorDao;
import datos.*;
public class TestAgregarCliente {

	public enum tipoSube {
		NORMAL,
		TARIFA
	};
	
	public static Hashtable<tipoSube, Object> dicc = new Hashtable<tipoSube, Object>();
	
	public static void main(String[] args) {
		ProfesorDao dao = new ProfesorDao();
		dao.agregar(new Profesor("mauro","pereyra",new Direccion("cordero",540)));
		
		

	}
	
}


