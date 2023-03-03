package dam.ej5.pojo;

public class Ordenador {
	private int precio;
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "precio: " + precio;
	}
	
	
}
