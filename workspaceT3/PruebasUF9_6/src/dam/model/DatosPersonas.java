package dam.model;

import java.util.ArrayList;

public class DatosPersonas {

	ArrayList<Persona> listaPersonas;

	public DatosPersonas() {
		listaPersonas = new ArrayList<Persona>();
		rellenarLista();
	}

	private void rellenarLista() {
		listaPersonas.add(new Persona("12345678Z", "Sergio", "Camu�as", 23));
		listaPersonas.add(new Persona("12345678X", "Sara", "P�rez", 25));
		listaPersonas.add(new Persona("12345678C", "Carlos", "Sainz", 27));
		listaPersonas.add(new Persona("12345678V", "V�ctor", "Castro", 68));
		listaPersonas.add(new Persona("12345678B", "Ana", "Mart�nez", 24));
		listaPersonas.add(new Persona("12345678N", "Juan Jos�", "Cardenal", 53));
		
	}
	
	public ArrayList<Persona> getListaPersonas() {
		return listaPersonas;
	}
	
}
