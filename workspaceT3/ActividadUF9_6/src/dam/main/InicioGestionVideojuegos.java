package dam.main;

import java.awt.EventQueue;

import dam.control.GestionVideojuegosControl;
import dam.model.FuenteDatos;
import dam.view.PAddVideojuegos;
import dam.view.PConsultaVideojuegos;
import dam.view.VPGestorVideojuegos;

public class InicioGestionVideojuegos {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPGestorVideojuegos vp = new VPGestorVideojuegos();
				PAddVideojuegos pav = new PAddVideojuegos();
				PConsultaVideojuegos pcv = new PConsultaVideojuegos();
				
				FuenteDatos datos = new FuenteDatos();
				
				GestionVideojuegosControl c = new GestionVideojuegosControl(vp, pav, pcv, datos);
				
				vp.setControlador(c);
				pav.setControlador(c);
				pcv.setControlador(c);
				
				vp.hacerVisible();
				 
				
			}
		});

	}

}
