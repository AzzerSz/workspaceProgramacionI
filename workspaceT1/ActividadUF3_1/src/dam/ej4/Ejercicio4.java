package dam.ej4;

public class Ejercicio4 {

	public static void main(String[] args) {
		int a = 7;
		int b = 4;
		int almacenador = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		a = b;
		b = almacenador;
		
		System.out.println();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
