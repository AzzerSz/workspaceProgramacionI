package dam.model;

public class Hipoteca {

	private double cantHip;
	private int duracion;
	private double interes;
	
	public Hipoteca(double cantHip, int duracion, double interes) {
		this.cantHip = cantHip;
		this.duracion = duracion;
		this.interes = interes;
	}
	
	public double getCantHip() {
		return cantHip;
	}



	public int getDuracion() {
		return duracion;
	}



	public double getInteres() {
		return interes;
	}



	public double calcularCuotaMensual() {
		Double cuotaMensual = (cantHip * (interes/12)) / 
				(100 * (1 - Math.pow((1 + (interes/1200)), -( duracion*12))));
		
		return cuotaMensual;
	}

	@Override
	public String toString() {
		return "Hipoteca [cantHip=" + cantHip + ", duracion=" + duracion + ", interes=" + interes + "]";
	}
	
	
	
}
