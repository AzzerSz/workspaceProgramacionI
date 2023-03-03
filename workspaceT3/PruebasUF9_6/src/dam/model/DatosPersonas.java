package dam.model;

import java.util.ArrayList;

public class DatosPersonas {

	ArrayList<Persona> listaPersonas;

	public DatosPersonas() {
		listaPersonas = new ArrayList<Persona>();
		rellenarLista();
	}

	private void rellenarLista() {
		listaPersonas.add(new Persona("12345678Z", "Sergio", "Camuñas", 23));
		listaPersonas.add(new Persona("12345678X", "Sara", "Pérez", 25));
		listaPersonas.add(new Persona("12345678C", "Carlos", "Sainz", 27));
		listaPersonas.add(new Persona("12345678V", "Víctor", "Castro", 68));
		listaPersonas.add(new Persona("12345678B", "Ana", "Martínez", 24));
		listaPersonas.add(new Persona("12345678N", "Juan José", "Cardenal", 53));
		
	}
	
	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}
	
}
