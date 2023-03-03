package dam.model;

public class Corredor {
	
	private int numero;
	private String nombre;
	private String nacionalidad;
	private int edad;
	private String escuderia;
	
	public Corredor(int numero, String nombre, String nacionalidad, int edad, String escuderia) {
		this.numero = numero;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.escuderia = escuderia;
	}

	public int getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public String getEscuderia() {
		return escuderia;
	}

}
