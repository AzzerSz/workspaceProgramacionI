package dam.ejBArrayBi;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	static final int MULANALISIS = 25;
	static final int MAX = 200;
	static final int MIN = 5;
	static final int MULTIPLO = 5;
	
	static int[][] mat;
	
	public static void main(String[] args) {
		inicializarArray();
		
		rellenarArray();
		
		mostrarArray();
		
		analisisArray();

	}

	private static void analisisArray() {
		int suma = 0;
		
		for (int i = 0; i < mat[0].length; i++) {
			for (int j = 0; j < mat.length; j++) {
				suma += mat[j][i];
				if (j == mat.length - 1) {
					if (suma < (mat.length * MULANALISIS)) {
						System.out.println("La columna " + (i+1) + " es menor a " + mat.length + " * 20");
						suma = 0;
					} else {
						suma = 0;
					}
				}
			}
		}
		
	}

	private static void mostrarArray() {
		for (int i = 0; i < mat.length; i++) {
			if (i != 0) {
				System.out.println();
			}
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
		System.out.println();
	}

	private static void rellenarArray() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = generarAlea();
			}
		}
	}

	private static int generarAlea() {
		Random rd = new Random();
		int numAlea = 0;
		
		do {
			numAlea = rd.nextInt(MAX + 1 - MIN) + MIN;
		} while (numAlea % MULTIPLO != 0 || numAlea % 2 == 0);
		return numAlea;
	}

	private static void inicializarArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Indique el número de filas");
		int f = solEnteroPositivo(sc);
		System.out.println("Indique el número de columnas");
		int c = solEnteroPositivo(sc);
		
		mat = new int[f][c];
		sc.close();
		
	}

	private static int solEnteroPositivo(Scanner sc) {
		int num = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				num = Integer.parseInt(sc.nextLine());
				
				if (num < 0) {
					throw new Exception("Introduce un valor entero positivo");
				}
				
				valNoVal = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Introduce un valor entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return num;
	}

}
