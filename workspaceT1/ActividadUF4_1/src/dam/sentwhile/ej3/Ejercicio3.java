package dam.sentwhile.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce cantidad de numeros que vas a introducir");
		int n = Integer.parseInt(teclado.nextLine());
		int contador = 1;
		int contadorNegativos = 0;
		int contadorPositivos = 0;
		
		int num;
		
		while (contador <= n) {
			System.out.println("Introduce el número (repetición " + contador + ")" );
			num = Integer.parseInt(teclado.nextLine());
			contador++;
			if (num < 0) {
				System.out.println("Es negativo");
				contadorNegativos++;
			} else if (num > 0) {
				System.out.println("Es positivo");
				contadorPositivos++;
			} else {
				System.out.println("Es un cero");
			}
		}
		System.out.println("El numero de negativos es " + contadorNegativos 
				+ " El numero de positivos es " + contadorPositivos);
		teclado.close();
	}

}
