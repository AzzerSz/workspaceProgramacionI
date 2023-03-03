package dam.main;

import java.awt.EventQueue;

import dam.control.EurovisionControlador;
import dam.db.persistencia.ParticipantesPersistencia;
import dam.view.PConsulta;
import dam.view.PRegistrar;
import dam.view.VPrincipal;

public class EurovisionInicio {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPrincipal vp = new VPrincipal();
				PConsulta pc = new PConsulta();
				PRegistrar pr = new PRegistrar();
				
				ParticipantesPersistencia parPer = new ParticipantesPersistencia();
				
				EurovisionControlador controlador = new EurovisionControlador(vp, pc, pr, parPer);
				
				vp.addControlador(controlador);
				pr.addControlador(controlador);
				
				vp.setVisible(true);
				
			}
		});

	}

}
