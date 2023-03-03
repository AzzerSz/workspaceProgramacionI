package dam.ej6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		boolean activo = true;
		String frase;
		
		while (activo) {
			System.out.println("Introduce una frase");
			frase = entrada.nextLine();
			if (frase.equals("")) {
				activo = false;
			} else {
				
				System.out.println("Nombre en mayúsculas" + frase.toUpperCase());
				System.out.println("Número de caracteres" + frase.length());
			}
			
		}
		
		entrada.close();

	}

}
