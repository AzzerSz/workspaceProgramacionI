package dam.empresa.model;

public class Asalariado {

	protected String nombre;
	protected String dni;
	protected int diasVacaciones;
	
	public Asalariado(String nombre, String dni, int diasVacaciones) {
		this.nombre = nombre;
		this.dni = dni;
		this.diasVacaciones = diasVacaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getDiasVacaciones() {
		return diasVacaciones;
	}

	public void setDiasVacaciones(int diasVacaciones) {
		this.diasVacaciones = diasVacaciones;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + dni + "Días de vacaciones: " + diasVacaciones;
	}
}
