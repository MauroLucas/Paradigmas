package test;

import datos.Cliente;
import datos.Prestamo;
import negocio.ClienteABM;
import negocio.PrestamoABM;
import java.util.List;

public class TestTraerPrestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrestamoABM prestamoABM= new PrestamoABM();
		long idPrestamo=1;
		System.out.println("\n---> TraerPrestamo idPrestamo="+idPrestamo+"\n\n");
		try{
			Prestamo p=prestamoABM.traerPrestamo(idPrestamo);
			System.out.println(p+"\nPertenece a "+p.getCliente());
			ClienteABM clienteABM= new ClienteABM();
			int dni=14000000;
			Cliente c= clienteABM.traerCliente(dni);
			System.out.println("\n---> TraerPrestamos del Cliente="+c+"\n\n");
			List<Prestamo> prestamos=prestamoABM.traerPrestamo(c);
			if(prestamos.isEmpty()){
				System.out.println("El cliente no tiene prestamos otorgados.");
			}
			else{
				for(Prestamo o: prestamos){
					System.out.println(o+"\nPertenece a"+o.getCliente());
				}
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
