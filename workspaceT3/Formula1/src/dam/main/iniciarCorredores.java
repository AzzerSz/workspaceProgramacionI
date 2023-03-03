package dam.main;

import java.awt.EventQueue;

import dam.control.PilotoControlador;
import dam.db.persistencia.CorredoresPersistencia;
import dam.view.VPConsultaPiloto;
import dam.view.VPRegistroPiloto;
import dam.view.VPrincipalPiloto;

public class iniciarCorredores {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPrincipalPiloto vp = new VPrincipalPiloto();
				VPRegistroPiloto pr = new VPRegistroPiloto();
				VPConsultaPiloto pc = new VPConsultaPiloto();
				CorredoresPersistencia corPer = new CorredoresPersistencia();
				
				PilotoControlador controlador = new PilotoControlador(vp, pr, pc, corPer);
				
				vp.addControlador(controlador);
				pr.addControlador(controlador);
				pc.addControlador(controlador);
				
				vp.hacerVisible();
				
			}
		});

	}

}
