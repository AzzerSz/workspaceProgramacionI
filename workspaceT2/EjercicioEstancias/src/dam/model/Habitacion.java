package dam.model;

public class Habitacion extends Estancia{
	
	private int numPuertasArm;
	private boolean accesoBanio;
	
	public Habitacion(String nombre, double metrosCuad, int numPuertas, int numVentanas, int numPuertasArm,
			boolean accesoBanio) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.numPuertasArm = numPuertasArm;
		this.accesoBanio = accesoBanio;
	}
	
	@Override
	public String toString() {
		String mostrarAcceso;
		
		if (accesoBanio) {
			mostrarAcceso = "Acceso a baño disponible: SI";
		} else {
			mostrarAcceso = "Acceso a baño disponible: NO";
		}
		
		return super.toString() + " - Habitación: Número de puertas del armario " + numPuertasArm + ", " + mostrarAcceso;
	}
}
