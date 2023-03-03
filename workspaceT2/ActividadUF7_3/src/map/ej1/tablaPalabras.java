package map.ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class tablaPalabras {

	static final int NUM_ENT = 5;
	
	static HashMap<String, Integer> tablaPalabras;
	
	public static void main(String[] args) {
		
		rellenarMap();
		
		mostrarMap();
		
		mostrarMapOrdAsc();

	}

	private static void mostrarMapOrdAsc() {
		
		ArrayList<String> listaPalabras = new ArrayList<String>(tablaPalabras.keySet());
		listaPalabras.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		});
		
		System.out.println("\nPalabras de la tabla ordenadas en función de su tamaño");
		for (String palabra : listaPalabras) {
			System.out.println("La palabra " + palabra + " tiene " + tablaPalabras.get(palabra) + " caracteres (OPCIÓN 1)");
		}
		
		System.out.println();
		
		// Opcion 2
		ArrayList<Entry<String, Integer>> listaPalabras2 = new ArrayList<>();
		listaPalabras2.addAll(tablaPalabras.entrySet());
		
		listaPalabras2.sort(Entry.comparingByValue());
		for (Entry<String, Integer> reg : listaPalabras2) {
			System.out.println("La palabra " + reg.getKey() + " tiene " + reg.getValue() + " caracteres (OPCIÓN 2)");
		}
		
	}

	private static void mostrarMap() {
		TreeMap<String, Integer> tablaOrd = new  TreeMap<String, Integer>();
		tablaOrd.putAll(tablaPalabras);
		
		System.out.println("** Listado de palabras ordenadas alfabéticamente **");
		for (Entry<String, Integer> elemento : tablaOrd.entrySet()) {
			System.out.println(elemento.getKey() + " con " + elemento.getValue() + " letras");
		}
		
	}

	private static void rellenarMap() {
		Scanner sc = new Scanner(System.in);
		tablaPalabras = new HashMap<String, Integer>();
		
		String palabra;
		
		for (int i = 0; i < NUM_ENT; i++) {
			palabra = solPalabra(i, sc);
			tablaPalabras.put(palabra, palabra.length());
		}
		
		sc.close();
		
	}
	

	private static String solPalabra(int num, Scanner sc) {
		String palabra = null;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println("Introduce la palabra " + (num+1));
				palabra = sc.nextLine().toUpperCase();
				
				if (tablaPalabras.containsKey(palabra)) {
					throw new Exception("Introduce una palabra que no haya sido introducida anteriormente");
				}
				
				valNoVal = false;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return palabra;
	}

}
