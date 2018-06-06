package datos;
import funciones.Funciones;
import java.math.*;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.GregorianCalendar;
import funciones.Funciones;
import java.util.HashSet;
public class Prestamo {
	private long idPrestamo;
	private GregorianCalendar fecha;
	private double monto;
	private double interes;
	private int cantCuotas;
	private Cliente cliente;
	Set<Cuota> cuotas;
	
	public Prestamo() {}

	public Prestamo(GregorianCalendar fecha, double monto, double interes, int cantCuota, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.interes = interes;
		this.cantCuotas = cantCuota;
		this.cliente = cliente;
		setCuotas();
		
	}
	
	public long getIdPrestamo() {
		return idPrestamo;
	}
	
	protected void setIdPrestamo(long idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuota) {
		this.cantCuotas = cantCuota;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Set<Cuota> getCuotas(){
		return this.cuotas;
	}
	
	public void setCuotas(Set<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	 
	 
	public void setCuotas() {
		this.cuotas = new HashSet<Cuota>();
		double saldoPendiente=0;
		double amotizacion=0;
		double interesCuota=0;
		double cuota=0;
		double deuda=0;
		GregorianCalendar fechaVencimiento = null;
		for(int i=1; i<=cantCuotas;i++) {
			
			if(i==1) {
				saldoPendiente = this.monto;
				amotizacion = saldoPendiente/( Math.pow(1 + this.interes, i) - 1);
				interesCuota = saldoPendiente * this.interes;
				cuota = amotizacion + interesCuota;
				deuda = saldoPendiente - amotizacion;
				
				
				fechaVencimiento = Funciones.traerFechaProximo(new GregorianCalendar(), 30);
				Cuota c = new Cuota(i,fechaVencimiento,saldoPendiente,amotizacion,interesCuota,cuota,deuda,this);
				this.cuotas.add(c);
				
				
			}
			else {
				 
				amotizacion = saldoPendiente/( Math.pow(1 + this.interes, i) - 1);
				interesCuota = saldoPendiente * this.interes;
				cuota = amotizacion + interesCuota;
				deuda = saldoPendiente - amotizacion;
				saldoPendiente = saldoPendiente - amotizacion;
				
				fechaVencimiento = Funciones.traerFechaProximo(fechaVencimiento, 30);
				Cuota c = new Cuota(i,fechaVencimiento,saldoPendiente,amotizacion,interesCuota,cuota,deuda,this);
				this.cuotas.add(c);
				
				
				
			}
			
			
			
		}
	}
	
	/*
	public void setCuotas(){
		double mesAnterior = monto;
		this.cuotas = new ArrayList<Cuota>();
		
		for (int i=0; i<cantCuotas; i++){
			Cuota c = new Cuota (i+1);
			c.calcularCuota(mesAnterior,interes,cantCuotas, fecha);
			cuotas.add(c);
			mesAnterior = c.getDeuda();
		}
	}
	*/

	@Override
	public String toString() {
		return "Prestamo [fecha=" +Funciones.traerFechaCorta(fecha) + ", monto=" + monto + ", interes=" + interes + ", cantCuota=" + cantCuotas
				+ "]";
	}
	
	

}
