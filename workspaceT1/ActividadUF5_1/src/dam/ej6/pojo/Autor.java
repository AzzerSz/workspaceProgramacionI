package dam.ej6.pojo;

public class Autor {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Autor(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return nombre + " " + apellido + " " + " de " + edad + " años";
	}
}
