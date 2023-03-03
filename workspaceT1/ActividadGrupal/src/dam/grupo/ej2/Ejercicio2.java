package dam.grupo.ej2;

import java.util.Random;
import java.util.Scanner;

// Esta clase saca un múltiplo de 7 menor a un número introducido

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num = Integer.parseInt(teclado.nextLine());
		
		Random aleatorio = new Random();
		int numAlea = 0;
		
		// Realiza un bucle sacando números aleatorios hasta que haya un múltiplo de 7
		do {
			numAlea = aleatorio.nextInt(num);
		} while(numAlea % 7 != 0);
		
		// Printeamos el primer múltiplo de 7 que haya salido
		System.out.println(numAlea);
		teclado.close();

	}

}
