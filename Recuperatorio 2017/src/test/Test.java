package test;
import modelo.*;
public class Test {

	public static void main(String[] args) {
		Libreria l = new Libreria();
		try {
			 System.out.println("1)");
			 System.out.println("Escenario 1 : ISBN:978849249370");
			 System.out.println(l.esValidoISBN("978849249370"));
			 
			 System.out.println("Escenario 2 : ISBN:9768492483705");
			 System.out.println(l.esValidoISBN("9768492483705"));
			 
			 System.out.println("Escenario 3 : ISBN:97631614B41A0");
			 System.out.println(l.esValidoISBN("97631614B41A0"));
			 
			 System.out.println("Escenario 4 : ISBN:9783161484100");
			 System.out.println(l.esValidoISBN("9783161484100"));
			 
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage() );
		}
		try {
			System.out.println("2)");
			Libro libro = new Libro();
			libro.setIsbn("9783161484100");
			System.out.println(libro.formatear());
		}
		catch(Exception e) {
			System.out.println("Error: " + e.getMessage() );
		}
		
	}

}
