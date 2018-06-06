package modelo;

import java.util.GregorianCalendar;

public class Cliente extends Persona {
	private float saldo;

	public Cliente(String nombre, String apellido, long dni, GregorianCalendar fechaNacimiento, float saldo) {
		super(nombre, apellido, dni, fechaNacimiento);
		this.saldo = saldo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public String hablar() {
		return "Soy un empleado";
	}

	@Override
	public String toString() {
		return "Cliente [saldo=" + saldo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	

}
