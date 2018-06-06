package modelo;

public class Cliente {
	
	private int idCliente;
	private long dni;
	private String apellido;
	private String nombre;
	public Cliente(int idCliente, long dni, String apellido, String nombre) {
		super();
		this.idCliente = idCliente;
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre
				+ "]";
	}
	
	public boolean equals(Cliente cliente) {
		boolean resultado = false;
		if(cliente.getDni()==this.dni) {
			resultado = true;
		}
		return resultado;
	}

}
