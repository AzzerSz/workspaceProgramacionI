package dam.grupo.ej2;

import java.util.Random;
import java.util.Scanner;

// Esta clase saca un m�ltiplo de 7 menor a un n�mero introducido

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un n�mero");
		int num = Integer.parseInt(teclado.nextLine());
		
		Random aleatorio = new Random();
		int numAlea = 0;
		
		// Realiza un bucle sacando n�meros aleatorios hasta que haya un m�ltiplo de 7
		do {
			numAlea = aleatorio.nextInt(num);
		} while(numAlea % 7 != 0);
		
		// Printeamos el primer m�ltiplo de 7 que haya salido
		System.out.println(numAlea);
		teclado.close();

	}

}
