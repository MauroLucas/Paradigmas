package datos;

import java.util.GregorianCalendar;
import funciones.Funciones;
import java.util.Iterator;
import java.util.Set;

public class Cliente {
	
	private long idCliente;
	private String apellido;
	private String nombre;
	private int dni;
	private GregorianCalendar fechaDeNacimiento;
	private boolean baja;
	private Set<Evento> eventos;
	
	public Cliente(){}
	
	public Cliente(String apellido, String nombre, int dni, GregorianCalendar fechaDeNacimiento) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.baja = false;
	}

	public long getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(long idCliente) {
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean isBaja() {
		return baja;
	}

	public void setBaja(boolean baja) {
		this.baja = baja;
	}
	
	public Set<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(Set<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public boolean equals(Cliente c){
		return (dni==c.getDni());
	}
	
	public boolean agregar(Evento e){
		return eventos.add(e);
	}
	
	public boolean eliminar(Evento e){
		return eventos.remove(e);
	}
	
	public Evento traerEvento(long idEvento){
		Evento resultado=null;
		Iterator<Evento> iterator=eventos.iterator();
		while(iterator.hasNext() && resultado!=null){
			Evento setElement=iterator.next();
			if(idEvento==setElement.getIdEvento()){
				resultado=setElement;
			}
		}
		return resultado;
	}
	

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni
				+ ", fechaDeNacimiento=" + Funciones.traerFechaCorta(fechaDeNacimiento) + ", baja=" + baja + "]";
	}
	
	

}
