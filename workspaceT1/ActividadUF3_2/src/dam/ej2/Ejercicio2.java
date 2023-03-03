package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		String pregunta = "Introduce tu nombre";
		System.out.println(pregunta);
		Scanner teclado = new Scanner(System.in);
		String nombre = teclado.nextLine();
		System.out.println("Buenos días " + nombre);
		teclado.close();
	}

}
