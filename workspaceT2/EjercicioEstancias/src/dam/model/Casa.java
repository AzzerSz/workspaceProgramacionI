package dam.model;

import java.util.ArrayList;

public class Casa {

	ArrayList<Estancia> composicion;
	
	public Casa() {
		this.composicion = new ArrayList<Estancia>();
	}

	public void setComposicion(Estancia estancia) {
		this.composicion.add(estancia);
	}
	
	public double sumaM2() {
		
		double suma = 0;
		
		for (int i = 0; i < composicion.size(); i++) {
			suma += composicion.get(i).getMetrosCuad();
		}
		return suma;
		
	}
	
	@Override
	public String toString() {
		String toString = ""; 
		
		for (int i = 0; i < composicion.size(); i++) {
			toString += composicion.get(i) + "\n";
		}
		return toString + "\nMETROS CUADRADOS TOTALES: " + sumaM2();
	}
	
}
