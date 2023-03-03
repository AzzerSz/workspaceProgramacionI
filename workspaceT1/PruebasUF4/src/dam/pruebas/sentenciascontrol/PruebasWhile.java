package dam.pruebas.sentenciascontrol;

import java.util.Scanner;

public class PruebasWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean continuar = true;
		
		// NO PODEMOS DECLARAR VARIABLES DENTRO DE UN BUCLE
		int respuesta;
		while (continuar) {
			System.out.println("Siguen nadando");
			
			System.out.println("¿Deseas continuar? 1- SI, 0 - NO");
			respuesta = Integer.parseInt(teclado.nextLine());
			
			if (respuesta == 0) {
				continuar = false;
			}
		}
		System.out.println("Fin del programa");
		
		teclado.close();

	}

}
