package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
public class Tarjeta {
	
	private int idTarjeta;
	private int kilometros;
	private Cliente cliente;
	private List<Compra> compras;
	public Tarjeta(int idTarjeta, Cliente cliente) {
		super();
		this.idTarjeta = idTarjeta;
		this.cliente = cliente;
		this.kilometros = 0;
		this.compras = new ArrayList<Compra>();
	}
	public int getIdTarjeta() {
		return idTarjeta;
	}
	public void setIdTarjeta(int idTarjeta) {
		this.idTarjeta = idTarjeta;
	}
	public int getKilometros() {
		return kilometros;
	}
	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Compra> getCompras() {
		return compras;
	}
	public void setCompras(List<Compra> compras) {
		this.compras = compras;
	}
	@Override
	public String toString() {
		return "Tarjeta [idTarjeta=" + idTarjeta + ", kilometros=" + kilometros + ", cliente=" + cliente + ", compras="
				+ compras + "]";
	}
	
	public boolean equals(Tarjeta tarjeta) {
		boolean resultado=false;
		if(this.idTarjeta==tarjeta.getIdTarjeta()) {
			resultado = true;
		}
		return resultado;
	}
	
	public boolean agregarCompra(Producto producto,GregorianCalendar fechaHora,double cantidad) {
		Compra compra = new Compra(producto,fechaHora,cantidad);
		this.kilometros += compra.calcularKms();
		return compras.add(compra);
	}
	
	

}
