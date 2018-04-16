package test;
import modelo.Funciones;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.List;
/**
 * Clase para el testeo de la clase main
 * @author Mauro Lucas Pereyra
 * @version 16/04/2018
 *
 */
public class TestFunciones {

	/**
	 * Metodo princial
	 * @param args - Array de String
	 */
	public static void main(String[] args) {
		
		int num1 = 3;
		int num2 = 2;
		
		System.out.print(Funciones.sumar(num1, num2));
		
	
		System.out.println(Funciones.esBisiesto(2014));
		System.out.println(Funciones.traerAnio(new GregorianCalendar()));
		System.out.println(Funciones.traerMes(new GregorianCalendar()));
		System.out.println(Funciones.traerDia(new GregorianCalendar()));
		
		System.out.println(Funciones.traerFecha(2014,5,22));
		System.out.println(Funciones.traerFecha(2014, 5, 22,24,15,60));
		System.out.println(Funciones.traerFecha("22/05/1994"));
		System.out.println(Funciones.traerFechaCorta(new GregorianCalendar()));
		System.out.println(Funciones.traerFechaCortaHora(new GregorianCalendar()));
		System.out.println(Funciones.traerFechaProximo(new GregorianCalendar(), 10));
		System.out.println(Funciones.esDiaHabil(new GregorianCalendar()));
		System.out.println(Funciones.traerDiaDeLaSemana(new GregorianCalendar()));
		System.out.println(Funciones.traerMesEnLetras(new GregorianCalendar()));
		System.out.println(Funciones.traerFechaLarga(new GregorianCalendar()));
		System.out.println(Funciones.sonFechasIguales(new GregorianCalendar(), new GregorianCalendar()));
		System.out.println(Funciones.sonFechasHorasIguales(new GregorianCalendar(), new GregorianCalendar()));
		System.out.println(Funciones.traerCantDiasDeUnMes(2014, 05));
		System.out.println(Funciones.aproximar2Decimal(10.345));
		
		System.out.println(Funciones.esNumero('5'));
		System.out.println(Funciones.esLetra('l'));
		System.out.println(Funciones.esCadenaNros("12345"));
		System.out.println(Funciones.esCadenaLetras("abcd"));
		System.out.println(Funciones.convertirADouble(10));

	}

}
