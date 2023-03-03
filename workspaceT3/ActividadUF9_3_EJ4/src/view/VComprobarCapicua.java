package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import control.CCEscuchador;

import javax.swing.JButton;

public class VComprobarCapicua extends JFrame {
	private JTextField txtInsert;
	private JButton btnEvento;
	private JLabel lblResultado;
	public VComprobarCapicua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComplements();
	}

	private void initComplements() {
		setTitle("Comprobar Capicua");
		getContentPane().setLayout(null);
		
		JLabel lblPresen = new JLabel("Introduce un n\u00FAmero:");
		lblPresen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPresen.setBounds(35, 50, 143, 13);
		getContentPane().add(lblPresen);
		
		txtInsert = new JTextField();
		txtInsert.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtInsert.setBounds(188, 49, 96, 19);
		getContentPane().add(txtInsert);
		txtInsert.setColumns(10);
		
		btnEvento = new JButton("\u00BFCapic\u00FAa?");
		btnEvento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEvento.setBounds(35, 78, 249, 21);
		getContentPane().add(btnEvento);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(35, 116, 372, 13);
		getContentPane().add(lblResultado);
		
		setSize(450, 300);
		setLocationRelativeTo(null);;
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void setControlador (CCEscuchador c) {
		btnEvento.addActionListener(c);
	}
	
	public void setResultado (String res, boolean boolres) {
		if (boolres) {
			lblResultado.setForeground(Color.GREEN);
		} else {
			lblResultado.setForeground(Color.RED);
		}
		
		lblResultado.setText(res);
	}
	
	public Integer getInformacion() {
		Integer num = null;
		
		try {
			num = Integer.parseInt(txtInsert.getText());
			
			if (num < 100 || num > 999) {
				num = null;
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblResultado.setForeground(Color.MAGENTA);
			lblResultado.setText("El número debe ser entero y de 3 cifras");
		}
		
		return num;
	}

}
