package pruebas.abstracta2.model;

public class Triangulo extends FiguraGeometrica {

	private double base;
	private double altura;
	
	@Override
	public double CalcularArea() {
		return base * altura / 2;
	}

	@Override
	public double calcularPerimetro() {
		return Math.sqrt(base * base + altura * altura) + base + altura;
	}

}
