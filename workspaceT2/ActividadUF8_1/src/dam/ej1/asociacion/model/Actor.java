package dam.ej1.asociacion.model;

public class Actor {

	private String nombre;
	private long nacimiento;
	
	public Actor() {}

	public Actor(String nombre, long nacimiento) {
		this.nombre = nombre;
		this.nacimiento = nacimiento;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public long getNacimiento() {
		return nacimiento;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNacimiento(long nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	public void mostrarActor() {
		System.out.println(nombre + " (" + nacimiento + ")");
	}
}
