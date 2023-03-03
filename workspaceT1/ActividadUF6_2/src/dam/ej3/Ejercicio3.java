package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	static final int TAM = 10;
	static int[] enteros;
	
	public static void main(String[] args) {
		
		enteros = new int[TAM];

		rellenarArray();
		
		mediaSumas();
		
	}

	private static void rellenarArray() {
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Introduce el " + (i + 1) + "º valor");
			enteros[i] = Integer.parseInt(entrada.nextLine());
		}
		
		entrada.close();
	}

	private static void mediaSumas() {
		
		int sumaPos = 0;
		int contPos = 0;
		int sumaNeg = 0;
		int contNeg = 0;
		
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] < 0) {
				sumaNeg += enteros[i];
				contNeg++;
			} else if (enteros[i] > 0) {
				sumaPos += enteros[i];
				contPos++;
			}
		}
		
		if (contPos != 0) {
			System.out.println("Media de la suma de números positivos " + ((double)sumaPos / contPos));
		}
		
		if (contNeg != 0) {
			System.out.println("Media de la suma de de números negativos " + ((double)sumaNeg / contNeg));
		}
		
	}

}
