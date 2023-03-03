package main;

import control.CDEControlador;
import view.VConversionDolEur;

public class ConversorDolarEuro {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
				VConversionDolEur v = new VConversionDolEur();
				
				CDEControlador c = new CDEControlador(v);
				
				v.hacerVisible();
				
				v.setControlador(c);
			}
		});
	}

}
