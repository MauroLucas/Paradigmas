package negocio;
import dao.ObservacionDao;
import datos.Observacion;
public class ObservacionABM {
	
	private static ObservacionABM instance = null;
	protected ObservacionABM() {}
	
	public static ObservacionABM getInstance() {
		if(instance==null) {
			instance = new ObservacionABM();
		}
		return instance;
	}
	
	public Observacion traerObservacion(int idObservacion) {
		return ObservacionDao.getInstance().traerObservacion(idObservacion);
	}

}
