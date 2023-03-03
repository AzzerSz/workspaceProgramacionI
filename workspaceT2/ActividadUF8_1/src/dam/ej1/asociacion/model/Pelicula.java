package dam.ej1.asociacion.model;

import java.util.Arrays;

public class Pelicula {

	private String titulo;
	private String director;
	private int duracion;
	private int numActores;
	private Actor[] actores;
	
	public Pelicula() {
		actores = new Actor[15];
		numActores = 0;
	}

	public Pelicula(String titulo, String director, int duracion) {
		this.titulo = titulo;
		this.director = director;
		this.duracion = duracion;
		actores = new Actor[15];
		numActores = 0;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	@Override
	public String toString() {
		return "Pelicula [título=" + titulo + ", director=" + director + ", duración=" + duracion + ", numActores="
				+ numActores + ", número de actores=" + Arrays.toString(actores) + "]";
	}

	public void mostrarPelicula() {
		System.out.println(this);
	}
	
	public void addActor(Actor actor) {
		actores[numActores] = actor;
		numActores++;
	}
}
