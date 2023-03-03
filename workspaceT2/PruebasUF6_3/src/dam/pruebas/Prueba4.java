package dam.pruebas;

import java.util.Scanner;

public class Prueba4 {
	public static void main(String[] args) {
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(System.in);
			System.out.println("Introduce tu edad");
			int edad = Integer.parseInt(sc.nextLine());
			
			System.out.println("Tienes " + edad + "a�os");
			
		} catch (Exception e) {
			System.out.println("El valor introducido no es v�lido. Debe ser un valor entero");
			e.printStackTrace();
		} finally {
			System.out.println("cerrando el escanner");
			sc.close();
			
		}
		
		System.out.println("Fin del programa");
		
	}
}

