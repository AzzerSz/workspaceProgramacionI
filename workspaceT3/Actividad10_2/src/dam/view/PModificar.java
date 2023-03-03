package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTextField;

import dam.control.RestauranteControlador;
import dam.model.Restaurante;

import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;

public class PModificar extends JPanel {

	public static final String BTN_CANCELAR = "Cancelar";
	public static final String BTN_BUSCAR = "Buscar";
	public static final String BTN_MODIFICAR = "Modificar";

	private String[] REGIONES = { "Andalucía", "Aragón", "Asturias", "Islas Baleares", "Cantabria", "Islas Canarias",
			"Castilla - La Mancha", "Castilla y León", "Cataluña", "Galicia", "Extemadura", "Madrid", "Murcia",
			"Extremadura", "Madrid", "Murcia", "Navarra", "País Vasco", "La Rioja", "Comunidad Valenciana" };

	private String[] COCINAS = { "Creativa", "Moderna", "Tradicional", "Regional", "Fusión" };

	private JTextField txtNombre;
	private JTextField txtDireccion;
	private JTextField txtTlf;
	private JTextField txtCiu;
	private JTextField txtMin;
	private JTextField txtMax;
	private JTextField txtWeb;
	private JButton btnBuscar;
	private JButton btnCancelar;
	private JButton btnGuardar;
	private JComboBox<String> cmbReg;
	private JComboBox<String> cmbCocina;
	private JSpinner spnDist;

	public PModificar() {

		initComponents();

	}

