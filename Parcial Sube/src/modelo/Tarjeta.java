package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
public class Tarjeta {
	
	private String codigo;
	private boolean estado;
	private double saldo;
	private List<Viaje> lstViajes;
	public Tarjeta(String codigo) {
		super();
		this.codigo = codigo;
		this.estado = true;
		this.saldo = 0;
		this.lstViajes = new ArrayList<Viaje>();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public List<Viaje> getLstViajes() {
		return lstViajes;
	}
	@Override
	public String toString() {
		String resultado = "Tarjeta [codigo=" + codigo + ", estado=" + estado + ", saldo=" + saldo +  "\n";
		for(Viaje v : lstViajes) {
			resultado += v.toString() + "\n";
		}
		return resultado;
	}
	
	public boolean equals(Tarjeta tarjeta) {
		boolean resultado=false;
		if(this.codigo==tarjeta.getCodigo()) {
			resultado = true;
		}
		return resultado;
	}
	
	public void cargarTarjeta(double importe) {
		this.saldo +=importe;
	}
	
	public Viaje traerViaje(GregorianCalendar fechaHora) {
		Viaje viaje = null;
		boolean encontrado = false;
		for(int i=0;i<lstViajes.size() && encontrado==false;i++) {
			if(Funciones.sonFechasHorasIguales(fechaHora, lstViajes.get(i).getFechahora())) {
				viaje = lstViajes.get(i);
				encontrado = true;
			}
		}
		return viaje;
	}
	
	public void agregarViaje(String linea,double precio,GregorianCalendar fechaHora)throws Exception {
		if(traerViaje(fechaHora)!=null)throw new Exception("Existe un viaje en la misma fecha/hora");
		if((this.saldo - precio)<=-20)throw new Exception("Saldo insuficiente");
		lstViajes.add(new Viaje(linea,precio,fechaHora));
		this.saldo -=precio;
	}
	
	

}
