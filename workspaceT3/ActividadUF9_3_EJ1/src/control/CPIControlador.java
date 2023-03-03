package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VComprobarParImpar;

public class CPIControlador implements ActionListener {

	VComprobarParImpar ventana;
	
	
	
	public CPIControlador(VComprobarParImpar ventana) {
		this.ventana = ventana;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		Integer i = ventana.getInformacion();
		
		if (i != null) {
			if (i % 2 == 0) {
				ventana.mostrarResultado("++++ ES PAR ++++");
			} else {
				ventana.mostrarResultado("++++ ES IMPAR ++++");
			}
		}

	}

}
