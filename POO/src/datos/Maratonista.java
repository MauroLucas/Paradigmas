package datos;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Esta Clase define una Maratonista.
 * Una Maratonista tiene datos de contacto como apellido,nombre,dni, sexo
 * y tiene datos que lo identifican como idMaratonista y nroChip.
 * Un Maratonista tiene un atributo tiempo que es el resultado de la diferencia entre el tiempo
 * inicial y el tiempo final.
 * @author Mauro Lucas Pereyra
 * @version 15/04/2018
 *
 */

public class Maratonista {
	private int idMaratonista;
	private String apellido;
	private String nombres;
	private int dni;
	private char sexo;
	private int nroChip;
	private LocalTime tiempo;
	/**
	 * Método Constructor de la Clase
	 */
	public Maratonista() {}
	/**
	 * Método Constructor de la Clase
	 * @param apellido - Valor ingresado por parametro.
	 * @param nombres - Valor ingresado por parametro.
	 * @param dni - Valor ingresado por parametro.
	 * @param sexo - Valor ingresado por parametro.
	 * @param nroChip - Valor ingresado por parametro.
	 * @param tiempo - Valor ingresado por parametro.
	 */
	
	
	public Maratonista(String apellido, String nombres, int dni, char sexo, int nroChip, LocalTime tiempo) {
		super();
		this.apellido = apellido;
		this.nombres = nombres;
		this.dni = dni;
		this.sexo = sexo;
		this.nroChip = nroChip;
		this.tiempo = tiempo;
	}


	/**
	 * Método para ingresar el id 
	 * @param idMaratonista - Valor ingresado por parametro.
	 */
	protected void setIdMaratonista(int idMaratonista) {
		this.idMaratonista = idMaratonista;
	}
	/**
	 * Método para obtener el id 
	 * @return idMaratonista - Retorna el id 
	 */
	
	public int getidMaratonista() {
		return idMaratonista;
	}


	/**
	 * Método para obtener el apellido
	 * @return - Retorna el apellido
	 */
	public String getApellido() {
		return apellido;
	}


	/**
	 * Método para ingresar el apellido
	 * @param apellido - Valor ingresado por parametro.
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	/**
	 * Método para obtener los nombres
	 * @return nombres - Retorna los nombres
	 */
	public String getNombres() {
		return nombres;
	}


	/**
	 * Método para ingresar lso nombres
	 * @param nombres - Valor ingresado por parametro.
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	/**
	 * Método para obtener el dni
	 * @return dni - Retorna el dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * Método para ingresar el dni
	 * @param dni - Valor ingresado por parametro.
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}


	/**
	 * Método para obtener el sexo
	 * @return sexo - Retorna el sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * Método para ingresar el sexo
	 * @param sexo - Valor ingresado por parametro.
	 */

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}


	/**
	 * Método para obtener el Numero de Chip
	 * @return nroChip - Retorna el Numero de Chip
	 */
	public int getNroChip() {
		return nroChip;
	}

	/**
	 * Método para ingresar el Numero de Chip
	 * @param nroChip - Valor ingresado por parametro.
	 */

	public void setNroChip(int nroChip) {
		this.nroChip = nroChip;
	}


	/**
	 * Método para obtener el tiempo que tardó de inicio a fin
	 * @return tiempo - Retorna el tiempo que tardó de inicio a fin
	 */
	public LocalTime getTiempo() {
		return tiempo;
	}

	/**
	 * Método para ingresar el tiempo
	 * @param tiempo - Valor ingresado por parametro.
	 */

	public void setTiempo(LocalTime tiempo) {
		this.tiempo = tiempo;
	}
	
	/**
	 * Método para ingresar el tiempo que tardó
	 * de inicio a fin
	 * @param ini - Valor ingresado por parametro.
	 * @param fin - Valor ingresado por parametro.
	 */
	public void setTiempo(LocalTime ini,LocalTime fin) {
		
    	LocalTime t = LocalTime.of(0,0);
    	Duration duration = Duration.between(ini, fin);
        t = t.plus(duration);
        setTiempo(t);
    	
    	
	}

	/**
	 * Método para mostrar la informacion del Maratonista
	 * @return String - Informacion del Maratonista
	 */

	@Override
	public String toString() {
		return "Maratonista [idMaratonista=" + idMaratonista + ", apellido=" + apellido + ", nombres=" + nombres
				+ ", dni=" + dni + ", sexo=" + sexo + ", nroChip=" + nroChip + ", tiempo=" + tiempo + "]";
	}
	
	
	
	
	
	
	

}
