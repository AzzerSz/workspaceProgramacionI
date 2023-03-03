 package dam.model;

public class Banio extends Estancia{

	private boolean ducha;
	private boolean banera;
	
	public Banio(String nombre, double metrosCuad, int numPuertas, int numVentanas, boolean ducha, boolean banera) {
		super(nombre, metrosCuad, numPuertas, numVentanas);
		this.ducha = ducha;
		this.banera = banera;
	}

	@Override
	public String toString() {
		String salidaDucha;
		String salidaBanera;
		
		if (ducha) {
			salidaDucha = "Ducha disponible ";
		} else {
			salidaDucha = "Ducha no disponible ";
		}
		
		if (banera) {
			salidaBanera = "Bañera disponible ";
		} else {
			salidaBanera = "Bañera no disponible ";
		}
			
		
		return super.toString() + " - " + "Baño: " + salidaDucha + salidaBanera;
	}
	
	
	
}
