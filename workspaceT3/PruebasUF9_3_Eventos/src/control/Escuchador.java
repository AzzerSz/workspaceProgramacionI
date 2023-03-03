package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.VentanaPrincipal;

public class Escuchador implements ActionListener {

	VentanaPrincipal vp;
	
	public Escuchador(VentanaPrincipal vp) {
		this.vp = vp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vp.ejecutarSaludo();
		
	}

}
