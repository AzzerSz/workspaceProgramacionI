package map.ej2.pojo;

public class Cancion {
	public static final int MAX_DURACION = 600;
	public static final int MIN_DURACION = 10;
	
	private String titulo;
	private String artista;
	private int duracion;
	
	public Cancion(String titulo, String artista, int duracion) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + "]";
	}
	
	
	
}
