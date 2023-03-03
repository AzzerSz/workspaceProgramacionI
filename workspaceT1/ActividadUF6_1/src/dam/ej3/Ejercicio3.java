package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una palabra");
		String cadena = entrada.nextLine();
		
		StringBuilder sbCadena = new StringBuilder(cadena);
		sbCadena.reverse();
		
		if (cadena.equals(sbCadena.toString())) {
			System.out.println("La palabra " + cadena + " es palíndroma");
		} else {
			System.out.println("La palabra " + cadena + " no es palíndroma");
		}
		
		// FORMA 2
		
		boolean esPalindromo = true;
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) != cadena.charAt(cadena.length() - (i + 1))) {
				esPalindromo = false;
			}
			
		}
		
		if (esPalindromo) {
			System.out.println("La palabra " + cadena + " es palíndroma");
		} else {
			System.out.println("La palabra " + cadena + " no es palíndroma");
		}
		
		entrada.close();

	}

}
