package dam.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TPReloj extends TareaPeriodica {

	public TPReloj() {
		super(60);
	}

	/*
	public TPReloj() {
		periodo = 60;
		actualizarReloj();
		activa = true;
	}
	*/
	
	public String leerHora() {

		Calendar cal = new GregorianCalendar();

		return cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE);

		}
	
	@Override
	public void ejecutarTarea() {
		System.out.println(leerHora());
	}
	
	
}
