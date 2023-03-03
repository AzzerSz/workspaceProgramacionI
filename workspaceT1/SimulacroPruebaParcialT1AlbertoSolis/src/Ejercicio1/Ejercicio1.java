package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numeros;
		int suma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Introduce un número para agregar a la suma");
			numeros = Integer.parseInt(input.nextLine());
			if (numeros < 0) {
				numeros = numeros * (-1);
			}
			suma = numeros + suma;
		}
		System.out.println(suma);

		input.close();
	}

}
