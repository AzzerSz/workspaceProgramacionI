package view;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

import model.Alumno;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;
import javax.swing.JList;
import javax.swing.ListSelectionModel;

public class VPruebasComponentes extends JFrame {
	private JTextArea txtAPruebas;
	private JComboBox cmbPrueba;
	private JComboBox cmbAlumnos;
	private JButton btnNewButton;
	private JButton btnPrueba;
	private JCheckBox chckPrueba;
	private ButtonGroup sexo;
	private JRadioButton rbtnHombre;
	private JRadioButton rbtnMujer;
	private JRadioButton rbtnOtro;
	private JList<Alumno> lstAlumnos;
	public VPruebasComponentes() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Pruebas Componentes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnPrueba = new JButton("");
		btnPrueba.setIcon(new ImageIcon(VPruebasComponentes.class.getResource("/view/Gingerman-icon.png")));
		btnPrueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPrueba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPrueba.setBounds(4, 66, 57, 59);
		getContentPane().add(btnPrueba);
		
		JScrollPane scrpPrueba = new JScrollPane();
		scrpPrueba.setBounds(71, 54, 505, 83);
		getContentPane().add(scrpPrueba);
		
		txtAPruebas = new JTextArea();
		scrpPrueba.setViewportView(txtAPruebas);
		txtAPruebas.setLineWrap(true);
		
		cmbPrueba = new JComboBox();
		cmbPrueba.setModel(new DefaultComboBoxModel(new String[] {"Lunes", "Martes", "Mi\u00E9rcoles", "Jueves", "Viernes", "S\u00E1bado", "Domingo"}));
		cmbPrueba.setBounds(124, 174, 148, 21);
		getContentPane().add(cmbPrueba);
		
		cmbAlumnos = new JComboBox();
		DefaultComboBoxModel<Alumno> dcm = new DefaultComboBoxModel<Alumno>();
		dcm.addElement(new Alumno ("Iván", "Alos", 22));
		dcm.addElement(new Alumno ("Alberto", "Solís", 22));
		dcm.addElement(new Alumno ("Rodrigo", "Piñel", 22));
		dcm.addElement(new Alumno ("Luis", "Ramos", 22));
		dcm.addElement(new Alumno ("Alejandro", "Merino", 22));
		cmbAlumnos.setModel(dcm);
		cmbAlumnos.setBounds(368, 174, 132, 21);
		getContentPane().add(cmbAlumnos);
		
		btnNewButton = new JButton("Probar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccion = "Datos seleccionados: ";
				
				if(chckPrueba.isSelected()) {
					if (cmbPrueba.getSelectedIndex() != -1) {
						seleccion += "\n" + cmbPrueba.getSelectedItem();
					}
					if (cmbPrueba.getSelectedIndex() != -1) {
						seleccion += "\n" + ((Alumno) cmbAlumnos.getSelectedItem()).getApellido();
					} 
				} else {
					txtAPruebas.setText("");
					
					ArrayList<Alumno> listaSel = (ArrayList<Alumno>) lstAlumnos.getSelectedValuesList();
				}
				
				if(rbtnHombre.isSelected()) {
					seleccion += "\n" + rbtnHombre.getText();
				} else if (rbtnMujer.isSelected()) {
					seleccion += "\n" + rbtnMujer.getText();
				} else {
					seleccion += "\n" + rbtnOtro.getText();
				}
				
				txtAPruebas.setText(seleccion);
				
			}
		});
		btnNewButton.setBounds(261, 352, 85, 21);
		getContentPane().add(btnNewButton);
		
		chckPrueba = new JCheckBox("Aceptar Pruebas");
		chckPrueba.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckPrueba.setBounds(89, 232, 132, 21);
		getContentPane().add(chckPrueba);
		
		sexo = new ButtonGroup();
		
		rbtnHombre = new JRadioButton("Hombre");
		rbtnHombre.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent ev) {
				
				String texto = ((JRadioButton)ev.getSource()).getText(); 
				if (ev.getStateChange() == ItemEvent.DESELECTED)
					System.out.format("Botón %s deseleccionado.\n" + texto);  
				else if (ev.getStateChange() == ItemEvent.SELECTED)
					txtAPruebas.setText("Botón %s seleccionado.\n" + texto);
			}
			
		});
		sexo.add(rbtnHombre);
		rbtnHombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtnHombre.setBounds(89, 290, 103, 21);
		getContentPane().add(rbtnHombre);
		
		rbtnMujer = new JRadioButton("Mujer");
		sexo.add(rbtnMujer);
		rbtnMujer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtnMujer.setBounds(243, 290, 103, 21);
		getContentPane().add(rbtnMujer);
		
		rbtnOtro = new JRadioButton("Otro");
		sexo.add(rbtnOtro);
		rbtnOtro.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtnOtro.setBounds(348, 290, 85, 21);
		getContentPane().add(rbtnOtro);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(443, 205, 121, 129);
		getContentPane().add(scrollPane);
		
		lstAlumnos = new JList<Alumno>();
		
		DefaultListModel<Alumno> dlm = new DefaultListModel<Alumno>();
		dlm.addElement(new Alumno ("Iván", "Alos", 22));
		dlm.addElement(new Alumno ("Alberto", "Solís", 22));
		dlm.addElement(new Alumno ("Rodrigo", "Piñel", 22));
		dlm.addElement(new Alumno ("Luis", "Ramos", 22));
		dlm.addElement(new Alumno ("Alejandro", "Merino", 22));
		
		lstAlumnos.setModel(dlm);
		
		lstAlumnos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(lstAlumnos);
		
		setSize(600, 450);
		setLocationRelativeTo(null);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
}
