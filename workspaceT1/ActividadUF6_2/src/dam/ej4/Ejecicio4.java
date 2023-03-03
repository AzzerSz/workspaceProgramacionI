package dam.ej4;

import java.util.Scanner;

public class Ejecicio4 {

	static final int TAM = 10;
	static int[] enteros;
	
	public static void main(String[] args) {
		
		enteros = new int[TAM];

		rellenarValores();
		
		mediaPosPar();
	}

	private static void rellenarValores() {
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Introduce el " + (i+1) + "º valor de la posición " + i);
			enteros[i] = Integer.parseInt(entrada.nextLine());
		}
		
		entrada.close();
		
	}

	private static void mediaPosPar() {
		float suma = 0;
		float contSuma = 0;
		
		for (int i = 0; i < enteros.length; i++) {
			if (i % 2 == 0) {
				suma += enteros[i];
				contSuma++;
				
			}
			
		}
		System.out.println(suma);
		System.out.println(contSuma);
		
		System.out.println("Media de las posiciones pares del array " + (suma / contSuma));
	}

}
