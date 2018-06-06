package negocio;

import dao.ContactoDao;
import datos.Contacto;
import datos.Cliente;
public class ContactoABM {
	
	ContactoDao dao = new ContactoDao();
	
	public Contacto traerContacto(long idContacto) {
		Contacto c = dao.traerContacto(idContacto);
		return c;
		
	}
	
	public int agregar(String email,String movil,String fijo,Cliente cliente)throws Exception {
		
		Contacto c = new Contacto(email,movil,fijo,cliente);
		
		return dao.agregar(c);
	}
	
	

}
