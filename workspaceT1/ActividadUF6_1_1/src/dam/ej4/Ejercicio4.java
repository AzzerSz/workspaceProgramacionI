package dam.ej4;

import java.util.Scanner;

public class Ejercicio4 {
	
	private static final String PWD = "123456A";

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		boolean stop = true;
		String contrasenaInt;
		int cont = 0;
		
		do {
			System.out.println("Introduce la contrase�a");
			contrasenaInt = entrada.nextLine();
			if (contrasenaInt.equals(PWD)) {
				System.out.println("La contrase�a es correcta");
				stop = false;
			} else {
				System.out.println("La contrase�a es incorrecta");
				cont++;
			}
			
			if (cont == 3) {
				System.out.println("Reint�ntalo de nuevo");
				stop = false;
			}
		} while (stop);
		
		
		
		entrada.close();
	}

}
