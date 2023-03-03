package dam.ej3.agregacion.model;

public class Ordenador {

	private CPU cpu;
	private Pantalla pantalla;
	private Teclado teclado;
	private Raton raton;

	public CPU getCpu() {
		return cpu;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	@Override
	public String toString() {
		return "Ordenador [cpu=" + cpu + ", \npantalla=" + pantalla + ", \nteclado=" + teclado + ", \nraton=" + raton
				+ "]";
	}

}
