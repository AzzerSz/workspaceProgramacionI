package Ejercicio2.otro;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int mul7 = 0;
		int div350 = 0;
		int numero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la cantidad de numeros a introducir");
		int cantidad = Integer.parseInt(entrada.nextLine());
		
		for (int i = 0; i < cantidad; i++) {
			System.out.println("Introduce un número entero y positivo");
			numero = Integer.parseInt(entrada.nextLine());
			
			if (numero % 7 == 0 ) {
				mul7++;
			}
			
			if (350 % numero == 0) {
				div350++;
			}
		}
		
		System.out.println("Has introducido " + div350 + " divisores de 350" 
		+ " y has introducido " + mul7 + " multiplos de 7");
		
		entrada.close();

	}

}
