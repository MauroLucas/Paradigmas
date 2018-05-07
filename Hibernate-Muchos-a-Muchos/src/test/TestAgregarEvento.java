package test;

import java.util.GregorianCalendar;
import negocio.EventoABM;
import funciones.Funciones;

public class TestAgregarEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar fecha= Funciones.traerFecha(2018,1,2);
		EventoABM abm= new EventoABM();
		try{
		//long ultimoEvento = abm.agregar("Cumpleaños",fecha);
		//long ultimoEvento = abm.agregar("Partido de Futbol",fecha);
		abm.agregarCliente(3,11111111);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
