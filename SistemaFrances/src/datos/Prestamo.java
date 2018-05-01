package datos;

import java.util.GregorianCalendar;
import funciones.Funciones;
import java.util.Set;

public class Prestamo {
	
	private int idPrestamo;
	private GregorianCalendar fecha;
	private double monto;
	private double interes;
	private int cantCuotas;
	private Cliente cliente;
	private Set<Cuota> cuotas;
	
	public Prestamo(){}

	public Prestamo(GregorianCalendar fecha, double monto, double interes, int cantCuotas, Cliente cliente) {
		super();
		this.fecha = fecha;
		this.monto = monto;
		this.interes = interes;
		this.cantCuotas = cantCuotas;
		this.cliente = cliente;
		setCuotas();
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	protected void setIdPrestamo(int idPrestamo) {
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

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	public String toString(){
		String prestamo="Prestamo: $ "+monto+"\nFecha:"+Funciones.traerFechaCorta(fecha)+"\nInteres: "+interes+"\nCant.de Cuotas:"+cantCuotas;
		return prestamo;
		}

	public Set<Cuota> getCuotas() {
		return cuotas;
	}

	public void setCuotas() {
		int i=1;
		double saldo=0;
		GregorianCalendar vencimiento=new GregorianCalendar();
		for(i=1;i<=cantCuotas;i++){
			Cuota c=new Cuota();
			c.setNroCuota(i);
			c.setCancelada(false);
			if(i==1){
				c.setSaldoPendiente(monto);
				c.setAmortizacion((c.getSaldoPendiente()*interes)/(Math.pow((1+interes),cantCuotas)-1));
				c.setInteresCuota(c.getSaldoPendiente()*interes);
				c.setCuota(c.getAmortizacion()+c.getInteresCuota());
				c.setDeuda(c.getSaldoPendiente()-c.getAmortizacion());
				c.setSaldoPendiente(c.getSaldoPendiente()-c.getAmortizacion());
				saldo=c.getSaldoPendiente();
				vencimiento=Funciones.traerFechaProximo(fecha,Funciones.traerCantDiasDeUnMes(fecha.YEAR,fecha.MONTH+2));
				if(Funciones.esDiaHabil(vencimiento)){
					c.setFechaVencimiento(vencimiento);
				}
				else{
					while(!Funciones.esDiaHabil(vencimiento)){
						vencimiento=Funciones.traerFechaProximo(vencimiento,1);
					}
					c.setFechaVencimiento(vencimiento);
				}
			}
			else{
				c.setSaldoPendiente(saldo);
				c.setAmortizacion((c.getSaldoPendiente()*interes)/(Math.pow((1+interes),cantCuotas-1)-1));
				c.setInteresCuota(c.getSaldoPendiente()*interes);
				c.setCuota(c.getAmortizacion()+c.getInteresCuota());
				c.setDeuda(c.getSaldoPendiente()-c.getAmortizacion());
				c.setSaldoPendiente(c.getSaldoPendiente()-c.getAmortizacion());
				vencimiento=Funciones.traerFechaProximo(vencimiento,Funciones.traerCantDiasDeUnMes(fecha.YEAR,fecha.MONTH+2));
				if(Funciones.esDiaHabil(vencimiento)){
					c.setFechaVencimiento(vencimiento);
				}
				else{
					while(!Funciones.esDiaHabil(vencimiento)){
						vencimiento=Funciones.traerFechaProximo(vencimiento,1);
					}
					c.setFechaVencimiento(vencimiento);
				}
			}
			c.setPrestamo(this);
			cuotas.add(c);
		}
	}
	
	

}
