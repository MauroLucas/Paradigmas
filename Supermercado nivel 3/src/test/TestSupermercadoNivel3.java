package test;
import modelo.*;
import java.util.GregorianCalendar;
public class TestSupermercadoNivel3 {

	public static void main(String[] args) {
		
		
		try {
			
			Supermercado s = new Supermercado();
			//Productos//
			s.getAdmProducto().agregarProducto("patata", 10);
			s.getAdmProducto().agregarProducto("zanahoria", 10);
			s.getAdmProducto().agregarProducto("lechuga", 10);
			s.getAdmProducto().agregarProducto("mandarina", 10);
			s.getAdmProducto().agregarProducto("manzana", 10);
			
			//Clientes//
			s.getAdmCliente().agregarCliente("Mauro", 38301299, "cordero 540");
			s.getAdmCliente().agregarCliente("Roberto", 38301230, "amenedo 321");
			s.getAdmCliente().agregarCliente("Jose", 38301231, "segui 1845");
			
			//Carritos""
			s.getAdmCarrito().agregarCarrito(Funciones.traerFecha(2017, 10, 4,10,45,10), s.getAdmCliente().traerCliente(1));
			s.getAdmCarrito().agregarCarrito(Funciones.traerFecha(2017, 10, 5), s.getAdmCliente().traerCliente(2));
			s.getAdmCarrito().agregarCarrito(Funciones.traerFecha(2017, 10, 6), s.getAdmCliente().traerCliente(3));
			
			//agregar items a carrito//
			s.getAdmCarrito().traerCarrito(1).agregarItem(s.getAdmProducto().traerProducto(1),1);
			s.getAdmCarrito().traerCarrito(2).agregarItem(s.getAdmProducto().traerProducto(2),1);
			s.getAdmCarrito().traerCarrito(3).agregarItem(s.getAdmProducto().traerProducto(3),1);
			
			
			
			
			System.out.println(s);
			
		}
		
		catch(Exception e){
			System.out.println("Exception: " + e.getMessage());
		}

	}

}
