package test;

import java.util.GregorianCalendar;
import negocio.ClienteABM;
import negocio.PrestamoABM;
import funciones.Funciones;

public class TestAgregarPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClienteABM c= new ClienteABM();
		PrestamoABM abm= new PrestamoABM();
		try{
		long ultimoIdPrestamo = abm.agregar(Funciones.traerFecha(2018,1,1),50000,15,60,c.traerCliente((long)1));
		ultimoIdPrestamo = abm.agregar(Funciones.traerFecha(2018,1,1),2000,6,24,c.traerCliente((long)1));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
