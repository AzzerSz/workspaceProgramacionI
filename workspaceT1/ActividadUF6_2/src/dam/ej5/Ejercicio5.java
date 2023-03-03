package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {
	
	static Scanner entrada;
	static double[] alturas;
	
	public static void main(String[] args) {
		
		inicializarArray();
		
		pedirAltura();
		
		entrada.close();
		
		numeroAlturas(mediaAltura());

	}

	public static void inicializarArray() {
		entrada = new Scanner(System.in);
		System.out.println("Introduce el número de alturas a introducir");
		alturas = new double[Integer.parseInt(entrada.nextLine())];
	}

	private static void numeroAlturas(double media) {
		
		int contAltMayor = 0;
		int contAltMenor = 0;
		
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i] > media) {
				contAltMayor++;
			} else if (alturas[i] < media) {
				contAltMenor++;
			}
		}
		System.out.println("Hay " + contAltMayor + " personas con una altura superior a la media y " 
		+ contAltMenor + " personas con una altura inferior a la media");
	}

	private static double mediaAltura() {
		double suma = 0;
		for (int i = 0; i < alturas.length; i++) {
			suma += alturas[i];
		}
		double media = (double)suma/alturas.length;
		System.out.println("La media de las alturas es " + media + " metros");
		return media;
		
	}

	private static void pedirAltura() {
		
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Introduce la " + (i+1) + "º Altura en metros");
			alturas[i] = Double.parseDouble(entrada.nextLine());
		}
		
	}

}
