package dam.main;

import dam.model.TPAviso;
import dam.model.TareaPeriodica;

public class AppGestorTareas {

	public static void main(String[] args) {
		TareaPeriodica tp = new TareaPeriodica(5);

		TPAviso tpa = new TPAviso(10, "Estudiar Principios de la Herencia!");

		
		while (!tp.necesitaEjecucion()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Esperando ejecución de tarea periódica...");
		}
		
		/*
		 * 
		 */
		
		tp.ejecutarTarea();

		while (!tpa.necesitaEjecucion()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Esperando ejecución de aviso...");
		}

		System.out.println("Aviso: " + tpa.leerAviso());

	}

}
