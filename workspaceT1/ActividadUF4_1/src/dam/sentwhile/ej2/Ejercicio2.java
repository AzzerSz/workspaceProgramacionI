package dam.sentwhile.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indica la cantidad de números que vas a introducir");
		int n = Integer.parseInt(teclado.nextLine());
		
		int contador = 1;
		int num;
		
		while (contador <= n) {
			System.out.println("Introduce un número " + contador);
			num = Integer.parseInt(teclado.nextLine());
			if (num % 2 == 0) {
				System.out.println(num + " es PAR");
			} else {
				System.out.println(num + " es IMPAR");
			}
			contador++;
		}
		
		System.out.println("\nFin del programa");
		
		teclado.close();

	}

}
