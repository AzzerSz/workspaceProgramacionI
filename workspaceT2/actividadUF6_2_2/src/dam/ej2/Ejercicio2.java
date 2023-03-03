package dam.ej2;

/* Este método crea una matriz cuadrada 4x4.
 * Mediante el método rellenarMatriz recorriendo un bucle for y rellena cada posición con i + j
 * Mediante el método mostrarArray recorriendo un bucle for y haciendo un sysoPrint por cada columna y un
 * sysoPrintln por cada fila
 * Mediante el método analizarSimetria recorriendo de nuevo un bucle for recorriendo las posiciones simétricas
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
		
		analizarSimetría();
	}

	private static void analizarSimetría() {
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
			System.out.println("La matriz es simétrica");
		} else {
			System.out.println("La matriz no es simétrica");
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
