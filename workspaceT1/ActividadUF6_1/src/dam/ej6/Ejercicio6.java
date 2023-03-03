package dam.ej6;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de caracteres");
		String cadena = entrada.nextLine();
		
		int cont = 0;
		int cont2 = 1;
		
		while (cadena.length() > cont) {
			System.out.println("Letra " + cont2 + ": " + cadena.substring(cont, cont2));
			cont++;
			cont2++;
			
			
			
		}
		entrada.close();
	}
}
