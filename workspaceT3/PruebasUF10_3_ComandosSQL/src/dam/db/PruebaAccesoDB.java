package dam.db;

import java.util.ArrayList;
import java.util.Scanner;

import dam.db.persistencia.AlumnosPersistencia;
import dam.model.Alumno;

public class PruebaAccesoDB {

	public static void main(String[] args) {
		AlumnosPersistencia ap = new AlumnosPersistencia();
		
		ArrayList<Alumno> listaAlumnos = ap.consultarAlumnos();
		
		if (!listaAlumnos.isEmpty()) {
			System.out.println("Listado de alumnos");
		}
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el dni del alumno que quieres consultar");
		String dni = sc.nextLine();
		
		Alumno alumno = ap.consultarAlumnoPorDni(dni);
		
		if (alumno != null) {
			System.out.println(alumno);
		} else {
			System.out.println("No existe ningún alumno con el dni introducido");
		}
		
		System.out.println("\nIntroduce el dni del nuevo alumno");
		dni = sc.nextLine().trim().toUpperCase();
		
		System.out.println("Introduce el nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduce la edad");
		int edad = Integer.parseInt(sc.nextLine());
		
		int res = ap.insertarAlumno(new Alumno(dni, nombre, edad));
		
		if (res == 1) {
			System.out.println("El alumno se ha insertado correctamente");
		} else {
			System.out.println("Ya existe un alumno con el DNI introducido");
		}
	}

}
