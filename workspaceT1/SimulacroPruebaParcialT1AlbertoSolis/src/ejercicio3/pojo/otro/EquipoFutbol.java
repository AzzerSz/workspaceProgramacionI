package ejercicio3.pojo.otro;

public class EquipoFutbol {
	
	static final int PTOS_PG = 3;
	static final int PTOS_PE = 1;
	
	private String nombre;
	private String ciudad;
	private int partidosGanados;
	private int partidosEmpatados;
	private int partidosPerdidos;
	
	
	// Source -> Generate constructor using fields
	public EquipoFutbol(String nombre, String ciudad, int partidosGanados
			, int partidosEmpatados, int partidosPerdidos) {
		
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.partidosGanados = partidosGanados;
		this.partidosEmpatados = partidosEmpatados;
		this.partidosPerdidos = partidosPerdidos;
	}
	
	public int calcularPuntos () {
		return partidosGanados * PTOS_PG + partidosEmpatados * PTOS_PE;
	}
	
	@Override
	public String toString() {
		return "El nombre del equipo es " + nombre + " - " + ciudad 
				+ "\nNúmero de partidos ganados " + partidosGanados 
				+ "\nNúmero de partidos empatados " + partidosEmpatados 
				+ "\nNúmero de partidos perdidos " + partidosPerdidos;
	}
}
