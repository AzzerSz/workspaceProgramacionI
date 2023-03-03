package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Estacion;

public class GestorEstaciones {

	static Estacion[] estaciones;
	static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		crearArray();
		
		rellenarArray();
		
		entrada.close();
		
		mostrarArray();
		
		analisisArrray();
		
		
	}

	private static void analisisArrray() {
		int contAbierta = 0;
		int contEsquiMay = 0;
		int contMitadDisp = 0;
		int contTot = 0;
		
		Estacion estacionMenor = new Estacion(null, null, "cerrada", null, null, null);
		
		for (int i = 0; i < estaciones.length; i++) {
			
			contTot++;
			
			if (estaciones[i].getEstado().equalsIgnoreCase("ABIERTA")) {
				contAbierta++;
				
				if (estaciones[i].kmEsquiables() > 20) {
					contEsquiMay++;
				}
				if (estaciones[i].PorcentajeKmEsquiables() > 50) {
					contMitadDisp++;
				}
			} 
			
			
			if ((estaciones[i].PorcentajeKmEsquiables() < estacionMenor.PorcentajeKmEsquiables() 
					|| i == 0) && (estaciones[i].getEstado().equalsIgnoreCase("ABIERTA"))) {
				estacionMenor = estaciones[i];
			}
			
		}
		
		System.out.println("ANÁLISIS DE ESTACIONES:\n");
		System.out.println("De " + contTot + ", " + contAbierta + " están abiertas, " + contEsquiMay 
				+ " tienen más de 20km esquiables abiertos y " + contMitadDisp + " tienen más del 50% de km esquiables abiertos.\n");
		System.out.println("La estación con menor porcentaje de km esquiables es:");
		System.out.println(estacionMenor);
	}

	private static void mostrarArray() {
		System.out.println("*** PISTAS INTRODUCIDAS ***");
		for (int i = 0; i < estaciones.length; i++) {
			System.out.println(estaciones[i] + "\n");
		}
		
	}

	private static void rellenarArray() {
		
		String nombre;
		String provincia;
		String estado;
		String nRemontes;
		String nPistas;
		String nKmEsquiables;
		
		for (int i = 0; i < estaciones.length; i++) {
			System.out.println("Introduce el nombre de la estación");
			nombre = entrada.nextLine();
			System.out.println("Introduce la provincia donde se encuentra la estación");
			provincia = entrada.nextLine();
			System.out.println("Introduce el estado de la estación (ABIERTA o CERRADA)");
			estado = entrada.nextLine();
			System.out.println("Introduce los remontes disponibles");
			nRemontes = entrada.nextLine();
			System.out.println("Intoduce el numero de pistas disponibles y totales");
			nPistas = entrada.nextLine();
			System.out.println("Introduce el numero de kilómetros esquiables y los totales");
			nKmEsquiables = entrada.nextLine();
			estaciones[i] = new Estacion(nombre, provincia, estado, nRemontes, nPistas, nKmEsquiables);
			System.out.println();
			
		}
		
	}

	public static void crearArray() {
		System.out.println("Introduce el número de estaciones que introducirá");
		estaciones = new Estacion[Integer.parseInt(entrada.nextLine())];
	}


}
