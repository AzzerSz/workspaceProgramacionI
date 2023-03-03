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
			salidaBanera = "Ba�era disponible ";
		} else {
			salidaBanera = "Ba�era no disponible ";
		}
			
		
		return super.toString() + " - " + "Ba�o: " + salidaDucha + salidaBanera;
	}
	
	
	
}
