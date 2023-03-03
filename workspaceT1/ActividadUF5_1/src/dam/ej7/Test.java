package dam.ej7;

import java.util.Random;

public class Test {
	
	static final int MIN = 100;
	static final int MAX = 200;

	public static void main(String[] args) {
		
		Random rnd = new Random();
	
		int valor;
		
		for (int i = 0; i < 100; i++) {
			valor = rnd.nextInt(MAX + 1 - MIN) + MIN;
			System.out.println(valor);
		}

	}

}
