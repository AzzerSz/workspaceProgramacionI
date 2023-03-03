package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import dam.view.VPruebasUF9_6;

public class PruebasUF9_6Control implements ActionListener {

	private VPruebasUF9_6 ventana;
	
	public PruebasUF9_6Control() {
		ventana = new VPruebasUF9_6();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
 if (e.getSource() instanceof JMenuItem) {
			if (e.getActionCommand().equals(VPruebasUF9_6.OPC_11)) {
				JOptionPane.showMessageDialog(ventana, "Se ha pulsado la opción 11", "Información"
						, JOptionPane.INFORMATION_MESSAGE);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.OPC_12)) {
				JOptionPane.showMessageDialog(ventana, "Se ha pulsado la opción 12", "Información"
						, JOptionPane.INFORMATION_MESSAGE);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.OPC_13)) {
				JOptionPane.showMessageDialog(ventana, "Se ha pulsado la opción 13", "Información"
						, JOptionPane.INFORMATION_MESSAGE);
			} else if (e.getActionCommand().equals(VPruebasUF9_6.OPC_14)) {
				JOptionPane.showMessageDialog(ventana, "Se ha pulsado la opción 14", "Información"
						, JOptionPane.INFORMATION_MESSAGE);
			} 
		}
	}
		
}
