package dam.view;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import dam.control.EurovisionControlador;

public class PRegistrar extends JPanel {
	
	public static final String BTN_LIMPIAR = "Limpiar Datos";
	public static final String BTN_GUARDAR = "Guardar Datos";
	
	private JComboBox<String> cmb1Punto;
	private JComboBox<String> cmb2Punto;
	private JComboBox<String> cmb3Punto;
	private JComboBox<String> cmb4Punto;
	private JComboBox<String> cmb5Punto;
	private JComboBox<String> cmb6Punto;
	private JComboBox<String> cmb7Punto;
	private JComboBox<String> cmb8Punto;
	private JComboBox<String> cmb10Punto;
	private JComboBox<String> cmb12Punto;
	
	private DefaultComboBoxModel<String> model1Cmb;
	private DefaultComboBoxModel<String> model2Cmb;
	private DefaultComboBoxModel<String> model3Cmb;
	private DefaultComboBoxModel<String> model4Cmb;
	private DefaultComboBoxModel<String> model5Cmb;
	private DefaultComboBoxModel<String> model6Cmb;
	private DefaultComboBoxModel<String> model7Cmb;
	private DefaultComboBoxModel<String> model8Cmb;
	private DefaultComboBoxModel<String> model10Cmb;
	private DefaultComboBoxModel<String> model12Cmb;
	
	private JButton btnGuardarDatos;
	private JButton btnLimpiarDatos;
	
	
	public PRegistrar() {
		
		setLayout(null);
		
		JLabel lblRegistrar = new JLabel("Registrar Puntos Jurado");
		lblRegistrar.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegistrar.setBounds(15, 21, 372, 39);
		add(lblRegistrar);
		
		JLabel lbl1Punto = new JLabel("1 Punto para:");
		lbl1Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl1Punto.setBounds(60, 85, 123, 20);
		add(lbl1Punto);
		
		JLabel lbl2Punto = new JLabel("2 Puntos para:");
		lbl2Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl2Punto.setBounds(60, 126, 123, 20);
		add(lbl2Punto);
		
		JLabel lbl3Punto = new JLabel("3 Puntos para:");
		lbl3Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl3Punto.setBounds(60, 167, 123, 20);
		add(lbl3Punto);
		
		JLabel lbl4Punto = new JLabel("4 Puntos para:");
		lbl4Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl4Punto.setBounds(60, 208, 123, 20);
		add(lbl4Punto);
		
		JLabel lbl5Punto = new JLabel("5 Puntos para:");
		lbl5Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl5Punto.setBounds(60, 249, 123, 20);
		add(lbl5Punto);
		
		JLabel lbl6Punto = new JLabel("6 Puntos para:");
		lbl6Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl6Punto.setBounds(60, 290, 123, 20);
		add(lbl6Punto);
		
		JLabel lbl7Punto = new JLabel("7 Puntos para:");
		lbl7Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl7Punto.setBounds(60, 331, 123, 20);
		add(lbl7Punto);
		
		JLabel lbl8Punto = new JLabel("8 Puntos para:");
		lbl8Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl8Punto.setBounds(60, 372, 123, 20);
		add(lbl8Punto);
		
		JLabel lbl10Punto = new JLabel("10 Puntos para:");
		lbl10Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl10Punto.setBounds(60, 413, 123, 20);
		add(lbl10Punto);
		
		JLabel lbl12Punto = new JLabel("12 Puntos para:");
		lbl12Punto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbl12Punto.setBounds(60, 454, 123, 20);
		add(lbl12Punto);
		
		contruirModelCmb();
		
		cmb1Punto = new JComboBox<String>();
		cmb1Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb1Punto.setModel(model1Cmb);
		cmb1Punto.setBounds(243, 85, 315, 26);
		add(cmb1Punto);
		
		cmb2Punto = new JComboBox<String>();
		cmb2Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb2Punto.setModel(model2Cmb);
		cmb2Punto.setBounds(243, 126, 315, 26);
		add(cmb2Punto);
		
		cmb3Punto = new JComboBox<String>();
		cmb3Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb3Punto.setModel(model3Cmb);
		cmb3Punto.setBounds(243, 167, 315, 26);
		add(cmb3Punto);
		
		cmb4Punto = new JComboBox<String>();
		cmb4Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb4Punto.setModel(model4Cmb);
		cmb4Punto.setBounds(243, 208, 315, 26);
		add(cmb4Punto);
		
		cmb5Punto = new JComboBox<String>();
		cmb5Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb5Punto.setModel(model5Cmb);
		cmb5Punto.setBounds(243, 249, 315, 26);
		add(cmb5Punto);
		
		cmb6Punto = new JComboBox<String>();
		cmb6Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb6Punto.setModel(model6Cmb);
		cmb6Punto.setBounds(243, 290, 315, 26);
		add(cmb6Punto);
		
		cmb7Punto = new JComboBox<String>();
		cmb7Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb7Punto.setModel(model7Cmb);
		cmb7Punto.setBounds(243, 331, 315, 26);
		add(cmb7Punto);
		
		cmb8Punto = new JComboBox<String>();
		cmb8Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb8Punto.setModel(model8Cmb);
		cmb8Punto.setBounds(243, 372, 315, 26);
		add(cmb8Punto);
		
		cmb10Punto = new JComboBox<String>();
		cmb10Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb10Punto.setModel(model10Cmb);
		cmb10Punto.setBounds(243, 413, 315, 26);
		add(cmb10Punto);
		
		cmb12Punto = new JComboBox<String>();
		cmb12Punto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmb12Punto.setModel(model12Cmb);
		cmb12Punto.setBounds(243, 454, 315, 26);
		add(cmb12Punto);
		
		btnGuardarDatos = new JButton(BTN_GUARDAR);
		btnGuardarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardarDatos.setBounds(104, 519, 153, 29);
		add(btnGuardarDatos);
		
		btnLimpiarDatos = new JButton(BTN_LIMPIAR);
		btnLimpiarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpiarDatos.setBounds(361, 519, 153, 29);
		add(btnLimpiarDatos);
	}

