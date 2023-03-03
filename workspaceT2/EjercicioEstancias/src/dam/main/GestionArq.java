package dam.main;

import java.util.Scanner;

import dam.model.Banio;
import dam.model.Casa;
import dam.model.Cocina;
import dam.model.Estancia;
import dam.model.Habitacion;
import dam.model.Hall;
import dam.model.Salon;

public class GestionArq {

	private static final String[] MENU_PRINC = {"Introduce:", "1 - Para añadir una estancia", 
			"2 - Para mostrar las estancias de la casa y los m2", "3 - Para salir del programa"};
	private static final String[] MENU_EST = {"Introduce:", "1 - Para agregar un baño", "2 - Para agregar una cocina", 
												"3 - Para agregar una Habitacion", "4 - Para agregar un Hall", "5 - Para agregar un salón"};
	
	static Scanner sc;

	public static void main(String[] args) {
		int num = -1;
		Casa casa = new Casa();
		sc = new Scanner(System.in);
		
		while (num != 3) {
			
			for (int i = 0; i < MENU_PRINC.length; i++) {
				System.out.println(MENU_PRINC[i]);
			}
			
			num = solicitarNumeroRangoInt(1, 3, "");
			
			switch (num) {
			case 1:
				casa.setComposicion(solicitarEstancia());
				break;

			case 2:
				System.out.println(casa);
				break;
			}
			
		}
		sc.close();
		System.out.println("** FINALIZANDO EL PROGRAMA **");

	}

	private static Estancia solicitarEstancia() {
		int num = 0;
		Estancia estancia = new Estancia("", 0, 0, 0);
		String nombre = "";
		double metrosCuad = 0;
		int numPuertas = 0;
		int numVentanas = 0;
		
		for (int i = 0; i < MENU_EST.length; i++) {
			System.out.println(MENU_EST[i]);
		}
		
		num = solicitarNumeroRangoInt(1, 5, "");
		
		switch (num) {
		case 1:
			boolean ducha = false;
			boolean banera = true;
			
			System.out.println("Introduce el nombre de la estancia");
			nombre = sc.nextLine();
			metrosCuad = solicitarNumeroRangoInt(0, 10000, "Introduce los metros cuadrados de la estancia");
			numPuertas = solicitarNumeroRangoInt(0, 100, "Introduce el número de puertas");
			numVentanas = solicitarNumeroRangoInt(0, 100, "Introduce el número de ventanas");
			
			ducha = solicitarBoolean("¿Dispone de ducha?");
			ducha = solicitarBoolean("¿Dispone de baño?");
			
			estancia = new Banio(nombre, metrosCuad, numPuertas, numVentanas, ducha, banera);
			break;
		case 2:
			System.out.println("Introduce el nombre de la estancia");
			nombre = sc.nextLine();
			metrosCuad = solicitarNumeroRangoInt(0, 10000, "Introduce los metros cuadrados de la estancia");
			numPuertas = solicitarNumeroRangoInt(0, 100, "Introduce el número de puertas");
			numVentanas = solicitarNumeroRangoInt(0, 100, "Introduce el número de ventanas");
			
			boolean tendedero = solicitarBoolean("¿Tiene tendedero?");
			double m2Tend = 0;
			if (tendedero) {
				m2Tend = solicitarNumeroRangoDouble(0, 100, "Introduce el tamaño del tendedero");
			}
			
			estancia = new Cocina(nombre, metrosCuad, numPuertas, numVentanas, tendedero, m2Tend);
			break;
					
		case 3:
			System.out.println("Introduce el nombre de la estancia");
			nombre = sc.nextLine();
			metrosCuad = solicitarNumeroRangoDouble(0, 10000, "Introduce los metros cuadrados de la estancia");
			numPuertas = solicitarNumeroRangoInt(0, 100, "Introduce el número de puertas");
			numVentanas = solicitarNumeroRangoInt(0, 100, "Introduce el número de ventanas");
			
			int numPuertasArm = solicitarNumeroRangoInt(0, 100, "Introduce el número de puertas del armario");
			boolean accesoBanio = solicitarBoolean("¿Dispone de acceso directo al baño?");
			
			estancia = new Habitacion(nombre, metrosCuad, numPuertas, numVentanas, numPuertasArm, accesoBanio);
			break;
			
		case 4:
			System.out.println("Introduce el nombre de la estancia");
			nombre = sc.nextLine();
			metrosCuad = solicitarNumeroRangoDouble(0, 10000, "Introduce los metros cuadrados de la estancia");
			numPuertas = solicitarNumeroRangoInt(0, 100, "Introduce el número de puertas");
			numVentanas = solicitarNumeroRangoInt(0, 100, "Introduce el número de ventanas");
			
			boolean puertaBlind = solicitarBoolean("¿Dispone de puerta blindada");
			
			estancia = new Hall(nombre, metrosCuad, numPuertas, numVentanas, puertaBlind);
			break;
		
		case 5:
			System.out.println("Introduce el nombre de la estancia");
			nombre = sc.nextLine();
			metrosCuad = solicitarNumeroRangoDouble(0, 10000, "Introduce los metros cuadrados de la estancia");
			numPuertas = solicitarNumeroRangoInt(0, 100, "Introduce el número de puertas");
			numVentanas = solicitarNumeroRangoInt(0, 100, "Introduce el número de ventanas");
			
			int numPuntosRed = solicitarNumeroRangoInt(0, 100, "Introduce el número de puntos de red");
			boolean tieneTerraza = solicitarBoolean("¿Tiene terraza?");
			double m2Terr = 0;
			
			if (tieneTerraza) {
				m2Terr = solicitarNumeroRangoDouble(0, 10000, "Introuduce el número de metros cuadrados de la terraza");
			}
			
			estancia = new Salon(nombre, metrosCuad, numPuertas, numVentanas, numPuntosRed, tieneTerraza, m2Terr);
			break;
		}
		
		return estancia;
		
	}

	private static boolean solicitarBoolean(String msg) {
		boolean caso = false;
		String resp;
		
		do {
			System.out.println(msg + " Introduce SI o NO");
			resp = sc.nextLine().toUpperCase().trim();
		} while (!(resp.equals("NO") || resp.equals("SI")));
		
		if (resp.equals("SI")) {
			caso = true;
		}
		return caso;
	}

	private static int solicitarNumeroRangoInt(int min, int max, String msg) {
		int num = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				if (!msg.isEmpty()) {
					System.out.println(msg);
				}
				num = Integer.parseInt(sc.nextLine());
				
				if (num < min || num > max) {
					throw new NumberFormatException();
				} else {
					valNoVal = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número decimal o entero comprendido entre {" + min + ", " + max + "}");
			}
		}
		
		return num;
	}
	
	private static double solicitarNumeroRangoDouble(double min, double max, String msg) {
		double num = 0;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				if (!msg.isEmpty()) {
					System.out.println(msg);
				}
				num = Double.parseDouble(sc.nextLine());
				
				if (num < min || num > max) {
					throw new NumberFormatException();
				} else {
					valNoVal = false;
				}
			} catch (NumberFormatException e) {
				System.out.println("Introduce un número entero comprendido entre {" + min + ", " + max + "}");
			}
		}
		
		return num;
	}

}
