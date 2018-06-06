package modelo;
import java.util.GregorianCalendar;
public class Venta {
	
	private Boleto boleto;
	private GregorianCalendar fechaHora;
	public Venta(Boleto boleto, GregorianCalendar fechaHora) {
		super();
		this.boleto = boleto;
		this.fechaHora = fechaHora;
	}
	public Boleto getBoleto() {
		return boleto;
	}
	public void setBoleto(Boleto boleto) {
		this.boleto = boleto;
	}
	public GregorianCalendar getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(GregorianCalendar fechaHora) {
		this.fechaHora = fechaHora;
	}
	

}