	private void contruirModelCmb() {
		model1Cmb = new DefaultComboBoxModel<>();
		model2Cmb = new DefaultComboBoxModel<>();
		model3Cmb = new DefaultComboBoxModel<>();
		model4Cmb = new DefaultComboBoxModel<>();
		model5Cmb = new DefaultComboBoxModel<>();
		model6Cmb = new DefaultComboBoxModel<>();
		model7Cmb = new DefaultComboBoxModel<>();
		model8Cmb = new DefaultComboBoxModel<>();
		model10Cmb = new DefaultComboBoxModel<>();
		model12Cmb = new DefaultComboBoxModel<>();
	}
	
	public void rellenarComboPaises(ArrayList<String> listaReg) {
		model1Cmb.removeAllElements();
		model1Cmb.addAll(listaReg);
		
		model2Cmb.removeAllElements();
		model2Cmb.addAll(listaReg);
		
		model3Cmb.removeAllElements();
		model3Cmb.addAll(listaReg);
		
		model4Cmb.removeAllElements();
		model4Cmb.addAll(listaReg);
		
		model5Cmb.removeAllElements();
		model5Cmb.addAll(listaReg);
		
		model6Cmb.removeAllElements();
		model6Cmb.addAll(listaReg);
		
		model7Cmb.removeAllElements();
		model7Cmb.addAll(listaReg);
		
		model8Cmb.removeAllElements();
		model8Cmb.addAll(listaReg);
		
		model10Cmb.removeAllElements();
		model10Cmb.addAll(listaReg);
		
		model12Cmb.removeAllElements();
		model12Cmb.addAll(listaReg);
		
		model1Cmb.setSelectedItem("-");
		model2Cmb.setSelectedItem("-");
		model3Cmb.setSelectedItem("-");
		model4Cmb.setSelectedItem("-");
		model5Cmb.setSelectedItem("-");
		model6Cmb.setSelectedItem("-");
		model7Cmb.setSelectedItem("-");
		model8Cmb.setSelectedItem("-");
		model10Cmb.setSelectedItem("-");
		model12Cmb.setSelectedItem("-");
	}
	
	public TreeMap<Integer, String> recogerPuntos() {
		
		TreeMap<Integer, String> colOrd = new TreeMap<Integer, String>();
		
		if (campoVacio().isEmpty()) {
			
			colOrd.put(1, (String) cmb1Punto.getSelectedItem());
			colOrd.put(2, (String) cmb2Punto.getSelectedItem());
			colOrd.put(3, (String) cmb3Punto.getSelectedItem());
			colOrd.put(4, (String) cmb4Punto.getSelectedItem());
			colOrd.put(5, (String) cmb5Punto.getSelectedItem());
			colOrd.put(6, (String) cmb6Punto.getSelectedItem());
			colOrd.put(7, (String) cmb7Punto.getSelectedItem());
			colOrd.put(8, (String) cmb8Punto.getSelectedItem());
			colOrd.put(10, (String) cmb10Punto.getSelectedItem());
			colOrd.put(12, (String) cmb12Punto.getSelectedItem());
			
			if (!comprobarRepetidos(colOrd).isEmpty()) {
				mostrarError(comprobarRepetidos(colOrd));
				colOrd.clear();
			}
			
		} else {
			
			mostrarError(campoVacio());
			
		}
		
		return colOrd;
		
	}

