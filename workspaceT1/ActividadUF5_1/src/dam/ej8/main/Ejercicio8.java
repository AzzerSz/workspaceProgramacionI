package dam.ej8.main;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int anyo;
		int paso1 = 0;
		int suma = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu fecha de nacimiento (día)");
		dia = Integer.parseInt(entrada.nextLine());
		System.out.println("Introduce tu fecha de nacimiento (mes)");
		mes = Integer.parseInt(entrada.nextLine());
		System.out.println("Introduce tu fecha de nacimiento (año)");
		anyo = Integer.parseInt(entrada.nextLine());
		entrada.close();
		
		paso1 = dia + mes + anyo;
		System.out.println(paso1);
		
		// paso2
		for (int i = 10; i < 10000; i = i * 10) {
			suma =+ paso1 % i;
			paso1 = paso1/10;
			System.out.println(suma);
		}
	}
}
