package ejercicio3.pojo;

public class Viaje {
	private String nombre;
	private String ciudad;
	private int numeroDias;
	private int precioTotal;
	
	public Viaje (String nombre, String ciudad, int numeroDias, int precioTotal) {
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.numeroDias = numeroDias;
		this.precioTotal = precioTotal;
		
	}
	
	public int getPrecioDia() {
		return precioTotal / numeroDias;
	}
	@Override
	public String toString() {
		return "El nombre es " + nombre + "\nEl viaje se dirige a " + ciudad 
				+ "\nDurante " + numeroDias + " dias" + "\nEl precio será de " + precioTotal + "€" 
				+"\nEl precio por día es " + getPrecioDia() + "€";
	}
}
