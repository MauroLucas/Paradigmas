package modelo;

public class Cliente {
	
	private int idCliente;
	private String apellido;
	private String nombre;
	public Cliente(String apellido, String nombre) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
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
		return "Cliente [idCliente=" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + "]";
	}
	
	

}
