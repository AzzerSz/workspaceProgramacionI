package list.ej3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class PruebaALAlea {
	
	static final int MAX = 100;
	static final int MIN = 1;

	static ArrayList<Integer> listaNumAlea;
	static ArrayList<Integer> listaNumAleaNoRepe;
	
	public static void main(String[] args) {
		rellenarLista();
		
		mostrarLista();
		
		mostrarListaNoRepe();
		
		mostrarElementosSinRepOrdDesc();
	}

	private static void mostrarElementosSinRepOrdDesc() {
		listaNumAleaNoRepe.sort(null);
		System.out.println("\n\nElementos de la lista sin repetir en orden descendente");
		System.out.println("Opción 1");
		for (int i = listaNumAleaNoRepe.size() - 1; i >= 0; i--) {
			System.out.print(listaNumAleaNoRepe.get(i) + " ");
			
		}
		
		// opcion 2
		System.out.println("\nOpción 2");
		listaNumAleaNoRepe.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return 0 - (o1 - o2);
			}
		});
		for (Integer integer : listaNumAleaNoRepe) {
			System.out.print(integer + " ");
		}
		
		// opcion 3
		listaNumAleaNoRepe.sort(null);
		Collections.reverse(listaNumAleaNoRepe);
		System.out.println("\nOpción 3");
		for (int i = 0; i < listaNumAleaNoRepe.size(); i++) {
			System.out.print(listaNumAleaNoRepe.get(i) + " ");
		}
	}

	private static void mostrarListaNoRepe() {
		listaNumAleaNoRepe = new ArrayList<Integer>();
		System.out.println("\nContenido de la lista sin repetir");
		
		for (int i = MIN; i <= MAX; i++) {
			if (listaNumAlea.contains(i) && listaNumAlea.indexOf(i) 
					== listaNumAlea.lastIndexOf(i)) {
				listaNumAleaNoRepe.add(i);
				System.out.print(i + " ");
			}
		}
		
	}

	private static void mostrarLista() {
		System.out.println("Contenido de la lista");
		for (Integer elemento : listaNumAlea) {
				System.out.print(elemento + " ");
		}
		
	}

	private static void rellenarLista() {
		listaNumAlea = new ArrayList<Integer>();
		
		for (int i = MIN; i <= MAX; i++) {
			listaNumAlea.add((i-1), generarAlea());
		}
		
	}

	private static Integer generarAlea() {
		Random rd = new Random();
		return rd.nextInt(MAX + 1 - MIN) + MIN;
	}

}
