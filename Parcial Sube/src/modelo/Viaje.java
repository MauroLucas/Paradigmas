package modelo;
import java.util.GregorianCalendar;
public class Viaje {
	
	private String linea;
	private double precio;
	private GregorianCalendar fechaHora;
	public Viaje(String linea, double precio, GregorianCalendar fechahora) {
		super();
		this.linea = linea;
		this.precio = precio;
		this.fechaHora = fechahora;
	}
	public String getLinea() {
		return linea;
	}
	public void setLinea(String linea) {
		this.linea = linea;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public GregorianCalendar getFechahora() {
		return fechaHora;
	}
	public void setFechahora(GregorianCalendar fechahora) {
		this.fechaHora = fechahora;
	}
	@Override
	public String toString() {
		return "Viaje [linea=" + linea + ", precio=" + precio + ", fechahora=" + Funciones.traerFechaCortaHora(fechaHora) + "]";
	}
	
	public boolean equals(Viaje viaje) {
		boolean resultado=false;
		if(Funciones.sonFechasHorasIguales(this.fechaHora,viaje.getFechahora() )) {
			resultado = true;
		}
		return resultado;
	}
	

}
