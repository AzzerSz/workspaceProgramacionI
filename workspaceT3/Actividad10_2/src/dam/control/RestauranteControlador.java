package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.db.persistencia.RestaurantesPersistencia;
import dam.model.Restaurante;
import dam.view.PConsulta;
import dam.view.PModificar;
import dam.view.PRegistro;
import dam.view.VPrincipalRestaurante;

public class RestauranteControlador implements ActionListener {

	private VPrincipalRestaurante vp;
	private PConsulta pco;
	private PRegistro pre;
	private PModificar pmo;
	private RestaurantesPersistencia RestPer;
	
	public RestauranteControlador(VPrincipalRestaurante vp, PConsulta pco, PRegistro pre, PModificar pmo,
			RestaurantesPersistencia restPer) {
		this.vp = vp;
		this.pco = pco;
		this.pre = pre;
		this.pmo = pmo;
		this.RestPer = restPer;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VPrincipalRestaurante.MNTM_CONSULTA)) {
				
				vp.mostrarPanel(pco);
				pco.rellenarComboRegion(RestPer.consultarRegionesDistinciones());
				
				
			} else if (e.getActionCommand().equals(VPrincipalRestaurante.MNTM_REGISTRO)) {
				vp.mostrarPanel(pre);
			} else if (e.getActionCommand().equals(VPrincipalRestaurante.MNTM_MODIFICACION)) {
				vp.mostrarPanel(pmo);
			} else if (e.getActionCommand().equals(VPrincipalRestaurante.MNTM_SALIR)) {
				int resp = JOptionPane.showConfirmDialog(vp, "Se va a cerrar la aplicación ¿Desea continuar?"
						, "Confirmación cierre de aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
				
				if (resp == JOptionPane.YES_OPTION) {
					System.exit(resp);
				}
			}
		}
		
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(PConsulta.BTN_CONSULTAR)) {
				
				ArrayList<Restaurante> listaRest = RestPer.consultarDatos(Integer.parseInt(pco.getRegionGetDist()[0]), pco.getRegionGetDist()[1]);
				if (!listaRest.isEmpty()) {
					pco.rellenarTabla(listaRest);
				
					pco.mostrarOculto(true);
					
				} else {
					
					pco.mostrarOculto(false);
					JOptionPane.showMessageDialog(pco, "No hay datos para esa consulta"
							, "Atención", JOptionPane.WARNING_MESSAGE);
					
				}
				
				
			} else if (e.getActionCommand().equals(PConsulta.BTN_ELIMINAR)) {
				
				if (pco.getNombreFila() != null) {
					
					int respElim = JOptionPane.showConfirmDialog(pco, "Se va a eliminar una fila ¿Desea continuar?"
							, "Confirmación borrado", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
					
					if (respElim == JOptionPane.YES_OPTION) {
						int exito = RestPer.eliminarRestauranteNombre(pco.getNombreFila());
						pco.rellenarTabla(RestPer.consultarDatos(Integer.parseInt(pco.getRegionGetDist()[0]),
								pco.getRegionGetDist()[1]));
			
						if (exito == -1) {
							
							JOptionPane.showMessageDialog(pco, "Error al eliminar"
									, "Atención", JOptionPane.WARNING_MESSAGE);
							
						} else {
							 
							JOptionPane.showConfirmDialog(vp, "Ha eliminado el restaurante"
									, "Confirmación eliminación", JOptionPane.PLAIN_MESSAGE, JOptionPane.INFORMATION_MESSAGE);
							
						}
						
					}
				} else {
					JOptionPane.showMessageDialog(pco, "No hay ninguna fila seleccionada"
							, "Atención", JOptionPane.WARNING_MESSAGE);
				}
				
			} else if (e.getActionCommand().equals(PRegistro.BTN_REGISTRAR)) {
				
				if (pre.getRestaurante(RestPer.consultarNombresRestaurante()) != null) {
					
					RestPer.insertarRestaurante(pre.getRestaurante(RestPer.consultarNombresRestaurante()));
					
				}
			} else if (e.getActionCommand().equals(PRegistro.BTN_LIMPIAR)) {
				
				pre.limpiarFormulario();
				
			} else if (e.getActionCommand().equals(PModificar.BTN_BUSCAR)) {
				if (pmo.getDatosNombre(RestPer.consultarNombresRestaurante()) != null) {
					pmo.setModificacionesBloqueadas(false);
				}
			} else if (e.getActionCommand().equals(PModificar.BTN_MODIFICAR)) {
				
				if (pmo.getRestauranteActualizar() != null) {
					RestPer.ActualizarRestaurante(pmo.getRestauranteActualizar());
				}
				
			} else if (e.getActionCommand().equals(PModificar.BTN_CANCELAR)) {
				pmo.limpiarCampos();
				pmo.setModificacionesBloqueadas(true);
			}
		}
	}

}
