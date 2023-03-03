package dam.ej2.main;

import java.util.Scanner;

import dam.ej2.pojo.Lugar;

public class Ejercicio9 {

	static Lugar[] lugar;
	static Scanner sc;
	
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		inicializarArray();
		
		rellenarArray();
		
		sc.close();
		
		mostrarArray();
		
		analisisPrio();

	}

	private static void mostrarArray() {
		for (int i = 0; i < lugar.length; i++) {
			System.out.println(lugar[i]);
		}
		
	}

	private static void analisisPrio() {
		Lugar lugarEsPri = new Lugar(null, null, 0, null);
		
		for (int i = 0; i < lugar.length; i++) {
			if (lugar[i].getPais().equalsIgnoreCase("España")) {
				if (lugar[i].getPrioridad() > lugarEsPri.getPrioridad()) {
					lugarEsPri = lugar[i];
				}
			}
		}
		
		if (lugarEsPri.getPais() != null) {
			System.out.println("El lugar de España con mayor prioridad es " + lugarEsPri);
		}
	}
		

	private static void rellenarArray() {
		for (int i = 0; i < lugar.length; i++) {
			System.out.println("Lugar " + (i+1) + "º");
			lugar[i] = realizarCuestionario();
		}
		
	}

	private static Lugar realizarCuestionario() {
		System.out.println("¿Ciudad del lugar?");
		String ciudad = sc.nextLine();
		System.out.println("¿País donde se encuentra ubicado el lugar?");
		String pais = sc.nextLine();
		int prioridad = solicitarPrioridad();
		String motivo = solicitarMotivo();
		
		Lugar lugar = new Lugar(ciudad, pais, prioridad, motivo);
		return lugar;
	}

	private static String solicitarMotivo() {
		boolean datoCorrecto = true;
		String motivo = null;
		while (datoCorrecto) {
			try {
				System.out.println("¿Cuál es el motivo");
				motivo = sc.nextLine();
				
				if (motivo.length() > 150) {
					throw new Exception("Introduce un valor comprendido entre 0 - 150 caracteres");
				}
				
				datoCorrecto = false;
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return motivo;
	}

	private static int solicitarPrioridad() {
		boolean datoCorrecto = true;
		int respuesta = -2;
		
		while (datoCorrecto) {
			try {
				System.out.println("¿Cuál es la prioridad con la que quieres vistar este lugar?");
				respuesta = Integer.parseInt(sc.nextLine());
				
				if(respuesta < 0 || respuesta > 10) {
					throw new Exception("Introduce un valor comprendido entre 0 - 10");
				}
				
				datoCorrecto = false;
				
			} catch (NumberFormatException e) {
				System.out.println("Introduce un valor entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return respuesta;
	}

	private static void inicializarArray() {
		boolean ValNoVal = true;
		int tam = 0;
		
		while (ValNoVal) {
			try {
				System.out.println("Introduce la cantidad de lugares a introducir");
				tam = Integer.parseInt(sc.nextLine());
				
				if (tam < 0) {
					throw new Exception("El valor introducido no es válido. Debe ser un valor mayor que 0");
				}
				
				ValNoVal = false;

			} catch (NumberFormatException e) {
				System.out.println("El valor introducido no es válido. Debe ser un valor entero");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		lugar = new Lugar[tam];
		
	}

}
