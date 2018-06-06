package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
public class SistemaYPF {
	
	private List<Cliente> clientes;
	private List<Producto> productos;
	private List<Tarjeta> tarjetas;
	
	public SistemaYPF() {
		clientes = new ArrayList<Cliente>();
		productos = new ArrayList<Producto>();
		tarjetas = new ArrayList<Tarjeta>();
	}
	
	//Métodos para el manejo de lista clientes//
	
	public Cliente traerCliente(long dni) {
		Cliente cliente = null;
		boolean encontrado = false;
		for(int i=0;i<clientes.size() && encontrado==false;i++) {
			if(clientes.get(i).getDni()==dni) {
				cliente = clientes.get(i);
				encontrado = true;
			}
		}
		return cliente;
	}
	
	public Cliente traerCliente(int idCliente) {
		Cliente cliente = null;
		boolean encontrado = false;
		for(int i=0;i<clientes.size() && encontrado==false;i++) {
			if(clientes.get(i).getIdCliente()==idCliente) {
				cliente = clientes.get(i);
				encontrado = true;
			}
		}
		return cliente;
	}
	
	public boolean agregarCliente(String nombre,String apellido,String email,long dni)throws Exception {
		Cliente cliente = traerCliente(dni);
		if(cliente!=null)throw new Exception("Cliente existente");
		if(clientes.size()==0) {
			cliente = new Cliente(0,nombre,apellido,email,dni);
		}
		else {
			int id = clientes.get(clientes.size()-1).getIdCliente()+1;
			cliente = new Cliente(id,nombre,apellido,email,dni);		
		}
		return clientes.add(cliente);
	}
	//
	
	//Métodos para el manejo de lista productos
	public Producto traerProducto(String nombre) {
		Producto producto = null;
		boolean encontrado = false;
		for(int i=0;i<productos.size() && encontrado==false;i++) {
			if(nombre.equalsIgnoreCase(productos.get(i).getNombre())) {
				producto = productos.get(i);
				encontrado = true;
			}
		}
		return producto;
	}
	
	public boolean agregarProducto(String nombre,double precio,String unidadDeMedida,double pesosPorKms)throws Exception {
		Producto producto = traerProducto(nombre);
		if(producto!=null)throw new Exception("Producto existente");
		if(productos.size()==0) {
			producto = new Producto(0,nombre,precio,unidadDeMedida,pesosPorKms);
		}
		else {
			int id = productos.get(productos.size()-1).getIdProducto()+1;
			producto = new Producto(id,nombre,precio,unidadDeMedida,pesosPorKms);
		}
		return productos.add(producto);
	}
	
	
	
	//
	
	//Métodos para el manejo de lista tarjetas
	
	public Tarjeta traerTarjeta(Cliente cliente) {
		Tarjeta tarjeta = null;
		boolean encontrado = false;
		for(int i=0;i<tarjetas.size() && encontrado==false;i++) {
			if(tarjetas.get(i).getCliente().equals(cliente)) {
				tarjeta = tarjetas.get(i);
				encontrado = true;
			}
		}
		return tarjeta;
	}
	public boolean agregarTarjeta(Cliente cliente)throws Exception {
		 
		 if(cliente==null)throw new Exception("Cliente inexistente");
		 Tarjeta tarjeta = traerTarjeta(cliente);
		 if(tarjeta!=null)throw new Exception("El cliente ya posee una tarjeta");
		 
		 if(tarjetas.size()==0) {
			 tarjeta = new Tarjeta(0,cliente);
		 }
		 else {
			 int id = tarjetas.get(tarjetas.size()-1).getIdTarjeta() + 1;
			 tarjeta = new Tarjeta(id,cliente);
		 }
		 return tarjetas.add(tarjeta);
	 }
	
	//Consultas//
	
	public List<Compra> traerCompras(Cliente cliente)throws Exception {
		if(cliente==null)throw new Exception("Cliente inexistente");
		return traerTarjeta(cliente).getCompras();
		
	}
	
