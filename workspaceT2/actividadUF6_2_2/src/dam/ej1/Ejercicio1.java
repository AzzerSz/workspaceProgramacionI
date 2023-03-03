package dam.ej1;

/* Esta clase creará un array de enteros cuadrado 4x4
 * Lo rellenará mediante el método "rellenarMatriz" que recorrerá un bucle for rellenando cada posición
 * con i + j P.Ej: [1,2] = 3
 * Lo mostrará mediante el método "mostrarMatriz" que recorrerá un bucle for que hará un sysoPrint por cada
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
