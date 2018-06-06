package datos;
import java.util.GregorianCalendar;
import java.util.Set;
public class Observacion {
	
	private int idObservacion;
	private int ordenPrioridad;
	private GregorianCalendar fechaHoraUtilizacion;
	private GregorianCalendar fechaHoraInicioExposicion;
	private GregorianCalendar fechaHoraFinExposicion;
	private int tiempoExposicion;
	private Observador observador;
	private ObjetoCeleste objetoCeleste;
	
	public Observacion() {}
	public Observacion(int ordenPrioridad, GregorianCalendar fechaHoraUtilizacion,
			GregorianCalendar fechaHoraInicioExposicion, GregorianCalendar fechaHoraFinExposicion, int tiempoExposicion,
			Observador observador, ObjetoCeleste objetoCeleste) {
		super();
		this.ordenPrioridad = ordenPrioridad;
		this.fechaHoraUtilizacion = fechaHoraUtilizacion;
		this.fechaHoraInicioExposicion = fechaHoraInicioExposicion;
		this.fechaHoraFinExposicion = fechaHoraFinExposicion;
		this.tiempoExposicion = tiempoExposicion;
		this.observador = observador;
		this.objetoCeleste = objetoCeleste;
	}
	
	protected void setIdObservacion(int idObservacion) {
		this.idObservacion = idObservacion;
	}
	
	public int getIdObservacion() {
		return idObservacion;
	}
	public int getOrdenPrioridad() {
		return ordenPrioridad;
	}
	public void setOrdenPrioridad(int ordenPrioridad) {
		this.ordenPrioridad = ordenPrioridad;
	}
	public GregorianCalendar getFechaHoraUtilizacion() {
		return fechaHoraUtilizacion;
	}
	public void setFechaHoraUtilizacion(GregorianCalendar fechaHoraUtilizacion) {
		this.fechaHoraUtilizacion = fechaHoraUtilizacion;
	}
	public GregorianCalendar getFechaHoraInicioExposicion() {
		return fechaHoraInicioExposicion;
	}
	public void setFechaHoraInicioExposicion(GregorianCalendar fechaHoraInicioExposicion) {
		this.fechaHoraInicioExposicion = fechaHoraInicioExposicion;
	}
	public GregorianCalendar getFechaHoraFinExposicion() {
		return fechaHoraFinExposicion;
	}
	public void setFechaHoraFinExposicion(GregorianCalendar fechaHoraFinExposicion) {
		this.fechaHoraFinExposicion = fechaHoraFinExposicion;
	}
	public int getTiempoExposicion() {
		return tiempoExposicion;
	}
	public void setTiempoExposicion(int tiempoExposicion) {
		this.tiempoExposicion = tiempoExposicion;
	}
	public Observador getObservador() {
		return observador;
	}
	public void setObservador(Observador observador) {
		this.observador = observador;
	}
	public ObjetoCeleste getObjetoCeleste() {
		return objetoCeleste;
	}
	public void setObjetoCeleste(ObjetoCeleste objetoCeleste) {
		this.objetoCeleste = objetoCeleste;
	}
	
	public int calcularTUtil(Observacion observacion) {
		return calcularTTr(observacion) + this.tiempoExposicion;
	}
	
	public int calcularTTr(Observacion observacion) {
		return calcularTAR(observacion) + calcularTDec(observacion);
		
		
	}
	
	public int calcularTDec(Observacion observacion) {
		float deltaDec = this.objetoCeleste.calcularDeltaDec(observacion.objetoCeleste);
        float velocidadDec = 0.12f;
        return (int)(deltaDec/velocidadDec);
	}
	
	public int calcularTAR(Observacion observacion) {
		float deltaAR = this.objetoCeleste.calcularDeltaAr(observacion.getObjetoCeleste());
		float velocidadAR = 0.09f;
		return (int)(velocidadAR/deltaAR);
	}
	
	@Override
	public String toString() {
		return "Observacion [idObservacion=" + idObservacion + ", ordenPrioridad=" + ordenPrioridad
				+ ", fechaHoraUtilizacion=" + fechaHoraUtilizacion + ", fechaHoraInicioExposicion="
				+ fechaHoraInicioExposicion + ", fechaHoraFinExposicion=" + fechaHoraFinExposicion
				+ ", tiempoExposicion=" + tiempoExposicion + ", observador=" + observador + ", objetoCeleste="
				+ objetoCeleste + "]";
	}
	
	
	
	
	
	
	
	

}
