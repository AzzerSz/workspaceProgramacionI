package dam.empresa.model;
public class EmpleadoProduccion extends Asalariado{

	private String turno;

	public EmpleadoProduccion(String nombre, String dni, int diasVacaciones, String turno) {
		super(nombre, dni, diasVacaciones);
		this.turno = turno;
	}
	
	public String getTurno() {
		return turno;
	}
	
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Turno del empleado de producción: " + turno;
	}
}
