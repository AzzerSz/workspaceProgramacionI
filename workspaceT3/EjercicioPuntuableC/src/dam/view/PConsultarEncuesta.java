package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PConsultarEncuesta extends JPanel {
	public PConsultarEncuesta() {
		setLayout(null);
		
		JLabel lblConsultarEncuesta = new JLabel("Consultar Encuesta");
		lblConsultarEncuesta.setBounds(10, 10, 184, 28);
		lblConsultarEncuesta.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD | Font.ITALIC, 24));
		add(lblConsultarEncuesta);
	}

}
