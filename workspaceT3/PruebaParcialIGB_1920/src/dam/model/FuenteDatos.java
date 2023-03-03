package dam.model;

import java.util.ArrayList;

public class FuenteDatos {
	
	private ArrayList<Receta> recetario;
	
	public FuenteDatos() {
		recetario = new ArrayList<Receta>();
	}
	
	public void addReceta(Receta vj) {
		recetario.add(vj);
	}

	public ArrayList<Receta> getRecetario() {
		return recetario;
	}
	
	

}
