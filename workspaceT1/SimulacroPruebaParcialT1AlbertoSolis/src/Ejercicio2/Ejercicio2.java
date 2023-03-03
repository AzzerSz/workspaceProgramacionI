package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el números de números a introducir");
		int veces = Integer.parseInt(input.nextLine());
		int numero;
		int mul3 = 0;
		int mul5 = 0;
		int mul15 = 0;
		
		for (int i = 1; i <= veces; i++) {
			System.out.println("Introduce un número");
			numero = Integer.parseInt(input.nextLine());
			if (numero % 15 == 0) {
				mul15++;
				mul5++;
				mul3++;
			} else if (numero % 5 == 0) {
				mul5++;
				mul3++;
			} else if (numero % 3 == 0) {
				mul3++;
			}
		}
		System.out.println("Has introducido " + mul3 + " multiplos de 3" 
		+ " Has introducido " + mul5 + " multiplos de 5" 
				+ " Has introducido " + mul15 + " multiplos de 15");
		
		input.close();
	}

}