	public List<Compra> traerCompras(GregorianCalendar desde,GregorianCalendar hasta){
		List<Compra> compras = new ArrayList<Compra>();
		for(Tarjeta t : tarjetas) {
			for(Compra c : t.getCompras()) {
				if( (c.getFechaHora().after(desde) && c.getFechaHora().before(hasta)) || Funciones.sonFechasHorasIguales(desde, c.getFechaHora()) || Funciones.sonFechasHorasIguales(hasta, c.getFechaHora())) {
					compras.add(c);
				}
			}
		}
		return compras;
	}
	
	public List<Compra> traerCompras(Cliente cliente,GregorianCalendar desde,GregorianCalendar hasta){
		List<Compra> compras =new ArrayList<Compra>();
		Tarjeta tarjeta = traerTarjeta(cliente);
		for(Compra c : tarjeta.getCompras()) {
			if( (c.getFechaHora().after(desde) && c.getFechaHora().before(hasta)) || Funciones.sonFechasHorasIguales(desde, c.getFechaHora()) || Funciones.sonFechasHorasIguales(hasta, c.getFechaHora())) {
				compras.add(c);
			}
			
		}
		return compras;
	}
	
	public List<Compra> traerCompras(Producto producto)throws Exception{
		List<Compra> compras =new ArrayList<Compra>();
		if(producto == null)throw new Exception("Producto inexistente");
		for(Tarjeta t : tarjetas) {
			for(Compra c : t.getCompras()) {
				if(c.getProducto().equals(producto)) {
					compras.add(c);
				}
			}
		}
		return compras;
	}
	public List<Compra> traerCompras(Producto producto,GregorianCalendar desde,GregorianCalendar hasta)throws Exception{
		List<Compra> compras =new ArrayList<Compra>();
		if(producto == null)throw new Exception("Producto inexistente");
		for(Tarjeta t : tarjetas) {
			for(Compra c : t.getCompras()) {
				if(c.getProducto().equals(producto)) {
					if( (c.getFechaHora().after(desde) && c.getFechaHora().before(hasta)) || Funciones.sonFechasHorasIguales(desde, c.getFechaHora()) || Funciones.sonFechasHorasIguales(hasta, c.getFechaHora())) {
						compras.add(c);
					}
				}
			}
		}
		return compras;
	}
	
	public double traerCantidadVendida(Producto producto) {
		double resultado=0;
		for(Tarjeta t : tarjetas) {
			for(Compra c : t.getCompras()) {
				if(c.getProducto().equals(producto)) {
					resultado += 1;
				}
			}
		}
		return resultado;
	}
	
	public double traerTotalDeVentas(Producto producto) {
		
		double cantidad = traerCantidadVendida(producto);
		return cantidad * producto.getPrecio(); 
	}
	
	//
	public String listaClientes() {
		String resultado = ("Clientes: " + "\n");
		for(Cliente cliente : clientes) {
			resultado += " " + cliente.toString() + "\n";
		}
		return resultado;
	}
	
	public String listaProductos() {
		String resultado = ("Productos: " + "\n");
		for(Producto producto : productos) {
			resultado += " " + producto.toString() + "\n";
		}
		return resultado;
	}
	
	public String listaTarjetas() {
		String resultado = "Tarjetas: " +"\n";
		for(Tarjeta tarjeta : tarjetas) {
			resultado += " " + tarjeta.toString() + "\n";
 		}
		return resultado;
	}
	
	public String listaCompras(List<Compra> compras) {
		String resultado=("Compras: " + "\n");{
			for(Compra compra : compras) {
				resultado += " " + compra.toString() + "\n";
			}
		}
		return resultado;
	}
	
	
	//
	
	public boolean agregarCompra(Cliente cliente,Producto producto,GregorianCalendar fechaHora,double cantidad)throws Exception {
		if(cliente==null)throw new Exception("Cliente inexistente");
		Tarjeta tarjeta = traerTarjeta(cliente);
		if(tarjeta==null)throw new Exception("El cliente no posee tarjeta");
		return tarjeta.agregarCompra(producto, fechaHora, cantidad);
		
	}

}
