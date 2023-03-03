package dam.sentdowhile.ej1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num = Integer.parseInt(teclado.nextLine());
		
		Random aleatorio = new Random();
		int numAlea = 0;
		
		do {
			numAlea = aleatorio.nextInt(num);
			System.out.println(numAlea);
		} while(numAlea % 2 != 0);
		
		System.out.println(numAlea);
		teclado.close();
	}

}
