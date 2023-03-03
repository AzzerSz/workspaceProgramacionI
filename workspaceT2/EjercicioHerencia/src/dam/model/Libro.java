package dam.model;

public class Libro extends Ejemplar {

	private String titulo;
	private String autor;
	private int nPaginas;
	
	public Libro(int nEjemplares, int ejemplaresPrest, String titulo, String autor, int nPaginas) {
		super(nEjemplares, ejemplaresPrest);
		this.titulo = titulo;
		this.autor = autor;
		this.nPaginas = nPaginas;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	@Override
	public String toString() {
		return "CD Pelicula:\n" + titulo + ", " + autor + ", " + nPaginas + " Páginas, " + super.toString();
	}
	
}
