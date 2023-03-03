package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dam.model.Hipoteca;
import dam.view.VentanaHipoteca;

public class ControladorHipoteca implements ActionListener {

	private VentanaHipoteca ventana;
	private Hipoteca hipoteca;
	
	public ControladorHipoteca(VentanaHipoteca ventana) {
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		ventana = new VentanaHipoteca();
		
		hipoteca = ventana.getDatos();
		System.out.println(hipoteca);
		
		
		if (hipoteca.getCantHip() != -1 && hipoteca.getDuracion() != -1 && hipoteca.getInteres() != -1) {
			ventana.setResultado(hipoteca);
			System.out.println(hipoteca);
		}

	}

}
