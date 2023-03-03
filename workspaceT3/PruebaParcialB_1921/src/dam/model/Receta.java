package dam.model;

public class Receta {
	
	public static final String[] DIFICULTAD = {"ALTA", "MEDIA", "BAJA"};
	
	private String nombre;
	private String descripcion;
	private int tiempo;
	private String dificultad;
	
	public Receta(String nombre, String descripcion, int tiempo, String difucultad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tiempo = tiempo;
		this.dificultad = difucultad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public int getTiempo() {
		return tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	

}
