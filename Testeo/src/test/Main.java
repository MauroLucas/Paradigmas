package test;
import modelo.*;
import java.util.List;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		Proceso proceso1 = new Proceso(1,10,5,true,false,false);
		Proceso proceso2 = new Proceso(2,10,6,true,false,false);
		Proceso proceso3 = new Proceso(3,10,7,true,false,false);
		Proceso proceso4 = new Proceso(4,10,8,true,false,false);
		
		List<Proceso> lista = new ArrayList<Proceso>();
		lista.add(proceso1);
		lista.add(proceso2);
		lista.add(proceso3);
		lista.add(proceso4);
		
		AlgoritmoPlanificacion algoritmo = new AlgoritmoPlanificacion(10,lista);
		//System.out.println(algoritmo.getListaColaListos());
		//System.out.println(algoritmo.getListaColaTerminados());
	
		
	}
	
	

}
