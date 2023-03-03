package dam.pruebas.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class PruebasStringTokenizer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena de caracteres");
		String cadena = sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(cadena, " ", true);
		
		System.out.println("La cadena introducida tiene " + st.countTokens() + " palabras");
		
		
		String palabra;
		while (st.hasMoreTokens()) {
			palabra = st.nextToken();
			System.out.println(palabra + " con " + palabra.length() + " caracteres");
		}
		
		System.out.println("Introduce cinco términos de una serie separado por -");
		String serie = sc.nextLine();
		
		StringTokenizer stSerie = new StringTokenizer(serie, "-");
		
		if (stSerie.countTokens() != 5) {
			System.out.println("Te he pedido 5 términos y has introducido " + stSerie.countTokens());
		} else {
			System.out.println("Los términos introducidos son: ");
			while (stSerie.hasMoreTokens()) {
				System.out.println(stSerie.nextToken());
			}
			
		}
		
		StringTokenizer st2 = new StringTokenizer(cadena);
		
		System.out.println("La cadena introducida tiene " + st2.countTokens() + " palabras");
		
		while (st2.hasMoreTokens()) {
			palabra = st2.nextToken();
			System.out.println(palabra + " con " + palabra.length() + " caracteres");
		}
		
		System.out.println("Introduce cinco términos de una serie separado por -");
		
		StringTokenizer st2Serie = new StringTokenizer(serie, "-");
		
		if (st2Serie.countTokens() != 5) {
			System.out.println("Te he pedido 5 términos y has introducido " + st2Serie.countTokens());
		} else {
			System.out.println("Los términos introducidos son: ");
			while (st2Serie.hasMoreTokens()) {
				System.out.println(st2Serie.nextToken());
			}
			
		}
		
		sc.close();

	}

}
