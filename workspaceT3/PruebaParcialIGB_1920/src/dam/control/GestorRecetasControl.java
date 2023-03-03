package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.model.FuenteDatos;
import dam.model.Receta;
import dam.view.PAddRecetas;
import dam.view.PConsultaRecetas;
import dam.view.VPGestorRecetas;

public class GestorRecetasControl implements ActionListener {
	
	VPGestorRecetas v;
	PAddRecetas par;
	PConsultaRecetas pcr;
	FuenteDatos datos;

	public GestorRecetasControl(VPGestorRecetas v, PAddRecetas pav, PConsultaRecetas pcv,
			FuenteDatos datos) {
		this.v = v;
		this.par = pav;
		this.pcr = pcv;
		this.datos = datos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JMenuItem) {
			
			if (e.getActionCommand().equals(VPGestorRecetas.MNTM_ADD)) {
				v.mostrarPanel(par);
				
			} else if (e.getActionCommand().equals(VPGestorRecetas.MNTM_CONSULTA)) {
				v.mostrarPanel(pcr);
				pcr.mostrarComponentesConsulta(false);
			
			} else if (e.getActionCommand().equals(VPGestorRecetas.MNTM_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(v, "Se va a cerrar la aplicación ¿Desea continuar?",
						"Confirmación cierre de aplicación", 
						JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
			
		} else if (e.getSource() instanceof JButton) {
			
			if (e.getActionCommand().equals(PAddRecetas.BTN_GUARDAR)) {
				Receta receta = par.obtenerVideoJuego();
				
				if (receta != null) {
					datos.addReceta(receta);
					par.mostrarResultado("Se ha guardado la receta correctamente");
					par.limpiarComponentes();
				}
			} else if (e.getActionCommand().equals(PConsultaRecetas.BTN_CONSULTAR)) {
				pcr.rellenarTabla(datos.getRecetario());
				pcr.mostrarComponentesConsulta(true);
				
			} else if (e.getActionCommand().equals(PConsultaRecetas.BTN_VER)) {
				int posRecSel = pcr.obtnerRecetaSel();
				
				if (posRecSel == -1) {
					pcr.mostrarDescripcion("");
					pcr.mostrarError("Debe seleccionar una receta");
				} else {
					pcr.mostrarDescripcion(datos.getRecetario().get(posRecSel).getDescripcion());
				}
				
			}
			
		}

	}

}
