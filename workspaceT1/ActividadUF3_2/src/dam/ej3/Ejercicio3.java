package dam.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Sacamos por consola Escribe un n�mero
		System.out.println("Escribe un n�mero");
		/* Creamos una variable de referencia (Objeto) 
		 * de tipo Scanner
		 */
		Scanner teclado = new Scanner(System.in);
		/* Creamos una variable de referencia (Objeto) de tipo
		 * String y guardamos en esta el valor introducido
		 * por consola
		 */
		String sNum = teclado.nextLine();
		/* Declaramos una variable primitiva de tipo int 
		 * y realizamos un cambio de unidad de String a int
		 */
		int num = Integer.parseInt(sNum);
		/* Printeamos el doble del numero multiplicando la
		 * variable num por dos y por tres para obtener el triple
		 * tambi�n
		 */
		System.out.println(("El doble del n�mero es " + num * 2));
		System.out.println(("El triple del n�mero es " + num * 3));
		// Cerramos la variable de referencia Scanner
		teclado.close();

	}

}
