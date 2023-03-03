package main;

import java.awt.EventQueue;

import control.CorredorControl;
import model.FuenteDatos;
import view.PAddCorredor;
import view.PConsultarCorredor;
import view.VPCarrera;

public class IniciarCarrera {
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {		
			@Override
			public void run() { 
				
				VPCarrera vp = new VPCarrera();
				PAddCorredor pad = new PAddCorredor();
				PConsultarCorredor pco = new PConsultarCorredor();
				
				FuenteDatos datos = new FuenteDatos();
				
				CorredorControl c = new CorredorControl(vp, pad, pco, datos);
				
				vp.setControlador(c);
				pad.setControlador(c);
				pco.setControlador(c);

				vp.hacerVisible();
				
			}
		});

}

}

