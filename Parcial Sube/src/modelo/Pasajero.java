package modelo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
public class Pasajero {
	
	private String nombre;
	private String apellido;
	private int dni;
	private List<Tarjeta> lstTarjetas;
	public Pasajero(String nombre, String apellido, int dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.lstTarjetas = new ArrayList<Tarjeta>();
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
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public List<Tarjeta> getLstTarjetas() {
		return lstTarjetas;
	}
	
	public boolean equals(Pasajero pasajero) {
		boolean resultado = false;
		if(pasajero.getDni()==this.dni) {
			resultado = true;
		}
		return resultado;
	}
	
	public void agregarTarjeta(String codigo) {
		if(lstTarjetas.size()==0) {
			lstTarjetas.add(new Tarjeta(codigo));
		}
		else {
			Tarjeta ultimaTarjeta = lstTarjetas.get(lstTarjetas.size()-1);
			Tarjeta tarjeta = new Tarjeta(codigo);
			tarjeta.setSaldo(ultimaTarjeta.getSaldo());
			ultimaTarjeta.setEstado(false);
			ultimaTarjeta.setSaldo(0);
			lstTarjetas.add(tarjeta);
		}
		
		
	}
	
	public Tarjeta traerTarjeta(String codigo) {
		Tarjeta tarjeta = null;
		boolean encontrado = false;
		for(int i=0;i<lstTarjetas.size() && encontrado==false;i++) {
			if(lstTarjetas.get(i).getCodigo()==codigo) {
				tarjeta = lstTarjetas.get(i);
				encontrado = true;
			}
		}
		return tarjeta;
	}
	
	public void cargarTarjeta(double importe) {
		Tarjeta ultimaTarjeta = lstTarjetas.get(lstTarjetas.size()-1);
		ultimaTarjeta.cargarTarjeta(importe);
	}
	public void agregarViaje(String linea,double precio,GregorianCalendar fechaHora)throws Exception {
		lstTarjetas.get(lstTarjetas.size()-1).agregarViaje(linea, precio, fechaHora);
	}
	@Override
	public String toString() {
		String resultado = "Pasajero [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni  + "\n";
		for(Tarjeta t : lstTarjetas) {
			resultado += t.toString() + "\n";
		}
		return resultado;
	}
	
	
	

}
