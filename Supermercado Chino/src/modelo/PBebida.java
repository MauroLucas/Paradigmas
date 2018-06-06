package modelo;

public class PBebida extends Producto {
	
	private float litros;

	public PBebida(String nombre, float precio, float litros) {
		super(nombre, precio);
		this.litros = litros;
	}

	public float getLitros() {
		return litros;
	}

	public void setLitros(float litros) {
		this.litros = litros;
	}
	
	

	public String toString() {
		return "Nombre: " + this.nombre + " /// " + "Litros: " + this.litros + " /// " + "Precio: $" + (int)this.precio; 
	}
	
	

}
