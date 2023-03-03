package model;

public class Encuesta {
	
	public static final String PREG1 = "Edad: ";
	public static final String PREG2 = "¿Ha pasado usted el COVID-19?: ";
	public static final String PREG3 = "¿Qué síntomas padeció?: ";
	public static final String PREG4 = "Nivel de gravedad: ";
	public static final String[] NIVEL_GRAV = {"Ninguna", "Leve", "Media", "Alta", "Hospitalización"};
	
	private int edad;
	private boolean covid;
	private String sintomas;
	private int gravedad;
	
	public Encuesta(int edad, boolean covid, String sintomas, int gravedad) {
		// TODO
		this.edad = edad;
		this.covid = covid;
		this.sintomas = sintomas;
		this.gravedad = gravedad;
	}

	@Override
	public String toString() {
		return PREG1 + edad + "\n" + PREG2 + traductorCovid() + "\n" 
				+ PREG3 + sintomas + "\n" + PREG4 + traductorGravedad();
	}

	private String traductorGravedad() {
		
		return NIVEL_GRAV[gravedad - 1];
	}

	private String traductorCovid() {
		return covid? "SI":"NO";
	}
	
	
	
}
