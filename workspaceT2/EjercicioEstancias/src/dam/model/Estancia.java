package dam.model;

public class Estancia {

	protected String nombre;
	protected double metrosCuad;
	protected int numPuertas;
	protected int numVentanas;
	
	public Estancia(String nombre, double metrosCuad, int numPuertas, int numVentanas) {
		this.nombre = nombre;
		this.metrosCuad = metrosCuad;
		this.numPuertas = numPuertas;
		this.numVentanas = numVentanas;
	}

	public double getMetrosCuad() {
		return metrosCuad;
	}

	@Override
	public String toString() {
		return  nombre + " - metrosCuadrados: " + metrosCuad + "m2, número de puertas: " + numPuertas
				+ ", número de ventanas " + numVentanas;
	}
	
}
