package pruebas.set;

import java.util.Scanner;
import java.util.TreeSet;

public class PruebaTreeSet {
	
	static TreeSet<String> tsAnimales;
	static Scanner sc;
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		
		tsAnimales = new TreeSet<String>();
		
		rellenarSet();
		
		mostrarSet();
		
		sc.close();
		
	}

	private static void mostrarSet() {
		System.out.println("\nEl conjunto tiene " + tsAnimales.size() + " animales");
		
		System.out.println("Animales del conjunto:");
		
		for (String animal : tsAnimales) {
			System.out.println(animal);
		}
		
	}

	private static void rellenarSet() {
		boolean continuar = true;
		String animal;
		String respuesta;
		
		while (continuar) {
			System.out.println("Introduce un animal");
			animal = sc.nextLine();
			
			tsAnimales.add(animal);
			
			System.out.println("¿Deseas introducir otro animal?");
			respuesta = sc.nextLine();
			continuar = respuesta.equalsIgnoreCase("SI")? true:false;
			
		}
	
}
	
}
