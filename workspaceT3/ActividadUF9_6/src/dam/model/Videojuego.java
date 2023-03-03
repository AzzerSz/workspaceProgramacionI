package dam.model;

public class Videojuego {
	
	public static final String[] PLATAFORMAS = {"PS5", "Nintendo Switch", "Nintendo DS"
			,"XBOX", "PC"};

	private String titulo;
	private String plataforma;
	private int codPegi;
	private String prestado;
	
	public Videojuego(String titulo, String plataforma, int codPegi, String prestado) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.codPegi = codPegi;
		this.prestado = prestado;
	}
	
	
	
	public static String[] getPlataformas() {
		return PLATAFORMAS;
	}



	public String getTitulo() {
		return titulo;
	}



	public String getPlataforma() {
		return plataforma;
	}



	public int getCodPegi() {
		return codPegi;
	}



	public String getPrestado() {
		return prestado;
	}



	@Override
	public String toString() {
		
		return "***" + titulo + "***" + "\nPlataforma: " + plataforma 
				+ "PEGI " + codPegi + "/n Prestado a: " + prestado;
	}
	
}
