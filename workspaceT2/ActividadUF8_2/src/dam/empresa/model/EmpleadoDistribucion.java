package dam.empresa.model;
public class EmpleadoDistribucion extends Asalariado{

	private String zona;

	public EmpleadoDistribucion(String nombre, String dni, int diasVacaciones, String zona) {
		super(nombre, dni, diasVacaciones);
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}
	
	public void setZona(String zona) {
		this.zona = zona;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Zona del empleado: " + zona;
	}
	
}
