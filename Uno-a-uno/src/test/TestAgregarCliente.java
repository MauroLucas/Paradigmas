package test;
import java.util.GregorianCalendar;
import negocio.ClienteABM;
public class TestAgregarCliente {

	public static void main(String[] args) {
		
		try {
			
		
		String apellido="Pereyra";
		String nombre="Mauro";
		
		GregorianCalendar fechaDeNacimiento=new GregorianCalendar();
		ClienteABM abm = new ClienteABM();
		abm.agregar(apellido, nombre, 12345678, fechaDeNacimiento);
		//System.out.println(ultimoIdCliente);
		}
		catch(Exception e) {
			System.out.print("Error" + e);
		}
	}

}
