package modelo;

public class PVerduleria extends Producto {
	
	private String unidadVenta;

	public PVerduleria(String nombre, float precio, String unidadVenta) {
		super(nombre, precio);
		this.unidadVenta = unidadVenta;
	}

	public String getUnidadVenta() {
		return unidadVenta;
	}

	public void setUnidadVenta(String unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	
	

	public String toString() {
		return "Nombre: " + this.nombre + " /// " + "Precio: $" + (int)this.precio + " /// " + "Unidad de venta: " + this.unidadVenta; 
	}
	

}
