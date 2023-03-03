package dam.ej1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MatrizBidiCuadrada {
	
	static final int MAX = 10;
	static final int MIN = 1;
	static final int MUL = 3;

	static int[][] mat;
	
	public static void main(String[] args) {
		inicializarMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		analisisMatriz();

	}

	private static void analisisMatriz() {
		int sumaSup = 0;
		int sumaInf = 0;
		
		for (int i = 0; i < mat.length - 1; i++) {
			for (int j = 0; j < mat[i].length - (i+1); j++) {
				sumaSup += mat[i][j];
				sumaInf += mat[mat.length - (j + 1)][mat.length - (i + 1)];
			}
		}
		
		System.out.println("La suma del triangulo superior es " + sumaSup);
		System.out.println("La suma del triangulo inferior es " + sumaInf);
		
		if (sumaSup > sumaInf) {
			System.out.println("\nLa suma del triangulo superior es mayor a la del inferior");
		} else  if (sumaInf > sumaSup){
			System.out.println("\nLa suma del triangulo inferior es mayor a la del inferior");
		} else if (sumaInf == sumaSup) {
			System.out.println("\nLos dos triángulos tienen igual suma");
		}
	}

	private static void mostrarMatriz() {
		for (int i = 0; i < mat.length; i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
		
	}

	private static void rellenarMatriz() {
		
		// mat.length = mat[i].length
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = generarAlea();
			}
		}
		
	}

	private static int generarAlea() {
		Random rd = new Random();
		int alea = 0;
		
		do {
			alea = rd.nextInt(MAX + 1 - MIN) + MIN;
		} while (alea % MUL == 0);
		return alea;
	}

	private static void inicializarMatriz() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número de filas y columnas (La matriz que crearás será una matriz cuadrada)");
		int n = Integer.parseInt(sc.nextLine());
		
		mat = new int[n][n];
		
		sc.close();
		
	}

}
