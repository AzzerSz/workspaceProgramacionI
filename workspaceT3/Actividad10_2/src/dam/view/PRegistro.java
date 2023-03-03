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

public class PRegistro extends JPanel {
	
	public static final String BTN_LIMPIAR = "Limpiar Datos";

	public static final String BTN_REGISTRAR = "Registrar";

	private String[] REGIONES = {"Andalucía", "Aragón", "Asturias", "Islas Baleares"
			, "Cantabria", "Islas Canarias", "Castilla - La Mancha", "Castilla y León", "Cataluña"
			, "Galicia", "Extemadura", "Madrid", "Murcia", "Extremadura", "Madrid", "Murcia"
			, "Navarra", "País Vasco", "La Rioja", "Comunidad Valenciana"};
	
	private String[] COCINAS = {"Creativa", "Moderna", "Tradicional", "Regional", "Fusión"};
	
	private JTextField txtNom;
	private JTextField txtDir;
	private JTextField txtTlf;
	private JTextField txtCiu;
	private JTextField txtPMin;
	private JTextField txtPMax;
	private JComboBox<String> cmbCocina;
	private JSpinner spnDist;
	private JComboBox<String> cmbReg;
	private JButton btnGuardarReg;
	private JButton btnLimpiar;
	
	public PRegistro() {
		
		initComponents();
	}
	private void initComponents() {
		setSize(VPrincipalRestaurante.ANCHO - 15, VPrincipalRestaurante.ALTO - 70);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Registrar Restaurante");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(33, 26, 310, 32);
		add(lblTitulo);
		
		JLabel lblNom = new JLabel("Nombre:");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNom.setBounds(33, 107, 72, 18);
		add(lblNom);
		
		JLabel lblReg = new JLabel("Region:");
		lblReg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblReg.setBounds(33, 144, 72, 18);
		add(lblReg);
		
		JLabel lblDir = new JLabel("Direcci\u00F3n:");
		lblDir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDir.setBounds(33, 180, 72, 18);
		add(lblDir);
		
		JLabel lblDistin = new JLabel("Distinci\u00F3n:");
		lblDistin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDistin.setBounds(33, 225, 78, 18);
		add(lblDistin);
		
		JLabel lblTlf = new JLabel("Tel\u00E9fono:");
		lblTlf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTlf.setBounds(33, 258, 72, 18);
		add(lblTlf);
		
		txtNom = new JTextField();
		txtNom.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtNom.setBounds(131, 107, 222, 19);
		add(txtNom);
		txtNom.setColumns(10);
		
		txtDir = new JTextField();
		txtDir.setColumns(10);
		txtDir.setBounds(118, 179, 422, 19);
		add(txtDir);
		
		txtTlf = new JTextField();
		txtTlf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTlf.setColumns(10);
		txtTlf.setBounds(118, 258, 541, 19);
		add(txtTlf);
		
		spnDist = new JSpinner();
		((JSpinner.DefaultEditor) spnDist.getEditor()).getTextField().setEditable(false);
		spnDist.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		spnDist.setFont(new Font("Tahoma", Font.PLAIN, 16));
		spnDist.setBounds(121, 224, 48, 20);
		add(spnDist);
		
		cmbReg = new JComboBox<String>();
		cmbReg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		for (String region : REGIONES) {
			cmbReg.addItem(region);
		}
		
		cmbReg.setBounds(115, 142, 168, 21);
		add(cmbReg);
		
		JLabel lblCocina = new JLabel("Cocina:");
		lblCocina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCocina.setBounds(377, 107, 72, 18);
		add(lblCocina);
		
		cmbCocina = new JComboBox<String>();
		cmbCocina.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		for (String cocina : COCINAS) {
			cmbCocina.addItem(cocina);
		}
		
		cmbCocina.setBounds(439, 108, 101, 21);
		add(cmbCocina);
		
		JLabel lblCiu = new JLabel("Ciudad:");
		lblCiu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCiu.setBounds(377, 144, 64, 18);
		add(lblCiu);
		
		txtCiu = new JTextField();
		txtCiu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtCiu.setColumns(10);
		txtCiu.setBounds(437, 143, 222, 19);
		add(txtCiu);
		
		JLabel lblPrecioMnimo = new JLabel("Precio M\u00EDnimo:");
		lblPrecioMnimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrecioMnimo.setBounds(299, 225, 113, 18);
		add(lblPrecioMnimo);
		
		txtPMin = new JTextField();
		txtPMin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPMin.setColumns(10);
		txtPMin.setBounds(422, 225, 72, 19);
		add(txtPMin);
		
		JLabel lblMximo = new JLabel("M\u00E1ximo:");
		lblMximo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMximo.setBounds(517, 225, 72, 18);
		add(lblMximo);
		
		txtPMax = new JTextField();
		txtPMax.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPMax.setColumns(10);
		txtPMax.setBounds(590, 225, 72, 19);
		add(txtPMax);
		
		btnGuardarReg = new JButton("Guardar Datos");
		btnGuardarReg.setActionCommand(BTN_REGISTRAR);
		btnGuardarReg.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnGuardarReg.setBounds(192, 342, 151, 29);
		add(btnGuardarReg);
		
		btnLimpiar = new JButton(BTN_LIMPIAR);
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnLimpiar.setBounds(377, 342, 151, 29);
		add(btnLimpiar);
	}
	
