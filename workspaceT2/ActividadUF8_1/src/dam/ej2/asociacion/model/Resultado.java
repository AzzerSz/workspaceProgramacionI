package dam.ej2.asociacion.model;

public class Resultado {

	private double tiempo;
	private int posicion;
	private Carrera carrera;
	private Atleta atleta;
	
	public Resultado(double tiempo, int posicion, Carrera carrera, Atleta atleta) {
		this.tiempo = tiempo;
		this.posicion = posicion;
		this.carrera = carrera;
		this.atleta = atleta;
	}
	
	public double getTiempo() {
		return tiempo;
	}
	
	public int getPosicion() {
		return posicion;
	}
	
	public Atleta getAtleta() {
		return atleta;
	}
	
}