	private String comprobarRepetidos(TreeMap<Integer, String> colOrd) {
		
		int[] contError = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		String error = "";
		
		for (Entry<Integer, String> pais : colOrd.entrySet()) {
			
			if (pais.getValue().equals(cmb1Punto.getSelectedItem())) {
				
				contError[0]++;
				
			} else if (pais.getValue().equals(cmb2Punto.getSelectedItem())) {
				
				contError[1]++;
				
			} else if (pais.getValue().equals(cmb3Punto.getSelectedItem())) {
				
				contError[2]++;
				
			} else if (pais.getValue().equals(cmb5Punto.getSelectedItem())) {
				
				contError[3]++;
				
			} else if (pais.getValue().equals(cmb5Punto.getSelectedItem())) {
				
				contError[4]++;
				
			} else if (pais.getValue().equals(cmb6Punto.getSelectedItem())) {
				
				contError[5]++;
				
			} else if (pais.getValue().equals(cmb7Punto.getSelectedItem())) {
				
				contError[6]++;
				
			} else if (pais.getValue().equals(cmb8Punto.getSelectedItem())) {
				
				contError[7]++;
				
			} else if (pais.getValue().equals(cmb10Punto.getSelectedItem())) {
				
				contError[8]++;
				
			} else if (pais.getValue().equals(cmb12Punto.getSelectedItem())) {
				
				contError[9]++;
				
			}
			
		}
		
		for (int i = 0; i < contError.length; i++) {
			if (contError[i] >= 2) {
				error = "No se pueden dar " + traducirPosicionPuntos(i) + " puntos a " + colOrd.get(traducirPosicionPuntos(i)) + " ya que ya se le han dado puntos";
				i = contError.length;
			}
		}
		
		return error;
	}

	private int traducirPosicionPuntos(int i) {
		int numeroPtos = 0;
		
		switch (i) {
		case 0:
			numeroPtos = 1;
			break;
			
		case 1:
			numeroPtos = 2;
			break;
		case 2:
			numeroPtos = 3;
			break;
		case 3:
			numeroPtos = 4;
			break;
		case 4:
			numeroPtos = 5;
			break;
		case 5:
			numeroPtos = 6;
			break;
		case 6:
			numeroPtos = 7;
			break;
		case 7:
			numeroPtos = 8;
			break;
		case 8:
			numeroPtos = 10;
			break;
		case 9:
			numeroPtos = 12;
			break;
		}
		
		return numeroPtos;
	}

	private String campoVacio() {
		
		String error = "";
		
		if (cmb1Punto.getSelectedIndex() == 0) {
			error = "No se ha asignado 1 Punto a ningún participante";
		} else if (cmb2Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 2 Puntos a ningún participante";
		} else if (cmb3Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 3 Puntos a ningún participante";
		} else if (cmb4Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 4 Puntos a ningún participante";
		} else if (cmb5Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 5 Puntos a ningún participante";
		} else if (cmb6Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 6 Puntos a ningún participante";
		} else if (cmb7Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 7 Puntos a ningún participante";
		} else if (cmb8Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 8 Puntos a ningún participante";
		} else if (cmb10Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 10 Puntos a ningún participante";
		} else if (cmb12Punto.getSelectedIndex() == 0) {
			error = "No se han asignado los 12 Puntos a ningún participante";
		}
		
		return error;
	}
	
	public void mostrarError(String error) {
		
		JOptionPane.showMessageDialog(this, error
				, "Atención", JOptionPane.WARNING_MESSAGE);
	}
	
	public void addControlador(EurovisionControlador e) {
		btnGuardarDatos.addActionListener(e);
		btnLimpiarDatos.addActionListener(e);
	}
	
	public void limpiarCampos() {
		cmb1Punto.setSelectedIndex(0);
		cmb2Punto.setSelectedIndex(0);
		cmb3Punto.setSelectedIndex(0);
		cmb4Punto.setSelectedIndex(0);
		cmb5Punto.setSelectedIndex(0);
		cmb6Punto.setSelectedIndex(0);
		cmb7Punto.setSelectedIndex(0);
		cmb8Punto.setSelectedIndex(0);
		cmb12Punto.setSelectedIndex(0);
		cmb10Punto.setSelectedIndex(0);
	}
	
}
