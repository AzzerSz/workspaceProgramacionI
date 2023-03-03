package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cad = entrada.nextLine();
		cad = cad.toUpperCase();
		
		int contVoc = 0;
		int contNoVoc = 0;
		
		for (int i = 0; i < cad.length(); i++) {
			if(cad.charAt(i) == 'A' || cad.charAt(i) == 'E' || cad.charAt(i) == 'I' || cad.charAt(i) == 'O' || cad.charAt(i) == 'U') {
				contVoc++;
			} else {
				contNoVoc++;
			}

		}
		
		System.out.println("La palabra tiene " + contVoc + " vocales" 
		+ " y " + contNoVoc + " no vocales");
		
		entrada.close();

	}

}
