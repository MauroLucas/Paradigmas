package modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.GregorianCalendar;
public class Supermercado {
	
      private AdmProducto admProducto;
      private AdmCarrito admCarrito;
      private AdmCliente admCliente;
    
      
      public Supermercado() {
    	  admProducto = new AdmProducto();
    	  admCarrito = new AdmCarrito();
    	  admCliente = new AdmCliente();
    	 
      }
      
      public AdmProducto getAdmProducto() {
    	  return admProducto;
      }
      public AdmCarrito getAdmCarrito() {
    	  return admCarrito;
      }
      public AdmCliente getAdmCliente() {
    	  return admCliente;
      }
      
      public float calcularTotal(Cliente cliente)throws Exception {
    	  
    	  float total=0;
    	  
    	  if(cliente==null)throw new Exception("Cliente inexistente");
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  total += carrito.calcularTotal();
    		  }
    	  }
    	  return total;
      }
public float calcularTotal(int idCliente)throws Exception {
    	  
    	  float total=0;
    	  Cliente cliente = admCliente.traerCliente(idCliente);
    	  if(cliente==null)throw new Exception("Cliente inexistente");
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  total += carrito.calcularTotal();
    		  }
    	  }
    	  return total;
      }

      public float calcularTotal(GregorianCalendar fechaInicio,GregorianCalendar fechaFin) {
    	  
    	  float total=0;
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getFechaHora().after(fechaInicio) && carrito.getFechaHora().before(fechaFin)) {
    			  total += carrito.calcularTotal();
    			  
    		  }
    	  }
    	  return total;
      }
      
      public float calcularTotal(GregorianCalendar fecha) {
    	  float total=0;
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getFechaHora().equals(fecha)) {
    			  total +=carrito.calcularTotal();
    		  }
    	  }
    	  
    	  return total;
      }
      
      public float calcularTotal(int mes,int anio) {
    	  float total=0;
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  int mesCarrito=Funciones.traerMes(carrito.getFechaHora());
    		  int anioCarrito=Funciones.traerAnio(carrito.getFechaHora());
    		  if(mesCarrito==mes && anioCarrito==anio) {
    			  total += carrito.calcularTotal();
    		  }
    	  }
    	  return total;
      }
      
      public float calcularTotal(GregorianCalendar fechaInicio,GregorianCalendar fechafin,Cliente cliente) {
    	  float total=0;
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  if(carrito.getFechaHora().after(fechaInicio) && carrito.getFechaHora().before(fechafin)) {
    				  total += carrito.calcularTotal();
    			  }
    		  }
    	  }
    	  
    	  return total;
      }
      
      public float calcularTotal(GregorianCalendar fecha,Cliente cliente) {
    	  float total=0;
    	  
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  if(carrito.getFechaHora().equals(fecha)) {
    				  total += carrito.calcularTotal();
    			  }
    		  }
    	  }
    	  return total;
      }
      
      public float calcularTotal(int mes, int anio ,Cliente cliente) {
    	  float total=0;
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  int mesCarrito=Funciones.traerMes(carrito.getFechaHora());
        		  int anioCarrito=Funciones.traerAnio(carrito.getFechaHora());
        		  if(mesCarrito==mes && anioCarrito==anio) {
        			  total += carrito.calcularTotal();
        		  }
    			  
    		  }
    	 }
    	  return total;
      }
      
      public float calcularTotal(int mes, int anio ,int dniCliente) {
    	  float total=0;
    	  Cliente cliente=admCliente.traerCliente((long)dniCliente);
    	  for(Carrito carrito : admCarrito.getLstCarrito()) {
    		  if(carrito.getCliente().equals(cliente)) {
    			  int mesCarrito=Funciones.traerMes(carrito.getFechaHora());
        		  int anioCarrito=Funciones.traerAnio(carrito.getFechaHora());
        		  if(mesCarrito==mes && anioCarrito==anio) {
        			  total += carrito.calcularTotal();
        		  }
    			  
    		  }
    	 }
    	  return total;
      }
      
      
      
      
    
   	
      
      
      
	
	
	
	
	
	
      
      public String toString() {
    	  String resultado = admProducto.toString() + "\n" + admCliente.toString() + "\n" + admCarrito.toString();
    	  return resultado;
      }
      
}
