package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Encuesta;

public class Encuestador {

	static Scanner entrada;
	static Encuesta[] encuestas;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		entrada.close();
		
		mostrarArray();
		
		realizarAnalisis();

	}

	private static void inicializarArray() {
		System.out.println("Indice la cantidad de encuestas que se van a realizar");
		int n = Integer.parseInt(entrada.nextLine());
		
		encuestas = new Encuesta[n];
	}

	private static void rellenarArray() {
		
		 int edad;
		 String respCovid;
		 String sintomas;
		 int gravedad;
		
		for (int i = 0; i < encuestas.length; i++) {
			System.out.print("Introduzca su " + Encuesta.PREG_1);
			edad = Integer.parseInt(entrada.nextLine());
			System.out.print(Encuesta.PREG_2);
			respCovid = entrada.nextLine().toUpperCase();
			
			if (respCovid.equals("SI")) {
				System.out.print(Encuesta.PREG_3);
				System.out.println("(Indicar los síntomas, separados por comas)\n" + "Síntomas respiratorios,"
						+ " Diarrea," + " Cansancio o Malestar," + " Perdida del olfato," + "\nPerdida del gusto," + " Fiebre o "
						+ " Sin síntomas");
				sintomas = entrada.nextLine();
				System.out.print(Encuesta.PREG_4);
				System.out.println("1: Ninguna, 2: Leve, 3: Media, 4: Alta, 5: Hospitalización");
				gravedad = Integer.parseInt(entrada.nextLine());
				encuestas[i] = new Encuesta(edad, respCovid, sintomas, gravedad);
			} else {
				sintomas = "";
				gravedad = 0;
				encuestas[i] = new Encuesta(edad, respCovid, sintomas, gravedad);
			}
			
		}
		
	}

	private static void mostrarArray() {
		System.out.println("\n*** Encuestas realizadas ***");
		for (int i = 0; i < encuestas.length; i++) {
			System.out.println("\n" + encuestas[i]);
		}
		
	}

	private static void realizarAnalisis() {
		int contCovid = 0;
		int contGrav = 0;
		int contOG = 0;
		
		Encuesta encuestaMayorLeve = new Encuesta(-1, "null", "null", 6);
		
		for (int i = 0; i < encuestas.length; i++) {
			if (encuestas[i].getRespCovid().equals("SI")) {
				contCovid++;
				
				// Cuántos han padecido una enfermedad grave
				if (encuestas[i].calcularNumSintomas() >= 3 || encuestas[i].getGravedad() > 3) {
					contGrav++;
				}
				
				// Cuántos han perdido el olfato y el gusto
				if (encuestas[i].encontrarSintoma("olfato") && encuestas[i].encontrarSintoma("gusto")) {
					contOG++;
				}
				
				// La encuesta del encuestado más mayor y que haya pasado la enfermedad con menor gravedad
				if (encuestas[i].getEdad() > encuestaMayorLeve.getEdad() || (encuestas[i].getEdad() == encuestaMayorLeve.getEdad() 
						&& encuestas[i].getGravedad() < encuestaMayorLeve.getGravedad())) {
					encuestaMayorLeve = encuestas[i];
				}
			}
		}
		
		System.out.println("\n *** Resultado del análisis ***");
		System.out.println("De " + encuestas.length + " encuestados, " + contCovid + " han pasado el COVID-19");
		System.out.println(contGrav + " han pasado más de 3 síntomas o han tenido gravedad superior a media");
		System.out.println(contOG + " perdieron el olfato y el gusto");
		System.out.println("El encuestado de mayor edad que pasó la enfermedad de forma más leve es " + encuestaMayorLeve);

	}

}
