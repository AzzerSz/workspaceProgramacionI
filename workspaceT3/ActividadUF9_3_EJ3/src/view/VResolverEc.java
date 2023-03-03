package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import control.RE2Controlador;
import model.Ecuacion;

import java.awt.Color;
import java.awt.Font;
import java.util.Iterator;

import javax.swing.JButton;

public class VResolverEc extends JFrame {
	private JTextField txtB;
	private JTextField txtA;
	private JTextField txtC;
	private JButton btnResolver;
	private JLabel lblResultado;
	public VResolverEc() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Resolver Ecuaci\u00F3n de segundo grado");
		getContentPane().setLayout(null);
		
		JLabel lblA = new JLabel("x\u00B2");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setBounds(104, 86, 45, 13);
		getContentPane().add(lblA);
		
		txtB = new JTextField();
		txtB.setBounds(128, 83, 38, 19);
		getContentPane().add(txtB);
		txtB.setColumns(10);
		
		JLabel lblB = new JLabel("X");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setBounds(176, 86, 45, 13);
		getContentPane().add(lblB);
		
		txtA = new JTextField();
		txtA.setColumns(10);
		txtA.setBounds(56, 83, 38, 19);
		getContentPane().add(txtA);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(199, 83, 38, 19);
		getContentPane().add(txtC);
		
		JLabel lblEnunciado = new JLabel("= 0");
		lblEnunciado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnunciado.setBounds(247, 86, 45, 13);
		getContentPane().add(lblEnunciado);
		
		btnResolver = new JButton("Resolver");
		btnResolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnResolver.setBounds(56, 126, 217, 21);
		getContentPane().add(btnResolver);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setBounds(49, 184, 331, 13);
		getContentPane().add(lblResultado);
		
		setSize(450, 300);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible () {
		setVisible(true);
	}
	
	public void setControlador (RE2Controlador listener) {
		btnResolver.addActionListener(listener);
	}
	
	public void setResultado (String string) {
		lblResultado.setText(string);
	}
	
	public Ecuacion getInformacion () {
		Integer[] num = {null, null, null};
		Ecuacion ec = null;
			try {
				num[0] = Integer.parseInt(txtA.getText());
				num[1] = Integer.parseInt(txtB.getText());
				num[2] = Integer.parseInt(txtC.getText());
				ec = new Ecuacion(num[0], num[1], num[2]);
			} catch (Exception e) {
				lblResultado.setText("Alguno de los valores introducidos no es un número");
				lblResultado.setForeground(Color.RED);
			} 
		if (ec != null) {
			lblResultado.setForeground(Color.BLUE);
		}
		return ec;
	}

}
