package dam.model;

public class Encuesta {

	public static final String SEXOS[] = {"Hombre", "Mujer"};
	
	private String sexo;
	private int edad;
	private String partido;
	
	public Encuesta(String sexo, int edad, String partido) {
		this.sexo = sexo;
		this.edad = edad;
		this.partido = partido;
	}

	public String getSexo() {
		return sexo;
	}

	public int getEdad() {
		return edad;
	}

	public String getPartido() {
		return partido;
	}
}
