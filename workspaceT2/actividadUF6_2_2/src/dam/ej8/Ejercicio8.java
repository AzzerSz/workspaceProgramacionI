package dam.ej8;

import java.util.Scanner;

public class Ejercicio8 {
	
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas de las matrices");
		int filas = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el número de columnas de las matrices");
		int columnas = Integer.parseInt(sc.nextLine());
		
		int[][] matA = new int[filas][columnas];
		int[][] matB = new int[filas][columnas];
		
		rellenarMatriz(matA, "A");
		
		rellenarMatriz(matB, "B");
		
		sc.close();
		
		mostrarMatriz(matA, "A");
		
		mostrarMatriz(matB, "B");
		
		analisisIgualdad(matA, matB);

	}

	private static void mostrarMatriz(int[][] mat, String nombre) {
		System.out.println();
		System.out.println("*** Matriz " + nombre + " ***");
		for (int i = 0; i < mat.length; i++) {
			System.out.println();
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
		}
		
	}

	private static void analisisIgualdad(int[][] matA, int[][] matB) {
		boolean igual = true;

			for (int i = 0; i < matB.length; i++) {
				for (int j = 0; j < matB[i].length; j++) {
					if (matA[i][j] != matB[i][j]) {
						igual = false;
						i = matB.length - 1;
						j = matB[i].length;
					}
				}
			}
			
		System.out.println("\n");
		
		if (igual == false) {
			System.out.println("Las matrices no son iguales");
		} else {
			System.out.println("Las matrices son iguales");
		}
	}

	private static void rellenarMatriz(int[][] mat, String nombre) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.println("Introduce la posición [" + (i+1) + ", " + (j + 1) + "] de la matriz " + nombre);
				mat[i][j] = Integer.parseInt(sc.nextLine());
			}
		}
		
	}

}
