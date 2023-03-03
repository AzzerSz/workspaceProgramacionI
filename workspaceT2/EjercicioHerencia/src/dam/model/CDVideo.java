package dam.model;

public class CDVideo extends CD{

	private String clasificacion;

	public CDVideo(int nEjemplares, int ejemplaresPrest, String nombre, double duracion, String clasificacion) {
		super(nEjemplares, ejemplaresPrest, nombre, duracion);
		this.clasificacion = clasificacion;
	}
	
	@Override
	public String toString() {
		return "CD VIDEO:\n" + super.toString() + " " + clasificacion;
	}
}
