package dam.ej6.pojo;

public class Libro {
	private String titulo;
	private Autor autor;
	
	public Libro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public Autor getAutor() {
		return autor;
	}
}
