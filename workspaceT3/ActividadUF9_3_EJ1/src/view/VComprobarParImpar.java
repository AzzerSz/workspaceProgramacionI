package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JTextField;

import control.CPIControlador;

import javax.swing.JButton;

public class VComprobarParImpar extends JFrame {
	
	private JTextField txtNumero;
	private JButton btnComprobar;
	private JLabel lblResultado;
	
	public VComprobarParImpar() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Comprobar Par o Impar");
		getContentPane().setLayout(null);
		
		JLabel lblIntro = new JLabel("Introduce un n\u00FAmero");
		lblIntro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIntro.setBounds(15, 16, 189, 20);
		getContentPane().add(lblIntro);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(205, 13, 146, 26);
		getContentPane().add(txtNumero);
		txtNumero.setColumns(10);
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnComprobar.setBounds(148, 76, 146, 26);
		getContentPane().add(btnComprobar);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(15, 164, 369, 20);
		getContentPane().add(lblResultado);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador(CPIControlador listener) {
		btnComprobar.addActionListener(listener);
	}
	
	public Integer getInformacion() {
		Integer num = null;
		
		try {
			num = Integer.parseInt(txtNumero.getText());
		} catch (Exception e) {
			System.out.println("El valor introducido no es entero");
			lblResultado.setText("El valor introducido no es un número");
			lblResultado.setForeground(Color.RED); 
		}
		
		return num;
	}
	
	public void mostrarResultado(String resultado) {
		lblResultado.setText(resultado);
		lblResultado.setForeground(Color.BLUE);
	}
	
}
