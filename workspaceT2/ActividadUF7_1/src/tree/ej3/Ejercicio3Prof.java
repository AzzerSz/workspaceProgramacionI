package tree.ej3;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3Prof {

	static TreeMap<Integer, String> seleccion;
	static final int[] dorsales = {1, 3, 5, 6, 7, 8, 11, 14, 15, 16, 18};
	static final String[] nombres = {"Casillas", "Pique", "Puyol", "Iniesta", "Villa", "Xavi Hernandez", 
			"Capdevila", "Xabi Alonso", "Ramos", "Busquets", "Pedrito"};
	
	public static void main(String[] args) {
		
		asignarTitulares();
		
		saltarCampo();
		
		simularFalta();
		
		finalizarPartido();
		
	}

	private static void finalizarPartido() {
		seleccion.clear();
		
		if (seleccion.isEmpty()) {
			System.out.println("*** Fin del partido ***");
		}
		
	}

	private static void simularFalta() {
		Scanner sc = new Scanner(System.in);
		
		int dorsal = solicitarDorsal(sc);
		
		System.out.println("El jugador " + seleccion.get(dorsal) + " con el dorsal " + dorsal + " es expulsado del campo");
		seleccion.remove(dorsal);
		
		sc.close();
	}

	private static int solicitarDorsal(Scanner sc) {
		int dorsal = 0;
		
		while (!seleccion.containsKey(dorsal)) {
			try {
				System.out.println("Introduce el dorsal del jugador que comete la falta");
				dorsal = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("El dorsal debe ser un entero mayor que 0");
			}
		}
		
		return dorsal;
	}

	private static void saltarCampo() {
		System.out.println("*** EMPIEZA EL PARTIDO, LOS JUGADORES SALTAN AL CAMPO ***");
		for (Entry<Integer, String> registro : seleccion.entrySet()) {
			System.out.println("Con el número " + registro.getKey() + " ... " + registro.getValue());
		}
	}

	private static void asignarTitulares() {
		seleccion = new TreeMap<Integer, String>();
		
		for (int i = 0; i < dorsales.length; i++) {
			seleccion.put(dorsales[i], nombres[i]);
		}
	}

}
