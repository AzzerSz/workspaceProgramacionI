package dam.ej2;

import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		long momentoIni = System.currentTimeMillis();
		
		Scanner entrada = new Scanner(System.in);
		
		int contChar = 0;
		System.out.println("Introduce una cadena de caracteres");
		String cadena= entrada.nextLine();
		System.out.println("Introduce una letra");
		char letra = entrada.nextLine().toUpperCase().charAt(0);
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.toUpperCase().charAt(i) == letra) {
				contChar++;
			}
		}
		
		System.out.println("La cadena introducida tiene " + contChar + letra + "s");
		long tiempoEmpleado = System.currentTimeMillis() - momentoIni;
		
		System.out.println("El tiempo empleado es de: " + tiempoEmpleado);
		
		entrada.close();
	}

}
