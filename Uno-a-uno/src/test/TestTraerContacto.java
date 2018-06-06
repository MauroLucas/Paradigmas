package test;
import negocio.ContactoABM;
public class TestTraerContacto {

	public static void main(String[] args) {
		try {
			ContactoABM abm = new ContactoABM();
			long id =1 ;
			System.out.println(abm.traerContacto(id));
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
