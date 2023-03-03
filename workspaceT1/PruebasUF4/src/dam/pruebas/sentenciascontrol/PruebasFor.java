package dam.pruebas.sentenciascontrol;

public class PruebasFor {

	public static void main(String[] args) {
		int m = 3;
		int n =7;
		
		for (int i = 0; i < 15; i++) {
			m ++;
		}
		System.out.println("m = " + m); // m = 18
		
		// Un for se puede convertir en un while
		/*
		 for (int i = 0; i < 15; i++) {
			n
			 ++;
		}
		System.out.println("m = " + m); // m = 18
		 */
		// Aumentar en 1 la variable n 13 veces
		int i = 0;
		while ( i < 13 ) {
			n ++;
			i++;
		}
		System.out.println("n = " + n); // n = 20
	}

}
