package datos;
import java.time.Duration;
import java.time.LocalTime;
public class Llamada {
	
	private String numeroTelefonico;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	
	public Llamada() {}
    public Llamada(String numeroTelefonico,LocalTime horaInicio,LocalTime horaFin) {
    	this.numeroTelefonico = numeroTelefonico;
    	this.horaInicio = horaInicio;
    	this.horaFin = horaFin;
    }
	public String getNumeroTelefonico() {
		return numeroTelefonico;
	}
	public void setNumeroTelefonico(String numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}
	public LocalTime getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}
	public LocalTime getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}
	
	public LocalTime duracionLlamada() {
		
		LocalTime resultado = LocalTime.of(0, 0,0);
		Duration duracion = Duration.between(getHoraInicio(), getHoraFin());
		resultado = resultado.plus(duracion);
		return resultado;
	}
	
    public boolean equals (Llamada llamada) {
    	boolean iguales=false;
    	if(llamada.getNumeroTelefonico().equals(this.numeroTelefonico)) {
    		iguales=true;
    	}
    	return iguales;
    }
	@Override
	public String toString() {
		return "Llamada [numeroTelefonico=" + numeroTelefonico + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin
				+ "]";
	}
    
    
}
