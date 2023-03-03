package dam.model;

public class Punto3D extends Punto2D {
	
	private int z;
	
	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	@Override
	public double calcularDistancia() {
		return Math.sqrt(Math.pow(x,2.0) + Math.pow(y,2.0) + Math.pow(z,2.0));
	}
}
