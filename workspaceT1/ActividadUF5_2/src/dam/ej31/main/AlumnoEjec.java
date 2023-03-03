package dam.ej31.main;

import java.util.Scanner;

import dam.ej31.pojo.Alumno;

public class AlumnoEjec {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Alumno alumnos;
		boolean bool = true;
		
		String nombre;
		double tareas;
		double examen;
		double actitud;
		
		int cont = 0;
		double notaMax = 0;
		String nombreMax = "null";
		
		int continuar;
		
		double suma = 0;
		int contAprob = 0;
		int contSusp = 0;
		
		while (bool) {
			System.out.println("Introduce el nombre del alumno");
			nombre = entrada.nextLine();
			
			System.out.println("Introduce la nota de las tareas del alumno");
			tareas = Double.parseDouble(entrada.nextLine());
			
			System.out.println("Introduce la nota del examen del alumno");
			examen = Double.parseDouble(entrada.nextLine());
			
			System.out.println("Introduce la nota de la actitud del alumno");
			actitud = Double.parseDouble(entrada.nextLine());
			
			alumnos = new Alumno(nombre, tareas, examen, actitud);
			
			System.out.println(alumnos);
			System.out.println(alumnos.getNotaFinal());
			
			cont++;
			
			suma += alumnos.getNotaFinal(); 
			
			
			if (alumnos.getNotaFinal() >= 5) {
				contAprob++;
			} else {
				contSusp++;
			}
			
			if (cont == 0 || notaMax < alumnos.getNotaFinal()) {
				notaMax = alumnos.getNotaFinal();
				nombreMax = nombre;
			}
			
			System.out.println("¿Desea continuar? 1-SI / 2-NO");
			continuar = Integer.parseInt(entrada.nextLine());
			if (continuar == 2) {
				bool = false;
			}
		}
		
		System.out.println("La nota máxima es " + notaMax + " de " + nombreMax );
		System.out.println("La media es " + Math.round(suma/cont));
		System.out.println("Han aprobado " + contAprob + " Han suspendido " + contSusp);
		
		entrada.close();

	}

}
