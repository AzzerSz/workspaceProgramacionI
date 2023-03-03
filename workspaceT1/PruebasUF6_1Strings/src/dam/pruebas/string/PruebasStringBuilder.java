package dam.pruebas.string;

import java.util.Scanner;

public class PruebasStringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		String sNum = sc.nextLine();
		
		StringBuilder sbNum = new StringBuilder(sNum);
		sbNum.reverse();
		System.out.println(sbNum);
		
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		palabra = palabra.toUpperCase();
		System.out.println(palabra);
		
		StringBuilder sbPalabra = new StringBuilder(palabra);
		sbPalabra.reverse();
		System.out.println(sbPalabra);
		
		sc.close();

	}

}
