package datos;

public class Direccion {
	
	private long idDireccion;
	private String calle;
	private int numero;
	
	public Direccion() {}
	
	

	public Direccion(String calle, int numero) {
		super();
		this.calle = calle;
		this.numero = numero;
	}



	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	protected void setIdDireccion(long idDireccion){
		this.idDireccion = idDireccion;
	}
	
	public long getIdDireccion() {
		return idDireccion;
	}

}
