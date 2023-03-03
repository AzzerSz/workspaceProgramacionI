package dam.ej1;

/* Esta clase crear� un array de enteros cuadrado 4x4
 * Lo rellenar� mediante el m�todo "rellenarMatriz" que recorrer� un bucle for rellenando cada posici�n
 * con i + j P.Ej: [1,2] = 3
 * Lo mostrar� mediante el m�todo "mostrarMatriz" que recorrer� un bucle for que har� un sysoPrint por cada
 * columna y un sysoPrintln para las filas */

/* Alternativa Arrays.toString(mat[i]) */

public class Ejercicio1 {

	static int [][] mat;
	
	public static void main(String[] args) {
		
		int filas = 4;
		int col = 4;
		
		mat = new int[filas][col];
		
		rellenarMatriz();
		
		mostrarArray();
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
				mat [i][j] = i + j;
			}
		}
	}

}
