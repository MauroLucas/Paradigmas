package datos;
import java.util.Set;
import java.util.GregorianCalendar;

public class Cliente {
	private long idCliente;
	private String apellido;
	private String nombre;
	private int dni;
	private boolean baja;
	private GregorianCalendar fechaDeNacimiento;
	private Set<Evento> eventos;
	
	public Cliente (){}

	public Cliente(String apellido, String nombre, int dni) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.baja=false;
	}
	
	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getApellido() {
		return apellido;
	}
    
	

	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public boolean equals(Cliente c) {
	  boolean equals=false;;
		if(c.getDni()==this.dni) {
		  equals = true;
	  }
		return equals;
	}
	
	public boolean agregar(Evento evento) {
		boolean agregar = false;
		if(evento!=null) {
			eventos.add(evento);
			agregar = true;
		}
		return agregar;
	}
	
	public boolean eliminar(Evento evento) {
		boolean eliminar = false;
		if(evento!=null) {
			eventos.remove(evento);
			eliminar = true;
		}
		return eliminar;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", baja=" + baja + "]";
	}
	
	
	

}
