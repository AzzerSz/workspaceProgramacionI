package dam.view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import dam.control.ControladorHipoteca;
import dam.model.Hipoteca;

import javax.swing.JButton;

public class VentanaHipoteca extends JFrame {
	private JTextField txtCantidad;
	private JTextField txtAnios;
	private JTextField txtInteres;
	private JLabel lblResultado;
	private JButton btnCalcula;
	public VentanaHipoteca() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Calcular Hipoteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCantidad.setBounds(36, 25, 83, 25);
		getContentPane().add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtCantidad.setBounds(126, 25, 96, 25);
		getContentPane().add(txtCantidad);
		txtCantidad.setColumns(10);
		
		JLabel lblAnios = new JLabel("A\u00F1os:");
		lblAnios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAnios.setBounds(232, 25, 83, 25);
		getContentPane().add(lblAnios);
		
		txtAnios = new JTextField();
		txtAnios.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtAnios.setBounds(293, 25, 54, 25);
		getContentPane().add(txtAnios);
		txtAnios.setColumns(10);
		
		JLabel lblInteres = new JLabel("Interes:");
		lblInteres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblInteres.setBounds(357, 25, 83, 25);
		getContentPane().add(lblInteres);
		
		btnCalcula = new JButton("Calcula");
		btnCalcula.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCalcula.setBounds(496, 27, 110, 21);
		getContentPane().add(btnCalcula);
		
		txtInteres = new JTextField();
		txtInteres.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtInteres.setColumns(10);
		txtInteres.setBounds(432, 25, 54, 25);
		getContentPane().add(txtInteres);
		
		lblResultado = new JLabel("");
		lblResultado.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblResultado.setBounds(232, 79, 374, 25);
		getContentPane().add(lblResultado);
		
		setSize(700, 150);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void addListener (ControladorHipoteca e) {
		btnCalcula.addActionListener(e);
	}
	
	public void setResultado (Hipoteca h) {
		lblResultado.setText(String.valueOf(h.calcularCuotaMensual()));
	}

	public Hipoteca getDatos() {
		Hipoteca hipoteca = null;
		
		double cantHip = (double) solHipoteca();
		
		int duracion = (int) solDuracion();
		
		double interes = (double) solInteres();
		
		hipoteca = new Hipoteca(cantHip, duracion, interes);
		
		return hipoteca;
	}

	private Double solInteres() {
		Double interes = -1.0;
		
		try {
			interes = Double.parseDouble(txtAnios.getText());
			if (interes < 0) {
				interes = -1.0;
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblResultado.setText("Debes de introducir un número positivo entre 0 y 100 como interés");
		}
		
		return interes;
	}

	private Integer solDuracion() {
		Integer duracion = -1;
		
		try {
			duracion = Integer.parseInt(txtAnios.getText());
			
			if (duracion < 0) {
				duracion = -1;
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblResultado.setText("Debes de introducir un número positivo como duración");
		}
		
		return duracion;
	}

	private Double solHipoteca() {
		Double cantHip = -1.0;
		
		try {
			cantHip = Double.parseDouble(txtCantidad.getText());
			
			if (cantHip < 0) {
				cantHip = -1.0;
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			lblResultado.setText("Debes introducir un número entero en cantidad hipotecada");
		}
		return cantHip;
	}

}
