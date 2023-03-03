package pruebas.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PruebaArrayList {

	static ArrayList<String> listaColores = new ArrayList<String>();
	
	public static void main(String[] args) {
		
		rellenarLista();
		
		mostrarLista();
		
		addColor();
		
		mostrarLista();
		
		addColorPrimeraPos();
		
		mostrarLista();
		
		comprobarColor();
		
		mostrarLista2();
		
		mostrarLista3();
		
	}

	private static void mostrarLista3() {
		System.out.println("\nColores de la lista recorridos por un foreach");
		for (String color : listaColores) {
			System.out.println(color);
		}
	}

	private static void mostrarLista2() {
		System.out.println("\nColores de la lista recorridos con un iterator");
		Iterator<String> it = listaColores.iterator();
		
		String color;
		
		while (it.hasNext()) {
			color  = it.next();
			System.out.println(color);
			
		}
	}

	private static void comprobarColor() {
		if (listaColores.contains("rosa")) {
			System.out.println("La lista cotiene el rosa");
		} else {
			System.out.println("La lista no contiene el rosa");
		}
		
	}

	private static void addColorPrimeraPos() {
		listaColores.add(0, "morado");
		
	}

	private static void addColor() {
		listaColores.set(0, "marrón");
		
	}

	private static void mostrarLista() {
		System.out.println();
		for (int i = 0; i < listaColores.size(); i++) {
			System.out.println(listaColores.get(i));
		}
		
	}

	private static void rellenarLista() {
		boolean continuar = true;
		String color;
		String respuesta;
		
		Scanner sc = new Scanner(System.in);
		
		while (continuar) {
			System.out.println("Introduce un color");
			color = sc.nextLine();
			
			listaColores.add(color);
			
			System.out.println("¿Deseas introducir otro color?");
			respuesta = sc.nextLine();
			continuar = respuesta.equalsIgnoreCase("SI")? true:false;
			
		}

		sc.close();
	}

}
