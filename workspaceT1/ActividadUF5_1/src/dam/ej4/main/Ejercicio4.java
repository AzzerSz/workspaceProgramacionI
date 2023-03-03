package dam.ej4.main;

import dam.ej4.pojo.Clase4;

public class Ejercicio4 {

	public static void main(String[] args) {
		Clase4 obj1 = new Clase4(7);
		Clase4 obj2 = new Clase4(9);

		obj2 = obj1;

		System.out.print(obj1.getProp()+" ");
		System.out.print(obj2.getProp()+" "); 
		
	}

}
