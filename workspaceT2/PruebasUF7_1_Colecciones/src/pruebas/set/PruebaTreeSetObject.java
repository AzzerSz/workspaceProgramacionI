package pruebas.set;

import java.util.TreeSet;
import java.util.Scanner;

import pruebas.pojo.PersonaComp;

public class PruebaTreeSetObject {
	
	static TreeSet<PersonaComp> setPersonas;
	static Scanner sc;

	public static void main(String[] args) {
		setPersonas = new TreeSet<PersonaComp>();
		sc = new Scanner(System.in);
		
		rellenarSet();
		
		mostrarSet();
		
		sc.close();

	}

	private static void mostrarSet() {
		System.out.println("La colección tiene " + setPersonas.size() + " personas");
		System.out.println("Personas de la colección:");
		
		for (PersonaComp persona : setPersonas) {
			System.out.println(persona);
		}
		
	}

	private static void rellenarSet() {
		boolean continuar = true;
		
		String nombre;
		int edad;
		
		while (continuar) {
			System.out.println("Introduce el nombre ");
			nombre = sc.nextLine();
			
			System.out.println();
			edad = solicitarEdad();
			
			setPersonas.add(new PersonaComp(nombre, edad));
			
			System.out.println("¿Desea introducir más datos?");
			continuar = sc.nextLine().toUpperCase().equals("SI")? true : false;
		}
		
	}

	private static int solicitarEdad() {
		int edad = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println("Introduce la edad");
				edad = Integer.parseInt(sc.nextLine());
				
				if (edad < 0 || edad > 130) {
					throw new Exception("Introduce una edad válida");
				}
				
				valNoVal = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		return edad;
	}

}
