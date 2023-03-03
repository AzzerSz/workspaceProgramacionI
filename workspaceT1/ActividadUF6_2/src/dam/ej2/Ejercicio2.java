package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	static final int TAM = 10;
	static int[] enteros;
	
	public static void main(String[] args) {
		
		enteros = new int[TAM];
		
		rellenarValores();
		
		mostrarArray();
		
		realizarAnalisis();

	}

	private static void rellenarValores() {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Introduce el " + (i+1) + "º valor");
			enteros[i] = Integer.parseInt(entrada.nextLine());
		}
		entrada.close();
		
	}
	
	private static void mostrarArray() {
		System.out.println("Array introducido:");
		System.out.print("{");
		for (int i = 0; i < enteros.length; i++) {
			
			if (i < (enteros.length - 1)) {
				System.out.print(enteros[i] + ",");
			} else {
				System.out.print(enteros[i]);
			}
		}
		System.out.println("}");
		
	}
	
	private static void realizarAnalisis() {
		
		int contNeg = 0;
		int contPos = 0;
		int contZero = 0;
		
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i] < 0) {
				contNeg++;
			} else if (enteros[i] > 0) {
				contPos++;
			} else {
				contZero++;
			}
		}
		
		System.out.println("El array contiene:");
		System.out.println(contNeg + " Números negativos");
		System.out.println(contPos + " Números positivos");
		System.out.println(contZero + " Ceros");
		
	}

}
