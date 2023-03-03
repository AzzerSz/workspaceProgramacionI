package pruebas.interfaz.model;

public class Cuadrado implements IFiguraGeometrica2 {

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
