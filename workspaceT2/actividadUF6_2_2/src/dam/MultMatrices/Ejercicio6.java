package dam.MultMatrices;

import java.util.Random;

public class Ejercicio6 {

	static int[][] matriz1;
	static int[][] matriz2;
	
	public static void main(String[] args) {
		matriz1 = new int[3][3];
		matriz2 = new int[3][3];
		
		rellenarMatriz(matriz1);
		rellenarMatriz(matriz2);
		
		System.out.println("*** PRIMERA MATRIZ ***");
		mostrarMatriz(matriz1);
		System.out.println("*** SEGUNDA MATRIZ ***");
		mostrarMatriz(matriz2);
		
		realizarProducto();

	}
	private static void realizarProducto() {
		int[][] producto = new int[3][3];
		
		for (int i = 0; i < producto.length; i++) {
			for (int j = 0; j < producto.length; j++) {
			}
		}
		
		mostrarMatriz(producto);
		
	}
	private static void mostrarMatriz(int [][] matriz) {
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
			
		}
	}

	private static void rellenarMatriz(int [][] matriz) {
		Random rd = new Random();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(9);
			}
		}
		
	}
}
