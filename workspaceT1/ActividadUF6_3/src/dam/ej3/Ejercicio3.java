package dam.ej3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio3 {

	final static char VOCAL = 'e';
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce 5 palabras separadas por comas");
		String linea = entrada.nextLine();
		
		StringTokenizer st = new StringTokenizer(linea, ",");
		String palabra;
		
		while(st.hasMoreTokens()) {
			palabra = st.nextToken().trim().toLowerCase();
			
			if (palabra.contains("a") || palabra.contains("i") || palabra.contains("o") || palabra.contains("u")) {
				System.out.println("\nLa palabra " + palabra + " no contiene la " + VOCAL + " como única vocal.");
			} else if (palabra.contains("e")) {
				System.out.println("\nLa palabra " + palabra + " contiene la " + VOCAL + " como única vocal.");
				calcularCantidadEs(palabra);
			} else {
				System.out.println("La palabra " + palabra + " no tiene vocales");
			}
		}
		

		entrada.close();
	}

	private static void calcularCantidadEs(String palabra) {
		int posE = palabra.indexOf('e');
		
		int contE = 0;
		
		while (posE != -1) {
			contE++;
			
			posE = palabra.indexOf('e', posE+1);
			
		}
		
		System.out.println("La palabra" + palabra + " contiene " + contE + " es");
		
	}

}
