package modelo;
import java.util.ArrayList;
import java.util.List;
public class Supermercado {
	
	private List<Producto> lstProductos;
	
	public Supermercado() {
		this.lstProductos = new ArrayList<Producto>();
	}
	
	public Producto traerProducto(String nombre) {
		Producto p = null;
		boolean encontrado = false;
		int i=0;
		while(i<lstProductos.size() && encontrado == false) {
			if(lstProductos.get(i).getNombre().equalsIgnoreCase(nombre)) {
				p = lstProductos.get(i);
			}
			i++;
		}
		return p;
	}
	
	
	
	public Producto productoMasCaro() {
		Producto producto = lstProductos.get(0);
		for(Producto p : lstProductos) {
			if(p.getPrecio()>producto.getPrecio()) {
				producto = p;
			}
		}
		return producto;
	}
	
	public Producto productoMasBarato() {
		Producto producto = lstProductos.get(0);
		for(Producto p : lstProductos) {
			if(p.getPrecio()<producto.getPrecio()) {
				producto = p;
			}
		}
		return producto;
	}
	
	public boolean agregarProducto(PVerduleria producto)throws Exception {
		
		if (traerProducto(producto.getNombre())!=null)throw new Exception("Error: Producto existente");
		return lstProductos.add(producto);
	}
	
	public boolean agregarProducto(PLimpieza producto)throws Exception {
		if (traerProducto(producto.getNombre())!=null)throw new Exception("Error: Producto existente");
		return lstProductos.add(producto);
	}
	
	public boolean agregarProducto(PBebida producto)throws Exception {
		if (traerProducto(producto.getNombre())!=null)throw new Exception("Error: Producto existente");
		return lstProductos.add(producto);
	}
	
	
	
	public String toString() {
		String resultado = new String();
		for(Producto p : lstProductos) {
			
			resultado += p.toString() + "\n";
		}
		
		return resultado;
	}

}
