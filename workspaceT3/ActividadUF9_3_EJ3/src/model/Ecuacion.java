package model;

public class Ecuacion {

	private int a;
	private int b;
	private int c;
	
	public Ecuacion(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double[] resolver () {
		double sol[] = null;
		
		if (a != 0 && ((b * b - 4 * a * c) >= 0)) {
			sol = new double[2];
			sol[0] = (-b + Math.sqrt(b * b - 4 * a * c)/2 * a);
			sol[1] = (-b - Math.sqrt(b * b - 4 * a * c)/2 * a);
		}
		
		return sol;
	}
	
}
