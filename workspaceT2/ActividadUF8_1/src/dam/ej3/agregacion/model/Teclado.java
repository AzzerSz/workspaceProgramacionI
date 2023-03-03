package dam.ej3.agregacion.model;

public class Teclado {

	private String tipo; // Qwerty
	private String clase; // mecánico

	public Teclado(String tipo, String clase) {
		this.tipo = tipo;
		this.clase = clase;
	}

	public String getTipo() {
		return tipo;
	}

	public String getClase() {
		return clase;
	}

	@Override
	public String toString() {
		return "Teclado [tipo=" + tipo + ", clase=" + clase + "]";
	}

}
