package pruebas.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class PruebasHashMap {

	static HashMap<Integer, String> mapa;
	
	public static void main(String[] args) {
		mapa = new HashMap<Integer, String>();
		
		mapa.put(1, "uno");
		mapa.put(4, "tres");
		mapa.put(3, "tres");
		mapa.put(1, "cuatro");
		mapa.put(2, "dos");
		mapa.put(2, "dos");
		
		System.out.println("\nEl mapa tiene " + mapa.size() + " elementos");

		// acceder a la colección de las claves
		//mapa.keySet();
		
		// acceder a la colección de los valores
		//mapa.values();
		
		// acceder a los registros del mapa
		//mapa.entrySet();
		
		System.out.println("\nElementos del mapa recorriendo la colección de entries");
		for (Entry<Integer, String> registro : mapa.entrySet()) {
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}
		/*
		Iterator<Entry<Integer, String>> it = mapa.entrySet().iterator();
		Entry<Integer, String> registro;
		while (it.hasNext()) {
			registro = it.next();
			System.out.println(registro.getKey() + " - " + registro.getValue());
		}
		*/
		System.out.println("\nElementos del mapa recorriendo la colección de claves");
		for (Integer clave : mapa.keySet()) {
			System.out.println(clave + " - " + mapa.get(clave));
		}
		
		System.out.println("\nElementos del mapa recorriendo la colección de valores");
		for (String valor : mapa.values()) {
			System.out.println(valor);
		}
	}

}
