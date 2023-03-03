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
			mostrarAcceso = "Acceso a ba�o disponible: SI";
		} else {
			mostrarAcceso = "Acceso a ba�o disponible: NO";
		}
		
		return super.toString() + " - Habitaci�n: N�mero de puertas del armario " + numPuertasArm + ", " + mostrarAcceso;
	}
}
