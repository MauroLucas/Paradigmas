package modelo;
import java.util.List;
import java.util.ArrayList;
public class Sistema {
	
	private List<Persona> lstPersonas;
	
	public Sistema() {
		lstPersonas = new ArrayList<Persona>();
	}
	
	public int cantEmpleados() {
		int cant=0;
		for(Persona p : lstPersonas) {
			if(p instanceof Empleado) {
				cant +=1;
			}
			
		}
		return cant;
	}
	
	public int cantClientes(){
		int cant=0;
		for(Persona p : lstPersonas) {
			if(p instanceof Cliente) {
				cant +=1;
			}
			
		}
		return cant;
		
	}
	
	public void agregarCliente(Cliente cliente ) {
		lstPersonas.add(cliente);
	}
	
	public void agregarEmpleado(Empleado empleado) {
		lstPersonas.add(empleado);
	}
	
	public String nombreClientes() {
		String resultado = new String();
		for(Persona p : lstPersonas) {
			if(p instanceof Cliente) {
				
				((Cliente) p).getSaldo();
			}
		}
		return resultado;
	}

}
