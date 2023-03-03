package dam.pruebasio;

import java.util.Scanner;

public class PruebasIO {

	public static void main(String[] args) {
		// Crear una variable de referecia por que el tipo de dato no es
		// primitivo
		String texto = "¿Cuál es tu color favorito?"; 
		
		/* Creamos una variable de referencia (Objeto) de tipo Scanner invocando
		 * a su constructor al que le indicamos que la fuente de información es 
		 * la entrada estandar
		 * Creamos una comunicación con el usuario a través del telcado (Entrada
		 * estandar)
		 */
		Scanner teclado = new Scanner(System.in);
		// Mostramos al usuario la pregunta
		System.out.println(texto);
		// En está línea lo primero que se ejecuta es teclado.nextLine();,
		// que se encarga de leer la línea que el usuario a introducido por teclado
		// y la cadena de caracteres leída se almacena en la variable color
		String color = teclado.nextLine();
		
		// utilizamos el método print para que no añada un salto de línea tras imprimir
		// el texto o la cadena de caracteres que le indiquemos
		System.out.print("Tu color favorito es el ");
		System.out.println(color);
		
		String pregunta = "\n¿Cuál es tu número favorito?";
		
		System.out.println(pregunta);
		String sNum = teclado.nextLine();
		int numero = Integer.parseInt(sNum);
		System.out.println("El doble de tu número favorito es " + (numero * 2));
		
		teclado.close();
	}

}
