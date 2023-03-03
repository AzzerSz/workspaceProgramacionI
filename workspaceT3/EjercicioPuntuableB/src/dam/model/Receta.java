package dam.model;

public class Receta {
	public static final String[] DIFICULTADES = {"Alta", "Media","Baja"};
	
	private String nombre;
	private String descripcion;
	private int tiempoEjec;
	private String dificultad;
	
	public Receta(String nombre, String descripcion, int tiempoEjec, String dificultad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiempoEjec = tiempoEjec;
		this.dificultad = dificultad;
	}

	public static String[] getDificultades() {
		return DIFICULTADES;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getTiempoEjec() {
		return tiempoEjec;
	}

	public String getDificultad() {
		return dificultad;
	}
	
	
	
}
