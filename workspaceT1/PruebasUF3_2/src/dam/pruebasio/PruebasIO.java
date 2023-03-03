package dam.pruebasio;

import java.util.Scanner;

public class PruebasIO {

	public static void main(String[] args) {
		// Crear una variable de referecia por que el tipo de dato no es
		// primitivo
		String texto = "�Cu�l es tu color favorito?"; 
		
		/* Creamos una variable de referencia (Objeto) de tipo Scanner invocando
		 * a su constructor al que le indicamos que la fuente de informaci�n es 
		 * la entrada estandar
		 * Creamos una comunicaci�n con el usuario a trav�s del telcado (Entrada
		 * estandar)
		 */
		Scanner teclado = new Scanner(System.in);
		// Mostramos al usuario la pregunta
		System.out.println(texto);
		// En est� l�nea lo primero que se ejecuta es teclado.nextLine();,
		// que se encarga de leer la l�nea que el usuario a introducido por teclado
		// y la cadena de caracteres le�da se almacena en la variable color
		String color = teclado.nextLine();
		
		// utilizamos el m�todo print para que no a�ada un salto de l�nea tras imprimir
		// el texto o la cadena de caracteres que le indiquemos
		System.out.print("Tu color favorito es el ");
		System.out.println(color);
		
		String pregunta = "\n�Cu�l es tu n�mero favorito?";
		
		System.out.println(pregunta);
		String sNum = teclado.nextLine();
		int numero = Integer.parseInt(sNum);
		System.out.println("El doble de tu n�mero favorito es " + (numero * 2));
		
		teclado.close();
	}

}
