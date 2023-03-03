package view;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

import control.CorredorControl;
import model.Corredor;

public class PAddCorredor extends JPanel {
	
	public static final String BTN_GUARDAR = "Guardar Datos";
	public static final String BTN_LIMPIAR = "Limpiar Datos";
	
	private JTextField txtNombre;
	private JTextField txtDorsal;
	private JRadioButton rdbtnHombre;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnMujer;
	private JSpinner jspEdad;
	private JComboBox<String> cmbModalidad;
	private JButton btnLimpiar;
	private JButton btnGuardar;
	public PAddCorredor() {
		setFont(new Font("Tahoma", Font.BOLD, 14));
		init();
	}

	private void init() {
		setLayout(null);
		setSize(VPCarrera.ANCHO - 15, VPCarrera.ALTO - 70);
		
		JLabel lblAdd = new JLabel("A\u00F1adir Corredor");
		lblAdd.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblAdd.setBounds(62, 41, 228, 34);
		add(lblAdd);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(91, 124, 87, 22);
		add(lblNombre);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSexo.setBounds(91, 192, 57, 22);
		add(lblSexo);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(181, 129, 160, 19);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDorsal = new JLabel("Dorsal:");
		lblDorsal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDorsal.setBounds(380, 124, 72, 22);
		add(lblDorsal);
		
		txtDorsal = new JTextField();
		txtDorsal.setColumns(10);
		txtDorsal.setBounds(455, 129, 160, 19);
		add(txtDorsal);
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setSelected(true);
		rdbtnHombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		buttonGroup.add(rdbtnHombre);
		rdbtnHombre.setBounds(184, 194, 81, 21);
		add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		rdbtnMujer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnMujer.setBounds(267, 194, 72, 21);
		add(rdbtnMujer);
		
		jspEdad = new JSpinner();
		jspEdad.setModel(new SpinnerNumberModel(4, 4, 125, 1));
		jspEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		jspEdad.setBounds(455, 197, 57, 20);
		add(jspEdad);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEdad.setBounds(380, 192, 57, 22);
		add(lblEdad);
		
		JLabel lblModalidad = new JLabel("Modalidad:");
		lblModalidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblModalidad.setBounds(91, 273, 95, 22);
		add(lblModalidad);
		
		cmbModalidad = new JComboBox<String>();
		cmbModalidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbModalidad.setModel(new DefaultComboBoxModel<String>(new String[] {"10000", "Medio Marat\u00F3n", "Marat\u00F3n"}));
		cmbModalidad.setBounds(196, 275, 137, 21);
		add(cmbModalidad);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnGuardar.setBounds(91, 388, 250, 34);
		add(btnGuardar);
		
		btnLimpiar = new JButton(BTN_LIMPIAR);
		btnLimpiar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLimpiar.setBounds(455, 388, 250, 34);
		add(btnLimpiar);
	}
	
	public void limpiarDatos() {
		txtNombre.setText("");
		txtDorsal.setText("");
		rdbtnHombre.setSelected(true);
		rdbtnMujer.setSelected(false);
		jspEdad.setValue(4);
		cmbModalidad.setSelectedIndex(0);
	}

public Corredor getDatos() {
		
		Corredor corredor = null;
		
		String nombre = txtNombre.getText().trim();
		
		if (nombre.isEmpty()) {
			mostrarError("El nombre del corredor es obligatorio");
		} else {
			String dorsal = txtDorsal.getText().trim();
			
			if (dorsal.isEmpty()) {
				mostrarError("El dorsal del corredor es obligatorio");
			} else if (dorsal.length() > 5) {
				mostrarError("El dorsal del corredor no puede tener más de 5 dígitos");
			} else if (contieneLetras(dorsal)) {
				mostrarError("El dorsal del corredor no puede contener caracteres que no sean números");
			}else {
				String sexo = "";
				if (rdbtnHombre.isSelected()) {
					sexo = rdbtnHombre.getText();
				} else if (rdbtnMujer.isSelected()) {
					sexo = rdbtnMujer.getText();
				}
				
					
				int edad = Integer.parseInt(String.valueOf(jspEdad.getValue()));
					
				String modalidad = (String) cmbModalidad.getSelectedItem();
			
				corredor = new Corredor(nombre, dorsal, sexo, edad, modalidad);
			}
			
		}
		
		return corredor;
		
	}

	private boolean contieneLetras(String dorsal) {
		
		boolean contiene = false;
		
		for (int x = 0; x < dorsal.length(); x++) {
	        char c = dorsal.charAt(x);
	        if (!(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || 
		        	c == '5' || c == '6' || c == '7' || c == '8' || c == '9')) {
	        	contiene = true;
	        	x = dorsal.length();
			}
	    }
	    return contiene;
	}

	public void mostrarResultado(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Resultado de la operación", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	private void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}

	public void setControlador(CorredorControl c) {
		btnGuardar.addActionListener(c);
		btnLimpiar.addActionListener(c);
		
	}
}
