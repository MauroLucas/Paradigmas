package dao;
import dao.ClienteDao;
import datos.Cliente;
import datos.PersonaJuridica;

public class TestUpdate {

	public static void main(String[] args) {
		ClienteDao dao = new ClienteDao();
		Cliente c = dao.traer((long)1);
		
		PersonaJuridica pj = (PersonaJuridica)c;
		
		
		
		dao.actualizar(pj);
		

	}

}
