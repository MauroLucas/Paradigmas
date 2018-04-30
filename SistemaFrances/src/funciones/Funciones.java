package funciones;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Funciones {
	
	public static boolean esBisiesto(int anio) {
		return ((anio%4==0) && (!(anio%100==0 && anio%400!=0)));
	}
	
	public static int traerAnio(GregorianCalendar fecha) {
		return fecha.get(Calendar.YEAR);
	}

	public static int traerMes(GregorianCalendar fecha) {
		return fecha.get(Calendar.MONTH)+1;
	}
	
	public static int traerDia(GregorianCalendar fecha) {
		return fecha.get(Calendar.DAY_OF_MONTH);
	}
	
	public static boolean esFechaValida(int anio, int mes, int dia) {
		boolean valido=true;
		if(anio<1900){
			valido=false;
		}
	
		if(mes>12 || mes<1){
			valido=false;
		}
		
		if(dia>Funciones.traerCantDiasDeUnMes(anio, mes) || dia<1){
			valido=false;
		}
		
		return valido;
	}

	public static GregorianCalendar traerFecha(int anio, int mes, int dia) {
	GregorianCalendar fecha= null;
	if(Funciones.esFechaValida(anio, mes, dia)){
		fecha= new GregorianCalendar(anio, mes-1, dia);
		fecha.setTime(fecha.getTime());
	}
	return fecha;
	}
	
	public static GregorianCalendar traerFecha(int anio, int mes, int dia, int hs, int min, int seg) {
		GregorianCalendar fecha= null;
		if(Funciones.esFechaValida(anio, mes, dia)){
			fecha= new GregorianCalendar(anio, mes-1, dia, hs, min, seg);
			fecha.setTime(fecha.getTime());
		}
		return fecha;
		}
	
	public static GregorianCalendar traerFecha(String fecha) {
		String[] datos= new String[2];
		GregorianCalendar fechagregorian=null;
		if(fecha.length()==10 && fecha.charAt(2)=='/' && fecha.charAt(5)=='/'){
			datos=fecha.split("/"); //datos[0]=dia, datos[1]=mes, datos[2]=año  
		}
		if(Funciones.esCadenaNumeros(datos[0]) && Funciones.esCadenaNumeros(datos[1]) && Funciones.esCadenaNumeros(datos[2])){
		fechagregorian=	Funciones.traerFecha(Integer.valueOf(datos[2]), Integer.valueOf(datos[1]), Integer.valueOf(datos[0]));
		}
		return fechagregorian;	
	}

	public static String traerFechaCorta(GregorianCalendar fecha) {
		return (String.valueOf(fecha.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(fecha.get(Calendar.MONTH)+1)+"/"+String.valueOf(fecha.get(Calendar.YEAR)));
	}
	
	public static String traerFechaCortaHora(GregorianCalendar fecha) {
		return (Funciones.traerFechaCorta(fecha)+" "+fecha.get(Calendar.HOUR_OF_DAY)+":"+fecha.get(Calendar.MINUTE)+":"+fecha.get(Calendar.SECOND));
	}
	
	public static GregorianCalendar traerFechaProximo(GregorianCalendar fecha, int cantDias) {
		GregorianCalendar fechaproximo= (GregorianCalendar)fecha.clone(); //clone retorna object(necesita casteo)
		fechaproximo.add(Calendar.DAY_OF_YEAR, cantDias);
		return fechaproximo;
	}
	
	public static boolean esDiaHabil(GregorianCalendar fecha) {
		return (fecha.get(Calendar.DAY_OF_WEEK)==1 || fecha.get(Calendar.DAY_OF_WEEK)==7);
	}
	
	public static String traerDiaDeLaSemana(GregorianCalendar fecha) {
		String[] dias={"Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado"};
		return dias[fecha.get(Calendar.DAY_OF_WEEK)-1];
	}
	
	public static String traerMesEnLetras(GregorianCalendar fecha) {
		String[] meses={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		return meses[fecha.get(Calendar.MONTH)];
	}
	
	public static String traerFechaLarga(GregorianCalendar fecha) {
		return (Funciones.traerDiaDeLaSemana(fecha)+" "+fecha.get(Calendar.DAY_OF_MONTH)+" de "+Funciones.traerMesEnLetras(fecha)+" de "+fecha.get(Calendar.YEAR));
	}
	
	public static boolean sonFechasIguales(GregorianCalendar fecha, GregorianCalendar fecha1) {
		return (fecha.get(Calendar.DAY_OF_MONTH)==fecha1.get(Calendar.DAY_OF_MONTH) && fecha.get(Calendar.MONTH)==fecha1.get(Calendar.MONTH) && fecha.get(Calendar.YEAR)==fecha1.get(Calendar.YEAR));
	}
	
	public static boolean sonFechasHorasIguales(GregorianCalendar fecha, GregorianCalendar fecha1) {
		return (Funciones.sonFechasIguales(fecha, fecha1) && fecha.get(Calendar.HOUR_OF_DAY)==fecha1.get(Calendar.HOUR_OF_DAY) && fecha.get(Calendar.MINUTE)==fecha1.get(Calendar.MINUTE) && fecha.get(Calendar.SECOND)==fecha1.get(Calendar.SECOND));
	}
	
	public static int traerCantDiasDeUnMes(int anio, int mes) {
		int[] cantdias={31,28,31,30,31,30,31,31,30,31,30,31};
		if(Funciones.esBisiesto(anio)){
			cantdias[1]=29;
		}
		return cantdias[mes-1];
	}
	
	public static double aproximar2Decimales(double valor) {
		return Math.round(valor*100.0)/100.0;
	}
	
	public static boolean esNumero(char c) {
		return (Character.isDigit(c));
	}
	
	public static boolean esLetra(char c) {
		return (Character.isAlphabetic(c));
	}
	
	public static boolean esCadenaNumeros(String cadena) {
		boolean numerica=true;
		int i=0;
		char c;
		while(numerica && i<cadena.length()){
				c=cadena.charAt(i);
				if(!Character.isDigit(c)){
					numerica=false;
				}
				i++;
		}
		return numerica;
	}
	
	public static boolean esCadenaLetras(String cadena) {
		boolean alfabetica=true;
		int i=0;
		char c;
		while(alfabetica && i<cadena.length()){
				c=cadena.charAt(i);
				if(!Character.isAlphabetic(c)){
					alfabetica=false;
				}
				i++;
		}
		return alfabetica;
	}
	
	public static double convertirADouble(int n) {
		return((double)n);
	}
	
	public static<E> String imprimirLista(List<E> lista){
		String resultado="Lista: \n";
		for(E objeto : lista){
			resultado+=objeto.toString()+"\n";
		}
		return resultado;
	}
	
	
}
