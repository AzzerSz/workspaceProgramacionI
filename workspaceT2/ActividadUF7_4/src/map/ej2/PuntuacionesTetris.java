package map.ej2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PuntuacionesTetris {
	
	static final String[] OPCIONES = {
			"para salir del programa",
			"para registrar un nuevo resultado",
			"para mostrar las puntuaciones"		
	};
	
	static HashMap<String, Integer> puntuaciones;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		puntuaciones = new HashMap<String, Integer>();
		
		String textoMenu = "\nIntroduce una de las siguientes opciones: ";
		for (int i = OPCIONES.length - 1; i >= 0; i--) {
			textoMenu += "\n" + i + " - " + OPCIONES[i];
		}
		
		int opcion = 1;
		
		while (opcion != 0) {
			opcion = solicitarEnteroRango(textoMenu, 0, OPCIONES.length - 1);
			
			switch (opcion) {
			case 0:
				System.out.println("\n** FINALIZANDO EL PROGRAMA **");
				break;
			case 1:
				registrarResultado();
				break;
			case 2:
				mostrarPuntuacionesOrd();
				break;
			}
		}
		
		sc.close();

	}
	
	private static void mostrarPuntuacionesOrd() {
		ArrayList<Entry<String, Integer>> listaPuntuaciones = new ArrayList<Entry<String, Integer>>();
		listaPuntuaciones.addAll(puntuaciones.entrySet());
		
		listaPuntuaciones.sort(Entry.comparingByValue());
		
		System.out.println("\nPuntuaciones ordenadas de mayor a menor");
		for (int i = listaPuntuaciones.size() - 1; i >= 0; i--) {
			System.out.println(listaPuntuaciones.get(i).getKey() + " - " 
					+ listaPuntuaciones.get(i).getValue());
		}
		
	}

	private static void registrarResultado() {
		String nick = solicitarNick();
		int punt = solicitarEnteroRango("Introduce la puntuación", 1, 1000000); 
		
		if (!puntuaciones.containsKey(nick)) {
			puntuaciones.put(nick, punt);
			System.out.println("\n¡PUNTUACIÓN ALMACENADA!");
			
		} else {
			if (puntuaciones.get(nick) < punt) {
				puntuaciones.put(nick, punt);
				System.out.println("\n¡NUEVO RECORD!");
			} else {
				System.out.println("\nPUNTUACIÓN NO SUPERADA");
			}
		}
		
	}

	private static String solicitarNick() {
		String nick = "";
		
		while (nick.isEmpty()) {
			System.out.println("Introduce el nick");
			nick = sc.nextLine().trim().toUpperCase();
			
			if (nick.isEmpty()) {
				System.out.println("El nick no puede ser vacío");
			}
		}
		
		return nick;
	}

	private static int solicitarEnteroRango(String mensaje, int min, int max) {
		int valor = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println(mensaje);
				valor = Integer.parseInt(sc.nextLine());
				
				if (valor >= min && valor <= max) {
					valNoVal = false;
				} else {
					throw new Exception();
				}
				
			} catch (Exception e) {
				System.out.println("El valor debe ser un entero entre " + min +" y " + max);
			}	
			
		}
		
		return valor;
	}

}
