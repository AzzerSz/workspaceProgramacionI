package dam.ej3;

import java.util.Random;

/* La clase crea un array regular 3x4 
 * Consta de un método rellenarArray donde recorriendo dos bucles for se rellena con núumeros aleatorios del 10 al 50
 * El método mostrar mediante dos bucles for de nuevo hace uun syso de la matriz
 * El método encontrarMayor recorre dos bucles for y compara cada posición con la anterior almacenando
 * en la variable mayor si mayor < quue pos.Actual entonces mayor = pos.Actual guardamos también las posiciones
 */

public class Ejercicio3 {
	
static int [][] mat;
	
	public static void main(String[] args) {
		
		int filas = 3;
		int col = 4;
		
		mat = new int[filas][col];
		
		rellenarMatriz();
		
		mostrarArray();
		
		encontrarMayor();
	}

	private static void encontrarMayor() {
		int mayor = 0;
		int f = 0;
		int c = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if(mayor < mat[i][j]) {
					mayor = mat[i][j];
					f = i;
					c = j;
				}
			}
		}
		
		System.out.println("El número más grande de la matriz es: " + mayor 
				+ " y se encuentra en la posición [" + (f+1) + ", " + (c+1) + "]" );
		
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
