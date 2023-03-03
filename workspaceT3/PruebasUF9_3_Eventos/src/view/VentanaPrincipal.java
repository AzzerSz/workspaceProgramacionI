package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

import control.Escuchador;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaPrincipal extends JFrame {
		
	private JTextField txtNombre;
	private JLabel lblNombre;
	private JButton btnSaludar;
	private JLabel lblSaludo;
	private Escuchador listener;
	
	public VentanaPrincipal() {
		super("Pruebas Eventos");
		initComponents();
	}

	private void initComponents() {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().setBackground(new Color(250, 240, 230));
		getContentPane().setLayout(null);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(26, 29, 90, 17);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNombre.setBounds(91, 30, 307, 19);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		btnSaludar = new JButton("Saludar");
		
		/*btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				lblSaludo.setText("Hola " + nombre);
			}
		}); */
		
		btnSaludar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSaludar.setBounds(200, 93, 85, 21);
		getContentPane().add(btnSaludar);
		
		lblSaludo = new JLabel("");
		lblSaludo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSaludo.setBounds(26, 180, 371, 13);
		getContentPane().add(lblSaludo);
		
		setSize(450, 250);
		setLocationRelativeTo(null);
	}
	
	public void setListener(Escuchador listener) {
		this.listener = listener;
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void ejecutarSaludo() {
		String nombre = txtNombre.getText();
		lblSaludo.setText("Hola " + nombre);
		
	}
}
