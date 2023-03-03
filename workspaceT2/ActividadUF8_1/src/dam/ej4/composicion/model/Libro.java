package dam.ej4.composicion.model;

import java.util.ArrayList;

public class Libro {

	private String titulo;
	private String isbn;
	private Autor autor;
	private int anioPub;
	private ArrayList<Pagina> paginas;
	
	public Libro(String titulo, String isbn, Autor autor, int anioPub, ArrayList<Pagina> paginas) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.autor = autor;
		this.anioPub = anioPub;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public int getAnioPub() {
		return anioPub;
	}

	public void setAnioPub(int anioPub) {
		this.anioPub = anioPub;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}

	public void setPaginas(ArrayList<Pagina> paginas) {
		this.paginas = paginas;
	}

	public class Pagina {
		private String contenido;
		private int numero;
		
		public Pagina(String contenido, int numero) {
			this.contenido = contenido;
			this.numero = numero;
		}

		public String getContenido() {
			return contenido;
		}

		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		
	}
	
}
