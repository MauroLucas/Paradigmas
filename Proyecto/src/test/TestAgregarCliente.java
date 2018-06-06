package test;
import java.util.GregorianCalendar;
import negocio.ClienteABM;
public class TestAgregarCliente {

	public static void main(String[] args) {
		
		String apellido="Pereyra";
		String nombre="Mauro";
		long dni=38301299;
		GregorianCalendar fechaDeNacimiento=new GregorianCalendar();
		ClienteABM abm = new ClienteABM();
		long ultimoIdCliente = abm.agregar(apellido, nombre, dni, fechaDeNacimiento);
		//System.out.println(ultimoIdCliente);
	}

}
