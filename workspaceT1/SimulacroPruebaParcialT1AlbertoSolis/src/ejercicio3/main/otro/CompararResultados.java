package ejercicio3.main.otro;

import java.util.Scanner;

import ejercicio3.pojo.otro.EquipoFutbol;

public class CompararResultados {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		EquipoFutbol equipo;
		String nombre;
		String localidad;
		int pg;
		int pe;
		int pp;
		
		int puntuajeMayor = -1;
		String nombreMayor = "";
		EquipoFutbol equipoMayor = new EquipoFutbol("", "", 0, 0, 0);
		
		boolean empate = false;
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Introduce los datos del " + i + "º equipo");
			
			System.out.println("Introduce el nombre del equipo");
			nombre = entrada.nextLine();
			
			System.out.println("Introduce la localidad del equipo");
			localidad = entrada.nextLine();
			
			System.out.println("Introduce la cantidad de partidos ganados");
			pg = Integer.parseInt(entrada.nextLine());
			
			System.out.println("Introduce la cantidad de partidos empatados");
			pe = Integer.parseInt(entrada.nextLine());
			
			System.out.println("Introduce la cantidad de partidos perdidos");
			pp = Integer.parseInt(entrada.nextLine());
			
			equipo = new EquipoFutbol(nombre,localidad,pg,pe,pp);
			
			if (puntuajeMayor == equipo.calcularPuntos()) {
				System.out.println("\nTienen el mismo puntuaje");
				empate = true;
			}
			
			if (i == 1 || puntuajeMayor < equipo.calcularPuntos()) {
				puntuajeMayor = equipo.calcularPuntos();
				nombreMayor = nombre;
				equipoMayor = equipo;
				empate = false;
			} 
			
		}
		
		if (empate == false) {
		System.out.println("El equipo con mayor puntuaje es " + nombreMayor + " con " 
				+ puntuajeMayor + " pts.");
		System.out.println("\n" + equipoMayor);
		}
		
				entrada.close();

	}

}
