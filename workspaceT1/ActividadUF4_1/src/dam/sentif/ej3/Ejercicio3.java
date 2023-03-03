package dam.sentif.ej3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creeamos una variable de referencia de tipo Scanner
		Scanner teclado = new Scanner(System.in);
		
		// Creamos una variable primitiva
		int salario;
		
		// Escribimos por consola Introduce las horas trabajadas
		System.out.println("Hola, bienvenid@");
		System.out.println();
		System.out.println("Introduce las horas trabajadas");
		
		// Leemos las horas introducidas como String y las almacenamos como tipo entero
		// mediante el método parseInt
		int horas = Integer.parseInt(teclado.nextLine());
		
		/* Creamos una sentencia de control con una condición de tipo booleana
		en el que si la variable horas es menor o igual a 40 simplemente
		se multipliquen esas horas por 16 pero si ocurre otra cosa el salario
		será igual a 40 * 16 más la diferencia entre esas 40 horas y la variable horas
		* 20*/
		if (horas <= 40) {
			salario = horas * 16;
			System.out.println("Su salario será de " + salario + " $");
		} else {
			salario = 40 * 16 + (horas - 40) * 20;
			System.out.println("Su salario será de " + salario + " $");
		}
		
		// Cerramos el Scanner
		teclado.close();

	}

}
