package dam.main;

import java.awt.EventQueue;

import dam.control.RestauranteControlador;
import dam.db.persistencia.RestaurantesPersistencia;
import dam.view.PConsulta;
import dam.view.PModificar;
import dam.view.PRegistro;
import dam.view.VPrincipalRestaurante;

public class InicioRestaurantes {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPrincipalRestaurante vp = new VPrincipalRestaurante();
				PConsulta pc = new PConsulta();
				PRegistro pr = new PRegistro();
				PModificar pm = new PModificar();
				
				RestaurantesPersistencia restPersis = new RestaurantesPersistencia();
				
				RestauranteControlador controlador = new RestauranteControlador(vp, pc, pr, pm, restPersis);
				
				vp.addControlador(controlador);
				pc.addControlador(controlador);
				pr.addControlador(controlador);
				pm.addControlador(controlador);
				
				vp.hacerVisible();
				
			}
		});
	}

}
