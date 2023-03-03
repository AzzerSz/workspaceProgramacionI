package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dam.model.FuenteDatos;
import dam.model.Videojuego;
import dam.view.PAddVideojuegos;
import dam.view.PConsultaVideojuegos;
import dam.view.VPGestorVideojuegos;

public class GestionVideojuegosControl implements ActionListener {

	private VPGestorVideojuegos vp;
	private PAddVideojuegos pav;
	private PConsultaVideojuegos pcv;
	FuenteDatos datos;

	public GestionVideojuegosControl(VPGestorVideojuegos vp, PAddVideojuegos pav, PConsultaVideojuegos pcv,
			FuenteDatos datos) {
		this.vp = vp;
		this.pav = pav;
		this.pcv = pcv;
		this.datos = datos;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		FuenteDatos fd = new FuenteDatos();
		
		if (e.getSource() instanceof JMenuItem) {
			
			if (e.getActionCommand().equals(VPGestorVideojuegos.MNTM_ADD)) {
				vp.mostrarPanel(pav);
				
			} else if (e.getActionCommand().equals(VPGestorVideojuegos.MNTM_CONSULTA)) {
				vp.mostrarPanel(pcv);
				
				
			} else if (e.getActionCommand().equals(VPGestorVideojuegos.MNTM_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vp, "Se va a cerrar la aplicación ¿Desea continuar?"
						, "Confirmación cierre de aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(resp);
				}
			}
			
		} else if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(PAddVideojuegos.BTN_GUARDAR)) {
				
				if (pav.recogerDatos() != null) {
					datos.addVideojuego(pav.recogerDatos());
					JOptionPane.showMessageDialog(vp, "VideoJuego Agregado Correctamente"
							, "Atención", JOptionPane.INFORMATION_MESSAGE);
					
				}
				
			} else if (e.getActionCommand().equals(PConsultaVideojuegos.BTN_CONSULTAR)) {
				if (!fd.getColeccion().isEmpty()) {
					pcv.rellenarTabla(fd);
				} else {
					JOptionPane.showMessageDialog(vp, "La colección está vacía por favor introduce información"
							, "Atención", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		}

	}

}
