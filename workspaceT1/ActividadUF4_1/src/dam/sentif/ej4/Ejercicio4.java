package dam.sentif.ej4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable Scanner de tipo objeto
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el año");
		// Almacenamos en una variable de enteros mediante los métodos teclado.nextLine
		// y el Integer.parseInt
		int año = Integer.parseInt(teclado.nextLine());
		
		// Analizamos primero la situación en la que un año es finisecular mediante una
		// sentencia de control
		if ((año % 100 == 0) && (año % 4 == 0)) {
			System.out.print("El año es finisecular");
			// Mediante una sentencia de control if expresamos lo siguiente:
			// Si un año es finisecular y además divisible entre 400 será bisiesto
			// por lo contrario no lo será
			if (año % 400 == 0) {
				System.out.println(" y bisiesto (366 días)");
			} else {
				System.out.println(" y no bisiesto (365 días)");
			}
		  // Si al analizar el año no es finisecular pasamos a la comprobación de
		  // si es bisiesto "común"
		} else if ((año % 4 == 0 && año % 100 != 0))
		// El enunciado nos da la siguiente condición: || (año % 100 == 0 && año % 400 == 0))
		// que podemos no analizarla por que ya lo hemos hecho en el anterior "if".
			// Si cumple la condición sacará por consola "El año es bisiesto"
		{
			System.out.println("El año es bisiesto (366 días)");
		  // Por lo contrario dirá que el año es común es decir, tiene 365 días
		} else {
			System.out.println("El año es común (365 días)");
		}
		teclado.close();

	}

}
