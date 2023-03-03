package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.model.DatosRecetas;
import dam.view.PAddReceta;
import dam.view.PConsultaReceta;
import dam.view.VPRecetas;

public class RecetasControl implements ActionListener {
	
	private VPRecetas vpr;
	private PAddReceta pad;
	private PConsultaReceta pco;
	private DatosRecetas listRec;

	public RecetasControl(VPRecetas vpr, PAddReceta pad, PConsultaReceta pco, DatosRecetas listRec) {
		this.vpr = vpr;
		this.pad = pad;
		this.pco = pco;
		this.listRec = listRec;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VPRecetas.MENU_ANYADIR)) {
				vpr.mostrarPanel(pad);
			} else if (e.getActionCommand().equals(VPRecetas.MENU_CONSULTA)) {
				vpr.mostrarPanel(pco);
			} else if (e.getActionCommand().equals(VPRecetas.MENU_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vpr, "Se va a cerrar la aplicación ¿Desea continuar?"
						, "Confirmación cierre de aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(resp);
				}
			}
		}
		
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(PAddReceta.BTN_GUARDAR)) {
				if (pad.getReceta() != null) {
					listRec.addReceta(pad.getReceta());
					JOptionPane.showMessageDialog(vpr, "Receta Agregada Correctamente"
							, "Atención", JOptionPane.INFORMATION_MESSAGE);
				}
					
			} else if (e.getActionCommand().equals(PConsultaReceta.BTN_MOSTRAR_LIST)) {
				pco.vaciarTabla();
				pco.rellenarTabla(listRec);
			} else if (e.getActionCommand().equals(PConsultaReceta.BTN_DESC)) {
				pco.setTxt(listRec);
			}
		}
		
	}

}
