package test;
import modelo.*;
import java.util.GregorianCalendar;
public class Test {

	public static void main(String[] args) {
		SistemaSube ss = new SistemaSube();
		
		try {
			System.out.println("Pasajero0");
			ss.agregarPasajero("Marina", "Lopez", 12345678);
			ss.agregarTarjeta(ss.traerPasajero(12345678), "9876543209");
			ss.cargarSaldo(ss.traerPasajero(12345678), 20);
			
			ss.agregarViaje(ss.traerPasajero(12345678), "165", 10, Funciones.traerFecha(2017, 06, 01, 13, 00, 00));
			ss.agregarViaje(ss.traerPasajero(12345678), "160", 6, Funciones.traerFecha(2017, 06, 03, 13, 30, 00));
			ss.agregarViaje(ss.traerPasajero(12345678), "170", 7, Funciones.traerFecha(2017, 06, 04, 14, 00, 00));
			System.out.println(ss.traerPasajero(12345678));
		}
		catch(Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		try {
			System.out.println("1)");
			ss.agregarPasajero("Juan", "Mendez", 11111111);
			ss.agregarPasajero("Mariana", "Mendez", 22222222);
			ss.agregarPasajero("Lucas", "Mendez", 33333333);
			
		    System.out.println(ss.traerPasajero(11111111));
		    System.out.println(ss.traerPasajero(22222222));
		    System.out.println(ss.traerPasajero(33333333));
			
		}
		catch(Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		
		try {
			System.out.println("2)");
			ss.agregarTarjeta(ss.traerPasajero(12345678), "9876543210");
			ss.agregarTarjeta(ss.traerPasajero(11111111), "9876543211");
			ss.agregarTarjeta(ss.traerPasajero(22222222), "9876543212");
			ss.agregarTarjeta(ss.traerPasajero(33333333), "9876543213");
			
			System.out.println(ss.traerPasajero(12345678));
			System.out.println(ss.traerPasajero(11111111));
			System.out.println(ss.traerPasajero(22222222));
			System.out.println(ss.traerPasajero(33333333));
			
		}
		catch(Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
		try {
			System.out.println("3)");
			ss.cargarSaldo(ss.traerPasajero(11111111), 10);
			System.out.println(ss.traerPasajero(11111111));
			
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		try {
			System.out.println("4)");
			ss.agregarViaje(ss.traerPasajero(11111111), "101", 12, Funciones.traerFecha(2017, 06, 12, 10, 00, 00));
			ss.agregarViaje(ss.traerPasajero(11111111), "102", 10, Funciones.traerFecha(2017, 06, 12, 13, 00, 00));
			System.out.println(ss.traerPasajero(11111111));
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		try {
			System.out.println("5)");
			ss.agregarViaje(ss.traerPasajero(11111111), "103", 13, Funciones.traerFecha(2017, 06, 12, 17, 00, 00));
			
			System.out.println(ss.traerPasajero(11111111));
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		try {
			System.out.println("6)");
			ss.agregarViaje(ss.traerPasajero(12345678), "101", 10, Funciones.traerFecha(2017, 06, 12, 14, 30, 00));
			
			System.out.println(ss.traerPasajero(12345678));
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		
		try {
			System.out.println("7)");
			
			System.out.println(ss.listaViajes(ss.traerViajes(ss.traerPasajero(11111111))));
			
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		
		try {
			System.out.println("8)");
			
			
			System.out.println(ss.listaViajes(ss.traerViajes(ss.traerTarjeta("9876543210"))));
			
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		
		try {
			System.out.println("9)");
			
			
			System.out.println(ss.listaViajes(ss.traerViajes(true)));
			
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		
		try {
			System.out.println("10)");
			
			GregorianCalendar desde = Funciones.traerFecha(2017, 06, 03);
			GregorianCalendar hasta = Funciones.traerFecha(2017, 06, 12);
			System.out.println(ss.listaViajes(ss.traerViajes(desde, hasta)));
			
		}
         catch(Exception e) {
        	 System.out.println("Error:" + e.getMessage());
		}
		

	}

}
