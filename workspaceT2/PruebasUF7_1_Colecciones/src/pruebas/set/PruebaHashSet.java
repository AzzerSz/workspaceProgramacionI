package pruebas.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PruebaHashSet {
	
	static HashSet<String> hsNumeros;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		hsNumeros = new HashSet<String>();
		
		rellenarSet();
		
		mostrarSet();
		
		mostrarSet2();
		
		sc.close();
		
	}

	private static void mostrarSet2() {
		
		Iterator<String> it = hsNumeros.iterator();
		String numero;
		boolean encontrado = false;
		
		while (it.hasNext() && !encontrado) {
			numero = it.next();
			if (numero.equalsIgnoreCase("uno")) {
				encontrado = true;
			}
		}
	
		if (encontrado) {
			System.out.println("El uno está en el conjunto");
		} else {
			System.out.println("El uno no está en el conjunto");
		}
		
	}

	private static void mostrarSet() {
		System.out.println("\nEl conjunto contiene " + hsNumeros.size() + " elementos");
		
		System.out.println("Elementos del conjunto:");
		for (String numero : hsNumeros) {
			System.out.println(numero);
		}
		
	}

	private static void rellenarSet() {
			boolean continuar = true;
			String numero;
			String respuesta;
			
			while (continuar) {
				System.out.println("Introduce un numero");
				numero = sc.nextLine();
				
				hsNumeros.add(numero);
				
				System.out.println("¿Deseas introducir otro numero?");
				respuesta = sc.nextLine();
				continuar = respuesta.equalsIgnoreCase("SI")? true:false;
				
			}
		
	}

}
