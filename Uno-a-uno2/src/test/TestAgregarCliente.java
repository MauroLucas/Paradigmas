package test;
import java.util.GregorianCalendar;
import datos.Contacto;
import negocio.ClienteABM;
public class TestAgregarCliente {

	public static void main(String[] args) {
		
		try {
			
		
		String apellido="Carlos";
		String nombre="Ramon";
		Contacto contacto = new Contacto("pereyra.mauro","111","222");
		GregorianCalendar fechaDeNacimiento=new GregorianCalendar();
		ClienteABM abm = new ClienteABM();
		abm.agregar(apellido, nombre, 38301299, fechaDeNacimiento,contacto);
		//System.out.println(ultimoIdCliente);
		}
		catch(Exception e) {
			System.out.print("Error" + e);
		}
	}

}