	public void addControlador(RestauranteControlador e) {
		btnGuardarReg.addActionListener(e);
		btnLimpiar.addActionListener(e);
	}
	
	public Restaurante getRestaurante(ArrayList<String> nombres) {
		
		Restaurante restaurante = null;
		boolean nomExist = false;
		
		for (String nombre : nombres) {
			if (nombre.equalsIgnoreCase(txtNom.getText())) {
				nomExist = true;
			}
		}
		
		if (!txtNom.getText().trim().isEmpty() && !nomExist) {
			
			String nombre = txtNom.getText();
			
			if (!txtCiu.getText().trim().isEmpty()) {
				
				String ciudad = txtCiu.getText();
				
				if ((getPrecioNum("MIN") < getPrecioNum("MAX") && getPrecioNum("MAX") != 0) 
						|| getPrecioNum("MAX") == 0.0) {
					if (getPrecioNum("MIN") != -1) {

						double precioMin = getPrecioNum("MIN");
						
						if (getPrecioNum("MAX") != -1) {
							
							double precioMax = getPrecioNum("MAX");
							String cocina = (String) cmbCocina.getSelectedItem();
							String region = (String) cmbReg.getSelectedItem();
							String direccion = txtDir.getText();
							int distincion = (int) spnDist.getValue();
							String telefono = txtTlf.getText();
							
							
							restaurante = new Restaurante(nombre, region, ciudad, distincion, direccion, precioMin, precioMax, cocina, telefono);
							
						} else {
							
							mostrarError("El precio máximo ha de ser un valor numérico");
						}

						
						
					} else {
						
						mostrarError("El precio mínimo ha de ser un valor numérico");
						
					}
				} else {
					mostrarError("El precio mínimo no puede ser mayor al precio máximo");
				}
				
			} else {
				
				mostrarError("El campo ciudad es obligatorio");
				
			}
			
		} else if(nomExist) {
			
			mostrarError("El nombre del restaurante ya existe en la base de datos");
			
		} else {
			
			mostrarError("El campo nombre es obligatorio");
			
		}
		
		return restaurante;
		
	}
	
	private double getPrecioNum(String tipoPrecio) {
		double precio = -1;
		
		try {
			
			if (tipoPrecio.equalsIgnoreCase("MAX")) {
				
				if (!txtPMax.getText().isEmpty()) {
					precio = Double.parseDouble(txtPMax.getText());
				} else {
					precio = 0.0;
				}
				
			} else if (tipoPrecio.equalsIgnoreCase("MIN")) {
				
				precio = Double.parseDouble(txtPMin.getText());
				
			}
			
		} catch (NumberFormatException e) {
			
		}
		
		return precio;
	}
	
	public void mostrarError(String error) {
		
		JOptionPane.showMessageDialog(this, error
				, "Atención", JOptionPane.WARNING_MESSAGE);
	}
	
	public void limpiarFormulario() {
		
		txtNom.setText("");
		cmbCocina.setSelectedIndex(0);
		cmbReg.setSelectedIndex(0);
		txtCiu.setText("");
		txtDir.setText("");
		spnDist.setValue(1);
		txtPMax.setText("");
		txtPMin.setText("");
		txtTlf.setText("");
		
	}
	
}
