package dam.pruebas;

import java.util.Scanner;

public class Prueba3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Introduce tu edad");
			int edad = Integer.parseInt(sc.nextLine());
			
			System.out.println("Tienes " + edad + "a�os");
		} catch (Exception e) {
			System.out.println("El valor introducido no es v�lido. Debe ser un valor entero");
		}
		
		System.out.println("cerrando el escanner");
		sc.close();
	}
}
