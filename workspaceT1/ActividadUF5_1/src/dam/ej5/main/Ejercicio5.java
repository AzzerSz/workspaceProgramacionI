package dam.ej5.main;

import dam.ej5.pojo.Ordenador;

public class Ejercicio5 {

	public static void main(String[] args) {
		Ordenador sobremesa = new Ordenador();

		sobremesa.setPrecio(900);

		Ordenador portatil = new Ordenador();

		portatil.setPrecio(1100);

		portatil = sobremesa;

		sobremesa = null;
		
		System.out.println("sobremesa " + sobremesa);
		System.out.println("sobremesa " + portatil);

	}

}
