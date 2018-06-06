package datos;
import java.util.GregorianCalendar;
import java.util.Set;

import funciones.Funciones;
public class Evento {
	private long idEvento;
	private String evento;
	private GregorianCalendar fechaHora;
	private Set<Cliente> clientes;
	
	public Evento() {}
	
	

	public Evento(String evento, GregorianCalendar fechaHora) {
		super();
		this.evento = evento;
		this.fechaHora = fechaHora;
	}



	protected void setIdEvento(long idEvento) {
		this.idEvento = idEvento;
	}
	
	public long getIdEvento() {
		return idEvento;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Set<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(Set<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public boolean equals(Evento evento) {
		boolean equals=false;
		if(evento.getEvento().equalsIgnoreCase(this.evento)) {
			equals=true;
		}
		return equals;
		
	}
	
	public boolean agregar(Cliente cliente) {
		return clientes.add(cliente);
		
	}
	
	public boolean eliminar(Cliente cliente) {
		return clientes.remove(cliente);
		
	}



	@Override
	public String toString() {
		return "Evento [idEvento=" + idEvento + ", evento=" + evento + ", fechaHora=" + Funciones.traerFechaCortaHora(fechaHora) + "]";
	}
	
	
	
	

}
