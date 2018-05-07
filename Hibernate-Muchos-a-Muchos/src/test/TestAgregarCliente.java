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
		//long ultimoidCliente=abm.agregar("Perez", "Juan",(int)11111111,Funciones.traerFecha(1991,1,1));
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
