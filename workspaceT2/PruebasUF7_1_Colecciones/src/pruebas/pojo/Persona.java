package pruebas.pojo;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean iguales = false;
		Persona p = (Persona) obj;
		
		if (nombre.equals(p.nombre) && edad == p.edad){
			iguales = true;
		}
		
		return iguales;
	}
	@Override
	public int hashCode() {
		Integer i = edad;
		int hc = nombre.hashCode() + i.hashCode();	
		return hc;
	}
}
