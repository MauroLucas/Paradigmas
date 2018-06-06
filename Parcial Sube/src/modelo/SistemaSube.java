package modelo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
public class SistemaSube {
	
	private List<Pasajero> lstPasajero;
	
	public SistemaSube() {
		lstPasajero = new ArrayList<Pasajero>();
	}
	
	public void agregarPasajero(String nombre,String apellido,int dni)throws Exception {
		Pasajero pasajero = traerPasajero(dni);
		if(pasajero!=null)throw new Exception("Pasajero exsistente");
		lstPasajero.add(new Pasajero(nombre,apellido,dni));
	}
	
	public Pasajero traerPasajero(int dni) {
		Pasajero pasajero = null;
		boolean encontrado = false;
		for(int i=0;i<lstPasajero.size() && encontrado==false;i++) {
			if(lstPasajero.get(i).getDni()==dni){
				pasajero = lstPasajero.get(i);
				encontrado = true;
			}
		}
		return pasajero;
	}
	
	public List<Pasajero> traerPasajero(){
		return this.lstPasajero;
	}
	
	public void agregarTarjeta(Pasajero pasajero,String codigo)throws Exception {
		if(pasajero==null)throw new Exception("Pasajero inexistente");
		if(this.traerTarjeta(codigo)!=null)throw new Exception("Tarjeta existente");
		pasajero.agregarTarjeta(codigo);
	}
	
	public void cargarSaldo(Pasajero pasajero,double importe)throws Exception {
		if(pasajero==null)throw new Exception("Pasajero inexistente");
		pasajero.cargarTarjeta(importe);
	}
	
	public void agregarViaje(Pasajero pasajero,String linea,double precio,GregorianCalendar fechaHora)throws Exception {
		if(pasajero==null)throw new Exception("pasajero inexistente");
		pasajero.agregarViaje(linea, precio, fechaHora);
	}
	public Tarjeta traerTarjeta(String codigo) {
		Tarjeta tarjeta = null;
		boolean encontrado = false;
		for(int i=0;i<lstPasajero.size() && encontrado==false;i++) {
			tarjeta = lstPasajero.get(i).traerTarjeta(codigo);
			if(tarjeta!=null) {
				encontrado = true;
			}
		}
		return tarjeta;
	}
	
	public List<Viaje> traerViajes(Pasajero pasajero)throws Exception{
		List<Viaje> viajes = new ArrayList<Viaje>();
		if(pasajero==null)throw new Exception("Pasajero inexistente");
		List<Tarjeta> tarjetas = pasajero.getLstTarjetas();
		for(Tarjeta tarjeta : tarjetas) {
			for(Viaje viaje : tarjeta.getLstViajes()) {
				viajes.add(viaje);
			}
		}
		return viajes;
	}
	public List<Viaje> traerViajes(Tarjeta tarjeta)throws Exception{
		
		if(tarjeta==null)throw new Exception("Tarjeta Inexistente");
		return tarjeta.getLstViajes();
		
		
	}
	
    public List<Viaje> traerViajes(boolean estado){
    	List<Viaje> viajes = new ArrayList<Viaje>();
    	for(Pasajero pasajero : lstPasajero) {
    		for(Tarjeta tarjeta : pasajero.getLstTarjetas()) {
    			if(tarjeta.isEstado()==estado) {
    				for(Viaje viaje : tarjeta.getLstViajes()) {
    					viajes.add(viaje);
    				}
    		  }
    	  }
    	
        }
    	return viajes;	
    }
	
    public List<Viaje> traerViajes(GregorianCalendar fechaDesde,GregorianCalendar fechaHasta){
    	List<Viaje> viajes = new ArrayList<Viaje>();
    	for(Pasajero pasajero : lstPasajero) {
    		for(Tarjeta tarjeta : pasajero.getLstTarjetas()) {
    			for(Viaje viaje : tarjeta.getLstViajes()) {
    				if((viaje.getFechahora().after(fechaDesde) && viaje.getFechahora().before(fechaHasta)) || Funciones.sonFechasIguales(viaje.getFechahora(), fechaDesde) || Funciones.sonFechasIguales(viaje.getFechahora(), fechaHasta)) {
    					viajes.add(viaje);
    				}
    			}
    		}
    	}
    	return viajes;
    }
		
	
		
		
	
	
	
	public String listaViajes(List<Viaje> viajes) {
		String resultado = "Viajes" + "\n";
		for(Viaje viaje : viajes) {
			resultado += viaje.toString() + "\n";
		}
		return resultado;
	
	}

}
