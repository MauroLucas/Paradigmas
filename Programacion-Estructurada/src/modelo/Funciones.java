package modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Esta Clase define un metodo basico de logica
 * matematica,sumar 2 numeros
 * @author Mauro Lucas Pereyra
 * @version 15/04/2018
 *
 */
public class Funciones {
	/**
	 * Metodo que permite sumar dos numeros pasados
	 * por parametro.
	 * @param num1 - Valor ingresado por parametro.
	 * @param num2 - Valor ingresado por parametro.
	 * @return - Retorna la suma de num1 y num2
	 */
	public static int sumar(int num1,int num2) {
		return num1+num2;
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo que permite saber si un año es bisiesto o no es bisiesto.
	 * @note Un año es bisiesto cuando el mes de febrero tiene 29 dias,
	 * esto ocurre cada 4 años.
	 * @param anio - Valor ingreado por parametro de tipo entero.
	 * @return <ul>
	 *          <li>true: el año es bisiesto</li>
	 *          <li>false: el año no es bisiesto</li>
	 *         </ul>
	 * 
	 */
>>>>>>> Mauro
	public static boolean esBisiesto(int anio) {
		boolean bisiesto;
		if(anio%4==0  && (anio%100!=0 || anio%400==0)) {
			
			bisiesto = true;
		}
		else {
			bisiesto=false;
		}
		
		return bisiesto;
	}
	
<<<<<<< HEAD
=======
	/** 
	 * Metodo para saber el año de una fecha pasada por parametro.
	 * @param fecha : Valor de tipo GregorianCalendar
	 * @return año de la fecha.
	 */
	
>>>>>>> Mauro
	public static int traerAnio(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.YEAR);
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo para saber el mes de una fecha pasada por parametro.
	 * @param fecha : Valor de tipo GregorianCalendar
	 * @return mes de la fecha.
	 */
>>>>>>> Mauro
	public static int traerMes(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.MONTH)+1;
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo para saber el día de una fecha pasada por parametro.
	 * @param fecha : Valor de tipo GregorianCalendar
	 * @return día de la fecha.
	 */
>>>>>>> Mauro
	public static int traerDia(GregorianCalendar fecha) {
		
		return fecha.get(Calendar.DAY_OF_MONTH);
	}
	
<<<<<<< HEAD
	public static boolean esFechaValida(int anio,int mes,int dia) {
		
		boolean fechavalida=true;
	    
		switch (mes) {
		
		case 1:if(dia>31) fechavalida=false;break;
		case 2:if(dia>28 && !esBisiesto(anio))fechavalida=false;break;
		case 3:if(dia>31)fechavalida=false; break;
		case 4:if(dia>30)fechavalida=false; break;
		case 5:if(dia>31)fechavalida=false; break;
		case 6:if(dia>30)fechavalida=false; break;
		case 7:if(dia>31)fechavalida=false; break;
		case 8:if(dia>31)fechavalida=false; break;
		case 9:if(dia>30)fechavalida=false; break;
		case 10:if(dia>31)fechavalida=false; break;
		case 11:if(dia>30)fechavalida=false; break;
		case 12:if(dia>31)fechavalida=false; break;
		default :fechavalida=false;
		}
		return fechavalida;
	}
	
	
	public static GregorianCalendar traerFecha(int anio,int mes,int dia) {
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(esFechaValida(anio,mes,dia)) {
		resultado.set(anio, mes-1, dia);
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		
		return(resultado);
		
	}
public static GregorianCalendar traerFecha(int anio,int mes,int dia,int horas,int minutos,int segundos) {
=======
	/**
	 * Metodo para saber si una fecha es valida o no es valida.
	 * @note Una fecha es válida dependiendo de la cantidad de días del mes
	 * y si es bisiesto o no(en el caso del mes de febrero). 
	 * @param anio 
	 * @param mes
	 * @param dia
	 * @return <ul>
	 *          <li>true: si la fecha es válida</li>
	 *          <li>false: si la fecha no es válida</li>
	 *         </ul>
	 */
	public static boolean esFechaValida(int anio,int mes,int dia) {
		
		boolean fechaValida=true;
	    
		switch (mes) {
		
		case 1:if(dia>31) fechaValida=false;break;
		case 2:if(dia>28 && !esBisiesto(anio))fechaValida=false;break;
		case 3:if(dia>31)fechaValida=false; break;
		case 4:if(dia>30)fechaValida=false; break;
		case 5:if(dia>31)fechaValida=false; break;
		case 6:if(dia>30)fechaValida=false; break;
		case 7:if(dia>31)fechaValida=false; break;
		case 8:if(dia>31)fechaValida=false; break;
		case 9:if(dia>30)fechaValida=false; break;
		case 10:if(dia>31)fechaValida=false; break;
		case 11:if(dia>30)fechaValida=false; break;
		case 12:if(dia>31)fechaValida=false; break;
		default :fechaValida=false;
		}
		return fechaValida;
	}
	
	/**
	 * Metodo para crear una fecha de tipo GregorianCalendar a partir
	 * de un anio, mes y dia de tipo entero pasados por parametro. 
	 * @param anio 
	 * @param mes
	 * @param dia
	 * @return fecha 
	 */
	
	public static GregorianCalendar traerFecha(int anio,int mes,int dia) {
		
		GregorianCalendar fecha = new GregorianCalendar();
		if(esFechaValida(anio,mes,dia)) {
		fecha.set(anio, mes-1, dia);
		fecha.setTime(fecha.getTime());
		}
		else {
			fecha=null;
		}
		
		return(fecha);
		
	}
	/**
	 * Metodo para crear una fecha de tipo GregorianCalendar a partir
	 * de un anio, mes, dia, horas, minutos, segundos de tipo entero 
	 * pasados por parametro. 
	 * @param anio 
	 * @param mes
	 * @param dia
	 * @param horas
	 * @param minutos
	 * @param segundos
	 * @return fecha 
	 */
	public static GregorianCalendar traerFecha(int anio,int mes,int dia,int horas,int minutos,int segundos) {
>>>>>>> Mauro
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(esFechaValida(anio,mes,dia)) {
		resultado.set(anio, mes-1, dia,horas,minutos,segundos);
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		
		return(resultado);
		
	}
<<<<<<< HEAD
	
=======
	/**
	 * Metodo para crear una fecha de tipo GregorianCalendar a partir
	 * de String pasado por parametro.
	 * @note DD/MM/AA
	 * @param anio 
	 * @param mes
	 * @param dia
	 * @param horas
	 * @param minutos
	 * @param segundos
	 * @return fecha 
<<<<<<< HEAD
>>>>>>> Mauro
=======
	 */
>>>>>>> Mauro
	public static GregorianCalendar traerFecha(String fecha) {
		
		GregorianCalendar resultado = new GregorianCalendar();
		if(fecha.length()==10) {
		String dia= fecha.substring(0,2);
		String mes = fecha.substring(3,5);
		String anio=fecha.substring(6,10);
			
		
		resultado.set(Integer.parseInt(anio),Integer.parseInt(mes)-1,Integer.parseInt(dia));  // paso de string a int
		resultado.setTime(resultado.getTime());
		}
		else {
			resultado=null;
		}
		return resultado;
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo que recibe un dato de tipo GregorianCalendar y retorna en un String 
	 * la fecha.
	 * @param fecha - Valor ingresado por parametro.
	 * @return dia, mes y año de la fecha.  
	 */
>>>>>>> Mauro
	public static String traerFechaCorta(GregorianCalendar fecha) {
		String resultado = new String();
		if(fecha!=null) {
			
			String dia=String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
			String mes=String.valueOf(fecha.get(Calendar.MONTH)+1);
			String anio = String.valueOf(fecha.get(Calendar.YEAR));
					
					
			
			resultado = (dia+ "/" +mes + "/" + anio);
		}
		else {
			resultado=null;
		}
		return resultado;
		
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo que recibe un dato de tipo GregorianCalendar y retorna en un String 
	 * la fecha.
	 * @param fecha - Valor ingresado por parametro.
	 * @return segundos, minutos, horas, dia, mes y año  de la fecha.  
	 */
>>>>>>> Mauro
	public static String traerFechaCortaHora(GregorianCalendar fecha) {
		
		String resultado = new String();
		if(fecha!=null) {
			
			String dia=String.valueOf(fecha.get(Calendar.DAY_OF_MONTH));
			String mes=String.valueOf(fecha.get(Calendar.MONTH)+1);
			String anio = String.valueOf(fecha.get(Calendar.YEAR));
			String hora = String.valueOf(fecha.get(Calendar.HOUR_OF_DAY));
			String minutos=String.valueOf(fecha.get(Calendar.MINUTE));
			String segundos=String.valueOf(fecha.get(Calendar.SECOND));
					
					
			
			resultado = (dia+ "/" +mes + "/" + anio + " " + hora+":"+minutos+":"+segundos);
		}
		else {
			resultado=null;
		}
		return resultado;
	}
	
	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha,int cantdias) {
		
		
		GregorianCalendar resultado = (GregorianCalendar) fecha.clone();
		resultado.add(GregorianCalendar.DAY_OF_YEAR, cantdias);
		resultado.setTime(resultado.getTime());
		return resultado;
		
		
		
	}
	
	public static boolean esDiaHabil(GregorianCalendar fecha) {
	boolean resultado=true;	
	switch(fecha.get(Calendar.DAY_OF_MONTH)){
	case 1:resultado=false;
	case 7:resultado=false;
	}
	return resultado;
	}
	
	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {
		
		String resultado = new String();
		int dia= fecha.get(Calendar.DAY_OF_WEEK);
		switch(dia) {
		
		case 1:resultado="Domingo"; break;
		case 2:resultado="Lunes";break;
		case 3:resultado="Martes";break;
		case 4:resultado="Miercoles";break;
		case 5:resultado="Jueves";break;
		case 6:resultado="Viernes";break;
		case 7:resultado="Sabado";break;
		
		}
		
		return resultado;
	}
	
	public static String traerMesEnLetras(GregorianCalendar fecha) {
		String resultado=new String();
		int mes=fecha.get(Calendar.MONTH);
		switch(mes) {
		
		case 0:resultado="Enero";break;
		case 1:resultado="Febrero";break;
		case 2:resultado="Marzo";break;
		case 3:resultado="Abril";break;
		case 4:resultado="Mayo";break;
		case 5:resultado="Junio";break;
		case 6:resultado="Julio";break;
		case 7:resultado="Agosto";break;
		case 8:resultado="Septiempre";break;
		case 9:resultado="Octubre";break;
		case 10:resultado="Noviembre";break;
		case 11:resultado="Diciembre";break;
		}
		
		return resultado;
	}
	
	public static String traerFechaLarga(GregorianCalendar fecha) {
		
		String resultado = new String();
		resultado=traerDiaDeLaSemana(fecha)+" " + String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)+" de "+ traerMesEnLetras(fecha)+" del "+String.valueOf(fecha.get(Calendar.YEAR)));
		return resultado;
	}
<<<<<<< HEAD
=======
	  /**
     * Metodo para saber si dos fechas son iguales.
     * @note las fechas van a ser iguales cuando compartan el mismo dia mes y año.
     * @param fecha - Valor ingresado como parametro
     * @param fecha1 - Valor ingresado como parametro
     * @return <ul>
     *          <li>true : si las fechas son iguales</li>
     *          <li>false : si las fechas no son iguales</li>
     */
>>>>>>> Mauro
	
	public static boolean sonFechasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
		
		boolean resultado=false;
		
		if (fecha.get(Calendar.DAY_OF_MONTH)== fecha1.get(Calendar.DAY_OF_MONTH)) {
			if(fecha.get(Calendar.MONTH)==fecha1.get(Calendar.MONTH)) {
				if(fecha.get(Calendar.YEAR)==fecha1.get(Calendar.YEAR)) {
					resultado=true;
				}
			}
			
		}
		return resultado;
	}
	
<<<<<<< HEAD
public static boolean sonFechasHorasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
=======
	 /**
     * Metodo para saber si dos fechas y hora son iguales.
     * @note las fechas van a ser iguales cuando compartan el mismo dia,mes,año y los
     * mismos segundos minutos y horas.
     * @param fecha - Valor ingresado como parametro
     * @param fecha1 - Valor ingresado como parametro
     * @return <ul>
     *          <li>true : si las fechas son iguales</li>
     *          <li>false : si las fechas no son iguales</li>
     */
	public static boolean sonFechasHorasIguales(GregorianCalendar fecha,GregorianCalendar fecha1) {
>>>>>>> Mauro
		
		boolean resultado=false;
		
		if (fecha.get(Calendar.DAY_OF_MONTH)== fecha1.get(Calendar.DAY_OF_MONTH)) {
			if(fecha.get(Calendar.MONTH)==fecha1.get(Calendar.MONTH)) {
				if(fecha.get(Calendar.YEAR)==fecha1.get(Calendar.YEAR)) {
					if(fecha.get(Calendar.HOUR)==fecha1.get(Calendar.HOUR)) {
						if(fecha.get(Calendar.MINUTE)==fecha1.get(Calendar.MINUTE)) {
							if(fecha.get(Calendar.SECOND)==fecha1.get(Calendar.SECOND)) {
								resultado=true;
							}
						}
					}
				}
			}
			
		}
		return resultado;
	}
	
	public static int traerCantDiasDeUnMes(int anio,int mes) {
		int resultado=0;
		switch(mes) {
		
		case 1:resultado=31;
		case 2:if(esBisiesto(anio))resultado=29;else resultado=28;break;
		case 3:resultado=31;
		case 4:resultado=30;
		case 5:resultado=31;
		case 6:resultado=30;
		case 7:resultado=31;
		case 8:resultado=31;
		case 9:resultado=30;
		case 10:resultado=31;
		case 11:resultado=30;
		case 12:resultado=31;
		}
		
		return resultado;
	}
	
	public static double aproximar2Decimal(double valor) {
		
		 return Math.rint(valor*100)/100;
	}
<<<<<<< HEAD
	
=======
	/**
	 * Metodo para saber si un caracter es una numero.
	 * @param c - Valor ingresado por parametro
	 * @return <ul>
	 *          <li>true: si es un numero</li>
	 *          <li>false: no es un numero</li>
	 */
>>>>>>> Mauro
	public static boolean esNumero(char c) {
		
		return (Character.isDigit(c));
	}
<<<<<<< HEAD
=======
	
	/**
	 * Metodo para saber si un caracter es una letra.
	 * @param c - Valor ingresado por parametro
	 * @return <ul>
	 *          <li>true: si es una letra</li>
	 *          <li>false: no es una letra</li>
	 */
>>>>>>> Mauro
	public static boolean esLetra(char c) {
		return (Character.isLetter(c));
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo para saber si un String es una cadena
	 * de numeros.
	 * @param cadena - Valor ingresado como parametro
	 * @return <ul>
	 *          <li>true: es una cadena de numeros</li>
	 *          <li>false: no es una cadena de numeros</li>
	 *         </ul>
	 */
>>>>>>> Mauro
	public static boolean esCadenaNros(String cadena) {
		boolean resultado=true;
		for(int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			if(!Character.isDigit(c)) {
				resultado=false;
			}
		}
		return resultado;
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo para saber si un String es una cadena
	 * de letras.
	 * @param cadena - Valor ingresado como parametro
	 * @return <ul>
	 *          <li>true: es una cadena de letras</li>
	 *          <li>false: no es una cadena de letras</li>
	 *         </ul>
	 */
>>>>>>> Mauro
	public static boolean esCadenaLetras(String cadena) {
		boolean resultado=true;
		for(int i=0;i<cadena.length();i++) {
			char c=cadena.charAt(i);
			if(!Character.isLetter(c)) {
				resultado=false;
			}
		}
		return resultado;
	}

<<<<<<< HEAD
=======
	/**
	 * Metodo para castear un valor de tipo entero.
	 * @param n - 
	 * @return parametro n casteado a double.
	 */
>>>>>>> Mauro
	public static double convertirADouble(int n) {
		
		return ((double) n);
	}
	
<<<<<<< HEAD
=======
	/**
	 * Metodo que recibe una lista de tipo generico y retorna un String
	 * con las posiciones de la lista y un salto de linea
	 * @param lista -Parametro generico.
	 * @return resultado : lista con los saltos de linea.
	 */
>>>>>>> Mauro
	public static<E> String imprimirLista  (List<E> lista) {
		String resultado = new String();
		for(E objeto : lista) {
			resultado += objeto.toString() + "\n";
		}
		return resultado;

  }
}