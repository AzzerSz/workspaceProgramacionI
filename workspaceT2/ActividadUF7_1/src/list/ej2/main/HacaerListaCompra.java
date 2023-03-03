package list.ej2.main;

import java.util.ArrayList;
import java.util.Scanner;

import list.ej2.pojo.Producto;

public class HacaerListaCompra {
	
	static ArrayList<Producto> listaCompra;
	static Scanner sc;

	public static void main(String[] args) {
		
		listaCompra = new ArrayList<Producto>();
		
		sc = new Scanner(System.in);
		
		int opcion = 1;
		
		while (opcion != 4) {
			
			opcion = solicitarOpcion();
			
			switch (opcion) {
			case 1: {
				addProducto();
				break;
			}
			
			case 2: {
				borrarProducto();		
					
						}

			case 3: {
				mostrarLista();
				break;
			}

			case 4: {
				System.out.println("\n*** Fin del proceso ***");
				break;
			}

			}
		}
		
		sc.close();
	}

	private static void mostrarLista() {
		if (listaCompra.isEmpty()) {
			System.out.println("\nLa lista está vacia");
		} else {
			System.out.println("\n*** LISTA DE LA COMPRA ***");
			for (Producto producto : listaCompra) {
				System.out.println(producto);
			}
			System.out.println("Total de productos: " + listaCompra.size());
		}
		
		
	}

	private static void borrarProducto() {
		if (listaCompra.isEmpty()) {
			System.out.println("\nLa lista está vacia");
		} else {
			System.out.println("Introduce el nombre del producto a eliminar");
			String nom = sc.nextLine().toUpperCase();
			
			int pos = encontrarNomProd(nom);
			
			if (pos == -1) {
				System.out.println("El producto no se encuentra en la lista");
			} else {
				listaCompra.remove(pos);
				System.out.println("El producto se ha eliminado de la lista");
			}
		}
		
	}

	private static void addProducto() {
		System.out.println("Introduce el nombre del producto a añadir");
		String nom = sc.nextLine().toUpperCase();
		
		int pos = encontrarNomProd(nom);
		
		if (pos != -1) {
			System.out.println("El producto ya está en la lista");
		} else {
			System.out.println("Introduce la cantidad de " + nom);
			String cant = sc.nextLine().toUpperCase();
			
			Producto prod = new Producto(nom, cant);
			listaCompra.add(prod);
			System.out.println("Producto añadido a la lista");
		}
		
	}

	private static int encontrarNomProd(String nom) {
		int pos = -1;
		boolean encontrado = false;
		
		for (int i = 0; i < listaCompra.size() && !encontrado; i++) {
			if (nom.equals(listaCompra.get(i).getNombre())) {
				pos = i;
				encontrado = true;
			}
		}
		
		return pos;
	}

	private static int solicitarOpcion() {
		int opcion = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				
				System.out.println("\nIntroduce una de las siguientes opciones");
				System.out.println("1 - Para añadir un producto a la lista");
				System.out.println("2- para eliminar un producto de la lista");
				System.out.println("3 - Para mostrar la lista");
				System.out.println("4 - Para finalizar");
				
				opcion = Integer.parseInt(sc.nextLine());
				
				if (opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
					valNoVal = false;
				} else {
					throw new Exception();
				}
				
			} catch (Exception e) {
				System.out.println("El valor debe ser 1, 2, 3 o 4");
			}
		}
		
		return opcion;
	}

}
