package datos;

import java.util.GregorianCalendar;
import funciones.Funciones;
import java.util.Iterator;
import java.util.Set;

public class Evento {
	
	private long idEvento;
	private String evento;
	private GregorianCalendar fecha;
	private Set<Cliente> clientes;
	
	public Evento(){}

	public Evento(String evento, GregorianCalendar fecha) {
		super();
		this.evento = evento;
		this.fecha = fecha;
	}

	public long getIdEvento() {
		return idEvento;
	}

	protected void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public boolean equals(Evento e){
		return(evento.equals(e.getEvento()) && Funciones.sonFechasHorasIguales(fecha, e.getFecha()));
	}
	
	public boolean agregar(Cliente cliente){
		return clientes.add(cliente);
	}
	
	public boolean eliminar(Cliente cliente){
		return clientes.remove(cliente);
	}
	
	public String toString(){
		return idEvento+" "+evento+" "+Funciones.traerFechaCortaHora(fecha);
	}
	

}
