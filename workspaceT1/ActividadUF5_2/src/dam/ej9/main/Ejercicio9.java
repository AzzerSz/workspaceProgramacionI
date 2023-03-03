package dam.ej9.main;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		
		System.out.println("Introduce la coordenada x");
		int x = Integer.parseInt(en.nextLine());
		System.out.println("Introduce la coordenada y");
		int y = Integer.parseInt(en.nextLine());
		
		en.close();
		System.out.println();
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.print("* * 2 * *");
		System.out.print("| |");
		System.out.println("* * 1 * *");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.println("| | | | | | | | | | |");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.print("* * 3 * *");
		System.out.print("| |");
		System.out.println("* * 4 * *");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");
		System.out.print("* * * * *");
		System.out.print("| |");
		System.out.println("* * * * *");

		if (x > 0 && y > 0) {
			System.out.println("El punto (" + x + "," + y + ") se encuentra en el 1º cuadrante");
		} else if (x < 0 && y < 0){
			System.out.println("El punto (" + x + "," + y + ") se encuentra en el 2º cuadrante");
		} else if (x > 0 && y < 0) {
			System.out.println("El punto (" + x + "," + y + ") se encuentra en el 3º cuadrante");
		} else if (x < 0 && y > 0) {
			System.out.println("El punto (" + x + "," + y + ") se encuentra en el 4º cuadrante");
		}
	}

}
