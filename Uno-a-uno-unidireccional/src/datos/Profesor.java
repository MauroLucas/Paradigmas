package datos;

public class Profesor {
	private long idProfesor;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	public Profesor() {}

	public Profesor(String nombre, String apellido,Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	protected void setIdProfesor(long idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public long getIdProfesor() {
		return idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
	
	

}
