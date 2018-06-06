package modelo;
import java.util.List;
import java.util.ArrayList;
import java.util.GregorianCalendar;
public class Funcion {
	
	private Teatro teatro;
	private String obra;
	private GregorianCalendar fechaHora;
	private double precioTope;
	private double porcentajeDescuento;
	private int cantFilas;
	private Boleto boletos[][];
	private List<Venta> lstVentas;
	public Funcion(Teatro teatro, String obra, GregorianCalendar fechaHora, double precioTope,
			double porcentajeDescuento, int cantFilas) {
		super();
		this.teatro = teatro;
		this.obra = obra;
		this.fechaHora = fechaHora;
		this.precioTope = precioTope;
		this.porcentajeDescuento = porcentajeDescuento;
		this.cantFilas = cantFilas;
		
		lstVentas = new ArrayList<Venta>();
	}
	
	public Boleto traerBoleto(int fila,int columna) {
		
		return boletos[fila][columna];
		
	}
	
	public void setBoletos() {
		double precio=0;
		
		for(int i=0;i<teatro.getCantidadFilas();i++) {
			for(int j=0;j<teatro.getCantidadColumnas();j++) {
				if(i<cantFilas) {
					
					precio=precioTope;
				}
				boletos[i][j] = new Boleto(teatro.traerButaca(i,j),precio);
			}
		}
	}
	
	public boolean agregarVenta(GregorianCalendar fechaHora,Boleto boleto) {
		
		
		Venta venta=null;
		if(estaVendido(boleto)) {
			venta.setBoleto(boleto);
			venta.setFechaHora(fechaHora);
		}
		return lstVentas.add(venta);
		
	}
	
	public boolean estaVendido(Boleto boleto) {
		boolean vendido=false;
		int i=0;
		while(i<lstVentas.size() && vendido==false) {
			if(lstVentas.get(i).getBoleto().equals(boleto)) {
				vendido=true;
			}
			i++;
		}
		return vendido;
		
	}
	
	
	
	
	

}
