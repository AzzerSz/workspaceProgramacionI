package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import dam.control.RecetasControl;
import dam.model.Receta;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.ScrollPaneConstants;

public class PAddReceta extends JPanel {
	
	public static final String BTN_GUARDAR = "Guardar";
	
	private JTextField txtNombre;
	private JTextArea txtDesc;
	private JButton btnGuardar;
	private JComboBox<String> cmdDificultad;
	private JSpinner spnTiempoEjec;
	public PAddReceta() {
		setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(24, 23, 76, 22);
		add(lblNombre);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDescripcion.setBounds(24, 66, 99, 22);
		add(lblDescripcion);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNombre.setBounds(101, 23, 105, 22);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JScrollPane scrpTexto = new JScrollPane();
		scrpTexto.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrpTexto.setBounds(140, 66, 210, 74);
		add(scrpTexto);
		
		txtDesc = new JTextArea();
		txtDesc.setLineWrap(true);
		txtDesc.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrpTexto.setViewportView(txtDesc);
		
		JLabel lblDificultad = new JLabel("Dificultad:");
		lblDificultad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDificultad.setBounds(24, 202, 99, 22);
		add(lblDificultad);
		
		cmdDificultad = new JComboBox<String>();
		cmdDificultad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmdDificultad.setModel(new DefaultComboBoxModel<String>(Receta.DIFICULTADES));
		cmdDificultad.setBounds(140, 201, 148, 25);
		add(cmdDificultad);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(173, 259, 115, 31);
		add(btnGuardar);
		
		JLabel lblTEjec = new JLabel("Tiempo de ejecuci\u00F3n:");
		lblTEjec.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTEjec.setBounds(24, 165, 182, 22);
		add(lblTEjec);
		
		spnTiempoEjec = new JSpinner();
		spnTiempoEjec.setModel(new SpinnerNumberModel(0, 0, 360, 1));
		spnTiempoEjec.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spnTiempoEjec.setBounds(216, 166, 72, 20);
		add(spnTiempoEjec);
	}
	
	public void setControlador(RecetasControl e) {
		btnGuardar.addActionListener(e);
	}

	public Receta getReceta() {
		
		Receta receta = null;
		
		String nombre = getNombre();
		if (!nombre.isEmpty()) {
			String descripcion = getDescripcion();
			if (!descripcion.isEmpty()) {
				int tiempoEjec = Integer.parseInt(spnTiempoEjec.getValue().toString());
				String dificultad = cmdDificultad.getSelectedItem().toString();

				
				receta = new Receta(nombre, descripcion, tiempoEjec, dificultad);
			}
		}
		return receta;
	}

	private String getDescripcion() {
		String descripcion = "";
		
		try {
			descripcion = txtDesc.getText().trim();
			
			if (descripcion.isEmpty()) {
				descripcion = "";
				throw new Exception();
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía"
					, "Atención", JOptionPane.WARNING_MESSAGE);
		}
		
		return descripcion;
	}

	private String getNombre() {
		String nombre = "";
		try {
			nombre = txtNombre.getText().trim();
			
			if (nombre.isEmpty()) {
				nombre = "";
				throw new Exception();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "El nombre de la receta no puede estar vacío"
					, "Atención", JOptionPane.WARNING_MESSAGE);
		}
		
		return nombre;
	}
	
	public void limpiarCampos () {
		txtNombre.setText("");
		txtDesc.setText("");
		spnTiempoEjec.setValue(0);
	}
}
