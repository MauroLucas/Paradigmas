package modelo;
import java.util.GregorianCalendar;
public class Empleado extends Persona {
	private long legajo;
	private float sueldoMensual;
	
	public Empleado(String nombre,String apellido,long dni, GregorianCalendar fechaNacimiento,long legajo,float sueldoMensual) {
		super(nombre,apellido,dni,fechaNacimiento);
		this.legajo=legajo;
		this.sueldoMensual=sueldoMensual;
	}

	

	@Override
	public String toString() {
		return "Empleado [legajo=" + legajo + ", sueldoMensual=" + sueldoMensual + ", nombre=" + nombre + ", apellido="
				+ apellido + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	public String cocinar() {
		return "Estoy cocinando";
	}
	
	public String pagarCuota() {
		return "Estoy pagando la cuota";
	}



	public long getLegajo() {
		return legajo;
	}

	public void setLegajo(long legajo) {
		this.legajo = legajo;
	}

	public float getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(float sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}
	
	public String hablar() {
		return "Soy un empleado";
	}

}
