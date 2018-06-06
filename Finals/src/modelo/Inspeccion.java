package modelo;
import java.util.GregorianCalendar;
public class Inspeccion {
	
	private int idInspeccion;
	private GregorianCalendar fecha;
	private boolean estaPagado;
	private String estado;
	private Automotor automotor;
	private Inspector inspector;
	public Inspeccion(int idInspeccion, GregorianCalendar fecha, boolean estaPagado, String estado, Automotor automotor,
			Inspector inspector) {
		super();
		this.idInspeccion = idInspeccion;
		this.fecha = fecha;
		this.estaPagado = estaPagado;
		this.estado = estado;
		this.automotor = automotor;
		this.inspector = inspector;
	}
	public int getIdInspeccion() {
		return idInspeccion;
	}
	public void setIdInspeccion(int idInspeccion) {
		this.idInspeccion = idInspeccion;
	}
	public GregorianCalendar getFecha() {
		return fecha;
	}
	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}
	public boolean isEstaPagado() {
		return estaPagado;
	}
	public void setEstaPagado(boolean estaPagado) {
		this.estaPagado = estaPagado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Automotor getAutomotor() {
		return automotor;
	}
	public void setAutomotor(Automotor automotor) {
		this.automotor = automotor;
	}
	public Inspector getInspector() {
		return inspector;
	}
	public void setInspector(Inspector inspector) {
		this.inspector = inspector;
	}
	@Override
	public String toString() {
		return "Inspeccion [idInspeccion=" + idInspeccion + ", fecha=" + Funciones.traerFechaCortaHora(fecha) + ", estaPagado=" + estaPagado
				+ ", estado=" + estado + ", automotor=" + automotor + ", inspector=" + inspector + "]";
	}
	
	public boolean equals(Inspeccion inspeccion) {
		boolean iguales = false;
		if(this.idInspeccion==inspeccion.getIdInspeccion()) {
			iguales = true;
		}
		return iguales;
	}
}
	