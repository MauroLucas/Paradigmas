package test;
import modelo.*;
import java.util.GregorianCalendar;
public class Test1 {

	public static void main(String[] args) {
		Empleado empleado = new Empleado("mauro","pereyra",(long)38301299,new GregorianCalendar(),(long)1856,(float)15.000);
		System.out.println(empleado.cocinar());
		Sistema s = new Sistema();
		s.agregarCliente(new Cliente("Mauro","Pereyra",(long)38301299,new GregorianCalendar(),10.59F));
		s.agregarCliente(new Cliente("Mauro","Pereyra",(long)38301299,new GregorianCalendar(),10.59F));
		s.agregarCliente(new Cliente("Mauro","Pereyra",(long)38301299,new GregorianCalendar(),10.59F));
		s.agregarEmpleado(empleado);
		System.out.println(s.cantClientes());
		System.out.println(s.cantEmpleados());
		
		
	}

}
