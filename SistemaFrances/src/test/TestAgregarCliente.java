package test;

import java.util.GregorianCalendar;
import negocio.ClienteABM;
import funciones.Funciones;

public class TestAgregarCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String apellido="tu apellido";
		String nombre="tu nombre";
		int dni=35000000;
		GregorianCalendar fechaDeNacimiento= Funciones.traerFecha(1990,1,1); // tu fecha denacimiento
		ClienteABM abm= new ClienteABM();
		try{
		long ultimoIdCliente = abm.agregar(apellido, nombre, dni,fechaDeNacimiento);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
