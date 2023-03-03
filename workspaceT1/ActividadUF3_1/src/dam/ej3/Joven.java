package dam.ej3;

public class Joven {

	public static void main(String[] args) {
		int edad = 23, nivelDeEstudios = 4, ingresos = 30000;
		boolean jasp  = (edad<=28 && nivelDeEstudios>3 && ingresos  > 28000)? true : false ;
		System.out.println(jasp);
	}

}
