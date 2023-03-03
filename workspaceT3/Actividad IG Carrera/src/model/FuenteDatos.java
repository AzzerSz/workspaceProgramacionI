package model;

import java.util.ArrayList;

public class FuenteDatos {
	
private ArrayList<Corredor> corredores;
private ArrayList<Corredor> corredoresH;
private ArrayList<Corredor> corredoresM;
	
	public FuenteDatos() {
		corredores = new ArrayList<Corredor>();
		corredoresH = new ArrayList<Corredor>();
		corredoresM = new ArrayList<Corredor>();
	}
	
	public void addCorredor(Corredor cor) {
		corredores.add(cor);
		
		if (cor.getSexo().equalsIgnoreCase("hombre")) {
			corredoresH.add(cor);
		} else {
			corredoresM.add(cor);
		}
	}

	public ArrayList<Corredor> getColeccionGlobal() {
		return corredores;
	}
	
	public ArrayList<Corredor> getColeccionHombres() {
		return corredoresH;
	}
	
	public ArrayList<Corredor> getColeccionMujeres() {
		return corredoresM;
	}

}
