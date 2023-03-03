package dam.ej2B.pojo;

public class Festival {
	private String nombre;
	private String ciudad;
	private String cartel;
	private int mes;
	
	public Festival(String nombre, String ciudad, String cartel, int mes) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.cartel = cartel;
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "*** " + nombre + " - " + ciudad + " ***\n" + "Colaboran " + cartel + "\nEl mes " + mes;
	}
	
	public int getMes() {
		return mes;
	}
}
