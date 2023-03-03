package dam.ej5;

import java.util.Random;
import java.util.Scanner;

/* Esta clase declara una matriz que pide al usuario introducir el número de f y c
 * Para
 */

public class Ejercicio5 {
	
	static int [][] matriz;

	public static void main(String[] args) {
		
		inicializarMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz(matriz);
		
		mostrarVertices();

	}
	
	private static void mostrarVertices() {
		int [][] vertices = new int[2][2];
		
		vertices[0][0] = matriz[0][0];
		vertices[0][1] = matriz[0][matriz[1].length - 1];
		vertices[1][0] = matriz[matriz.length - 1][0];
		vertices[1][1] = matriz[matriz.length - 1][matriz[1].length - 1];
		System.out.println("Vertices de la matriz:");
		mostrarMatriz(vertices);
	}

	private static void mostrarMatriz(int[][] mat) {
		System.out.println();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			
			System.out.println();
			
		}
	}

	private static void rellenarMatriz() {
		Random rd = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(50 + 1 - 10) + 10;
			}
		}
		
	}

	private static void inicializarMatriz() {
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce el número de filas");
		int f = Integer.parseInt(ent.nextLine());
		System.out.println("Introduce el número de columnas");
		int c = Integer.parseInt(ent.nextLine());
		ent.close();
		
		matriz = new int[f][c];
		
	}

}
