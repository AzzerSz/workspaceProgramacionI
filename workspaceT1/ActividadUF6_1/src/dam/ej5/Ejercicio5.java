package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String cadena = entrada.nextLine();
		StringBuilder sbCadena = new StringBuilder(cadena);
		
		for (int i = 0; i < sbCadena.length(); i++) {
			if (sbCadena.charAt(i) == ' ') {
				
				sbCadena.deleteCharAt(i);
			}
			
		}
		
		System.out.println(sbCadena);
		
		entrada.close();

	}

}
