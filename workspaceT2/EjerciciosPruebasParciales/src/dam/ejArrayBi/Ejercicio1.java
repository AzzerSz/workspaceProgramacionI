package dam.ejArrayBi;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
	
	static int[][] a;

	public static void main(String[] args) {
		
		inicializarMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		analisisMatriz();

	}

	private static void analisisMatriz() {
		int suma = 0;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				suma += a[i][j];
				
				if (j == a[i].length - 1) {
					if (suma > a[i].length * 20) {
						System.out.println("\nLa fila " + (i+1) + " es mayor a m * 20 " + suma + ", m * 20 = " + a[i].length*20);
						suma = 0;
					} else {
						suma = 0;
					}
				}
			}
		}
		
	}

	private static void mostrarMatriz() {
		for (int i = 0; i < a.length; i++) {
			if (i != 0) {
				System.out.println();
			}
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
		
	}

	private static void rellenarMatriz() {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = generarAlea();
			}
		}
		
	}

	private static int generarAlea() {
		Random rd = new Random();
		int alea = 0;
		
		do {
			alea = rd.nextInt(180 + 1 - 3) + 3;
		} while (alea % 3 != 0 && alea % 2 != 0);
		return alea;
	}

	private static void inicializarMatriz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de filas");
		int f = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el número de columnas");
		int c = Integer.parseInt(sc.nextLine());
		sc.close();
		
		a = new int[f][c];
		
	}

}
