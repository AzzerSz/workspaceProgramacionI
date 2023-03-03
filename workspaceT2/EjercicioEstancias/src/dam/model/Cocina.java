package dam.model;

public class Cocina extends Estancia {
	private boolean tieneTendedero;
	private double m2Tend;
	
	public Cocina(String nombre, double metrosCuad, int numPuertas, int numVentanas, boolean tieneTendedero,
			double m2Tend) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.tieneTendedero = tieneTendedero;
		this.m2Tend = m2Tend;
	}
	
	public double getM2Tend() {
		return m2Tend;
	}

	@Override
	public String toString() {
		String mostrarTendedero;
		
		if (tieneTendedero) {
			mostrarTendedero = "Dispone de tendedero";
		} else {
			mostrarTendedero = "No dispone de tendedero";
		}
		
		return super.toString() + " - Cocina " + mostrarTendedero + ", Tamaño tendedero " + m2Tend + "m2";
	}
	
	
}
