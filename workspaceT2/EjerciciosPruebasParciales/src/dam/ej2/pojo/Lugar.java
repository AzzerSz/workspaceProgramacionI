package dam.ej2.pojo;

public class Lugar {
	private String ciudad;
	private String pais;
	private int prioridad;
	private String motivo;
	
	public Lugar(String ciudad, String pais, int prioridad, String motivo) {
		this.ciudad = ciudad;
		this.pais = pais;
		this.prioridad = prioridad;
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return ciudad + " - " + pais + "\n*** Prioridad ***: " 
				+ prioridad + "\n*** Motivo ***: " + motivo;
	}

	public String getPais() {
		return pais;
	}

	public int getPrioridad() {
		return prioridad;
	}
	
}
