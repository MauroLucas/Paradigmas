package modelo;
import java.util.ArrayList;
import java.util.List;
public class AdmCliente {
	private List<Cliente> lstCliente;
	public AdmCliente() {
		lstCliente = new ArrayList<Cliente>();
	}
	public List<Cliente> getLstCliente() {
		return lstCliente;
	}
	public String toString() {
  	  String resultado = new String("Clientes:" + "\n");
  	  for(Cliente c: lstCliente) {
  		  
  		  resultado += " " +c.toString() + "\n";
  	  }
  	  return resultado;
    }
	
////ABM Cliente//////////////////
	public boolean agregarCliente(String cliente,long dni,String direccion)throws Exception {
		boolean resultado=false;
		Cliente c = traerCliente(dni);
		if(c!=null)throw new Exception("Cliente existente");
		if(lstCliente.size()==0) {
			lstCliente.add(new Cliente (1,cliente,dni,direccion));
			resultado=true;
		}
		else {
			int lastId=lstCliente.get(lstCliente.size()-1).getIdCliente();
			lstCliente.add(new Cliente(lastId+1,cliente,dni,direccion));
			resultado=true;
		}
		
		
		return resultado;
		
	}
	
	//Pre Condicion: El cliente no debe tener carritos asignados//
	public boolean eliminarCliente(int idCliente,Supermercado s)throws Exception {
		Cliente c=traerCliente(idCliente);
		if(c==null)throw new Exception("Cliente inexistente");
		boolean encontrado=false;
		int i=0;
		while(i<s.getAdmCarrito().getLstCarrito().size() && encontrado==false) {
			if(s.getAdmCarrito().getLstCarrito().get(i).getCliente().equals(c)) {
				encontrado=true;
				
			}
		}
		if(encontrado) throw new Exception("El cliente posee carritos");
		
		
		return lstCliente.remove(c);
			
		
		
	}
	
	
	public Cliente traerCliente(long dni) {
		Cliente cliente = null;
		int i=0;
		boolean encontrado=false;
		while(i<lstCliente.size() && encontrado==false) {
			if(dni==lstCliente.get(i).getDni()) {
				cliente = lstCliente.get(i);
			}
			i++;
		}
		return cliente;
	}
	
	public Cliente traerCliente(int idCliente) {
		Cliente cliente = null;
		int i =0;
		boolean encontrado=false;
		while(i<lstCliente.size() && encontrado==false) {
			if(idCliente==lstCliente.get(i).getIdCliente()) {
				cliente=lstCliente.get(i);
				encontrado=true;
			}
			i++;
		}
		return cliente;
	}
	
	
	
	
	
	
	

}
