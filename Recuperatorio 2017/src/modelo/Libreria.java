package modelo;
import java.util.ArrayList;
import java.util.List;
public class Libreria {
	
	private List<Libro> lstLibros;
	private List<Cliente> lstClientes;
	private List<Venta> lstVentas;
	
	public Libreria() {
		lstLibros = new ArrayList<Libro>();
		lstClientes = new ArrayList<Cliente>();
		lstVentas = new ArrayList<Venta>();
	}
	
	// Metodos para el manejo de lista de clientes//
	public Cliente traerCliente(long dni) {
		Cliente cliente = null;
		boolean encontrado = false;
		for(int i=0;i<lstClientes.size() && encontrado==false;i++) {
			if(dni == lstClientes.get(i).getDni()) {
				cliente = lstClientes.get(i);
			}
		}
		return cliente;
	}
	
	public boolean agregarCliente(long dni,String apellido,String nombre)throws Exception {
		Cliente cliente = traerCliente(dni);
		if(cliente!=null)throw new Exception("Cliente existete");
		
		if(lstClientes.size()==0) {
			cliente = new Cliente(0,dni,apellido,nombre);
		}
		else {
			int id = lstClientes.get(lstClientes.size()-1).getIdCliente()+1;
			cliente = new Cliente(id,dni,apellido,nombre);
		}
		
		return lstClientes.add(cliente);
	}
	
	//
	
	//Metodos para el manejo de lista Libros//
	 public Libro traerLibro(int idLibro) {
		 Libro libro = null;
		 boolean encontrado = false;
		 int i=0;
		 while(i<lstLibros.size() && encontrado==false) {
			 if(lstLibros.get(i).getIdLibro()==idLibro) {
				 libro = lstLibros.get(i);
				 encontrado=true;
			 }
			 i++;
		 }
		 return libro;
	 }
	 
	 public Libro traerLibro(String isbn) {
		 Libro libro = null;
		 boolean encontrado = false;
		 int i=0;
		 while(i<lstLibros.size() && encontrado==false) {
			 if(lstLibros.get(i).getIsbn().equals(isbn)) {
				 libro = lstLibros.get(i);
				 encontrado = true;
			 }
			 
			 i++;
		 }
		 return libro;
	 }
	 
	 public boolean agregarLibro(String isbn,String titulo,String autores,String editorial,double precio)throws Exception {
		 Libro libro = traerLibro(isbn);
		 if(libro!=null)throw new Exception("Libro existente");
		 if(lstLibros.size()==0) {
			 libro = new Libro(0,isbn,titulo,autores,editorial,precio);
		 }
		 else {
			 int id = lstLibros.get(lstLibros.size()-1).getIdLibro()+1;
			 libro = new Libro(id,isbn,titulo,autores,editorial,precio);
		 }
		 
		 
		 return lstLibros.add(libro);
	 }
	
	//
	
	//Metodos para el manejo de lista Ventas//
	 
	 
	 
	 
	 public boolean agregarLibro(Cliente cliente,Libro libro,int cantidad)throws Exception {
		 
		 Venta venta = null;
		 if(cliente==null)throw new Exception("Cliente inexistente");
		 if(libro==null)throw new Exception("Libro inexistente");
		 int i=0;
		 boolean encontrado = false;
		 while(i<lstVentas.size() && encontrado == false) {
			 if(lstVentas.get(i).getCliente().equals(cliente)) {
				 venta = lstVentas.get(i);
				 encontrado = true;
			 }
			 i++;
		 }
		 return venta.agregarLibro(libro, cantidad);
		 
	 }
	 
	 public boolean eliminarLibro(Cliente cliente,Libro libro,int cantidad)throws Exception{
		 
		 Venta venta = null;
		 if(cliente==null)throw new Exception("Cliente inexistente");
		 if(libro==null)throw new Exception("Libro inexistente");
		 
		 return venta.agregarLibro(libro, cantidad);
		 
	 }
	
	
		//
	 
	 public boolean esValidoISBN(String isbn) {
		 boolean resultado = false;
		 Libro libro = new Libro();
		 if(libro.esValidoISBN(isbn)==true) {
			 resultado = true;
		 }
		 return resultado;
	 }
	
	

}


