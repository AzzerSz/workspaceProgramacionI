package view;

import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import control.CDEControlador;

import javax.swing.JButton;

public class VConversionDolEur extends JFrame {
	private JTextField txtDolar;
	private JButton btnConvertir;
	private JLabel lblResultado;
	
	public VConversionDolEur() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Conversi\u00F3n Dolar Euro");
		getContentPane().setLayout(null);
		
		JLabel lblPeticion = new JLabel("Introduce la cantidad de dolares:");
		lblPeticion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPeticion.setBounds(24, 38, 236, 25);
		getContentPane().add(lblPeticion);
		
		txtDolar = new JTextField();
		txtDolar.setBounds(274, 33, 141, 25);
		getContentPane().add(txtDolar);
		txtDolar.setColumns(10);
		
		btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConvertir.setBounds(154, 106, 141, 25);
		getContentPane().add(btnConvertir);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblResultado.setBounds(24, 174, 370, 20);
		getContentPane().add(lblResultado);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador(CDEControlador listener) {
		btnConvertir.addActionListener(listener);
	}
	
	public void setLblResultado(String lblResultado) {
		this.lblResultado.setText(lblResultado);
	}
	
	public double getNumero () {
		Double db = null;
		
		try {
			db = Double.parseDouble(txtDolar.getText());
			
			if (db <= 0) {
				db = null;
				throw new NumberFormatException();
				}
			
		} catch (NumberFormatException e) {
			lblResultado.setText("El valor debe ser numérico y positivo");
		}
		
		return db;
		
	}
	
}
