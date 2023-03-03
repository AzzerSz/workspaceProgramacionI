package dam.sort;

import java.util.Random;

public class PruebasOrdenarArray {

	static int [] a;
	
	public static void main(String[] args) {
		a = new int[10];
		
		rellenarArray();
		
		mostrarArray();
		
		ordenarArray();
		
		mostrarArray();

	}

	private static void ordenarArray() {
		int aux;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					aux = a[i];
					a[i] = a[j];
					a[j] = aux;
				}
			}
		}
		
	}

	private static void mostrarArray() {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
	}

	private static void rellenarArray() {
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(50);
		}
		
	}

}
