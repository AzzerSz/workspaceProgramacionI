package dam;
import java.awt.EventQueue;

import dam.control.GestorRecetasControl;
import dam.model.FuenteDatos;
import dam.view.PAddRecetas;
import dam.view.PConsultaRecetas;
import dam.view.VPGestorRecetas;

public class InicioGestionRecetas {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPGestorRecetas vp = new VPGestorRecetas();
				PAddRecetas par = new PAddRecetas();
				PConsultaRecetas pcr = new PConsultaRecetas();
				
				FuenteDatos datos = new FuenteDatos();
				
				GestorRecetasControl c = new GestorRecetasControl(vp, par, pcr, datos);
				
				vp.setControlador(c);
				par.setControlador(c);
				pcr.setControlador(c);
				
				vp.hacerVisible();
				
			}
		});

	}

}
