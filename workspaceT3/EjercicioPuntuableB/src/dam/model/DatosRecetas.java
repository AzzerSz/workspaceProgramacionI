package dam.model;

import java.util.ArrayList;

public class DatosRecetas {

	private ArrayList<Receta> listaRecetas;
	
	public DatosRecetas() {
		listaRecetas = new ArrayList<Receta>();
	}
	
	public ArrayList<Receta> getRecetas() {
		return listaRecetas;
	}
	
	public void addReceta (Receta r) {
		listaRecetas.add(r);
	}
}
