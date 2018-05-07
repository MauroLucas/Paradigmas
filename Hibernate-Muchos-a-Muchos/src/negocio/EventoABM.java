package negocio;

import java.util.GregorianCalendar;
import dao.*;
import datos.*;
import funciones.Funciones;


public class EventoABM {
	
	EventoDao dao= new EventoDao();
	ClienteDao daoC= new ClienteDao();
	
	public Evento traerEvento(long idEvento) throws Exception{
		Evento e=dao.traerEvento(idEvento);
		if(e==null) throw new Exception("ERROR: El evento no existe.");
		return e;
	}
	
	public int agregar(String evento, GregorianCalendar fecha) throws Exception{
		//if(dao.traerEvento(evento)!=null && Funciones.sonFechasHorasIguales(fecha,dao.traerEvento(evento).getFecha())) throw new Exception("ERROR: El evento ya existe.");
		return dao.agregar(new Evento(evento,fecha));
	}
	
	public void modificar(Evento e) {
		dao.actualizar(e);
	}
	
	public void eliminar(long idEvento) throws Exception {
		Evento e=dao.traerEvento(idEvento);
		if(e==null) throw new Exception("ERROR: El evento no existe.");
		dao.eliminar(e);
	}
	
	public void agregarCliente(long idEvento, int dni) throws Exception{
		Cliente c=daoC.traerCliente(dni);
		Evento e=traerEvento(idEvento);
		if(c==null) throw new Exception("El cliente no existe.");
		e.agregar(c);
		modificar(e);
	}
	
	public void eliminarCliente(long idEvento, int dni) throws Exception{
		Cliente c=daoC.traerCliente(dni);
		Evento e=traerEvento(idEvento);
		if(c==null) throw new Exception("El cliente no existe.");
		e.eliminar(c);
		modificar(e);
	}
	
	public Cliente traerCliente(long idEvento, int dni) throws Exception{
		Evento e=traerEvento(idEvento);
		return null;
	}
	
	

}
