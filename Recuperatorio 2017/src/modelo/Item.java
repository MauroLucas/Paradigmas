package modelo;

public class Item {
	
	private int idItem;
	private Libro libro;
	private int cantidad;
	public Item(int isItem, Libro libro, int cantidad) {
		super();
		this.idItem = isItem;
		this.libro = libro;
		this.cantidad = cantidad;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int isItem) {
		this.idItem = isItem;
	}
	public Libro getLibro() {
		return libro;
	}
	public void setLibro(Libro libro) {
		this.libro = libro;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Item [isItem=" + idItem + ", libro=" + libro + ", cantidad=" + cantidad + "]";
	}
	
	public boolean equals(Item item) {
		boolean resultado=false;
		if(item.getIdItem()==this.idItem) {
			resultado = true;
		}
		return resultado;
	}
	
	public void incrementar(int cantidad) {
		this.cantidad += cantidad;
	}
	
	public void decrementar(int cantidad) {
		this.cantidad -=cantidad;
	}

}
