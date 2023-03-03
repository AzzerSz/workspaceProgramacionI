package dam.ej2.pojos;

public class Perfil {
	private String nombre;
	private String puestoActual;
	private String ciudad;
	private int nContactos;
	
	public Perfil(String nombre, String puestoActual, String ciudad, int nContactos) {
		this.nombre = nombre;
		this.puestoActual = puestoActual;
		this.ciudad = ciudad;
		this.nContactos = nContactos;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nPuesto actual: " + puestoActual + "\nCiudad: " + ciudad + "\n"
				+ nContactos + " contactos";
	}
	
	public int getNContactos() {
		return nContactos;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	
	
	
	
	
}
