package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import dam.view.VPruebasUF9_6;

public class PruebasUF9_6Control implements ActionListener {

	private VPruebasUF9_6 ventana;
	
	
	
	
	public PruebasUF9_6Control() {
		ventana = new VPruebasUF9_6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VPruebasUF9_6.BTN_INFO)) {
				
				JOptionPane.showMessageDialog(ventana, "Este es un mensaje de información"
						, "Información", JOptionPane.INFORMATION_MESSAGE);
				
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_ERROR)) {
				
				ventana.mostrarError();
				
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_WARNING)) {
				
				JOptionPane.showMessageDialog(ventana, "Este es un mensaje de atención"
						, "Atención", JOptionPane.WARNING_MESSAGE);
				
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_TEXTO)) {
				
				JOptionPane.showMessageDialog(ventana, "Este es un mensaje de texto"
						, "Atención", JOptionPane.PLAIN_MESSAGE);
				
			} else if (e.getActionCommand().equals(VPruebasUF9_6.BTN_CONFIRM)) {
				JOptionPane.showConfirmDialog(ventana, "Se va mostrar un mensaje de aviso", "Confirmacion"
						, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
			}
			
			int respuesta = JOptionPane.YES_NO_OPTION;
			if (respuesta == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(ventana, "Este es un mensaje de atención"
						, "Atención", JOptionPane.WARNING_MESSAGE);
			}
		}
		

	}

}
