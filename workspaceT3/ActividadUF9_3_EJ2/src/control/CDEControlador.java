package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VConversionDolEur;

public class CDEControlador implements ActionListener {

	private VConversionDolEur ventanaPrinc;
	
	public CDEControlador(VConversionDolEur ventanaPrinc) {
		this.ventanaPrinc = ventanaPrinc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Double db = ventanaPrinc.getNumero();
		
		if (db != null) {
			ventanaPrinc.setLblResultado("Conversión: " + (db * 0.91) + "€");
		}
	}

}
