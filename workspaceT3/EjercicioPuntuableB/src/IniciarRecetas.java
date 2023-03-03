import java.awt.EventQueue;

import dam.control.RecetasControl;
import dam.model.DatosRecetas;
import dam.view.PAddReceta;
import dam.view.PConsultaReceta;
import dam.view.VPRecetas;

public class IniciarRecetas {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPRecetas vpr = new VPRecetas();
				PAddReceta pad = new PAddReceta();
				PConsultaReceta pco = new PConsultaReceta();
				
				DatosRecetas listaRecetas = new DatosRecetas();
				
				RecetasControl controlador = new RecetasControl(vpr, pad, pco, listaRecetas);
				
				vpr.setControlador(controlador);
				pad.setControlador(controlador);
				pco.setControlador(controlador);
				
				vpr.hacerVisible();
				
			}
		});
	}

}
