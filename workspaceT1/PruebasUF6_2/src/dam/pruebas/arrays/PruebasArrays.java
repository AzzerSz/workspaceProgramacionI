package dam.pruebas.arrays;

import java.util.Random;

public class PruebasArrays {
	
	public static void main(String[] args) {
	
		int[] enteros = new int[6];
		
		mostrarArray(enteros);
		rellenarArray(enteros);
		mostrarArray(enteros);
		
		String[] colores = {"rojo","amarillo","azul"};
		
		mostrarArrayColores(colores);
		
		for (int i = 0; i < colores.length; i++) {
			System.out.println("La palabra " + colores[i] + " tiene " + colores[i].length() + " caracteres");
		}
		
		
	}
	
	private static void rellenarArray(int[] enteros) {
		for (int i = 0; i < enteros.length; i++) {
			enteros[i] = generarAleatorio();
		}
	}

	private static int generarAleatorio() {
		Random rd = new Random();
		return rd.nextInt(10);
	}
	
	private static void mostrarArrayColores(String[] colores) {
		System.out.print("{");
		
		for (int i = 0; i < colores.length; i++) {
			if (i != colores.length-1) {
				System.out.print(colores[i] + ",");
			} else {
				System.out.print(colores[i]);
			}
		}
		
		System.out.println("}");
		
	}
	
	private static void mostrarArray(int[] enteros) {
		System.out.print("{");
		
		for (int i = 0; i < enteros.length; i++) {
			if (i != enteros.length-1) {
				System.out.print(enteros[i] + ",");
			} else {
				System.out.print(enteros[i]);
			}
		}
		
		System.out.println("}");
		
	}
}
