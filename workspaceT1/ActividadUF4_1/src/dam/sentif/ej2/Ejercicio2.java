package dam.sentif.ej2;

public class Ejercicio2 {

	public static void main(String[] args) {
		int n1 = 64;
		int n2 = 75;
		int n3 = 53;
		int n4 = 82;
		int n5 = 99;
		
		if (n1 > n2 && n1 > n3 && n1 > n4 && n1 > n5) {
			System.out.println("El numero mayor es " + n1);
		} else if (n2 > n3 && n2 > n4 && n2 > n5) {
			System.out.println("El numero mayor es " + n2);
		} else if (n3 > n4 && n3 > n5) {
			System.out.println("El numero mayor es " + n3);
		} else if (n4 > n5) {
			System.out.println("El numero mayor es " + n4);
		} else {
			System.out.println("El numero mayor es " + n5);
		}
	}

}
