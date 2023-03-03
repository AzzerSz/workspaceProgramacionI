package dam.model;

public class Hall extends Estancia {

	private boolean puertaBlind;

	public Hall(String nombre, double metrosCuad, int numPuertas, int numVentanas, boolean puertaBlind) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.puertaBlind = puertaBlind;
	}

	@Override
	public String toString() {
		String mostrarPuertaBlind;
		
		if (puertaBlind) {
			mostrarPuertaBlind = "Dispone de puerta blindada";
		} else {
			mostrarPuertaBlind = "No dispone de puerta blindada";
		}
		
		return super.toString() + " - Hall: " + mostrarPuertaBlind;
	}

	
}
