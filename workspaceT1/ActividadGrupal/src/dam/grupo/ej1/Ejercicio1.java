package dam.grupo.ej1;

import java.util.Scanner;

public class Ejercicio1 {

	// Esta clase pide introducir 2 dos números y recorre un bucle donde imprime los
	// multiplos de 3 del menor hasta el mayor
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int menor = 0;
		int mayor = 0;
		
		System.out.println("Introduce el primer número");
		int num1 = Integer.parseInt(teclado.nextLine());
		
		System.out.println("introduce el segundo numero");
		int num2 = Integer.parseInt(teclado.nextLine());
		
		// Almacenar el número mayor en la variable mayor
		// y la menor en la variable menor
		if (num1 > num2) {
			menor = num2;
			mayor = num1;
		} else {
			mayor = num2;
			menor = num1;
		}
		// recorremos un bucle desde el menor hasta el mayor si es múltiplo de 3 lo printeamos
		// por consola por cada recorrido en el bucle sumamos 1 al menor
		while (menor <= mayor) {
			if (menor % 3 == 0) {
			System.out.println(menor); 
			}
			
			menor++;
		}
		
		teclado.close();
		

	}

}
