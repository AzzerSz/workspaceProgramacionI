package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.db.AccesoDB;
import dam.db.persistencia.CorredoresPersistencia;
import dam.model.Corredor;
import dam.view.VPConsultaPiloto;
import dam.view.VPRegistroPiloto;
import dam.view.VPrincipalPiloto;

public class PilotoControlador implements ActionListener {

	private VPrincipalPiloto vp;
	private VPRegistroPiloto pr;
	private VPConsultaPiloto pc;
	private CorredoresPersistencia corPer;
	
	public PilotoControlador(VPrincipalPiloto vp, VPRegistroPiloto pr, VPConsultaPiloto pc,
			CorredoresPersistencia corPer) {
		this.vp = vp;
		this.pr = pr;
		this.pc = pc;
		this.corPer = corPer;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VPrincipalPiloto.MNTM_REGISTRO)) {
				vp.mostrarPanel(pr);
			} else if (e.getActionCommand().equals(VPrincipalPiloto.MNTM_CONSULTA)) {
				pc.rellenarTabla(corPer.consultarDatos());
				vp.mostrarPanel(pc);
			} else if (e.getActionCommand().equals(VPrincipalPiloto.MNTM_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vp, "Se va a cerrar la aplicación ¿Desea continuar?"
						, "Confirmación cierre de aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(resp);
				}
			}
		} else if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VPRegistroPiloto.BTN_GUARDAR)) {
				if (pr.getCorredor() != null) {
					corPer.insertarCorredor(pr.getCorredor());
					JOptionPane.showConfirmDialog(vp, "Ha insertado un corredor"
							, "Confirmación de inserción", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
				}
			} else if (e.getActionCommand().equals(VPRegistroPiloto.BTN_LIMPIAR)) {
				
				pr.limpiarCampos();
			} else if (e.getActionCommand().equals(VPConsultaPiloto.BTN_BORRAR)) {
				if (pc.getNumeroFila() != -1) {
					
					int respElim = JOptionPane.showConfirmDialog(pc, "Se va a eliminar una fila ¿Desea continuar?"
							, "Confirmación borrado", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
					
					if (respElim == JOptionPane.YES_OPTION) {
						
						corPer.eliminarCorredorNumero(pc.getNumeroFila());
						pc.rellenarTabla(corPer.consultarDatos());
					}
					
				} else {
					JOptionPane.showMessageDialog(pc, "No hay ninguna fila seleccionada"
							, "Atención", JOptionPane.WARNING_MESSAGE);
				}
			}
		}

	}

}
