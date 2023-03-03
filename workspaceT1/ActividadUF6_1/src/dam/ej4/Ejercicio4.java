package dam.ej4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String s = entrada.nextLine();
		
		System.out.println("Introduce una letra");
		String x = entrada.nextLine();
		
		char xMin = x.charAt(0);
		x = x.toUpperCase();
		char xMay = x.charAt(0);
		
		s = s.replace(xMin, xMay);
		
		entrada.close();

		System.out.println(s);
	}

}
