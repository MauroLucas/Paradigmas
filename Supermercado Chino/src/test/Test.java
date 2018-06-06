package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		
		Supermercado supermercado = new Supermercado();
		Test.cargarProductos(supermercado);
		System.out.print(supermercado);
		
		System.out.println("=============================");
		System.out.println("Producto más caro: " + supermercado.productoMasCaro().getNombre());
		System.out.println("Producto más barato: " + supermercado.productoMasBarato().getNombre());

	}
	
	public static void cargarProductos(Supermercado s) {
		try {
			
			 s.agregarProducto(new PBebida("Coca-Cola Zero",20,1.5F));
			 s.agregarProducto(new PBebida("Coca-Cola",18,1.5F));
			 s.agregarProducto(new PLimpieza("Shampoo Sedal",19,"500ml"));
			 s.agregarProducto(new PVerduleria("Frutillas",64,"kilo"));
			 
			 
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
