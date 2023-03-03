package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	static final int TAM = 10;
	static int[] vector;
	
	public static void main(String[] args) {
		
		vector = new int[TAM];
		
		rellenarValores();
		
		mostrarArray();

	}

	private static void rellenarValores() {
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Introduce el " + (i+1) + "º valor");
			vector[i] = Integer.parseInt(entrada.nextLine());
		}
		
		entrada.close();
		
	}
	
	private static void mostrarArray() {
		System.out.println("Valores del array");
		for (int i = 0; i < vector.length; i++) {
			System.out.println((i+1) + "º vector[" + i + "]:" + vector[i]);
		}
		
	}

}
