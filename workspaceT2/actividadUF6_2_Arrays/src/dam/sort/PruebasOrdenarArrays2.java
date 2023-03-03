package dam.sort;

import java.util.Arrays;
import java.util.Random;

public class PruebasOrdenarArrays2 {

	static int [] a;
	
	public static void main(String[] args) {
		a = new int[10];
		
		rellenarArray();
		
		mostrarArray();
		
		ordenarArray();
		
		mostrarArray();

	}

	private static void ordenarArray() {
		Arrays.sort(a);
		
	}

	private static void mostrarArray() {
		System.out.println(Arrays.toString(a));
	}

	private static void rellenarArray() {
		Random rd = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = rd.nextInt(50);
		}
		
	}

}
