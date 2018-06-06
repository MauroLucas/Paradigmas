package test;
import negocio.EventoABM;
import dao.EventoDao;
import funciones.Funciones;
import datos.Evento;
public class TestAgregarEvento {

	public static void main(String[] args) {
		try {
			EventoABM abm = new EventoABM();
			EventoDao dao = new EventoDao();
			//abm.agregar("partido", Funciones.traerFecha(2018, 05, 22, 15, 00, 00));
			//abm.agregar("partido2", Funciones.traerFecha(2018, 05, 22, 16, 00, 00));
			abm.agregar("partido22",Funciones.traerFecha(2018, 05, 22, 18, 00, 00));
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
