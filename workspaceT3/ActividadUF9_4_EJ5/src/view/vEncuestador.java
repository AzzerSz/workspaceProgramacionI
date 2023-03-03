package view;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Encuesta;

import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import control.EncuestadorControlador;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class vEncuestador extends JFrame {
	
	public static final String BTN_GUARDAR = "Guardar";
	public static final String BTN_LIMPIAR = "Limpiar";
	public static final String BTN_VER = "Ver encuestas realizadas";
	
	private final ButtonGroup btngGravedad = new ButtonGroup();
	private JSpinner spnEdad;
	private JCheckBox chckResp;
	private JCheckBox chckCans;
	private JCheckBox chckOlfato;
	private JCheckBox chckGusto;
	private JCheckBox chckCabeza;
	private JCheckBox chckFiebre;
	private JCheckBox chckSin;
	private JCheckBox chckTos;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;
	private JRadioButton rbtn4;
	private JRadioButton rbtn5;
	private JButton btnGuardar;
	private JButton btnLimpiar;
	private JTextArea txtaEncuestas;
	private JComboBox<String> cmbCovid;
	private JButton btnVer;
	
	public vEncuestador() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Encuestas COVID");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblPregunta1 = new JLabel(Encuesta.PREG1);
		lblPregunta1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPregunta1.setBounds(37, 42, 83, 25);
		getContentPane().add(lblPregunta1);
		
		JLabel lblPregunta2 = new JLabel(Encuesta.PREG2);
		lblPregunta2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPregunta2.setBounds(37, 89, 320, 25);
		getContentPane().add(lblPregunta2);
		
		JLabel lblPregunta3 = new JLabel(Encuesta.PREG3);
		lblPregunta3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPregunta3.setBounds(37, 140, 238, 25);
		getContentPane().add(lblPregunta3);
		
		JLabel lblPregunta4 = new JLabel(Encuesta.PREG4);
		lblPregunta4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPregunta4.setBounds(37, 356, 192, 25);
		getContentPane().add(lblPregunta4);
		
		spnEdad = new JSpinner();
		spnEdad.setEditor(new JSpinner.DefaultEditor(spnEdad));
		spnEdad.setModel(new SpinnerNumberModel(0, 0, 115, 1));
		spnEdad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spnEdad.setBounds(99, 42, 69, 25);
		getContentPane().add(spnEdad);
		
		cmbCovid = new JComboBox<String>();
		cmbCovid.setModel(new DefaultComboBoxModel<String>(new String[] {"SI", "NO"}));
		cmbCovid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbCovid.setBounds(359, 89, 61, 25);
		getContentPane().add(cmbCovid);
		
		chckResp = new JCheckBox("S\u00EDntomas respiratorios");
		chckResp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckResp.setBounds(37, 187, 221, 25);
		getContentPane().add(chckResp);
		
		chckCans = new JCheckBox("CansancioMalestar");
		chckCans.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckCans.setBounds(276, 187, 221, 25);
		getContentPane().add(chckCans);
		
		chckOlfato = new JCheckBox("P\u00E9rdida del olfato");
		chckOlfato.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckOlfato.setBounds(37, 225, 221, 25);
		getContentPane().add(chckOlfato);
		
		chckGusto = new JCheckBox("P\u00E9rdida del gusto");
		chckGusto.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckGusto.setBounds(276, 225, 221, 25);
		getContentPane().add(chckGusto);
		
		chckCabeza = new JCheckBox("Dolor de cabeza");
		chckCabeza.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckCabeza.setBounds(37, 260, 221, 25);
		getContentPane().add(chckCabeza);
		
		chckFiebre = new JCheckBox("Fiebre");
		chckFiebre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckFiebre.setBounds(276, 260, 221, 25);
		getContentPane().add(chckFiebre);
		
		chckSin = new JCheckBox("Sin s\u00EDntomas");
		chckSin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckSin.setBounds(37, 293, 221, 25);
		getContentPane().add(chckSin);
		
		chckTos = new JCheckBox("Tos seca");
		chckTos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckTos.setBounds(276, 293, 221, 25);
		getContentPane().add(chckTos);
		
		rbtn1 = new JRadioButton("1 - " + Encuesta.NIVEL_GRAV[0]);
		rbtn1.setSelected(true);
		btngGravedad.add(rbtn1);
		rbtn1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbtn1.setBounds(37, 394, 155, 25);
		getContentPane().add(rbtn1);
		
		rbtn2 = new JRadioButton("2 - " + Encuesta.NIVEL_GRAV[1]);
		btngGravedad.add(rbtn2);
		rbtn2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbtn2.setBounds(216, 394, 155, 25);
		getContentPane().add(rbtn2);
		
		rbtn3 = new JRadioButton("3 - " + Encuesta.NIVEL_GRAV[2]);
		btngGravedad.add(rbtn3);
		rbtn3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbtn3.setBounds(403, 394, 155, 25);
		getContentPane().add(rbtn3);
		
		rbtn4 = new JRadioButton("4 - " + Encuesta.NIVEL_GRAV[3]);
		btngGravedad.add(rbtn4);
		rbtn4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbtn4.setBounds(125, 448, 155, 25);
		getContentPane().add(rbtn4);
		
		rbtn5 = new JRadioButton("5 - " + Encuesta.NIVEL_GRAV[4]);
		btngGravedad.add(rbtn5);
		rbtn5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rbtn5.setBounds(300, 448, 178, 25);
		getContentPane().add(rbtn5);
		
		btnGuardar = new JButton(BTN_GUARDAR);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnGuardar.setBounds(123, 511, 106, 25);
		getContentPane().add(btnGuardar);
		
		btnLimpiar = new JButton(BTN_LIMPIAR);
		btnLimpiar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLimpiar.setBounds(303, 511, 106, 25);
		getContentPane().add(btnLimpiar);
		
		btnVer = new JButton(BTN_VER);
		btnVer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnVer.setBounds(152, 575, 238, 25);
		getContentPane().add(btnVer);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(37, 623, 521, 104);
		getContentPane().add(scrollPane_1);
		
		txtaEncuestas = new JTextArea();
		scrollPane_1.setViewportView(txtaEncuestas);
		
		setSize(600, 800);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(EncuestadorControlador e) {
		btnGuardar.addActionListener(e);
		btnLimpiar.addActionListener(e);
		btnVer.addActionListener(e);
		
	}

	public void limpiarComponentes() {
		spnEdad.setValue(0);
		cmbCovid.setSelectedIndex(0);
		
		chckResp.setSelected(false);
		chckCans.setSelected(false);
		chckOlfato.setSelected(false);
		chckGusto.setSelected(false);
		chckCabeza.setSelected(false);
		chckFiebre.setSelected(false);
		chckTos.setSelected(false);
		chckSin.setSelected(false);
		
		rbtn1.setSelected(true);
		rbtn2.setSelected(false);
		rbtn3.setSelected(false);
		rbtn4.setSelected(false);
		
		txtaEncuestas.setText("");
		
	}

	public Encuesta obtenerEncuesta() {
		
		int edad = (int) spnEdad.getValue();
		boolean covid = true;
		
		if (cmbCovid.getSelectedIndex() == 1) {
			covid = false;
		}
		
		String sintomas = obtenerSintomas();
		
		int gravedad = obtenerGravedad();
		
		Encuesta encuesta = new Encuesta(edad, covid, sintomas, gravedad);
		return encuesta;
	}

	private int obtenerGravedad() {
		int gravedad = 1;
		
		if (rbtn1.isSelected()) {
			gravedad = 1;
		} else if (rbtn2.isSelected()) {
			gravedad = 2;
		} else if (rbtn3.isSelected()) {
			gravedad = 3;
		} else if (rbtn4.isSelected()) {
			gravedad = 4;
		} else if (rbtn5.isSelected()) {
			gravedad = 5;
		}
		return gravedad;
	}

	private String obtenerSintomas() {
		
		String sintomas = "";
		
		if (chckResp.isSelected()) {
			sintomas += chckResp.getText() + ", ";
		} if (chckCans.isSelected()) {
			sintomas += chckCans.getText() + ", ";
		} if (chckOlfato.isSelected()) {
			sintomas += chckOlfato.getText() + ", ";
		} if (chckGusto.isSelected()) {
			sintomas += chckGusto.getText() + ", ";
		} if (chckCabeza.isSelected()) {
			sintomas += chckCabeza.getText() + ", ";
		} if (chckFiebre.isSelected()) {
			sintomas += chckFiebre.getText() + ", ";
		} if (chckTos.isSelected()) {
			sintomas += chckTos.getText() + ", ";
		} if (chckSin.isSelected()) {
			sintomas += chckSin.getText() + ", ";
		}
		
		if (sintomas.endsWith(", ")) {
			sintomas = sintomas.substring(0, sintomas.length() - 2);
		}
		return sintomas;
	}
	

	public void mostrarLista(String lista) {
		txtaEncuestas.setText(lista);
		
	}
}
