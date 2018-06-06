package modelo;
import java.util.*;

public class AlgoritmoPlanificacion {
	
	 private int quantum;
	 private int quantumSobrante;
	 private int ejecuciones;
	 private List<Proceso> colaListos;
	
	 private List<Proceso> colaTerminados;
	 
	 
	 
	 public AlgoritmoPlanificacion(int quantum,List<Proceso> colaListos) {
		 this.quantum = quantum;
		 this.quantumSobrante = 0;
		 this.colaListos= new ArrayList<Proceso>(colaListos);
		 
		 //this.colaBloqueados = new ArrayList<Proceso>();
		 this.colaTerminados = new ArrayList<Proceso>();
		 this.ejecuciones=0;
		 this.procesarCola();
		
	 }
	 
	
	 public List<Proceso> getListaColaTerminados(){
		 return this.colaTerminados;
	 }
	 
	 public List<Proceso> getListaColaListos(){
		 return this.colaListos;
	 }
	 
	 private void procesarCola() {
		//Mientras exista una proceso sin terminar se seguigan ejecutando los procesos.
		 while(colaListos.size()!=0) { 
			 trabajarProcesos();
		 }
	 }
	 
	
	 
	 
	 private void trabajarProcesos() {
		 Proceso p = this.primeroColaListos();
		 //Ejecuto proceso que no llego a consumir el quantum
		 if(ejecuciones< (quantum + quantumSobrante) && p!=null) {
			 if(quantumSobrante>0) {
				 quantumSobrante -=1;
			 }
			 p.ejecucionProceso();
			 if(p.isBloqueado() || p.isTerminado()) {
				 //Si al terminar la ejecucion el proceso no llega a consumir todo el quantum, esa diferencia la aprobecha elproximo proceso.
				 if(ejecuciones < quantum) {
					 quantumSobrante += quantum - ejecuciones;
				 }
				//Si el proceso termino de ejecutar reinica el quantum
				 ejecuciones = 0;
			 }
			 else {
				 ejecuciones += 1;
			 }
			 
		 }
		 //Los procesos que llegan al limite del quantum se agregar al final de la colaListos
		 else{
			 
			
			 ejecuciones=0;
			 colaListos.remove(p);
			 colaListos.add(p);
		 }
		 //Procesos Bloqueados ejecutan procedimientos de E/S
		 for(Proceso pBloqueado : colaListos) {
			 if(pBloqueado.isBloqueado()) {
				 pBloqueado.ejecucionES();
			 }
			 
		 }
		
		 this.reposicionarProcesos();
	 }
	 
	 //Reposiciono los procesos en sus colas correspondientes
	 private void reposicionarProcesos() {
		 
		//Los procesos que no esten bloqueado en la cola de bloqueados pasan a la cola de listos
		// for(Proceso p : colaBloqueados) {
			// if(!p.isBloqueado()) {
				//} colaListos.add(p);
				 //colaBloqueados.remove(p);
			 //}
		 //}
		 
		 //Los procesos bloqueados en cola de listas pasan a la cola de bloqueados
		 //System.out.println(colaListos);
		 for(Proceso proceso : colaListos) {
			// if(proceso.isBloqueado()) {
				 
				// this.colaBloqueados.add(proceso);
				 //this.colaListos.remove(proceso);
			 //}
			//Los procesos terminados en cola de listas pasan a la cola de terminados
			 if (proceso.isTerminado()) {
				 //colaTerminados.add(proceso);
				 colaListos.remove(proceso);
				 System.out.println("soy un terminado");
			 }
			 
		 }
		 
		 
	 }
	 
	 //Este metodo busca siempre al proximo proceso que este en la lista//
	 
	 private Proceso primeroColaListos() {
		 Proceso p =null;
		 int i=0;
		 boolean encontrado=false;
		 while(i<colaListos.size() && encontrado==false) {
			 if(colaListos.get(i).isEjecutando()) {
				 encontrado=true;
				 p = colaListos.get(i);
			 }
			 i++;
		 }
		 return p;
	 }
	 
	
	 
	 
	 
	 
	 

}
