package dam.ejercicio3.pojo;

public class Empleado {
	
	private String numEmpleado;
	private int salarioMensual;
	private int anyhosAntiguedad;
	
	public Empleado(String numEmpleado, int salarioMensual, int anyhosAntiguedad) {
		this.numEmpleado = numEmpleado;
		this.salarioMensual = salarioMensual;
		this.anyhosAntiguedad = anyhosAntiguedad;
	}
	
	public void revisarSalario() {
		if (salarioMensual < 1000 && anyhosAntiguedad >= 5) {
			salarioMensual += 100;
		} else if (salarioMensual < 1000 && anyhosAntiguedad < 5 && anyhosAntiguedad >= 2) {
			salarioMensual += 50;
		}
	}
	
	@Override
	public String toString() {
		return numEmpleado + "\nA�os de antig�edad: " + anyhosAntiguedad
				+ "\nSalario: " + salarioMensual + "� mensuales";
	}
	

}
