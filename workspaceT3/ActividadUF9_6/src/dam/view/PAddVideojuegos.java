package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import dam.control.GestionVideojuegosControl;
import dam.model.Videojuego;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class PAddVideojuegos extends JPanel {
	public static final String BTN_GUARDAR = "Guardar Datos";
	
	private final ButtonGroup btngCodPegi = new ButtonGroup();
	
	private JComboBox<String> cmbPlataforma;
	
	private JRadioButton rdbtn3;
	private JRadioButton rdbtn7;
	private JRadioButton rdbtn12;
	private JRadioButton rdbtn18;
	private JTextField txtPrestadoA;
	private JTextField txtTitulo;
	private JButton btnGuardar;

	public PAddVideojuegos() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		
		setSize(VPGestorVideojuegos.RESTA_ANCHO, VPGestorVideojuegos.RESTA_ALTO);
		
		JLabel lblTitulo = new JLabel("A\u00F1adir videojuego");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitulo.setBounds(47, 42, 246, 30);
		add(lblTitulo);
		
		JLabel lblNombre = new JLabel("T\u00EDtulo");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(47, 83, 45, 16);
		add(lblNombre);
		
		txtTitulo = new JTextField();
		txtTitulo.setToolTipText("Introduce el t\u00EDtulo del videojuego");
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTitulo.setBounds(106, 82, 260, 19);
		add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPlataforma.setBounds(47, 127, 86, 13);
		add(lblPlataforma);
		
		cmbPlataforma = new JComboBox<String>();
		cmbPlataforma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbPlataforma.setModel(new DefaultComboBoxModel<String>(Videojuego.PLATAFORMAS));
		cmbPlataforma.setBounds(153, 123, 213, 21);
		add(cmbPlataforma);
		
		JLabel lblCodPegi = new JLabel("C\u00F3digo Pegi");
		lblCodPegi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCodPegi.setBounds(47, 197, 103, 20);
		add(lblCodPegi);
		
		rdbtn3 = new JRadioButton("3");
		rdbtn3.setSelected(true);
		btngCodPegi.add(rdbtn3);
		rdbtn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn3.setBounds(170, 195, 103, 25);
		add(rdbtn3);
		
		rdbtn7 = new JRadioButton("7");
		btngCodPegi.add(rdbtn7);
		rdbtn7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn7.setBounds(293, 195, 103, 25);
		add(rdbtn7);
		
		rdbtn12 = new JRadioButton("12");
		btngCodPegi.add(rdbtn12);
		rdbtn12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn12.setBounds(416, 195, 103, 25);
		add(rdbtn12);
		
		rdbtn18 = new JRadioButton("18");
		btngCodPegi.add(rdbtn18);
		rdbtn18.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtn18.setBounds(539, 195, 103, 25);
		add(rdbtn18);
		
		JLabel lblPrestadoA = new JLabel("Prestado a");
		lblPrestadoA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPrestadoA.setBounds(47, 275, 103, 20);
		add(lblPrestadoA);
		
		txtPrestadoA = new JTextField();
		txtPrestadoA.setToolTipText("Introduce la persona a quien se ha prestado");
		txtPrestadoA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtPrestadoA.setColumns(10);
		txtPrestadoA.setBounds(155, 276, 260, 19);
		add(txtPrestadoA);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(301, 375, 182, 21);
		add(btnGuardar);
	}
	
	public void setControlador(GestionVideojuegosControl e) {
		btnGuardar.addActionListener(e);
	}
	
	public Videojuego recogerDatos() {
		Videojuego vj = null;
		
		String titulo = recogerTitulo();
		
		if (titulo != null) {
			String plataforma = (String) cmbPlataforma.getSelectedItem();
			int codPegi = obtenerCodPegi();
			String prestadoA = recogerPrestado();
			
			if (prestadoA != null) {
				vj = new Videojuego(titulo, plataforma, codPegi, prestadoA);
			}
			
		}
		
		return vj;
	}

	private int obtenerCodPegi() {
		int cod = Integer.parseInt(rdbtn3.getText());
		
		if (rdbtn7.isSelected()) {
			cod = Integer.parseInt(rdbtn7.getText());
		} else if (rdbtn12.isSelected()) {
			cod = Integer.parseInt(rdbtn12.getText());
		} else if (rdbtn18.isSelected()) {
			cod = Integer.parseInt(rdbtn18.getText());
		}
		
		return cod;
	}

	private String recogerTitulo() {
		String titulo = null;
		
		try {
			titulo = txtTitulo.getText().trim();
			
			if (titulo.isEmpty()) {
				titulo = null;
				throw new Exception();
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "El título del videojuego no puede estar vacío"
					, "Atención", JOptionPane.WARNING_MESSAGE);
		}
		return titulo;
	}
	
	private String recogerPrestado() {
		String prestado = null;
		
		try {
			prestado = txtPrestadoA.getText().trim();
			
			if (prestado.isEmpty()) {
				prestado = null;
				throw new Exception();
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "La persona a la que ha sido prestado no puede estar vacío"
					, "Atención", JOptionPane.WARNING_MESSAGE);
		}
		return prestado;
	}
	
}
