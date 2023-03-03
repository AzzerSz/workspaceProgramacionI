package pruebas.abstracta2.model;

public class Cuadrado extends FiguraGeometrica {

	private double lado;
	
	@Override
	public double CalcularArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public double calcularPerimetro() {
		return 4 * lado;
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	

}
