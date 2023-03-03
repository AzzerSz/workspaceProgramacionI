package dam.model;

public class Punto2D {
	protected int x;
	protected int y;
	
	public Punto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double calcularDistancia() {
		return Math.sqrt(Math.pow(x,2.0) + Math.pow(y,2.0));
	}
}
