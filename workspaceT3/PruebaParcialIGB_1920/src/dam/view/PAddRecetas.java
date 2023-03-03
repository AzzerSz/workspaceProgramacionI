package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import dam.control.GestorRecetasControl;
import dam.model.Receta;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class PAddRecetas extends JPanel {
	public static final String BTN_GUARDAR = "Guardar Datos";
	
	private JTextField txtNombre;
	private JComboBox<String> cmbDificultad;
	private JButton btnGuardar;
	private JTextArea txtaDescripcion;
	private JSpinner spnTiempo;
	
	public PAddRecetas() {
		init();
	}

	private void init() {
		setLayout(null);
		
		setSize(VPGestorRecetas.PANEL_ANCHO, VPGestorRecetas.PANEL_ALTO);
		
		JLabel lblTitulo = new JLabel("Añadir Receta");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(45, 45, 319, 29);
		add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(97, 110, 111, 22);
		add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setToolTipText("Introduce el título dela receta");
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNombre.setBounds(246, 108, 433, 25);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Descripción");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDescripcion.setBounds(97, 175, 111, 22);
		add(lblDescripcion);
		
		cmbDificultad = new JComboBox<String>();
		cmbDificultad.setModel(new DefaultComboBoxModel<String>(Receta.DIFICULTAD));
		cmbDificultad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbDificultad.setBounds(546, 319, 133, 25);
		add(cmbDificultad);
		
		JLabel lblTiempo = new JLabel("Tiempo de ejecución");
		lblTiempo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTiempo.setBounds(97, 320, 189, 22);
		add(lblTiempo);
		
		JLabel lblDificultad = new JLabel("Dificultad");
		lblDificultad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDificultad.setBounds(419, 320, 102, 22);
		add(lblDificultad);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(301, 396, 182, 25);
		add(btnGuardar);
		
		spnTiempo = new JSpinner();
		spnTiempo.setModel(new SpinnerNumberModel(0, 0, 240, 1));
		spnTiempo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spnTiempo.setBounds(301, 319, 63, 25);
		add(spnTiempo);
		
		JScrollPane scrpDescripcion = new JScrollPane();
		scrpDescripcion.setBounds(246, 175, 431, 103);
		add(scrpDescripcion);
		
		txtaDescripcion = new JTextArea();
		txtaDescripcion.setLineWrap(true);
		txtaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrpDescripcion.setViewportView(txtaDescripcion);
	}
	
	public void setControlador(GestorRecetasControl c) {
		btnGuardar.addActionListener(c);
	}

	public Receta obtenerVideoJuego() {
		Receta receta = null;
		
		String nombre = txtNombre.getText().trim();
		
		if (nombre.isEmpty()) {
			mostrarError("El nombre de la receta es obligatorio");
		} else {
			String desd = txtaDescripcion.getText().trim();
			
			if (desd.isEmpty()) {
				mostrarError("La descripción de la receta es obligatoria");
			} else {
				int tiempo = (int) spnTiempo.getValue();
				
				if (tiempo == 0) {
					mostrarError("El tiempo de ejecución debe ser mayor que 0");
				} else {
					String dif = (String) cmbDificultad.getSelectedItem();
				
					receta = new Receta(nombre, desd, tiempo, dif);
				}
			}
		}
		return receta;
	}

	private void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}

	public void mostrarResultado(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Resultado de la operación", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}

	public void limpiarComponentes() {
		txtNombre.setText("");
		txtaDescripcion.setText("");
		spnTiempo.setValue(0);
		cmbDificultad.setSelectedIndex(0);
		
	}
}
