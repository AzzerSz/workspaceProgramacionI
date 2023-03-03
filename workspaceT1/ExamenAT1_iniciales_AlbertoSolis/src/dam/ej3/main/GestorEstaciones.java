package dam.ej3.main;

import dam.ej3.pojo.Estacion;

public class GestorEstaciones {

	public static void main(String[] args) {
		Estacion estacion = new Estacion("Ñeganes", "Ñeganes", "CERRADA", "31/65", "43/65", "23/56");
		System.out.println(estacion.calcularPorcentaje());
		
	}

}
