package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
public class admVTV {
	
	private List<Persona> lstPersona;
	private List<Automotor> lstAutomotores;
	private List<Inspeccion> lstInspecciones;
	
	public admVTV() {
		this.lstPersona = new ArrayList<Persona>();
		this.lstAutomotores = new ArrayList<Automotor>();
		this.lstInspecciones = new ArrayList<Inspeccion>();
	}
	
	//Metodos para el manejo de lista personas//
	
	public boolean agregarInspector(String apellido,String nombre,int dni,int legajo)throws Exception {
		Inspector I = traerInspector(dni);
		if(I!=null)throw new Exception("Inspector existente");
		if(lstPersona.size()==0) {
			I = new Inspector(1,apellido,nombre,dni,legajo);
		}
		else {
			int id = lstPersona.get(lstPersona.size()-1).getIdPersona()+1;
			I = new Inspector(id,apellido,nombre,dni,legajo);
		}
		return lstPersona.add(I);
	}
	
	public boolean agregarContribuyente(String apellido,String nombre,int dni,boolean esExento)throws Exception {
		Contribuyente C = traerContribuyente(dni);
		if(C!=null)throw new Exception("Contribuyente existente");
		if(lstPersona.size()==0) {
			C = new Contribuyente(1,apellido,nombre,dni,esExento);
		}
		else {
			int id = lstPersona.get(lstPersona.size()-1).getIdPersona()+1;
			C = new Contribuyente(id,apellido,nombre,dni,esExento);
		}
		return lstPersona.add(C);
	}
	
	public Contribuyente traerContribuyente(int idPersona) {
		Contribuyente c = null;
		int i=0;
		boolean encontrado = false;
		while(i<lstPersona.size() && encontrado==false) {
			if(lstPersona.get(i).getDni()==idPersona) {
				if(lstPersona.get(i) instanceof Contribuyente) {
					c = (Contribuyente)lstPersona.get(i);
					encontrado = true;
				}
				
			}
			
			i++;
		}
		return c;
	}
	
	public Inspector traerInspector(int idPersona) {
		Inspector I = null;
		int i=0;
		boolean encontrado = false;
		while(i<lstPersona.size() && encontrado==false) {
			if(lstPersona.get(i).getDni()==idPersona) {
				if(lstPersona.get(i) instanceof Inspector) {
					I = (Inspector)lstPersona.get(i);
					encontrado = true;
				}
				
			}
			
			i++;
		}
		return I;
	}
	
	
	
	//
	
	//Metodos para el manejo de lista automotores//
	
	public Automotor traerAutomotor(String dominio) {
		Automotor a = null;
		int i = 0;
		boolean encontrado = false;
		while(i<lstAutomotores.size() && encontrado == false) {
			if(lstAutomotores.get(i).getDominio().equals(dominio)) {
				a = lstAutomotores.get(i);
				encontrado = true;
			}
			
			i++;
		}
		return a;
	}
	
	public boolean agregarAutomotor(String dominio,int modelo,String marca,Contribuyente contribuyente)throws Exception {
		if(contribuyente==null)throw new Exception("Contribuyente inexistente");
		Automotor automotor = traerAutomotor(dominio);
		if(automotor!=null)throw new Exception("Dominio existente");
		if(lstAutomotores.size()==0) {
			automotor = new Automotor(1,dominio,modelo,marca,contribuyente);
		}
		else {
			int id = lstAutomotores.get(lstAutomotores.size()-1).getIdAutomotor()+1;
			automotor = new Automotor(id,dominio,modelo,marca,contribuyente);
		}
		return lstAutomotores.add(automotor);
	}
	//
	
	//Metodos para el manejo de lista inspecciones//
	
	public Inspeccion traerInspeccion(int idInspeccion) {
		Inspeccion I = null;
		int i = 0;
		boolean encontrado = false;
		while(i<lstInspecciones.size() && encontrado == false) {
			if(lstInspecciones.get(i).getIdInspeccion()==idInspeccion) {
				I = lstInspecciones.get(i);
				encontrado = true;
			}
			i++;
		}
		return I;
	}
	
	public List<Inspeccion> traerInspeccion(Automotor automotor){
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		for(Inspeccion I : lstInspecciones) {
			if(I.getAutomotor().equals(automotor)) {
				lista.add(I);
			}
		}
		return lista;
	}
	
	public List<Inspeccion> traerInspeccion(GregorianCalendar fecha){
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		for(Inspeccion I : lstInspecciones) {
			if(Funciones.sonFechasHorasIguales(fecha, I.getFecha())) {
				lista.add(I);
			}
		}
		return lista;
	}
	
	public List<Inspeccion> traerInspeccion(Inspector inspector,GregorianCalendar fecha)throws Exception{
		if(inspector==null)throw new Exception("Inspector inexistente");
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		for(Inspeccion I : lstInspecciones) {
			if(I.getInspector().equals(inspector)) {
				if(Funciones.sonFechasHorasIguales(fecha, I.getFecha())) {
					lista.add(I);
				}
				
			}
			
		}
		return lista;
	}
	
	public List<Inspeccion> traerInspeccion(GregorianCalendar fecha,String estado){
		
		List<Inspeccion> lista = new ArrayList<Inspeccion>();
		for(Inspeccion I : lstInspecciones) {
			
				if(Funciones.sonFechasHorasIguales(fecha, I.getFecha()) && estado.equalsIgnoreCase(I.getEstado()) ) {
					lista.add(I);
				}
				
			
			
		}
		return lista;
	}
	
	
	public boolean agregarInspeccion(GregorianCalendar fecha,boolean estaPagado,String estado,Automotor automotor,Inspector inspector)throws Exception {
		Inspeccion inspeccion = null;
		if(automotor==null)throw new Exception("Automotor inexistente");
		if(inspector==null)throw new Exception("Inspector inexistente");
		if(lstInspecciones.size()==0) {
			inspeccion = new Inspeccion(1,fecha,estaPagado,estado,automotor,inspector);
		}
		else {
			int id = lstInspecciones.get(lstInspecciones.size()-1).getIdInspeccion()+1;
			inspeccion = new Inspeccion(id,fecha,estaPagado,estado,automotor,inspector);
			
		}
		return lstInspecciones.add(inspeccion);
		
	}
	//
	
	public String listaPersonas() {
		String resultado = new String("Personas: " + "\n");
		for(Persona p : lstPersona) {
			if(p instanceof Contribuyente) {
				Contribuyente con = (Contribuyente)p;
				resultado += con.toString() + "\n";
			}
			if(p instanceof Inspector) {
				Inspector ins = (Inspector)p;
				resultado += ins.toString() + "\n";
			}
		}
		return resultado;
	}
	
	public String listaAutomotor() {
		String resultado = new String("Automotores: " + "\n");
		for(Automotor a : lstAutomotores) {
			resultado += a.toString() + "\n";
		}
		return resultado;
	}
	public String listaInspecciones() {
		String resultado = mostrarInspecciones(this.lstInspecciones);
		return resultado;
	}
	
	public String mostrarInspecciones(List<Inspeccion> ins) {
		String resultado = "Inspecciones" + "\n";
		for(Inspeccion I : ins) {
			resultado += I.toString() + "\n";
		}
		return resultado;
		
	}
	
	

}
