package dam.pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Prueba6 {
	
	final static int TAM = 10;
	
	static int[] a;
	static Scanner sc;
	
	public static void main(String[] args) {
		a = new int[TAM];
		
		rellenarArray();
		
		mostrarArray();
	}

	private static void rellenarArray() {
		sc = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			a[i] = rellenarValor(i);
		}
	}

	private static int rellenarValor(int i) {
		int valor = 0;
		
		boolean valorNoVal = true;
		
		while (valorNoVal) {
			try {
				System.out.println("Introduce el valor de la posición " + (i + 1));
				valor = Integer.parseInt(sc.nextLine());
				
				valorNoVal = false;
			} catch (Exception e) {
				System.out.println("El valor debe ser entero");
			} 
		}
		return valor;
	}

	private static void mostrarArray() {
		System.out.println(Arrays.toString(a));
	}

}
