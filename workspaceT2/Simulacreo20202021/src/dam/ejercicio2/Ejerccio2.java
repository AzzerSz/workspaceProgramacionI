package dam.ejercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Ejerccio2 {

	static HashMap<String, Integer> tablaFlota;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		tablaFlota = new HashMap<String, Integer>();
		sc = new Scanner(System.in);
		
		solicitarCoche();

		sc.close();
		
		mostrarCoche();
	}

	private static void mostrarCoche() {
		ArrayList<Entry<String, Integer>> listaBaterias = new ArrayList<Entry<String, Integer>>();
		listaBaterias.addAll(tablaFlota.entrySet());
		
		listaBaterias.sort(Entry.comparingByValue());

		System.out.println("Puntuaciones ordenadas de mayor a menor");
		
		int cont = 0;
		
		for (Entry<String, Integer> entry : listaBaterias) {
			
			if (entry.getValue() >= 40) {
				for (int i = listaBaterias.size() - 1; i >= 0; i--) {
					System.out.println(entry.getKey() + " - " + entry.getValue());	
				}
				
				cont++;
			}
		}
		
		System.out.println("Hay " + cont + " aptos para el uso");
		
	}

	private static void solicitarCoche() {
		int numSol = solicitarNumCoche(0, 1000, "Introduce el número de coches que va a insertar");
		String matricula = "1234ABC";
		int bateria = 0;
		
		for (int i = 0; i < numSol; i++) {
			
			matricula = solicitarMatricula();
			bateria = solicitarNumCoche(0, 100, "Introduce el porcentaje de bateria");
			
			if (tablaFlota.containsKey(matricula)) {
				tablaFlota.put(matricula, bateria);
				i--;
			} else {
				tablaFlota.put(matricula, bateria);
			}
			
			for (Entry<String, Integer> valor : tablaFlota.entrySet()) {
				if (valor.getValue() <= 40) {
					System.out.println("El vehículo con matrícula " + valor.getKey() + " ha de ser recargado");
				}
			}
		}
		
	}

	private static String solicitarMatricula() {
		String matricula = "";
		
		while (matricula.isBlank() || matricula.length() != 7) {
			System.out.println("Introduce la matricula del coche");
			matricula = sc.nextLine().toUpperCase();
			
			if (matricula.isBlank() || matricula.length() != 7) {
				System.out.println("Introduce un valor válido xxxxXXX --> 1234ABC");
			}
		}
		
		return matricula;
	}

	private static int solicitarNumCoche(int min, int max, String msg) {
		int numeroEnt = -2;
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				System.out.println(msg);
				numeroEnt = Integer.parseInt(sc.nextLine());
				
				if (numeroEnt < min || numeroEnt > max) {
					throw new Exception("Introduce un valor entero comprendido entre {" + min + ", " + max + "}");
				} else {
					valNoVal = false;
				}
				
			} catch (NumberFormatException e) {
				System.out.println("Introduce un valor entero");
			} catch (Exception x) {
				System.out.println(x.getMessage());
			}
		}
		
		return numeroEnt;
	}

}
