package dam.ej6;

import java.util.Random;

public class Ejercicio6 {

	static int[][] mat;
	
	public static void main(String[] args) {
		int filas = 4;
		int col = 4;
		
		mat = new int[filas][col];
		
		rellenarMatriz();
		
		mostrarArray();

		mostrarSuma();
		
		calcularSumaDiagonal();
	}


	private static void calcularSumaDiagonal() {
		int suma = 0;
		int sumaDI = 0;
		for (int i = 0; i < mat.length; i++) {
			suma += mat[i][i];
			sumaDI += mat[i][mat.length - (i + 1)];
		}
		System.out.println("La suma de la diagonal es " + suma);
		System.out.println("La suma de la diagonal inversa es " + sumaDI);
	}

	private static void mostrarSuma() {
		int sumaF = 0;
		int sumaC = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				sumaF += mat[i][j];
				sumaC += mat[j][i];
				if (i == 0 && j == 3 || i == 1 && j == 3 || i == 2 && j == 3 || i == 3 && j == 3) {
					System.out.println("La suma de la " + (i+1) + "º fila es " + sumaF);
					sumaF = 0;
				}
				
				if (j == 0 && i == 3 || j == 1 && i == 3 || j == 2 && i == 3 || j == 3 && i == 3) {
					System.out.println("La suma de la " + (i+1) + "º columna es " + sumaC);
					sumaC = 0;
				}
			}
		}
		
	}


	private static void mostrarArray() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}

	private static void rellenarMatriz() {
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat [i][j] = obtenerAleatorio(10, 50);
			}
		}
	}

	private static int obtenerAleatorio(int min, int max) {
		Random rd = new Random();
		return rd.nextInt(max + 1 - min) + min;
	}

}
