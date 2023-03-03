package tree.ej3;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3 {
	
	static TreeMap<Integer, String> mapa;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		mapa = new TreeMap<Integer, String>();
		
		mapa.put(1, "Casillas");
		mapa.put(3, "Pique");
		mapa.put(5, "Puyol");
		mapa.put(6, "Iniesta");
		mapa.put(7, "Villa");
		mapa.put(8, "Xavi Hernandez");
		mapa.put(11, "Capdevila");
		mapa.put(14, "Xavi Alonso");
		mapa.put(15, "Ramos");
		mapa.put(16, "Busquets");
		mapa.put(18, "Pedrito");
		
		mostrarMapa();
		
		int num = 0;
		
		while (num != 2) {
			num = solicitarNumeroMenu();
			while (realizarFalta(num) && num != 2) {
				realizarFalta(num);
			} 
		}
		
		if (num == 2) {
			mapa.remove(1);
			mapa.remove(3);
			mapa.remove(5);
			mapa.remove(6);
			mapa.remove(7);
			mapa.remove(8);
			mapa.remove(11);
			mapa.remove(14);
			mapa.remove(15);
			mapa.remove(16);
			mapa.remove(18);
			if (mapa.isEmpty()) {
				System.out.println("Fin del partido");
			}
		}
		
		sc.close();
	}

	private static boolean realizarFalta(int num) {
		
		boolean valorVal = true;
		
		int dorsal = solicitarNumero();
		
		while (valorVal) {
			if (mapa.containsKey(dorsal)) {
				System.out.println("El jugador ha sido eliminado del partido");
				mapa.remove(dorsal);
				valorVal = false;
			} else {
				System.out.println("El número no está registrado en el mapa");
				valorVal = false;
			}
		}
		
		return valorVal;
	}

	private static int solicitarNumero() {
		int num = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println("Introduce el dorsal");
				num = Integer.parseInt(sc.nextLine());
				
				if (num < 0) {
					throw new NumberFormatException();
				} else {
					valNoVal = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce un dorsal válido");
			}
		}
		
		return num;
		
	}

	private static int solicitarNumeroMenu() {
		
		int num = 0;
		boolean valNoval = true;
		
		while (valNoval) {
			try {
				System.out.println("*** MENÚ DE INTERACCIÓN ***");
				System.out.println("1 - Para agregar una falta");
				System.out.println("2 - Para finalizar el partido");
				
				num = Integer.parseInt(sc.nextLine());
				
				if (num > 0 && num < 3) {
					valNoval = false;
				} else {
					throw new NumberFormatException();
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce un valor válido (1 o 2)");
			}
		}
		
		return num;
		
	}

	private static void mostrarMapa() {
		for (Integer dorsal : mapa.keySet()) {
			System.out.println("Con el número " + dorsal + " ... " + mapa.get(dorsal));
		}
	}

}
