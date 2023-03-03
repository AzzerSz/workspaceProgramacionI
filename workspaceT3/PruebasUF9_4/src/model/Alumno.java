package model;

public class Alumno {

	private String nombre;
	private String apellido;
	private int edad;
	
	public Alumno(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + apellido;
	}
	
	public String getApellido() {
		return apellido;
	}
	
}
