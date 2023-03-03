package dam.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un número de 5 dígitos");
		String frase = entrada.nextLine();
		
		int suma = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("El " + frase.charAt(i));
			suma += Integer.parseInt(frase.substring(i, i+1));
		}
		
		System.out.println(suma);
		entrada.close();

	}

}
