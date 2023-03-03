package list.ej1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ejercicio1 {
	
	static Scanner sc;

	public static void main(String[] args) {
		ArrayList<Integer> fichero1 = new ArrayList<Integer>();
		ArrayList<Integer> fichero2 = new ArrayList<Integer>();
		ArrayList<Integer> fichero3 = new ArrayList<Integer>();
		ArrayList<Integer> ficheroRes = new ArrayList<Integer>();
		
		sc = new Scanner(System.in);
		
		rellenarFichero(fichero1, 1);
		
		rellenarFichero(fichero2, 2);
		
		rellenarFichero(fichero3, 3);
		
		sc.close();
		
		ficheroRes.addAll(fichero1);
		ficheroRes.addAll(fichero2);
		ficheroRes.addAll(fichero3);
		
		ficheroRes.sort(null);
		
		System.out.println("\nFichero resultante ordenado de manera creciente");
		mostrarFichero(ficheroRes);
		
		ficheroRes.sort(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer i1, Integer i2) {
				return  0 - (i1 - i2);

			}
		});
		
		System.out.println("\nFichero resultante ordenado de manera decreciente");
		mostrarFichero(ficheroRes);

	}

	private static void mostrarFichero(ArrayList<Integer> ficheroRes) {
		
		for (Integer kilos : ficheroRes) {
			System.out.println(kilos);
		}
		
	}

	private static void rellenarFichero(ArrayList<Integer> fichero, int i) {
		System.out.println("*** Rellenando el fichero " + i);
		
		int kilos = 1;
		
		while (kilos != 0) {
			kilos = solicitarKilos();
			if (kilos != 0) 
				fichero.add(kilos);
			
		}
		
	}

	private static int solicitarKilos() {
		int k = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println("Introduce los kilos");
				k = Integer.parseInt(sc.nextLine());
				
				if (k < 0) {
					throw new NumberFormatException();
				} else {
					valNoVal = false;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("El valor debe ser entero y mayor o igual que cero");
			}
		}
		return k;
	}

}
