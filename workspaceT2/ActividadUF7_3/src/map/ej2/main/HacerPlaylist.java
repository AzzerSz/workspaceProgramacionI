package map.ej2.main;

import java.util.ArrayList;
import java.util.Scanner;

import map.ej2.pojo.Cancion;

public class HacerPlaylist {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Cancion> playlist;
	
	public static void main(String[] args) {
		 playlist = new ArrayList<Cancion>();
		 
		 int num;
		 
		 System.out.println("** Bienvenido a la aplicaci�n TU PLAYLIST");
		 do {
			 System.out.println("Indica la acci�n que deseas realizar:");
			 System.out.println("1- Para a�adir una canci�n a la playlist");
			 System.out.println("2 - Para eliminar una canci�n de la playlist");
			 System.out.println("3 - Para mostrar el listado");
			 System.out.println("4 - Para reproducir una canci�n");
			 System.out.println("5 - Para reproducir toda la lista");
			 System.out.println("6 - Para consultar el tiempo de duraci�n de la playlist");
			 System.out.println("0 - para salir de la aplicaci�n");
			 num = solicitarNumMenu();
			 
			 switch (num) {
			case 1:
				addCancion();
				break;

			case 2:
				
				break;
				
			case 3:
				mostrarPlaylist();
				break;
			case 4:
				
				break;
				
			case 5:
				
				break;
			 
		 	case 6:
				
				break;
			 }
		} while (num != 0);
		 
		 System.out.println("\n** CERRANDO PLAYLIST **");
		 sc.close();

	}



	private static void addCancion() {
		String titulo = solicitarCadenaNoVacia("\nInsertar el t�tulo de la caci�n");
		String grupo = solicitarCadenaNoVacia("\nIntroduce el grupo o artista");
		int duracion = solicitarDuracion();
		
		playlist.add(new Cancion(titulo, grupo, duracion));
		
		System.out.println("Canci�n a�adida, canciones en la lista: "  + playlist.size());
		
	}



	private static int solicitarDuracion() {
		int dur = 0;
		
		do {
			dur = Integer.parseInt(sc.nextLine());
			
				if (dur <= Cancion.MIN_DURACION && dur >= Cancion.MAX_DURACION) {
					System.out.println("Escoge una duraci�n correcta");
				}
				
			}while (dur <= Cancion.MIN_DURACION && dur >= Cancion.MAX_DURACION);
		
		
		return dur;
	}



	private static String solicitarCadenaNoVacia(String mensaje) {
		String cadena = "";
		
		while (cadena.isEmpty()) {
			System.out.println(mensaje);
			cadena = sc.nextLine().trim().toUpperCase();
			
			if (cadena.isEmpty()) {
				System.out.println("Debes introducir un texto distinto de vac�o");
			}
		}
		return null;
	}



	private static void mostrarPlaylist() {
		if (!playlist.isEmpty()) {
			System.out.println("** Canciones de la lista **");
			for (int i = 0; i < playlist.size(); i++) {
				System.out.println((i + 1) + " " + playlist.get(i));
				} 
			
			} else {
				System.out.println("La lista est� vacia");
		}
		
	}



	private static int solicitarNumMenu() {
		int num = 0;
		
		do {
			num = Integer.parseInt(sc.nextLine());
			
				if (num <= 0 && num >= 6) {
					System.out.println("La opci�n introducida no es v�lida");
				}
				
			}while (num <= 0 && num >= 6);
		
		return num;
	}
}