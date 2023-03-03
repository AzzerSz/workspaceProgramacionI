package dam.model;

public class CDAudio extends CD{

	private int nCanciones;

	public CDAudio(int nEjemplares, int ejemplaresPrest, String nombre, double duracion, int nCanciones) {
		super(nEjemplares, ejemplaresPrest, nombre, duracion);
		this.nCanciones = nCanciones;
	}
	
	@Override
	public String toString() {
		return "CD AUDIO:\n" + super.toString() + ", " + nCanciones + " canciones";
	}
}
