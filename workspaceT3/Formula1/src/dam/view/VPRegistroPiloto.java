package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import dam.control.PilotoControlador;
import dam.model.Corredor;

import javax.swing.SpinnerNumberModel;

public class VPRegistroPiloto extends JPanel {
	
	public static final String BTN_LIMPIAR = "Limpiar";
	public static final String BTN_GUARDAR = "Guardar";
	
	private JTextField txtNombre;
	private JTextField txtNacionalidad;
	private JTextField txtEscuderia;
	private JSpinner spnNum;
	private JSpinner spnEdad;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	
	public VPRegistroPiloto() {
		
		initComponents();
	}

	private void initComponents() {
		setSize(VPrincipalPiloto.ANCHO - 15, VPrincipalPiloto.ALTO - 70);
		setLayout(null);
		
		JLabel lblNumero = new JLabel("N\u00FAmero:");
		lblNumero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNumero.setBounds(60, 55, 70, 15);
		add(lblNumero);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(374, 55, 70, 15);
		add(lblNombre);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEdad.setBounds(60, 124, 70, 15);
		add(lblEdad);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNacionalidad.setBounds(374, 124, 97, 15);
		add(lblNacionalidad);
		
		JLabel lblEscuderia = new JLabel("Escuderia:");
		lblEscuderia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEscuderia.setBounds(60, 194, 96, 15);
		add(lblEscuderia);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardar.setBounds(261, 322, 113, 30);
		add(btnGuardar);
		
		spnNum = new JSpinner();
		spnNum.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spnNum.setBounds(140, 50, 40, 25);
		add(spnNum);
		
		spnEdad = new JSpinner();
		spnEdad.setModel(new SpinnerNumberModel(18, 18, null ,1));
		spnEdad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spnEdad.setBounds(116, 119, 40, 25);
		add(spnEdad);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(446, 55, 214, 15);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNacionalidad = new JTextField();
		txtNacionalidad.setColumns(10);
		txtNacionalidad.setBounds(483, 124, 214, 15);
		add(txtNacionalidad);
		
		txtEscuderia = new JTextField();
		txtEscuderia.setColumns(10);
		txtEscuderia.setBounds(140, 194, 214, 15);
		add(txtEscuderia);
		
		btnLimpiar = new JButton(BTN_LIMPIAR);
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpiar.setBounds(406, 322, 113, 30);
		add(btnLimpiar);
		
	}
	
	public void addControlador(PilotoControlador e) {
		btnGuardar.addActionListener(e);
		btnLimpiar.addActionListener(e);
	}
	
	public void mostrarError(String error) {
		
		JOptionPane.showMessageDialog(this, error
				, "Atención", JOptionPane.WARNING_MESSAGE);
	}
	
	public Corredor getCorredor() {
		Corredor corredor = null;
		
		if ((int) spnNum.getValue() > 0) {
			
			int numero = (int) spnNum.getValue();
			
			if (!txtNombre.getText().trim().isEmpty()) {
				
				String nombre = txtNombre.getText();
				String nacionalidad = txtNacionalidad.getText();
				int edad = (int) spnEdad.getValue();
				String escuderia = txtEscuderia.getText();
				
				corredor = new Corredor(numero, nombre, nacionalidad, edad, escuderia);
				
				
			} else {
				
				mostrarError("El campo nombre no puede estar vacío");
			}
			
		} else {
			
			mostrarError("El valor del número del corredor ha de ser mayor que 0");
		}
		
		return corredor;
	}
	
	public void limpiarCampos() {
		spnNum.setValue(0);
		txtNombre.setText("");
		spnEdad.setValue(18);
		txtNacionalidad.setText("");
		txtEscuderia.setText("");
		
	}
	
}
