package model;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaEncuestas {

	private ArrayList<Encuesta> lista;
	
	public ListaEncuestas () {
		lista = new ArrayList<Encuesta>();
	}
	
	public void addEncuesta (Encuesta e) {
		lista.add(e);
	}
	
	public ArrayList<Encuesta> getLista() {
		return lista;
		
	}
	
	@Override
	public String toString() {
		String sLista = "";
		for (Encuesta encuesta : lista) {
			sLista += encuesta + "\n\n";
		}
		return sLista;
	}
	
}
