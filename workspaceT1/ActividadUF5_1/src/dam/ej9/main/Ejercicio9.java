package dam.ej9.main;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = Integer.parseInt(entrada.nextLine());
		entrada.close();
		
		boolean si = esPrimo(numero);
		boolean si2 = false;
		
		int c;
		int r;
		
		if(si) {
			System.out.println("El numero "+ numero + " es primo");
			c = numero;
			r = 0;
			numero = 0;
			while (c > 0) {
				r = c % 10;
				c = c / 10;
				numero = numero * 10 + r;
				si2 = esPrimo(numero);
			}
		}
		
		if(si2) {
			System.out.println("El número: " + numero + " es Omirp");
		}
	}


	public static boolean esPrimo(int numero) {
		boolean si = true;
		
		for (int i = 2; i < numero/2 && si; i++) {
			if (numero % i == 0) {
				si = false;
			}
		}
		
		return si;
	}

}
