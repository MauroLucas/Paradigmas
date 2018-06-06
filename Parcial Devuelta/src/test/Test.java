package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		SistemaYPF ypf = new SistemaYPF();
		try {
			System.out.println("1)");
			ypf.agregarCliente("Micaela","Hidalgo", "mhidalgo@gmail.com", 11111111);
			ypf.agregarCliente("Juan", "Lopez", "jlopez@gmail.com", 22222222);
			ypf.agregarCliente("Daniela","Rojas", "drojas@gmail.com", 33333333);
			ypf.agregarCliente("Lucas","Suarez","lsuarez@gmail.com", 44444444);
			
			System.out.println(ypf.listaClientes());
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		try {
			System.out.println("2)");
			
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
