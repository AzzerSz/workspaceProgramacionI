package dam.grupo.ej4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entero");
		int num = Integer.parseInt(sc.nextLine());

		System.out.print("Primos menores que num : ");

		for (int i = 2; i < num; i++) {

			if (esPrimo(i)) {

				System.out.print(i + " ");

			}

		}

		sc.close();
	}

	private static boolean esPrimo(int num) {
		boolean esPrimo = true;

		for (int i = 2; i <= num / 2 && esPrimo; i++) {

			if (num % i == 0) {

				esPrimo = false;
			}
		}
		return esPrimo;
	}

}
