package dam.ejercicio1;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.println("Indique el número de números aleatorios menores que 200 va a generar");
		int num = Integer.parseInt(entrada.nextLine());
		System.out.println("Indique el valor del que quiere que sean multiplos estos números");
		int multiploDe = Integer.parseInt(entrada.nextLine());
		
		int numAlea;
		int conMultiplo = 0;
		
		for (int i = 0; i < num; i++) {
			numAlea = aleatorio.nextInt(200);
			System.out.print(numAlea);
			
			if (numAlea % multiploDe == 0 && numAlea != 0) {
				System.out.println(" Es multiplo de " + multiploDe);
				conMultiplo++;
			} else {
				System.out.println("");
			}
		}
		
		System.out.println("Se han generado " + conMultiplo + " multiplos de " + multiploDe + " menores que 200");

		entrada.close();
		
		/**----------------------------------------------------*
		 * rd.nextInt(LIM_SUP + 1 - LIM_INF) + LIM_INF;
		 *------------------------------------------------------*/
		
	}

}
