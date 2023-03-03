package dam.ej3.agregacion.model;

public class Pantalla {

	private double resolucion;
	private int pulgadas;

	public Pantalla(double resolucion, int pulgadas) {
		this.resolucion = resolucion;
		this.pulgadas = pulgadas;
	}

	public double getResolucion() {
		return resolucion;
	}

	public int getPulgadas() {
		return pulgadas;
	}

}
