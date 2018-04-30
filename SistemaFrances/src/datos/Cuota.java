package datos;

import java.util.GregorianCalendar;

public class Cuota {
	
	private int idCuota;
	private int nroCuota;
	private GregorianCalendar fechaVencimiento;
	private double saldoPendiente;
	private double amortizacion;
	private double interesCuota;
	private double cuota;
	private double deuda;
	private boolean cancelada;
	private GregorianCalendar fechaDePago;
	private double punitorios;
	
	public Cuota(){}
	
	public Cuota(int nroCuota, GregorianCalendar fechaVencimiento, double saldoPendiente, double amortizacion,
			double interesCuota, double cuota, double deuda) {
		super();
		this.nroCuota = nroCuota;
		this.fechaVencimiento = fechaVencimiento;
		this.saldoPendiente = saldoPendiente;
		this.amortizacion = amortizacion;
		this.interesCuota = interesCuota;
		this.cuota = cuota;
		this.deuda = deuda;
	}
	
	

	public int getIdCuota() {
		return idCuota;
	}

	protected void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
	}

	public int getNroCuota() {
		return nroCuota;
	}

	public void setNroCuota(int nroCuota) {
		this.nroCuota = nroCuota;
	}

	public GregorianCalendar getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(GregorianCalendar fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public double getSaldoPendiente() {
		return saldoPendiente;
	}

	public void setSaldoPendiente(double saldoPendiente) {
		this.saldoPendiente = saldoPendiente;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public double getInteresCuota() {
		return interesCuota;
	}

	public void setInteresCuota(double interesCuota) {
		this.interesCuota = interesCuota;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

	public boolean isCancelada() {
		return cancelada;
	}

	public void setCancelada(boolean cancelada) {
		this.cancelada = cancelada;
	}

	public GregorianCalendar getFechaDePago() {
		return fechaDePago;
	}

	public void setFechaDePago(GregorianCalendar fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	public double getPunitorios() {
		return punitorios;
	}

	public void setPunitorios(double punitorios) {
		this.punitorios = punitorios;
	}

	@Override
	public String toString() {
		return "Cuota [nroCuota=" + nroCuota + ", fechaVencimiento=" + fechaVencimiento + ", saldoPendiente="
				+ saldoPendiente + ", amortizacion=" + amortizacion + ", interesCuota=" + interesCuota + ", cuota="
				+ cuota + ", deuda=" + deuda + ", cancelada=" + cancelada + ", fechaDePago=" + fechaDePago
				+ ", punitorios=" + punitorios + "]";
	}
	
	
	

}
