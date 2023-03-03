package dam.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TareaPeriodica {

	protected int periodo;
	protected Date ultimaEjec;
	protected boolean activa;
	
	public TareaPeriodica (int aPeriodoSegs) {
		this.periodo = aPeriodoSegs;
		actualizarReloj();
		activa=true;
	}

		//Constructor para ejecuciones cadasegundo

		public TareaPeriodica () {
			this(1);
		}

		//Establecer la última ejecución a la hora actual

		public void actualizarReloj() {
			ultimaEjec = new Date(); //Horaactual
		}
		
		public boolean necesitaEjecucion() {

			if (!activa) return false;

				// Calcular la hora de la próxima ejecución
				Calendar calProximaEj = new GregorianCalendar();
				calProximaEj.setTime(ultimaEjec);
				calProximaEj.add(Calendar.SECOND, periodo);
				Calendar calAhora= new GregorianCalendar();
	
				// Comprobar si ha pasado a la hora actual
	
				return (calProximaEj.before(calAhora));
			}

			public void ejecutarTarea() {

			System.out.println("Ejecucion de tarea");

			}

			public void activar() { activa = true; }

			public void desactivar() { activa = false; }
}
