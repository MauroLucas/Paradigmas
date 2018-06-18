package test;
import java.util.List;

import datos.Maratonista;
import datos.Marca;
import funciones.Funciones;
import negocio.MaratonistaABM;
import negocio.MarcaABM;
/**
 * Clase para el testeo de Maratón
 * @author Mauro Lucas Pereyra
 * @version 16/04/2018
 *
 */
public class TestOO2 {
	/**
	 * Metodo princial
	 * @param args - Array de String
	 */
	public static void main(String[] args) {
		MarcaABM marcaABM = new MarcaABM();
		MaratonistaABM maratonistaABM =new MaratonistaABM();
		
		
		
		try {
			System.out.println("Traer e imprimir todos los maratonistas");
			System.out.println(Funciones.imprimirLista(maratonistaABM.traerMaratonistas()));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Traer el maratonista con nroChip=934152");
			System.out.println(maratonistaABM.traerMaratonista(934152));
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Traer marcas maratonista con nroChip=934152 ");
			List<Marca> marcas = marcaABM.traerMarca(maratonistaABM.traerMaratonista(934152));
			System.out.println(marcas.get(0));
			System.out.println(marcas.get(1));
			System.out.println("Hora Inicio= " + marcas.get(0).getHora());
			System.out.println("Hora Fin= " + marcas.get(1).getHora());
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Setear el tiempo y volver a imprimir maratonista con nroChip=934152");
			Maratonista m = maratonistaABM.traerMaratonista(934152);
			List<Marca> marcas = marcaABM.traerMarca(m);
			m.setTiempo(marcas.get(0).getHora(), marcas.get(1).getHora());
			System.out.println(m);
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Actualizar BD");
			maratonistaABM.actualizarMaratonistas();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Traer e imprimir todos los maratonistas");
			System.out.println(Funciones.imprimirLista(maratonistaABM.traerMaratonistas()));
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Traer e imprimir Clasificacion General");
			System.out.println(Funciones.imprimirLista(maratonistaABM.traerClasificacion()));
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Traer e imprimir Clasificacion Masculina");
			System.out.println(Funciones.imprimirLista(maratonistaABM.traerClasificacion('m')));
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		try {
			System.out.println("Traer e imprimir Clasificacion Femenina");
			System.out.println(Funciones.imprimirLista(maratonistaABM.traerClasificacion('f')));
			
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
