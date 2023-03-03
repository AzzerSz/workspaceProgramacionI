package dam.pruebas.sentenciascontrol;

import java.util.Scanner;

public class PruebasDoWhile {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
		
		// NO PODEMOS DECLARAR VARIABLES DENTRO DE UN BUCLE
		int respuesta;
		
		boolean continuar = true;
		do {
			System.out.println("Siguen nadando");
			
			System.out.println("¿Deseas continuar? 1- SI, 0 - NO");
			respuesta = Integer.parseInt(teclado.nextLine());
			
			if (respuesta == 0) {
				continuar = false;
			}
		} while (continuar);
		System.out.println("Fin del programa");
		teclado.close();
	}

}
