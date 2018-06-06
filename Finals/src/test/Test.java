package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		admVTV vtv = new admVTV();
		
		try {
			System.out.println("-->Test 1");
			vtv.agregarInspector("Perez", "Juan", 11111111, 100);
			vtv.agregarContribuyente("Lopez", "Rodrigo", 22222222, false);
			vtv.agregarContribuyente("Martinez", "Juan", 33333333, false);
			vtv.agregarInspector("Alvarez","Jose",44444444,101);
			vtv.agregarContribuyente("Martines", "Martin", 55555555, true);
			vtv.agregarContribuyente("Fernandez", "Julia", 66666666, false);
			vtv.agregarInspector("Bruno", "Gustavo",77777777, 102);
			vtv.agregarInspector("Gonzales", "Cristian",88888888, 103);
			System.out.println(vtv.listaPersonas());
			
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        try {
        	System.out.println("-->Test 2: traer contribuyente");
        	System.out.println(vtv.traerContribuyente(22222222));
			
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        
        try {
        	System.out.println("-->Test 3: agregarAutomoro");
        	vtv.agregarAutomotor("GAA111", 2010, "Fiat", vtv.traerContribuyente(22222222));
        	vtv.agregarAutomotor("AAA100", 2005, "Corsa", vtv.traerContribuyente(33333333));
        	vtv.agregarAutomotor("HHH222", 2011, "Volkswagen", vtv.traerContribuyente(55555555));
        	vtv.agregarAutomotor("JJJ333", 2010, "Fiat", vtv.traerContribuyente(66666666));
        	vtv.agregarAutomotor("LLL444", 2012, "Honda",vtv.traerContribuyente(33333333));
        	System.out.println(vtv.listaAutomotor());
        	
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        try {
        	System.out.println("-->Test 4: traerInspector");
        	System.out.println(vtv.traerInspector(11111111));
        	
        	
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        
        try {
        	System.out.println("-->Test 5: traerAutomotor");
        	System.out.println(vtv.traerAutomotor("LLL444"));
        	
        	
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        
        try {
        	System.out.println("-->Test 6:");
        	vtv.agregarInspeccion(Funciones.traerFecha(2016, 2, 10, 9, 0, 0), false, "apto", vtv.traerAutomotor("GAA111"), vtv.traerInspector(11111111));
        	vtv.agregarInspeccion(Funciones.traerFecha(2016, 2, 10, 9, 30, 00), false, "condicional", vtv.traerAutomotor("AAA100"), vtv.traerInspector(44444444));
        	vtv.agregarInspeccion(Funciones.traerFecha(2016, 2, 10, 10, 00, 00), false, "condicional", vtv.traerAutomotor("HHH222"), vtv.traerInspector(44444444));
        	vtv.agregarInspeccion(Funciones.traerFecha(2016, 2, 11, 14, 30, 00), false, "apto", vtv.traerAutomotor("JJJ333"), vtv.traerInspector(77777777));
        	vtv.agregarInspeccion(Funciones.traerFecha(2016, 2, 13, 10, 00, 00), false, "condicional", vtv.traerAutomotor("LLL444"), vtv.traerInspector(88888888));
        	System.out.println(vtv.listaInspecciones());
        	
        	
        	
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
        
        try {
        	System.out.println("-->Test 7: traer inspeccion");
        	
        	System.out.println(vtv.listaInspecciones());
        	
        	
        	
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		

	}

}
