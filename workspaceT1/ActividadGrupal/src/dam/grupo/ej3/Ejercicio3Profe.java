package dam.grupo.ej3;

import java.util.Scanner;

public class Ejercicio3Profe {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero entero");
		int num = Integer.parseInt(input.nextLine());
		
		boolean esPrimo = esPrimo(num);
		
		if (esPrimo) {
			System.out.println("El n�mero " + num + " es primo");
		} else {
			System.out.println("El n�mero " + num + " no es primo");
		}
		
		input.close();
	}

	private static boolean esPrimo(int num) {
		boolean esPrimo = true;
		for (int i = 2; i <= num/2 && esPrimo; i++) {
			if (num % i == 0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}

}
