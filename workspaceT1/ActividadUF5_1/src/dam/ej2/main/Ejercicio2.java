package dam.ej2.main;

import dam.ej2.pojo.Clase2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Clase2 obj1= new Clase2(5,4);
		System.out.println(obj1.modificar(4)+ " ");
		// obj1.p1 = 9
		// obj2.p2 = 8
		// 8 9 

		Clase2 obj2= new Clase2(5,4);
		System.out.println(obj2.modificar(5)+ " ");
		// obj1.p1 = 10
		// obj2.p2 = 9
		// 9 10 

		obj2 = obj1;
		
		// obj2.p1 = 9
		// obj2.p2 = 8
		
		System.out.println(obj2.modificar(5)+ " ");
		
		// obj2.p1 = 14
		// obj2.p2 = 13
		// 13 14

	}

}
