package dam.ej2B.main;

import java.util.Scanner;

import dam.ej2B.pojo.Festival;

public class Ejercicio2 {
	
	static Scanner sc;
	static Festival[] fest;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		sc.close();
		
		mostrarArray();
		
		analisisJulAgo();
	}
	private static void analisisJulAgo() {
		int cont = 0;
		for (int i = 0; i < fest.length; i++) {
			if (fest[i].getMes() == 7 || fest[i].getMes() == 9) {
				cont++;
			}
		}
		
		if (cont == 0) {
			System.out.println("No se realizar�n festivales en Julio o Agosto");
		} else {
			System.out.println("Hay " + cont + " festivales que se realizaran el mes de Julio o Agosto");
		}
		
	}
	private static void mostrarArray() {
		for (int i = 0; i < fest.length; i++) {
			System.out.println(fest[i] + "\n");
		}
		
	}
	private static void rellenarArray() {
		String nombre;
		String ciudad;
		String cartel;
		int mes;
		
		for (int i = 0; i < fest.length; i++) {
			System.out.println((i+1) + "� FESTIVAL ");
			
			System.out.println("Introduce el nombre del festival");
			nombre = sc.nextLine();
			System.out.println("Introduce la ciudad donde se realizar� el festival");
			ciudad = sc.nextLine();
			System.out.println("Introduce los participantes al evento");
			cartel = introducirCartel();
			System.out.println("Introduce el mes en el que se llevar� a cabo el festival");
			mes = introducirMes();
			
			fest[i] = new Festival(nombre, ciudad, cartel, mes);
		}
		
	}
	private static int introducirMes() {
		int mes = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				mes = Integer.parseInt(sc.nextLine());
				
				if (mes < 1 || mes > 12) {
					throw new Exception("Introduce un n�mero del 1 al 12");
				}
				
				valNoVal = false;
				
			} catch (NumberFormatException e) {
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} 
			
		}
		
		return mes;
	}
	private static String introducirCartel() {
		String cartel = null;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				cartel = sc.nextLine();
				
				if (cartel.length() < 30) {
					throw new Exception("Introduce una cadena que tenga m�s de 30 caracteres");
				}
				
				valNoVal = false;
						
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return cartel;
	}
	private static void inicializarArray() {
		System.out.println("Introduce el n�mero de festivales a introducir");
		int cant = introducirCant();
		
		fest = new Festival[cant];
		
	}
	private static int introducirCant() {
		int cant = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				cant = Integer.parseInt(sc.nextLine());
				
				if (cant < 0) {
					throw new Exception("Introduce un valor mayor a cero");
				}
				
				valNoVal = false;
			} catch (NumberFormatException e) {
				System.out.println("Introduce un n�mero entero positivo");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		return cant;
	}
}
