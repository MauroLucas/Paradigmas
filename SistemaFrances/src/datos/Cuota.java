package datos;
import java.util.GregorianCalendar;

import funciones.Funciones;
public class Cuota {
	
	private int idCuota;
	private int nroCuota;
	private GregorianCalendar fechaVencimiento;
	private double saldoPendiente;
	private double amotizacion;
	private double interesCuota;
	private double cuota;
	private double deuda;
	private boolean cancelada;
	private GregorianCalendar fechaDePago;
	private double punitorios;
	public Prestamo prestamo;
	
	public Cuota() {}

	

	public Cuota(int nroCuota, GregorianCalendar fechaVencimiento, double saldoPendiente, double amotizacion,
			double interesCuota, double cuota, double deuda,Prestamo prestamo) {
		super();
		this.nroCuota = nroCuota;
		this.fechaVencimiento = fechaVencimiento;
		this.saldoPendiente = saldoPendiente;
		this.amotizacion = amotizacion;
		this.interesCuota = interesCuota;
		this.cuota = cuota;
		this.deuda = deuda;
		this.cancelada=false;
		this.fechaDePago = null;
		this.punitorios = 0;
		this.prestamo = prestamo;
		
	}
	public Cuota(int nroCuota) {
		this.nroCuota = nroCuota;
		this.fechaVencimiento = null;
		this.saldoPendiente = 0;
		this.amotizacion = 0;
		this.interesCuota = 0;
		this.cuota = 0;
		this.deuda = 0;
	}
    
    
	protected void setIdCuota(int idCuota) {
		this.idCuota = idCuota;
	}
	public int getIdCuota() {
		return idCuota;
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

	public double getAmotizacion() {
		return amotizacion;
	}

	public void setAmotizacion(double amotizacion) {
		this.amotizacion = amotizacion;
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
	
	

	public Prestamo getPrestamo() {
		return prestamo;
	}



	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}



	public void calcularCuota(double monto, double interes, int cantCuotas, GregorianCalendar fecha) {
   		
		
		
		
		setSaldoPendiente(monto);
		setAmotizacion((getSaldoPendiente()*interes)/(Math.pow((1+interes),cantCuotas-getNroCuota()+1)-1));
		setInteresCuota(interes*getSaldoPendiente());
		setCuota(getAmotizacion()+getInteresCuota());
		setDeuda(getSaldoPendiente()-getAmotizacion());
		setFechaVencimiento((fecha));
		
	
	
	
}//Cierra metodo

	@Override
	public String toString() {
		return "Cuota [nroCuota=" + nroCuota + ", fechaVencimiento=" + Funciones.traerFechaCorta(fechaVencimiento) + ", saldoPendiente="
				+ Funciones.aproximar2Decimal(saldoPendiente) + ", amotizacion =" + Funciones.aproximar2Decimal(amotizacion) + ", interesCuota=" + Funciones.aproximar2Decimal(interesCuota) + ", cuota="
				+ Funciones.aproximar2Decimal(cuota) + ", deuda=" + Funciones.aproximar2Decimal(deuda) + ", cancelada=" + cancelada + ", fechaDePago=" + Funciones.traerFechaCorta(fechaDePago)
				+ ", punitorios=" + punitorios + "]";
	}
	
	
	
	

}
