package dam.ej5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un día de la semana");
		String diaSema = entrada.nextLine().toUpperCase();
		
		
		if(diaSema.equals("SÁBADO") || diaSema.equals("DOMINGO")) {
			System.out.println("El dia es fin de semana");
		} else {
			System.out.println("El día no es fin de semana");
		}
		
		entrada.close();

	}

}
