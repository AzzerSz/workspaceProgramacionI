package dam.main;

import java.awt.EventQueue;

import dam.control.ControladorHipoteca;
import dam.model.Hipoteca;
import dam.view.VentanaHipoteca;

public class HipotecaMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VentanaHipoteca v = new VentanaHipoteca();
				
				ControladorHipoteca c = new ControladorHipoteca(v);
				
				v.addListener(c);
				
				v.hacerVisible();
				
			}
		});

	}

}
