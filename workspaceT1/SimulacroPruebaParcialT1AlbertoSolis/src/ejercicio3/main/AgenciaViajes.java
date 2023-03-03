package ejercicio3.main;

import java.util.Scanner;

import ejercicio3.pojo.Viaje;

public class AgenciaViajes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Viaje viaje;
		String nombre;
		String ciudad;
		int nDias;
		int precio;
		int anterior = 999999;
		String viajeBarato = "a";
		
		System.out.println("Introduce cuantos viajes va a introducir");
		int nViajes = Integer.parseInt(input.nextLine());
		
		for (int i = 0; i < nViajes; i++) {
			System.out.println("");
			System.out.println("Introduce el nombre del viaje");
			nombre = input.nextLine();
			System.out.println("Introduce la ciudad");
			ciudad = input.nextLine();
			System.out.println("Introduce el número de días");
			nDias = Integer.parseInt(input.nextLine());
			System.out.println("Introduce el precio");
			precio = Integer.parseInt(input.nextLine());
			viaje = new Viaje (nombre, ciudad, nDias, precio);
			
			System.out.println(viaje.getPrecioDia());
			
			if(anterior > viaje.getPrecioDia()) {
				anterior = viaje.getPrecioDia();
				viajeBarato = nombre;
			}
		}
		System.out.println("El precio mas bajo por día es " + viajeBarato 
				+ " y cuesta " + anterior + "€/dia");

		input.close();
	}

}
