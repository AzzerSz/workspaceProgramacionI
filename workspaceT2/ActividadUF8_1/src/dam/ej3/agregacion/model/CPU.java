package dam.ej3.agregacion.model;

public class CPU {

	private double procesador;
	private String tarjetaG;
	private int ram;

	public CPU(double procesador, String tarjetaG, int ram) {
		this.procesador = procesador;
		this.tarjetaG = tarjetaG;
		this.ram = ram;
	}

	public double getProcesador() {
		return procesador;
	}

	public String getTarjetaG() {
		return tarjetaG;
	}

	public int getRam() {
		return ram;
	}

	@Override
	public String toString() {
		return "CPU [procesador=" + procesador + ", tarjetaG=" + tarjetaG + "Ghz, ram=" + ram + "]";
	}

}
