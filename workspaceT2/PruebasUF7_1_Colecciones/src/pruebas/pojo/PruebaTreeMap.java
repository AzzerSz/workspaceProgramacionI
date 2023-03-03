package pruebas.pojo;

import java.util.HashMap;
import java.util.TreeMap;

public class PruebaTreeMap {

	static HashMap<String, Integer> mapa;
	
	public static void main(String[] args) {
		mapa = new HashMap<String, Integer>();
		
		mapa.put("uno", 1);
		mapa.put("dos", 2);
		mapa.put("tres", 3);
		mapa.put("uno", 4);
		mapa.put("dos", 2);
		mapa.put("cinco", 3);
		
		System.out.println("\nElementos del mapa");
		for (String clave : mapa.keySet()) {
			System.out.println(clave + " - " + mapa.get(clave));
		}
		
		// TreeMap<String, Integer> mapaOrden = new TreeMap<String, Integer>(mapa);
		TreeMap<String, Integer> mapaOrden = new TreeMap<String, Integer>();
		mapaOrden.putAll(mapa);
		
		System.out.println("\nElementos del mapa ordenado");
		for (String clave : mapaOrden.keySet()) {
			System.out.println(clave + " - " + mapaOrden.get(clave));
		}
	}

}
