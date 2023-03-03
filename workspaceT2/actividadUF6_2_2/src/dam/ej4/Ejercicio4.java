package dam.ej4;

import java.util.Random;
import java.util.Scanner;

/* Esta clase consta de un m�todo inicializar matriz que solicita el nuumero de f y c por teclado e inicializa
 * el array
 * El m�todo relleanr matriz mediante un random rellena con n�meros aleatorios del 10 al 50
 * El m�todo mostrar matriz exactamente igual a las anteriores clases
 * El m�todo intercambiar filas intercambia la fila de la posici�n 0 por la de la posici�n 1 para ello
 * recorre un bucle for donde mediante una variable auxiliar guarda un valor y lo vuelve cambiar en la 
 * posici�n objetivo luego de haber cambiado una posici�n2 por la posici�n 1
 */

public class Ejercicio4 {

	static int [][] matriz;
	
	public static void main(String[] args) {
		
		inicializarMatriz();
		
		rellenarMatriz();
		
		mostrarMatriz();
		
		intercambiarFilas(0, 1);
		
		mostrarMatriz();

	}

	private static void intercambiarFilas(int f1, int f2) {
		int valor;
		
			for (int j = 0; j < matriz[f2].length; j++) {
				valor = matriz[f2][j];
				matriz[f2][j] = matriz[f1][j];
				matriz[f1][j] = valor;
			}
		
	}

	private static void mostrarMatriz() {
		System.out.println();
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
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
		System.out.println("Introduce el n�mero de filas");
		int f = Integer.parseInt(ent.nextLine());
		System.out.println("Introduce el n�mero de columnas");
		int c = Integer.parseInt(ent.nextLine());
		ent.close();
		
		matriz = new int[f][c];
		
	}

}
