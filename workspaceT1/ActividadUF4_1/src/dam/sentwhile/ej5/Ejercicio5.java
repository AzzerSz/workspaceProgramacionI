package dam.sentwhile.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		boolean positivo = true;
		int num;
		int contador = 0;
		
		while (positivo) {
			System.out.println("Introduce un número entero positivo");
			num = Integer.parseInt(teclado.nextLine());
			if (num > 0) {
				positivo = false;
				while (contador <= num) {
					contador++;
					if (num % contador == 0 && contador != num) {
						System.out.print(contador + ",");
					} else if (num % contador == 0 && contador == num) {
						System.out.print(" y " + contador + ".");
					}
				}
			}
		}
		
		teclado.close();
		
	}

}
