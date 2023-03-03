package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Encuesta;

public class Encuestador {
	
	static Scanner sc;
	static Encuesta[] encuestas;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		sc.close();
		
		mostrarArray();
		
		realizarAnalisis();

	}

	private static void realizarAnalisis() {
		int contCovid = 0;
		int contGrav = 0;
		int contOG = 0;
		
		Encuesta encuestaMayorLeve = new Encuesta(-1, null, null, 6);
		//int mayorEdad = -1;
		//int menorGrav = 6;
		
		for (int i = 0; i < encuestas.length; i++) {
			if (encuestas[i].getRespCovid().equals("SI")) {
				contCovid++;
				
				// cu�ntos han padecido tres o m�s s�ntomas o la gravedad haya sido mayor que 3
				if (encuestas[i].calcularNumSintomas() >= 3 || encuestas[i].getGravedad() > 3) {
					contGrav++;
				}
				
				// cu�ntos han perdido el olfato y el gusto
				if (encuestas[i].encontrarSintoma("olfato") && encuestas[i].encontrarSintoma("gusto")) {
					contOG++;
				}
				
				//  la encuesta del encuestado m�s mayor y que haya pasado la enfermedad con menor gravedad
				if (encuestas[i].getEdad() > encuestaMayorLeve.getEdad() 
						|| (encuestas[i].getEdad() == encuestaMayorLeve.getEdad() 
						&& encuestas[i].getGravedad() < encuestaMayorLeve.getGravedad())) {
					encuestaMayorLeve = encuestas[i];
				}
			}
		}
		
		System.out.println("\n*** Resultado del an�lisis ***");
		System.out.println("De " + encuestas.length + " encuestados, " + contCovid 
				+ " han pasado el COVID-19");

		System.out.println(contGrav + " han pasado 3 o m�s de 3 s�ntomas o han tenido gravedad superior " 
				+ "a media");

		System.out.println(contOG + " perdieron el olfato y el gusto");

		System.out.println("El encuestado de mayor edad que pas� la enfermedad de forma m�s leve es \n" 
				+ encuestaMayorLeve);

		
	}

	private static void mostrarArray() {
		System.out.println("\n*** Encuestas realizadas ***");
		for (int i = 0; i < encuestas.length; i++) {
			System.out.println("\n" + encuestas[i]);
		}
		
	}

	private static void rellenarArray() {
		int edad;
		String respCovid;
		String sintomas;
		int gravedad;
		
		for (int i = 0; i < encuestas.length; i++) {
			System.out.println(Encuesta.PREG_1);
			edad = Integer.parseInt(sc.nextLine());
			
			System.out.println(Encuesta.PREG_2);
			System.out.println("(SI/NO)");
			respCovid = sc.nextLine().toUpperCase();
			
			if (respCovid.equals("SI")) {
				System.out.println(Encuesta.PREG_3);
				System.out.println("(indicar los s�ntomas, separados por comas)\n"
						+ "S�ntomas respiratorios\n"
						+ "Diarrea\n"
						+ "Cansancio o Malestar\n"
						+ "P�rdida del olfato\n"
						+ "P�rdida del gusto\n"
						+ "Fiebre\n"
						+ "Sin s�ntomas\n");
				sintomas = sc.nextLine();
				
				System.out.println(Encuesta.PREG_4);
				System.out.println("1: Ninguna, 2: Leve, 3: Media, 4: Alta, 5: Hospitalizaci�n");
				gravedad = Integer.parseInt(sc.nextLine());
			} else {
				sintomas = "";
				gravedad = 1;
			}
			
			encuestas[i] = new Encuesta(edad, respCovid, sintomas, gravedad);
		}
		
	}

	private static void inicializarArray() {
		System.out.println("Indica la cantidad de encuestas que se van a realizar");
		int n = Integer.parseInt(sc.nextLine());
		
		encuestas = new Encuesta[n];
		
	}

}
