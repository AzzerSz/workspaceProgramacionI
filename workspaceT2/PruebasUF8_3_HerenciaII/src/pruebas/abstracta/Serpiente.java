package pruebas.abstracta;

public abstract class Serpiente extends AnimalVertebrado {

	private double longitud;
	private boolean esVenenosa;
	
	public Serpiente(double longitud, boolean esVenenosa) {
		super("Reptil", "Serpiente");
		this.longitud = longitud;
		this.esVenenosa = esVenenosa;
	}
	
	public void cambiarPiel () {
		System.out.println("Cambiando piel");
	}

	@Override
	public String toString() {
		return "Serpiente [longitud=" + longitud + ", ¿Es Venenosa: =?" + "]";
	} 

	
	
	
}
