package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Encuesta;
import model.ListaEncuestas;
import view.vEncuestador;

public class EncuestadorControlador implements ActionListener {

	private vEncuestador ventana;
	private ListaEncuestas list;
	
	public EncuestadorControlador(vEncuestador ventana, ListaEncuestas list) {
		this.ventana = ventana;
		this.list = list;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/* De esta manera obtenemos el componente en el que se ha producido el evento
		e.getSource(); */
		
		// De esta manera obtenemos el comando del componente en el que se ha producido el evento
		if (e.getActionCommand().equals(vEncuestador.BTN_GUARDAR)) {
			// El evento se ha producido en el botón Guardar
			Encuesta encuesta = ventana.obtenerEncuesta();
			list.addEncuesta(encuesta);
			
		} else if (e.getActionCommand().equals(vEncuestador.BTN_LIMPIAR)) {
			// El evento se ha producido en el botón Limpiar
			ventana.limpiarComponentes();
			
		} else if (e.getActionCommand().equals(vEncuestador.BTN_VER)) {
			
			ventana.mostrarLista(list.toString());
			
		}

	}

}
