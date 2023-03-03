package dam.sentfor.ej5;

public class Ejercicio5 {

	public static void main(String[] args) {
		int impar = 0;
		int par = 0;
		
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				par = par + i;
			} else {
				impar =  impar + i;
			}
		}
		System.out.println("La suma de los numeros impares es: " + impar 
				+ "\nLa suma de los numeros pares es: " + par);

	}

}
