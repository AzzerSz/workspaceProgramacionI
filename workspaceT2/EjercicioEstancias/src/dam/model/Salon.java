package dam.model;

public class Salon extends Estancia {

	private int numPuntosRed;
	private boolean tieneTerraza;
	private double m2Terr;
	
	public Salon(String nombre, double metrosCuad, int numPuertas, int numVentanas, int numPuntosRed,
			boolean tieneTerraza, double m2Terr) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.numPuntosRed = numPuntosRed;
		this.tieneTerraza = tieneTerraza;
		this.m2Terr = m2Terr;
	}
	
	public double getM2Terr() {
		return m2Terr;
	}

	@Override
	public String toString() {
		String mostrarTerraza;
		
		if (tieneTerraza) {
			mostrarTerraza = "Terraza disponible ";
		} else {
			mostrarTerraza = "Terraza no disponible ";
		}
		
		return super.toString() + " - Salón: Puntos de red disponibles " + numPuntosRed + mostrarTerraza 
				+ " Tamaño de la terraza" + m2Terr + " m2";
	}
	
	
	
}
