package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import model.Corredor;
import model.FuenteDatos;
import view.PAddCorredor;
import view.PConsultarCorredor;
import view.VPCarrera;

public class CorredorControl implements ActionListener {
	
	private VPCarrera v;
	private PAddCorredor pac;
	private PConsultarCorredor pcr;
	private FuenteDatos datos;

	public CorredorControl(VPCarrera v, PAddCorredor pac, PConsultarCorredor pcr, FuenteDatos datos) {
		this.v = v;
		this.pac = pac;
		this.pcr = pcr;
		this.datos = datos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VPCarrera.MNTM_ADD)) {
				v.mostrarPanel(pac);
			} else if (e.getActionCommand().equals(VPCarrera.MNTM_CONSULTA)) {
				v.mostrarPanel(pcr);
			} else if (e.getActionCommand().equals(VPCarrera.MNTM_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(v, "Se va a cerrar la aplicación ¿Desea continuar?",
						"Confirmación cierre de aplicación", JOptionPane.YES_NO_OPTION,
						JOptionPane.INFORMATION_MESSAGE);
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
				
		} else if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(PAddCorredor.BTN_GUARDAR)) {
				Corredor co = pac.getDatos();

				if (co != null) {
					datos.addCorredor(co);
					pac.mostrarResultado("Se ha guardado el corredor correctamente");
				}
			
		} else if (e.getActionCommand().equals(PAddCorredor.BTN_LIMPIAR)) {
			pac.limpiarDatos();
			
		} else if (e.getActionCommand().equals(PConsultarCorredor.BTN_CONSULTAR)) {
			if (!datos.getColeccionGlobal().isEmpty()) {
				//Cuando se pulsa el boton, se muestra la tabla
				
				if (pcr.obtenerRadioButton().equals(PConsultarCorredor.RDBTN_HOMBRES)) {
					if (!datos.getColeccionHombres().isEmpty()) {
						pcr.configurarTabla();
						pcr.rellenarTabla(datos.getColeccionHombres());
					} else {
						pcr.mostrarError("La lista de hombres está vacía, agrega datos");
					}
					

				} else if (pcr.obtenerRadioButton().equals(PConsultarCorredor.RDBTN_MUJERES)) {
					if (!datos.getColeccionMujeres().isEmpty()) {
						pcr.configurarTabla();
						pcr.rellenarTabla(datos.getColeccionMujeres());
					} else {
						pcr.mostrarError("La lista de mujeres está vacía, agrega datos");
					}

				} else if (pcr.obtenerRadioButton().equals(PConsultarCorredor.RDBTN_TODOS)) {
					pcr.configurarTabla();
					pcr.rellenarTabla(datos.getColeccionGlobal());
				} 
			} else {
				pcr.mostrarError("La lista global está vacía, agrega datos");
			}
		}

	}
	}
}
