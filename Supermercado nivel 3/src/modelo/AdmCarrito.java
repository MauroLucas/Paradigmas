package modelo;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
public class AdmCarrito {
	
	 private List<Carrito> lstCarrito;
	 
	 public AdmCarrito() {
		 lstCarrito = new ArrayList<Carrito>();
	 }

	public List<Carrito> getLstCarrito() {
		return lstCarrito;
	}

	public String toString() {
		String resultado = new String("Carritos:" + "\n");
  	  for(Carrito c:lstCarrito) {
  		  resultado += " " + c.toString() + "\n";
  	  }
  	  
  	  
  	  return resultado;
    }
	
////ABM Carrito///////////////////
	//Pre Condicion: Si el cliente es el mismo la fechahora debe ser distinta
	public boolean agregarCarrito(GregorianCalendar fechahora,Cliente cliente)throws Exception {
		boolean resultado=false;
		if(cliente==null)throw new Exception("Cliente no encontrado");
		if(fechahora==null)throw new Exception("Fecha incorrecta");
		if(this.traerCarrito(fechahora)!=null)throw new Exception("Error:carrito existente");
	    if(lstCarrito.size()==0) {
	    	lstCarrito.add(new Carrito(1,fechahora,cliente));
	    	resultado=true;
	    }
	    else {
	    	int lastId=lstCarrito.get(lstCarrito.size()-1).getIdCarrito();
	    	lstCarrito.add(new Carrito(lastId+1,fechahora,cliente));
	    	resultado=true;
	    }
		
		return resultado;
	}
	
	public boolean eliminarCarrito(int idCarrito)throws Exception {
		
		Carrito c=traerCarrito(idCarrito);
		if(c==null)throw new Exception("Carrito inexistente");
		return lstCarrito.remove(c);
	}
	
	public Carrito traerCarrito(int idCarrito) {
		Carrito carrito = null;
		boolean encontrado=false;
		int i=0;
		while(i<lstCarrito.size() && encontrado==false) {
			if(lstCarrito.get(i).getIdCarrito()==idCarrito) {
				carrito=lstCarrito.get(i);
				encontrado=true;
			}
			i++;
		}
		return carrito;
		
	}
	
	public Carrito traerCarrito(GregorianCalendar fechahora) {
		
		Carrito carrito=null;
		boolean encontrado=false;
		int i=0;
		while(i<lstCarrito.size() && encontrado==false) {
			if(Funciones.sonFechasHorasIguales(fechahora, lstCarrito.get(i).getFechaHora())){
				carrito=lstCarrito.get(i);
				encontrado=true;
			}
			i++;
		}
	return carrito;
	}
	
	
	//////////////////////////

}
