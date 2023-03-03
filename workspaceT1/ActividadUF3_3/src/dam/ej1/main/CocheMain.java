package dam.ej1.main;

import dam.ej1.pojo.Coche;

public class CocheMain {

	public static void main(String[] args) {
		Coche miCoche = new Coche(0, "1234BCD");
		miCoche.acelerar();
		System.out.println(miCoche);
		miCoche.acelerar();
		System.out.println(miCoche);
		miCoche.acelerar();
		System.out.println(miCoche);
		miCoche.acelerar();
		System.out.println(miCoche);
		miCoche.acelerar();
		System.out.println(miCoche);
		miCoche.frenar();
		System.out.println(miCoche);
		miCoche.frenar();
		System.out.println(miCoche);
		miCoche.frenar();
		System.out.println(miCoche);
		miCoche.parar();
		System.out.println(miCoche);

	}

}
