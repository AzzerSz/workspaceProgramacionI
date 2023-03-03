package dam.pruebas;

import java.util.Scanner;

import dam.exceptions.FueraDeRangoException;

public class Prueba8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean edadNoVal = true;
		
		while (edadNoVal) {
			try {
				System.out.println("Introduce tu edad");
				int edad = Integer.parseInt(sc.nextLine());
				
				if (edad < 0 || edad > 130) {
					throw new FueraDeRangoException("La edad debe ser un valor entre 0 y 130");
				}
				
				edadNoVal = false;

				System.out.println("Tienes " + edad + " años");

			} catch (NumberFormatException e) {
				System.out.println("El valor introducido no es válido. Debe ser un valor entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("cerrando el escanner");
		sc.close();
		
	}
}

