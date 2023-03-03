package dam.pruebas;

import java.util.Scanner;

public class Prueba3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce tu edad");
			int edad = Integer.parseInt(sc.nextLine());
			
			System.out.println("Tienes " + edad + "años");
		} catch (Exception e) {
			System.out.println("El valor introducido no es válido. Debe ser un valor entero");
		}
		
		System.out.println("cerrando el escanner");
		sc.close();
	}
}
