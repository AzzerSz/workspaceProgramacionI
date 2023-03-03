package dam.sentif.ej4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variable Scanner de tipo objeto
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el a�o");
		// Almacenamos en una variable de enteros mediante los m�todos teclado.nextLine
		// y el Integer.parseInt
		int a�o = Integer.parseInt(teclado.nextLine());
		
		// Analizamos primero la situaci�n en la que un a�o es finisecular mediante una
		// sentencia de control
		if ((a�o % 100 == 0) && (a�o % 4 == 0)) {
			System.out.print("El a�o es finisecular");
			// Mediante una sentencia de control if expresamos lo siguiente:
			// Si un a�o es finisecular y adem�s divisible entre 400 ser� bisiesto
			// por lo contrario no lo ser�
			if (a�o % 400 == 0) {
				System.out.println(" y bisiesto (366 d�as)");
			} else {
				System.out.println(" y no bisiesto (365 d�as)");
			}
		  // Si al analizar el a�o no es finisecular pasamos a la comprobaci�n de
		  // si es bisiesto "com�n"
		} else if ((a�o % 4 == 0 && a�o % 100 != 0))
		// El enunciado nos da la siguiente condici�n: || (a�o % 100 == 0 && a�o % 400 == 0))
		// que podemos no analizarla por que ya lo hemos hecho en el anterior "if".
			// Si cumple la condici�n sacar� por consola "El a�o es bisiesto"
		{
			System.out.println("El a�o es bisiesto (366 d�as)");
		  // Por lo contrario dir� que el a�o es com�n es decir, tiene 365 d�as
		} else {
			System.out.println("El a�o es com�n (365 d�as)");
		}
		teclado.close();

	}

}
