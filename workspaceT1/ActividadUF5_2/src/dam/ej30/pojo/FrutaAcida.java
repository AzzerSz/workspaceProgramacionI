package dam.ej30.pojo;

public class FrutaAcida {
	private  String nombre;
	private int gradoAc;
	
	public FrutaAcida(String nombre, int gradoAc) {
		
		this.nombre = nombre;
		this.gradoAc = gradoAc;
	}

	@Override
	public String toString() {
		return "Nombre de la fruta " + nombre + "\nCon una acidez de " + gradoAc;
	}
	
}
