package dam.ej2.pojo;

public class Persona {

	private String nombre;
	private String apellido;
	private String apellidoDos;
	
	public Persona() {
		this.nombre = "Alberto";
		this.apellido = "Solís";
		this.apellidoDos = "Zapata";
		
		saludo();
	}

	private void saludo() {
		System.out.println("Encantado");
		
	}
	
	
}
