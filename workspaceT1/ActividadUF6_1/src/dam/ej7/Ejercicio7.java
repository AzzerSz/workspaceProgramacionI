package dam.ej7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la primera serie de números separados por comas");
		String cadena1 = entrada.nextLine();
		System.out.println("Introduce la segunda serie de números separados por comas");
		String cadena2 = entrada.nextLine();
		
		StringTokenizer stCadena1 = new StringTokenizer(cadena1, ",");
		StringTokenizer stCadena2 = new StringTokenizer(cadena2, ",");
		
		int suma1 = 0;
		int suma2 = 0;
		
		while (stCadena1.hasMoreTokens()) {
			suma1 += Integer.parseInt(stCadena1.nextToken());
			suma2 += Integer.parseInt(stCadena2.nextToken());
		}
		
		if (suma1 > suma2) {
			System.out.println("La primera serie " + cadena1 + " es mayor que la serie 2");
			
		} else if (suma2 > suma1) {
			System.out.println("La segunda serie " + cadena2 + " es mayor que la serie 1");
		}
		
		entrada.close();

	}

}
