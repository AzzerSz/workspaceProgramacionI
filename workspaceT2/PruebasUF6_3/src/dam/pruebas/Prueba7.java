package dam.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba7 {
	
	final static int TAM = 5;
	
	static int[] a;
	static Scanner sc;
	
	public static void main(String[] args) {
		a = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
	}

	private static void rellenarArray() {
		sc = new Scanner(System.in);
		
		boolean valorNoVal = true;
		
		while (valorNoVal) {
			for (int i = 0; i < a.length; i++) {
				valorNoVal = true;
				try {
					a[i] = rellenarValor(i);

					valorNoVal = false;
				} catch (NumberFormatException e) {
					System.out.println("El valor introducido debe ser entero");
				}
			} 
		}
	}

	private static int rellenarValor(int i) throws NumberFormatException {
		int valor = 0;

				System.out.println("Introduce el valor de la posición " + (i + 1));
				valor = Integer.parseInt(sc.nextLine());
				
		return valor;
	}

	private static void mostrarArray() {
		System.out.println(Arrays.toString(a));
	}

}
