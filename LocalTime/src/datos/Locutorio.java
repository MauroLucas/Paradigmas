package datos;
import java.util.List;

import funciones.Funciones;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;
public class Locutorio {
	
	private List<Venta> lstVentas;
	
	public Locutorio() {
	 lstVentas = new ArrayList<Venta>();	
	}

	public List<Venta> getLstVentas() {
		return lstVentas;
	}
	public boolean agregarVenta(Venta venta) {
		return lstVentas.add(venta);
	}

	public void setLstVentas(List<Venta> lstVentas) {
		this.lstVentas = lstVentas;
	}
	
	public List<Llamada> llamadasRealizadas(GregorianCalendar diaDesde,GregorianCalendar diaHasta) {
		List<Llamada> llamadas = new ArrayList<Llamada>();
		for(int i=0;i<lstVentas.size();i++) {
			GregorianCalendar fechaHora = lstVentas.get(i).getFechaHora();
			if((fechaHora.after(diaDesde) && fechaHora.before(diaHasta)) || Funciones.sonFechasHorasIguales(fechaHora, diaDesde) || Funciones.sonFechasHorasIguales(fechaHora, diaHasta)) {
				for(Llamada l : lstVentas.get(i).getLstLlamadas()) {
					llamadas.add(l);
				}
			}
		}
		return llamadas;
	}
	
	public List<Llamada> llamadasRealizadas(GregorianCalendar dia,LocalTime horaDesde,LocalTime horaHasta){
		List<Llamada> llamadas = new ArrayList<Llamada>();
		
		for(int i=0;i<lstVentas.size();i++) {
			if(Funciones.sonFechasIguales(lstVentas.get(i).getFechaHora(),dia)) {
				
				
				for(Llamada l: lstVentas.get(i).getLstLlamadas()) {
					if(l.getHoraInicio().isAfter(horaDesde) && l.getHoraFin().isBefore(horaHasta) || l.getHoraInicio().equals(horaDesde) || l.getHoraFin().equals(horaHasta)) {
						llamadas.add(l);
					}
				}
			}
		}
		return llamadas;
	}
	
	public List<Llamada> llamadasRealizadas(LocalTime hora){
		List<Llamada> llamadas = new ArrayList<Llamada>();
		for(int i=0;i<lstVentas.size();i++) {
			for(Llamada l :lstVentas.get(i).getLstLlamadas()) {
				if(hora.isAfter(l.getHoraInicio()) && hora.isBefore(l.getHoraFin())  || hora.equals(l.getHoraInicio()) || hora.equals(l.getHoraFin())   ) {
					llamadas.add(l);
				}
			}
		}
		return llamadas;
	}
	
	
	

}
