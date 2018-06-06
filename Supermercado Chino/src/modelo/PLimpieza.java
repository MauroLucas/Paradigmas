package modelo;

public class PLimpieza extends Producto {
	
	private String contenido;

	public PLimpieza(String nombre, float precio, String contenido) {
		super(nombre, precio);
		this.contenido = contenido;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	
	
	
	public String toString() {
		return "Nombre: " + this.nombre + " /// " + "Contenido: " + this.contenido + " /// " + "Precio: $"  + (int)this.precio; 
	}

}
