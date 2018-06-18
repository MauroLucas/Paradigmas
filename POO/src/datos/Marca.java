package datos;

import java.time.LocalTime;


/**
 * Esta Clase define una Marca.
 * Una marca es registro de tiempo de un maratonista.
 * @author Mauro Lucas Pereyra
 * @version 15/04/2018
 *
 */
public class Marca {
	private int idMarca;
	private Maratonista maratonista;
	private LocalTime hora;
	
	/**
	 * Metodo Constructor de la Clase
	 */
	public Marca() {}
	/**
	 * Metodo Constructor de la Clase
	 * @param maratonista - Valor ingresado por parametro.
	 * @param hora - Valor ingresado por parametro.
	 */
	public Marca(Maratonista maratonista, LocalTime hora) {
		super();
		this.maratonista = maratonista;
		this.hora = hora;
	}

	/**
	 * Metodo para ingresar el id de la Marca
	 * @param idMarca - Valor ingresado por parametro.
	 */
	protected void setIdMarca(int idMarca) {
		this.idMarca = idMarca;
	}
	/**
	 * Metodo para obtener el id de la Marca
	 * @return idMarca - Retorna el id de la Marca
	 */
	
	public int getIdMarca() {
		return idMarca;
	}
	/**
	 * Metodo para obtener el Maratonista de la Marca
	 * @return maratonista -Retorna el Maratonista.
	*/

	public Maratonista getMaratonista() {
		return maratonista;
	}
	
	/**
	 * Metodo para ingresar el Maratonista de la Marca
	 * @param maratonista - Valor ingresado por parametro.
	 */

	public void setMaratonista(Maratonista maratonista) {
		this.maratonista = maratonista;
	}
	
	/**
	 * Metodo para obtener el registro de tiempo
	 * @return hora -Retorna el tiempo del maratonista.
	*/

	public LocalTime getHora() {
		return hora;
	}
	/**
	 * Metodo para ingresar la hora de la Marca
	 * @param hora - Valor ingresado por parametro.
	 */

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	/**
	 * Metodo para mostrar la informacion de la Marca
	 * @return String - Informacion de la Marca
	 */

	@Override
	public String toString() {
		return "Marca [idMarca=" + idMarca + ", maratonista=" + maratonista + ", hora=" + hora + "]";
	}

	

	

	

	

	
	
	
	
	
	

}
