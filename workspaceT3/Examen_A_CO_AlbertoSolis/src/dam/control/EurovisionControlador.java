package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.db.persistencia.ParticipantesPersistencia;
import dam.view.PConsulta;
import dam.view.PRegistrar;
import dam.view.VPrincipal;

public class EurovisionControlador implements ActionListener {
	
	private VPrincipal vp;
	private PConsulta pc;
	private PRegistrar pr;
	private ParticipantesPersistencia parPer;

	public EurovisionControlador(VPrincipal vp, PConsulta pc, PRegistrar pr, ParticipantesPersistencia parPer) {
		this.vp = vp;
		this.pc = pc;
		this.pr = pr;
		this.parPer = parPer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VPrincipal.MNTM_CONSULTA)) {
				pc.rellenarTabla(parPer.consultarDatos());
				vp.mostrarPanel(pc);
			} else if (e.getActionCommand().equals(VPrincipal.MNTM_REGISTRO)) {
				pr.rellenarComboPaises(parPer.consultarPaisesEurovision());
				vp.mostrarPanel(pr);
			} else if (e.getActionCommand().equals(VPrincipal.MNTM_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vp, "Se va a cerrar la aplicación ¿Desea continuar?"
						, "Confirmación cierre de aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(resp);
				}
			}
		} else if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(PRegistrar.BTN_GUARDAR)) {
				TreeMap<Integer, String> recogerPuntos= pr.recogerPuntos();
				
				if (!recogerPuntos.isEmpty()) {
					int exito = parPer.ActualizarRestaurante(recogerPuntos);
					
					if (exito != 0) {
						JOptionPane.showConfirmDialog(vp, "Ha actualizado la base de datos"
								, "Confirmación eliminación", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
					} else {
						pr.mostrarError("ERROR AL ACTUALIZAR");
					}
				}
			} else if (e.getActionCommand().equals(PRegistrar.BTN_LIMPIAR)) {
				pr.limpiarCampos();
			}
			
		}

	}

}
