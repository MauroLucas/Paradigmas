package modelo;
import java.util.ArrayList;
import java.util.List;
public class AdmProducto {
	private List<Producto> gondola;
	
	public AdmProducto() {
		gondola = new ArrayList<Producto>();
	}

	public List<Producto> getGondola() {
		return gondola;
	}
	

	public String toString() {
  	  String resultado = new String("Productos:" + "\n");
  	  for(Producto p:gondola) {
  		  resultado += " " +  p.toString() + "\n";
  	  }
  	   return resultado;
    }
	
	
    public boolean agregarProducto(String producto,float precio)throws Exception {
  	  boolean resultado=false;
  	  Producto p = traerProducto(producto);
  	  if(p!=null)throw new Exception("Producto existente:"+producto);
  	  if(gondola.size()==0) {
  		  gondola.add(new Producto(1,producto,precio));
  		  resultado=true;
  	  }
  	  else {
  		  
  		  gondola.add(new Producto(gondola.get(gondola.size()-1).getIdProducto()+1,producto,precio));
  		  resultado=true;
  	  }
  	  return resultado;
    }
    
    public Producto traerProducto(int idProducto) {
  	  Producto resultado = null;
  	  int i=0;
  	  boolean encontrado=false;
  	  while(i<gondola.size()&&encontrado==false) {
  		  if(idProducto==gondola.get(i).getIdProducto()) {
  			  resultado=gondola.get(i);
  			  encontrado=true;
  			  
  		  }
  		  i++;
  	  }
  	  
  	  
  	  return resultado;
    }
    
    public Producto traerProducto(String producto) {
  	  Producto resultado = null;
  	  int i=0;
  	  boolean encontrado=false;
  	  while(i<gondola.size()&&encontrado==false) {
  		  if(producto.equalsIgnoreCase(gondola.get(i).getProducto())) {
  			  resultado=gondola.get(i);
  			  encontrado=true;
  			  
  		  }
  	  i++;
  	  }
  	  
  	  return resultado;
    }
    
    //Pre-condicion: El producto no debe existir en un Carrito//
    public boolean eliminarProducto(int idProducto,Supermercado s)throws Exception {
  	 Producto p=traerProducto(idProducto);
  	 if(p==null)throw new Exception("El producto no existe"+"id:" + idProducto);
  	 if(this.productoUtilizado(idProducto,s))throw new Exception("El producto existe en un carrito");
     return gondola.remove(p);
    }
    
    public boolean productoUtilizado(int idProducto,Supermercado s) {
    	 boolean utilizado=false;
      	 int i=0,j=0;
      	 while(i<s.getAdmCarrito().getLstCarrito().size() && utilizado==false) {
      		 Carrito carrito = s.getAdmCarrito().getLstCarrito().get(i);
      		 while(j<carrito.getListaItems().size() && utilizado==false) {
      			 ItemCarrito item = carrito.getListaItems().get(j);
      			 if(idProducto==(item.getProducto().getIdProducto())) {
      				 
      				 utilizado=true;
      			 }
      			 j++;
      		 }
      		 i++;
      	 }
      	 return utilizado;
      	 
    }
    
	
    
	public boolean modificarProducto(int idProducto,String producto,double precio)throws Exception {
  	  boolean resultado=true;
  	  Producto p= traerProducto(idProducto);
  	  if(p==null)throw new Exception("Producto Inexistente:"+" id:"+idProducto);
  	  p.setProducto(producto);
  	  
  	  p.setPrecio((float)precio);
  	  return resultado;
    }
    
	
	

}
