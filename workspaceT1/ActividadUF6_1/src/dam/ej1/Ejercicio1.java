package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// OPCIÓN 1
		
		Scanner entrada = new Scanner(System.in);
		String cadena = entrada.nextLine();
		int contMay = 0;
		int contMin  = 0;

		for (int i = 0; i < cadena.length(); i++) {
		if (cadena.charAt(i) == ' ') {
			
			} else if(cadena.charAt(i) == cadena.toUpperCase().charAt(i) ) {
				contMay++;
			} else if (cadena.charAt(i) == cadena.toLowerCase().charAt(i)) {
				contMin++;
			}
			
		}
		
		System.out.println("OPCIÓN 1: \nLa cadena tiene " + contMay + " mayúsculas y " + contMin + " minúsculas");
		entrada.close();

		contMay = 0;
		contMin  = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if (Character.isUpperCase(cadena.charAt(i))) {
				contMay++;
			} else if (Character.isLowerCase(cadena.charAt(i))) {
				contMin++;
			}
		}
		
		System.out.println("OPCIÓN 2: \nLa cadena tiene " + contMay + " mayúsculas y " + contMin + " minúsculas");
		
	}

}
