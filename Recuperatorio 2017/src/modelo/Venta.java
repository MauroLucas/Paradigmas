package modelo;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
public class Venta {
	
	private int idVenta;
	private Cliente cliente;
	private GregorianCalendar fechaHora;
	private boolean cerrada;
	private List<Item> lstItem;
	public Venta(int idVenta, Cliente cliente) {
		super();
		this.idVenta = idVenta;
		this.cliente = cliente;
		this.fechaHora = new GregorianCalendar();
		this.cerrada = false;
		this.lstItem = new ArrayList<Item>();
	}
	public int getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public boolean isCerrada() {
		return cerrada;
	}
	public void setCerrada(boolean cerrada) {
		this.cerrada = cerrada;
	}
	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}
	public List<Item> getLstItem() {
		return lstItem;
	}
	
	//Metodos para manejo de lista Items//
	
	public Item traerItem(Libro libro) {
		Item item = null;
		boolean encontrado = false;
		int i=0;
		while(i<lstItem.size() && encontrado==false) {
			if(lstItem.get(i).getLibro().equals(libro)) {
				item = lstItem.get(i);
				encontrado = true;
			}
			i++;
		}
		return item;
	}
	
	public boolean agregarLibro (Libro libro,int cantidad)throws Exception {
		boolean resultado = false;
		if(libro==null)throw new Exception("Libro inexistente");
		Item item = traerItem(libro);
		if(item==null) {
			if(lstItem.size()==0) {
				lstItem.add(new Item(0,libro,cantidad));
			}
			else {
				int id = lstItem.get(lstItem.size()-1).getIdItem()+1;
				lstItem.add(new Item(id,libro,cantidad));
			}
			resultado = true;
		}
		else {
			item.incrementar(cantidad);
		}
		
		return resultado;
	}
	
	public boolean eliminarLibro (Libro libro,int cantidad)throws Exception {
		boolean resultado = false;
		if(libro==null)throw new Exception("Libro inexistente");
		Item item = traerItem(libro);
		if(item==null) {
			throw new Exception("Item inexistente");
		}
		else {
			if(item.getCantidad()>cantidad) {
				item.decrementar(cantidad);
			}
			else {
				lstItem.remove(item);
				resultado = true;
			}
		}
		
		return resultado;
	}
	
	
	
	
	
	//
	
	
	
	

}

