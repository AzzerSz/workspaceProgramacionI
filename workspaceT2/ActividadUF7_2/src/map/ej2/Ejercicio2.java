package map.ej2;

import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;
import java.util.Map.Entry;

// 100 veces generar aletatorio si el aleatorio generado se encuentra entre las claves
// de la tabla obtengo su valor lo aumento en 1 y lo vuelvo a introducir sino se encuentra
// entre las claves de la tabla introduzco el aleatorio al valor 1

public class Ejercicio2 {
	
	static final int MAX = 100;
	static final int MIN = 1;
	static final int REPE_1 = 5;
	static final int REPE_2 = 2;

	static HashMap<Integer, Integer> tablaAlea;
	
	public static void main(String[] args) {
		
		rellenarTabla();
		
		imprimirNumNoAPar();
		
		imprimirRepetidos(REPE_1);

		imprimirRepetidos(REPE_2);
		
		imprimirTablaOrd();
	}

	private static void imprimirTablaOrd() {
		TreeMap<Integer, Integer> tablaAleaOrd = new TreeMap<Integer, Integer>();
		tablaAleaOrd.putAll(tablaAlea);
		
		System.out.println("\nNúmeros de la tabla");
		for (Entry<Integer, Integer> registro : tablaAleaOrd.entrySet()) {
			System.out.println(registro.getKey() + " ha aparecido " + registro.getValue() + " veces");
		}
	}

	private static void imprimirRepetidos(int numRepe) {
		System.out.println("\nNúmeros del " + MIN + " al " + MAX + " que han aparecido " + numRepe + " veces");
		for (Integer clave : tablaAlea.keySet()) {
			if (tablaAlea.get(clave) == numRepe) {
				System.out.print(clave + " ");
			}
		}
		
	}

	private static void imprimirNumNoAPar() {
		System.out.println("\nNúmeros del " + MIN + " al " + MAX + " que no han aparecido");
		for (int i = MIN; i <= MAX; i++) {
			if (!tablaAlea.containsKey(i)) {
				System.out.print(i + " ");
			}
		}
	}

	private static void rellenarTabla() {
		Random rd = new Random();
		tablaAlea = new HashMap<Integer, Integer>();
		
		int num;
		int valor;
		
		for (int i = 0; i < 100; i++) {
			num = rd.nextInt(MAX + 1 - MIN) + MIN;
			if (tablaAlea.containsKey(num)) {
					valor = tablaAlea.get(num) + 1;
			} else {
				valor = 1;
			} 
			
			tablaAlea.put(num, valor);
		}
		
	}

}
