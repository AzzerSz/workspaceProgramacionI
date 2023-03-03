package dam.ej2;

/* Este m�todo crea una matriz cuadrada 4x4.
 * Mediante el m�todo rellenarMatriz recorriendo un bucle for y rellena cada posici�n con i + j
 * Mediante el m�todo mostrarArray recorriendo un bucle for y haciendo un sysoPrint por cada columna y un
 * sysoPrintln por cada fila
 * Mediante el m�todo analizarSimetria recorriendo de nuevo un bucle for recorriendo las posiciones sim�tricas
 * (evitando la diagonal de la matriz) y comparando la posisicion [i][j] con [j][i]
 */

/* AlternativaMostrar Arrays.toString(mat[i]) */

public class Ejercicio2 {
	
	static int [][] mat;
	
	public static void main(String[] args) {
		
		int filas = 4;
		int col = 4;
		
		mat = new int[filas][col];
		
		rellenarMatriz();
		
		mostrarArray();
		
		analizarSimetr�a();
	}

	private static void analizarSimetr�a() {
		boolean simetrica = true;
		
		for (int i = 0; i < mat.length - 1; i++) {
			for (int j = i + 1; j < mat[i].length; j++) {
				if (mat[i][j] != mat[j][i]) {
					simetrica = false;
					
					j = mat[i].length;
					i = mat.length - 1;
				}
			}
		}
		
		if (simetrica) {
			System.out.println("La matriz es sim�trica");
		} else {
			System.out.println("La matriz no es sim�trica");
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
				mat [i][j] = i + j;
			}
		}
	
		
	}

}
