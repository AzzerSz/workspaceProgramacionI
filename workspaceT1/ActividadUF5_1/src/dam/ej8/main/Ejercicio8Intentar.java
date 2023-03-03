package dam.ej8.main;

import java.util.Scanner;

public class Ejercicio8Intentar {

	public static void main(String[] args) {
		
		int dia;
		int mes;
		int anyo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu fecha de nacimiento (día)");
		dia = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Introduce tu fecha de nacimiento (mes)");
		mes = Integer.parseInt(entrada.nextLine());
		
		System.out.println("Introduce tu fecha de nacimiento (año)");
		anyo = Integer.parseInt(entrada.nextLine());
		
		entrada.close();
		
		int suma = dia + mes + anyo;
		
		int c;
		int r;
		
		while (suma >= 10) {
			c = suma;
			suma = 0;
			
			while (c > 0) {
				
				r = c % 10;
				c = c / 10;
				suma += r;
				
			}
			
		}
		
		System.out.println(suma);

	}

}
