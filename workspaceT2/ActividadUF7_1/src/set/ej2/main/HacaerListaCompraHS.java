package set.ej2.main;

import java.util.HashSet;
import java.util.Scanner;

import set.ej2.pojo.ProductoHS;

public class HacaerListaCompraHS {
	
	static HashSet<ProductoHS> listaCompra;
	static Scanner sc;

	public static void main(String[] args) {
		
		listaCompra = new HashSet<ProductoHS>();
		
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
			for (ProductoHS producto : listaCompra) {
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
			System.out.println("Introduce la cantidad de " + nom);
			String cant = sc.nextLine().toUpperCase();
			ProductoHS prodEli = new ProductoHS(nom, cant);
			
			if (!(listaCompra.contains(prodEli))) {
				System.out.println("El producto no se encuentra en la lista");
			} else {
				listaCompra.remove(prodEli);
				System.out.println("El producto se ha eliminado de la lista");
			}
		}
		
	}

	private static void addProducto() {
		System.out.println("Introduce el nombre del producto a añadir");
		String nom = sc.nextLine().toUpperCase();
		System.out.println("Introduce la cantidad de " + nom);
		String cant = sc.nextLine().toUpperCase();
		ProductoHS prod = new ProductoHS(nom, cant);
		
		if (listaCompra.contains(prod)) {
			System.out.println("El producto ya está en la lista");
		} else {
			prod.setCantidad(cant);
			
			listaCompra.add(prod);
			System.out.println("Producto añadido a la lista");
		}
		
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
