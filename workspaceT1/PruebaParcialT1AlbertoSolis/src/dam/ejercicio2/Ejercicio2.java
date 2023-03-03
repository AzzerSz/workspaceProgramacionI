package dam.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numEntrada;
		int numeroAnterior = 0;
		
		int contMayor = 0;
		int contMenor = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Introduce el " + i + "º valor");
			numEntrada = Integer.parseInt(entrada.nextLine());
			
			if (i == 1) {
				numeroAnterior = numEntrada;
			}
			
			if (numEntrada < numeroAnterior) {
				contMenor++;
				numeroAnterior = numEntrada;
				
			} else if (numEntrada > numeroAnterior) {
				numeroAnterior = numEntrada;
				contMayor++;
			}
			
		}
		
		System.out.println(contMayor + " números son mayores que el anterior y " 
				+ contMenor + " menores que el anterior" );
		
		entrada.close();

	}

}
