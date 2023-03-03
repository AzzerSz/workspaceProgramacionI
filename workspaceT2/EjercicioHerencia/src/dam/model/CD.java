package dam.model;

public class CD extends Ejemplar{

	protected String nombre;
	protected double duracion;
	
	public CD(int nEjemplares, int ejemplaresPrest, String nombre, double duracion) {
		super(nEjemplares, ejemplaresPrest);
		this.nombre = nombre;
		this.duracion = duracion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public String toString() {
		return nombre + " " + duracion + "min, " + super.toString();
	}
}
