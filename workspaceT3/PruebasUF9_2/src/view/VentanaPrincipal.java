package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class VentanaPrincipal extends JFrame {
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	
	public VentanaPrincipal(String titulo) {
		super(titulo);
		initComponents();
	}

	private void initComponents() {
		try {

			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

			} catch (Exception e) {

			e.printStackTrace();

			}
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Mi primera etiqueta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(125, 89, 182, 13);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Mi segunda etiqueta");
		lblNewLabel_1.setBounds(125, 122, 154, 13);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(124, 164, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		setSize(600, 250);
		setLocationRelativeTo(null);
		
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
