package pruebas.set;

import java.util.Scanner;
import java.util.TreeSet;

public class PruebaTreeSetInt {

	static TreeSet<Integer> tsNumeros;
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		tsNumeros = new TreeSet<Integer>();

		rellentarSet();

		mostrarSet();

		sc.close();

	}

	private static void mostrarSet() {
		System.out.println("\nEl conjunto tiene " + tsNumeros.size() + " numeros");

		System.out.println("\nNumeros del conjunto");
		for (Integer numero : tsNumeros) {
			System.out.println(numero);
		}
	}

	private static void rellentarSet() {
		boolean continuar = true;
		int num = 0;
		String respuesta = " ";

		while (continuar) {
			System.out.println("Introduce un numero");
			num = Integer.parseInt(sc.nextLine());

			tsNumeros.add(num);

			System.out.println("¿Deseas introducir otro numero?");
			respuesta = sc.nextLine();
			continuar = respuesta.equalsIgnoreCase("SI") ? true : false;

		}

	}
}