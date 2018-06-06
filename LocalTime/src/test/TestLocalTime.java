package test;
import java.time.LocalTime;
import java.util.GregorianCalendar;
import funciones.Funciones;
import datos.Llamada;
import datos.Locutorio;
import datos.Venta;
public class TestLocalTime {

	public static void main(String[] args) {
	   
		
	   Llamada llamada1 = new Llamada("4294-1004",LocalTime.of(23,00,00),LocalTime.of(2,00,00));
	   Llamada llamada2 = new Llamada("4294-1004",LocalTime.of(15,00,00),LocalTime.of(16,00,59));
	   Llamada llamada3 = new Llamada("4294-1004",LocalTime.of(17,00,00),LocalTime.of(19,00,59));
	   Llamada llamada4 = new Llamada("4294-1004",LocalTime.of(19,00,00),LocalTime.of(20,00,59));
	   Llamada llamada5 = new Llamada("4294-1004",LocalTime.of(14, 00,00),LocalTime.of(20,00,00));
	   System.out.println(llamada1);
	   System.out.println("Duracion de Llamada " + llamada1.duracionLlamada());
	   System.out.println("Duracion de Llamada " + llamada2.duracionLlamada());
	   System.out.println("Duracion de Llamada " + llamada3.duracionLlamada());
	   
	   Locutorio locutorio = new Locutorio();
	   Venta venta1= new Venta(new GregorianCalendar());
       venta1.agregarLlamada(llamada1);
       venta1.agregarLlamada(llamada2); 
       venta1.agregarLlamada(llamada3); 
       venta1.agregarLlamada(llamada4);
       venta1.agregarLlamada(llamada5);
       
       locutorio.agregarVenta(venta1);
       GregorianCalendar diaDesde = Funciones.traerFecha(2018, 6, 4);
       GregorianCalendar diaHasta = Funciones.traerFecha(2018, 6, 4);
       System.out.println("Imprimir llamadas desde,hasta");
       System.out.println(Funciones.imprimirLista(locutorio.llamadasRealizadas(diaDesde, diaHasta)));
       LocalTime horaDesde = LocalTime.of(14,00,00);
       LocalTime horaHasta = LocalTime.of(20,00,59);
       System.out.println("DiaDesde,horadesde,horaHasta");
       System.out.println(Funciones.imprimirLista(locutorio.llamadasRealizadas(diaDesde,horaDesde,horaHasta)));
       
       System.out.println(Funciones.imprimirLista(locutorio.llamadasRealizadas(LocalTime.of(19, 00))));
       
	}

}
