package dam.model;

import java.util.ArrayList;

public class FuenteDatos {

	private ArrayList<Videojuego> coleccion;

	public FuenteDatos() {
		coleccion = new ArrayList<Videojuego>();
	}
	
	public void addVideojuego(Videojuego vj) {
		coleccion.add(vj);
	}
	
	public ArrayList<Videojuego> getColeccion() {
		return coleccion;
	}
	
	
}
