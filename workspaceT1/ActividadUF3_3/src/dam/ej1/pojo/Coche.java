package dam.ej1.pojo;

public class Coche {
	// ATRIBUTOS o variables globales
	private int velocidad;
	private String matricula;
	// CONSTRUCTORES
	public Coche () {
		
	}
	
	public Coche (int velocidad, String matricula) {
		this.velocidad = velocidad;
		this.matricula = matricula;
	}
	// MÉTODOS DE ACCESO

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	// RESTO DE MÉTODOS
	
	public String toString() {
		return "El coche de matrícula " + matricula + " iba a una velocidad de " + velocidad 
				+ " Km/h";
	}
	
	public void acelerar() {
		velocidad += 10;
	}
	public void frenar() {
		velocidad -= 10;
	}
	public void parar() {
		velocidad = 0;
	}
}
