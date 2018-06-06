package negocio;
import dao.EventoDao;
import datos.Cliente;
import datos.Evento;
import java.util.GregorianCalendar;

import org.hibernate.Hibernate;
public class EventoABM {
	EventoDao dao = new EventoDao();
	
	public Evento traerEvento(long idEvento) {
		return dao.traerEvento(idEvento);
	}
	
	public Evento traerEvento(String evento) {
		return dao.traerEvento(evento);
	}
	
	public Evento traerEventoYClientes(long idEvento) {
		return dao.traerEventoYClientes(idEvento);
	}
	public Evento traerEventoYClientes(String evento) {
		return dao.traerEventoYClientes(evento);
	}
	
	public int agregar(String nombre,GregorianCalendar fechaHora)throws Exception  {
		if(dao.traerEvento(nombre)!=null)throw new Exception("Evento existente");
		Evento evento = new Evento(nombre,fechaHora);
		return dao.agregar(evento);
	}
	
	public void agregarCliente(Evento evento,Cliente cliente) {
		evento.agregar(cliente);
		dao.actualizar(evento);
	}
	
	

}
