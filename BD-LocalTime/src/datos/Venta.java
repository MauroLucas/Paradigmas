package datos;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;
public class Venta {
	private GregorianCalendar fechaHora;
	private List<Llamada> lstLlamadas;
	
	public Venta() {}
	
	public Venta(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
		lstLlamadas = new ArrayList<Llamada>();
	}
	
	public Llamada traerLlamada(String numeroTelefonico) {
		Llamada llamada = null;
		boolean encontrado=false;
		int i=0;
		while(i<lstLlamadas.size() && encontrado==false) {
			if(lstLlamadas.get(i).getNumeroTelefonico().equals(numeroTelefonico)){
				encontrado = true;
			}
		}
		return llamada;
	}
	
	public boolean agregarLlamada(Llamada llamada) {
		return lstLlamadas.add(llamada);
	}

	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}

	public List<Llamada> getLstLlamadas() {
		return lstLlamadas;
	}

	public void setLstLlamadas(List<Llamada> lstLlamadas) {
		this.lstLlamadas = lstLlamadas;
	}
	
	
	

}
