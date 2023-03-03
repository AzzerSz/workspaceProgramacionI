package dam.ej2.pojo;

import java.util.StringTokenizer;

public class Encuesta {
	
	public static final String PREG_1 = "Edad: ";
	public static final String PREG_2 = "¿Ha pasado usted el COVID-19?: ";
	public static final String PREG_3 = "¿Qué sintomas padeció?: ";
	public static final String PREG_4 = "¿Nivel de gravedad?: ";
	
	private int edad;
	private String respCovid;
	private String sintomas;
	private int gravedad;
	
	public Encuesta(int edad, String respCovid, String sintomas, int gravedad) {
		this.edad = edad;
		this.respCovid = respCovid;
		this.sintomas = sintomas;
		this.gravedad = gravedad;
	}

	public int getEdad() {
		return edad;
	}


	public String getRespCovid() {
		return respCovid;
	}


	public String getSintomas() {
		return sintomas;
	}


	public int getGravedad() {
		return gravedad;
	}


	@Override
	public String toString() {
		return PREG_1 + edad + " años \n" + PREG_2 + respCovid + "\n" 
				+ PREG_3 + sintomas + "\n" + PREG_4 + traducirGravedad();
	}

	private String traducirGravedad() {
		
		String nivelGravedad = "nada";
		
		switch (gravedad) {
		case 1:
			nivelGravedad = "Ninguna";
			break;
		case 2:
			nivelGravedad = "Leve";
			break;
		case 3:
			nivelGravedad = "Media";
			break;
		case 4:
			nivelGravedad = "Alta";
			break;
		case 5:
			nivelGravedad = "Hospitalización.";
			break;
		}
		
		return nivelGravedad;
	}
	
	public int calcularNumSintomas() {
		StringTokenizer st = new StringTokenizer(sintomas, ",");
		return st.countTokens();
	}
	
	public boolean encontrarSintoma(String sintoma) {

		return sintomas.contains(sintoma);
	}
	
	
}
