package dam.ej30.main;

import java.util.Scanner;

import dam.ej30.pojo.FrutaAcida;

public class Solicitud {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		FrutaAcida fruta;
		FrutaAcida frutaMenor = new FrutaAcida(null, 0);
		FrutaAcida frutaMayor = new FrutaAcida(null, 0);
		
		String nombre;
		int acidez;
		int acidezMayor = 0;
		int acidezMenor = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce el nombre de la fruta");
			nombre = entrada.nextLine();
			System.out.println("Introduce el grado de acidez de la fruta " + nombre + " (1-5)");
			acidez = Integer.parseInt(entrada.nextLine());
			
			fruta = new FrutaAcida(nombre, acidez);
			
			if (i == 0 || acidez > acidezMayor) {
				frutaMayor = fruta;
				acidezMayor = acidez;
			}
			
			if (i == 0 || acidez < acidezMenor) {
				frutaMenor = fruta;
				acidezMenor = acidez;
			}
		}
		
		System.out.println("Mayor grado de acidez\n***************\n" + frutaMayor);
		System.out.println();
		System.out.println("Menor grado de acidez\n***************\n" + frutaMenor);
		
		entrada.close();

	}

}
