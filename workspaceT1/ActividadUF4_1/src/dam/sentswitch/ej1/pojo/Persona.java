package dam.sentswitch.ej1.pojo;

public class Persona {
	@SuppressWarnings("unused")
	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String indicarCategoria() {
		
		String categoria ="";
		
		switch (edad) {
		case 7:
		
		case 8:
			categoria = "La categoría del jugador es Pre-Benjamin";
			break;
			
		case 9:
			
		case 10:
			categoria = "La categoría del jugador es Benjamin";
			break;
		case 11:
			
		case 12:
			categoria = "La categoría del jugador es Alevin";
			break;
		
		case 13:
			
		case 14:
			categoria = "La categoría del jugador es Infantil";
			break;
		
		case 15:
			
		case 16:
			categoria = "La categoría del jugador es Cadete";
			break;
			
		default:
			categoria = "La categoría del jugador es Juvenil";
			break;
		}
		
		return categoria;
	}
	
	
}
