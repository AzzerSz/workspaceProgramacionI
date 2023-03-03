package dam.ej3.agregacion.model;

public class Raton {

	private int dpi;
	private String tipo; // inalámbrico

	public Raton(int dpi, String tipo) {
		this.dpi = dpi;
		this.tipo = tipo;
	}

	public int getDpi() {
		return dpi;
	}

	public String getTipo() {
		return tipo;
	}

	@Override
	public String toString() {
		return "Raton [dpi=" + dpi + ", tipo=" + tipo + "]";
	}

}
