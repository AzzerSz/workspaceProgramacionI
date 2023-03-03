package dam.main;

import java.util.ArrayList;
import java.util.Scanner;

import dam.model.CD;
import dam.model.CDAudio;
import dam.model.CDVideo;
import dam.model.Ejemplar;
import dam.model.Libro;

public class Biblioteca {

	static final String[] MENU = {"Introduce una de las siguientes opciones:", 
								"V para visualizar el listado", "A para alquilar un ejemplar", 
								"D para devolver un ejemplar"};
	
	static ArrayList<Ejemplar> ejemplares; 
	static Scanner sc;
	
	public static void main(String[] args) {
		
		ejemplares = new ArrayList<Ejemplar>();
		sc = new Scanner(System.in);
		
		ejemplares.add(new Libro(4, 2, "El señor de los anillos", "J.R.R. Tolkien", 1368));
		ejemplares.add(new Libro(4, 0, "Diez Negritos", "Agatha Christie", 256));
		ejemplares.add(new CDAudio(3, 1, "Thriller", 43, 9));
		ejemplares.add(new CDAudio(3, 3, "Back in black", 42, 10));
		ejemplares.add(new CDVideo(4, 3, "Star Wars", 128, "Aventuras"));
		ejemplares.add(new CDVideo(3, 1, "TIERRA", 100, "Documental"));
		
		char respuesta = 'X';
		
		while (respuesta != 'Z') {
			mostrarMenu();
			respuesta = solicitarRespuesta();
			
			switch (respuesta) {
			case 'V':
				mostrarLista();
				break;
			case 'A':
				alquilarEjemplar();
				break;
			case 'D':
				devolverEjemplar();
	break;

			}
			
		}
		
		sc.close();

	}

	private static void devolverEjemplar() {

		System.out.println("Introduce el nombre del Ejemplar");
		String nombre = sc.nextLine();
		Libro libro = new Libro(0, 0, nombre, nombre, 0);
		CD cd = new CD(0, 0, nombre, 0);
		
		for (int i = 0; i < ejemplares.size(); i++) {
			if (ejemplares.get(i) instanceof Libro) {
				libro = (Libro) ejemplares.get(i);
				
				if (nombre.equals(libro.getTitulo())) {
					
					if (ejemplares.get(i).devolucion()) {
						System.out.println("Devolución ejecutada correctamente");
					} else {
						System.out.println("Devolución denegada");
					}
				}
			} else if (ejemplares.get(i) instanceof CD) {
				cd = (CD) ejemplares.get(i);
				
				if (nombre.equals(cd.getNombre())) {
					
					if (ejemplares.get(i).devolucion()) {
						System.out.println("Devolución ejecutada correctamente");
					} else {
						System.out.println("Devolución denegada");
					}
				}
			}
		}
		
	
		
	}

	private static void alquilarEjemplar() {
		System.out.println("Introduce el nombre del Ejemplar");
		String nombre = sc.nextLine();
		Libro libro = new Libro(0, 0, nombre, nombre, 0);
		CD cd = new CD(0, 0, nombre, 0);
		
		for (int i = 0; i < ejemplares.size(); i++) {
			if (ejemplares.get(i) instanceof Libro) {
				libro = (Libro) ejemplares.get(i);
				
				if (nombre.equals(libro.getTitulo())) {
					
					if (ejemplares.get(i).prestamo()) {
						System.out.println("Prestamo ejecutado correctamente");
					} else {
						System.out.println("Prestamo denegado");
					}
				}
			} else if (ejemplares.get(i) instanceof CD) {
				cd = (CD) ejemplares.get(i);
				
				if (nombre.equals(cd.getNombre())) {
					
					if (ejemplares.get(i).prestamo()) {
						System.out.println("Prestamo ejecutado correctamente");
					} else {
						System.out.println("Prestamo denegado");
					}
				}
			} else {
				System.out.println("Ejemplar no encontrado");
			}
		}
		
	}

	private static void mostrarLista() {
		for (int i = 0; i < ejemplares.size(); i++) {
			ejemplares.get(i).mostrarDatos();
		}
		
	}

	private static char solicitarRespuesta() {
		String respuesta = "X";
		boolean valNoVal = true;
		
		while (valNoVal) {
			try {
				
				respuesta = sc.nextLine();
				
				if (!(respuesta.toUpperCase().charAt(0) == 'V' || respuesta.toUpperCase().charAt(0) == 'A' 
						|| respuesta.toUpperCase().charAt(0) == 'D' || respuesta.toUpperCase().charAt(0) == 'Z') ) {
					
					throw new Exception("Introduce un valor correcto: V, A o D ");
					
				} else {
					valNoVal = false;
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return respuesta.toUpperCase().charAt(0);
	}

	private static void mostrarMenu() {
		for (int i = 0; i < MENU.length; i++) {
			System.out.println(MENU[i]);
		}
		
	}

}
