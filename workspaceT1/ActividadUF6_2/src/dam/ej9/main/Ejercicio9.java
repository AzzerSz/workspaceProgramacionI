package dam.ej9.main;

import java.util.Random;

import dam.ej9.pojo.Persona;

public class Ejercicio9 {

	final static int TAM = 10;
	static Persona[] grupoPer;
	
	public static void main(String[] args) {
		grupoPer = new Persona[TAM];
		
		rellenarArray();
		System.out.println("****************************************");
		porcentajeGenero();
		System.out.println("****************************************");
		porcentajeTraba();
		System.out.println("****************************************");
		sueldoMedio();
		System.out.println("****************************************");
	}

	private static void sueldoMedio() {
		int sumaHomb = 0;
		int contHombTrab = 0;
		int sumaMuj = 0;
		int contMujTrab = 0;
		
		for (int i = 0; i < grupoPer.length; i++) {
			if (grupoPer[i].getTrabaja() == 1 && grupoPer[i].getSexo() == 1) {
				sumaHomb += grupoPer[i].getSueldo();
				contHombTrab++;
			} else if (grupoPer[i].getTrabaja() == 1 && grupoPer[i].getSexo() == 2) {
				sumaMuj += grupoPer[i].getSueldo();
				contMujTrab++;
			}
			
		}
		
		double media;
		if (contHombTrab != 0) {
			media = (double)(sumaHomb / contHombTrab);
			System.out.println("El sueldo medio de los hombres es " + media +"€");
		}
		
		if (contMujTrab != 0) {
			media = (double)(sumaMuj / contMujTrab);
			System.out.println("El sueldo medio de los mujeres es " + media+"€");
		}
		
	}

	private static void porcentajeTraba() {
		int contHombTrab = 0;
		int contMujTrab = 0;
		
		for (int i = 0; i < grupoPer.length; i++) {
			
			
			if (grupoPer[i].getTrabaja() == 1 && grupoPer[i].getSexo() == 1 ) {
				contHombTrab++;
			} else if (grupoPer[i].getTrabaja() == 1 && grupoPer[i].getSexo() == 2) {
				contMujTrab++;
			}
			
		}
		
		System.out.println("Porcentaje hombres que trabajan: " + (contHombTrab * 100 / TAM) + "%");
		System.out.println("Porcentaje mujeres que trabajan: " + (contMujTrab * 100 / TAM) + "%");
	}

	private static void porcentajeGenero() {
		int contMuj = 0;
		int contHomb = 0;
		
		for (int i = 0; i < grupoPer.length; i++) {
			if (grupoPer[i].getSexo() == 1) {
				contHomb++;
			} else {
				contMuj++;
			}
		}
		
		System.out.println("Porcentaje hombres: " + (contHomb * 100 / TAM) + "%");
		System.out.println("Porcentaje mujeres: " + (contMuj * 100 / TAM) + "%");
		
	}

	public static void rellenarArray() {
		Random rd = new Random();
		
		int sexo;
		int trabaja;
		int sueldo;
		
		for (int i = 0; i < grupoPer.length; i++) {
			
			sexo = rd.nextInt(2-1+1)+1;
			trabaja = rd.nextInt(2-1+1)+1;
			
			if (trabaja == 1) {
				sueldo = (rd.nextInt(2000 - 600 + 1) + 600);
			} else {
				sueldo = 0;
			}
			
			grupoPer[i] = new Persona(sexo, trabaja, sueldo);
			System.out.println(grupoPer[i]);
		}
	}

}
