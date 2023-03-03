package dam.jordan.juegodelcalamar;

import java.util.Random;
import java.util.Scanner;

public class JuegoCalamar {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		int canicas = 10;
		int canicasBot = 10;
		int apuesta;
		int apuestaBot;
		boolean fin = true;
		int parImparBot;
		int parImpar;

		while (fin) {
			System.out.println("Tu número de canicas es: " + canicas);
			System.out.println("El número de canicas del rival es: " + canicasBot);

			System.out.println("Introduce la apuesta inicial (apuesta máxima " + canicas + ")");
			apuesta = Integer.parseInt(entrada.nextLine());

			parImparBot = aleatorio.nextInt(2) + 1;

			if (parImparBot == 2) {
				System.out.println("El rival ha escogigo PAR");
			} else {
				System.out.println("El rival ha escogido IMPAR");
			}

			if (parImparBot == 2) {
				if (apuesta % 2 == 0) {
					canicas -= apuesta;
					canicasBot += apuesta;

				} else {
					canicas += apuesta;
					canicasBot -= apuesta;

				}
			} else {
				if (apuesta % 2 == 0) {
					canicas += apuesta;
					canicasBot -= apuesta;
				} else {
					canicas -= apuesta;
					canicasBot += apuesta;
				}

			}

			System.out.println("Tu número de canicas es: " + canicas);
			System.out.println("El número de canicas del rival es: " + canicasBot);

			if (canicas <= 0) {
				System.out.println("Has perdido.");
				fin = false;
			} else if (canicas >= 20) {
				System.out.println("Has ganado.");
				fin = false;
			}

			if (fin) {
				System.out.println("Turno del rival");

				if (canicasBot > canicas) {
					apuestaBot = aleatorio.nextInt(canicas) + 1;
				} else {
					apuestaBot = aleatorio.nextInt(canicasBot) + 1;
				}

				System.out.println("Introduce '1' si crees que es impar + escribe '2' si crees que es par");
				parImpar = Integer.parseInt(entrada.nextLine());
				System.out.println("El número de canicas apostadas por el rival es: " + apuestaBot);
				if (parImpar == 2) {
					if (apuestaBot % 2 == 0) {
						canicas += apuestaBot;
						canicasBot -= apuestaBot;

					} else {
						canicas -= apuestaBot;
						canicasBot += apuestaBot;
					}
				} else {
					if (apuestaBot % 2 == 0) {
						canicas -= apuestaBot;
						canicasBot += apuestaBot;
					} else {
						canicas += apuestaBot;
						canicasBot -= apuestaBot;
					}
				}
				if (canicas <= 0) {
					System.out.println("Has perdido.");
					fin = false;
				} else if (canicas >= 20) {
					System.out.println("Has ganado.");
					fin = false;
				}
			}

		}

		entrada.close();

	}

}