	private void initComponents() {
		setSize(VPrincipalRestaurante.ANCHO - 15, VPrincipalRestaurante.ALTO - 70);
		setLayout(null);

		JLabel lblModificarRestaurante = new JLabel("Modificar Restaurante");
		lblModificarRestaurante.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblModificarRestaurante.setBounds(33, 26, 310, 32);
		add(lblModificarRestaurante);

		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNom.setBounds(33, 87, 72, 18);
		add(lblNom);

		JLabel lblReg = new JLabel("Region:");
		lblReg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReg.setBounds(33, 128, 72, 18);
		add(lblReg);

		JLabel lblDir = new JLabel("Direcci\u00F3n:");
		lblDir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDir.setBounds(33, 160, 72, 18);
		add(lblDir);

		JLabel lblDistin = new JLabel("Distinci\u00F3n:");
		lblDistin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDistin.setBounds(33, 209, 78, 18);
		add(lblDistin);

		JLabel lblTlf = new JLabel("Tel\u00E9fono:");
		lblTlf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTlf.setBounds(33, 244, 72, 18);
		add(lblTlf);

		JLabel lblCiudad = new JLabel("Nombre:");
		lblCiudad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCiudad.setBounds(0, -16, 72, 19);
		add(lblCiudad);

		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNombre.setColumns(10);
		txtNombre.setBounds(131, 87, 222, 19);
		add(txtNombre);

		txtDireccion = new JTextField();
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(118, 160, 310, 19);
		add(txtDireccion);

		txtTlf = new JTextField();
		txtTlf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTlf.setColumns(10);
		txtTlf.setBounds(118, 244, 227, 19);
		add(txtTlf);

		spnDist = new JSpinner();
		spnDist.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		spnDist.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spnDist.setBounds(121, 208, 48, 20);
		add(spnDist);

		cmbReg = new JComboBox<String>();
		cmbReg.setFont(new Font("Tahoma", Font.PLAIN, 16));

		for (String region : REGIONES) {
			cmbReg.addItem(region);
		}

		cmbReg.setBounds(115, 126, 168, 21);
		add(cmbReg);

		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCocina.setBounds(447, 160, 72, 18);
		add(lblCocina);

		cmbCocina = new JComboBox<String>();
		cmbCocina.setFont(new Font("Tahoma", Font.PLAIN, 16));

		for (String cocina : COCINAS) {
			cmbCocina.addItem(cocina);
		}

		cmbCocina.setBounds(509, 159, 101, 21);
		add(cmbCocina);

		JLabel lblCiu = new JLabel("Ciudad:");
		lblCiu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCiu.setBounds(377, 128, 64, 18);
		add(lblCiu);

		txtCiu = new JTextField();
		txtCiu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCiu.setColumns(10);
		txtCiu.setBounds(437, 127, 222, 19);
		add(txtCiu);

		JLabel lblPrecioMnimo = new JLabel("Precio M\u00EDnimo:");
		lblPrecioMnimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecioMnimo.setBounds(299, 209, 113, 18);
		add(lblPrecioMnimo);

		txtMin = new JTextField();
		txtMin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMin.setColumns(10);
		txtMin.setBounds(422, 209, 72, 19);
		add(txtMin);

		JLabel lblMaximo = new JLabel("M\u00E1ximo:");
		lblMaximo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMaximo.setBounds(517, 209, 72, 18);
		add(lblMaximo);

		txtMax = new JTextField();
		txtMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtMax.setColumns(10);
		txtMax.setBounds(590, 209, 72, 19);
		add(txtMax);

		btnGuardar = new JButton("Guardar datos");
		btnGuardar.setActionCommand(BTN_MODIFICAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardar.setBounds(189, 326, 154, 29);
		add(btnGuardar);

		btnCancelar = new JButton(BTN_CANCELAR);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setBounds(377, 326, 154, 29);
		add(btnCancelar);

		btnBuscar = new JButton(BTN_BUSCAR);
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBuscar.setBounds(455, 84, 95, 25);
		add(btnBuscar);

		JLabel lblWeb = new JLabel("Web:");
		lblWeb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWeb.setBounds(355, 244, 48, 18);
		add(lblWeb);

		txtWeb = new JTextField();
		txtWeb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtWeb.setColumns(10);
		txtWeb.setBounds(401, 244, 273, 19);
		add(txtWeb);

		setModificacionesBloqueadas(true);
	}

	public void setModificacionesBloqueadas(boolean editable) {
		txtNombre.setEditable(editable);
		btnBuscar.setEnabled(editable);
		cmbReg.setEnabled(!editable);
		txtCiu.setEnabled(!editable);
		txtDireccion.setEnabled(!editable);
		spnDist.setEnabled(!editable);
		cmbCocina.setEnabled(!editable);
		txtMin.setEditable(!editable);
		txtMax.setEditable(!editable);
		txtTlf.setEditable(!editable);
		txtWeb.setEditable(!editable);
		btnGuardar.setEnabled(!editable);
		btnCancelar.setEnabled(!editable);

	}

	public void addControlador(RestauranteControlador e) {
		btnBuscar.addActionListener(e);
		btnCancelar.addActionListener(e);
		btnGuardar.addActionListener(e);
	}

	public String getDatosNombre(ArrayList<String> nombres) {

		String nomBd = null;
		String posibleNombre = null;
		int cont = 0;

		for (String nombre : nombres) {

			if (nombre.toUpperCase().indexOf(txtNombre.getText().toUpperCase()) != -1
					&& !txtNombre.getText().isBlank()) {
				posibleNombre = nombre;
				cont++;
			}

		}

		if (cont == 1) {
			nomBd = posibleNombre;
			txtNombre.setText(nomBd);
		}

		if (cont == 0) {
			mostrarError("No se ha encontrado ningún restaurante con ese nombre");
		} else if (cont > 1) {
			mostrarError("Existen varios nombres que contienen esa cadena de caracteres");
		}

		return nomBd;

	}

	public void mostrarError(String error) {

		JOptionPane.showMessageDialog(this, error, "Atención", JOptionPane.WARNING_MESSAGE);
	}

	public void limpiarCampos() {
		cmbReg.setSelectedIndex(0);
		txtCiu.setText("");
		txtDireccion.setText("");
		cmbCocina.setSelectedIndex(0);
		spnDist.setValue(1);
		txtMin.setText("");
		txtMax.setText("");
		txtTlf.setText("");
		txtWeb.setText("");
		txtNombre.setText("");
		
	}
	
	public Restaurante getRestauranteActualizar() {
		
		Restaurante restaurante = null;
		double precioPosibleMin;
		double precioPosibleMax;
	
		if (!txtCiu.getText().isEmpty()) {
			
			String ciudad = txtCiu.getText();
			
			double precioMin = getPrecioMin();
			
			if (precioMin != -1) {
			
				double precioMax = getPrecioMax();
				
				if (precioMax != -1) {
					
					if (precioMax != 0 && precioMin > precioMax) {
						
						mostrarError("El precio mínimo no puede ser mayor a precio máximo");
						
					} else {
						String nombre = txtNombre.getText();
						String region = (String) cmbReg.getSelectedItem();
						String direccion = txtDireccion.getText();
						String cocina = (String) cmbCocina.getSelectedItem();
						int dist = (int) spnDist.getValue();
						String tlf = txtTlf.getText();
						String web = txtWeb.getText();
						
						restaurante = new Restaurante(nombre, region, ciudad, dist, direccion, precioMin, precioMax, cocina, tlf, web);
					}
				}
			}
		} else {
			mostrarError("El campo ciudad no puede estar vacio");
		}	
						
		return restaurante;
		
	}
	
	private double getPrecioMax() { // Este método devuelve 3 valores -1 si caracter, 0 si está vacío, O un número x, si bien introducido
		double precio = -1;
		
		try {
			
			if (!txtMax.getText().isEmpty()) {
				precio = Double.parseDouble(txtMax.getText());
			} else {
				precio = 0;
			}
			
			if (precio < 0) {
				throw new NumberFormatException();
			}
			
		} catch (NumberFormatException e) {
			
			mostrarError("El precio máximo debe ser un número positivo");
			
		}
		
		return precio;
	}
	
	private double getPrecioMin() { // Este método devuelve 3 valores -1 si caracter, 0 si está vacío, O un número x, si bien introducido
		double precio = -1;
		
		try {
			
			if (!txtMin.getText().isEmpty()) {
				precio = Double.parseDouble(txtMin.getText());
			} else {
				precio = 0;
			}
			
			if (precio < 0) {
				throw new NumberFormatException();
			}
			
			
		} catch (NumberFormatException e) {
			
			mostrarError("El precio mínimo debe ser un número positivo");
			
		}
		
		return precio;
	}

}
