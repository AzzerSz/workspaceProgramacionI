package dam.sentswitch.ej1.main;

import java.util.Scanner;

import dam.sentswitch.ej1.pojo.Persona;

public class Jugadores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del jugador");
		String nombre1 = teclado.nextLine();
		System.out.println("Introduce la edad del jugador");
		int edad1 = Integer.parseInt(teclado.nextLine());
		
		Persona jugador1 = new Persona(nombre1, edad1);
		
		System.out.println(jugador1.indicarCategoria());
		
		teclado.close();

	}

}
