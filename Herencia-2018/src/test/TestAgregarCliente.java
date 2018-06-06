package test;
import dao.ClienteDao;
import datos.PersonaFisica;
import datos.PersonaJuridica;
import negocio.ClienteABM;
public class TestAgregarCliente {

	public static void main(String[] args) {
		try {
			ClienteABM.getInstance().agregarPersonaFisica("10101", "gonzales", "carlos", 38301298);
		}catch(Exception e) {
			System.out.println(e);
		}


	}

}
