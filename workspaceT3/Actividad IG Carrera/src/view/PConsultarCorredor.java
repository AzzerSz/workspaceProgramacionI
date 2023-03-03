package view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JPanel;

import control.CorredorControl;
import model.Corredor;

import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;

public class PConsultarCorredor extends JPanel {
	
	public static final String RDBTN_TODOS = "Todos";
	public static final String RDBTN_MUJERES = "Mujeres";
	public static final String BTN_CONSULTAR = "Consultar Corredores";
	private static final String COLUMN_NOM = "NOMBRE";
	private static final String COLUMN_DORSAL = "DORSAL";
	private static final String COLUMN_SEXO = "SEXO";
	private static final String COLUMN_EDAD = "EDAD";
	private static final String COLUMN_MODAL = "MODALIDAD";
	public static final String RDBTN_HOMBRES = "Hombres";
	
	private JRadioButton rdbtnMujeres;
	private JRadioButton rdbtnHombres;
	private JRadioButton rdbtnTodos;
	private JTable tblCorredores;
	private DefaultTableModel dtm;
	private JButton btnConsultar;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	
	public PConsultarCorredor() {
		setFont(new Font("Tahoma", Font.BOLD, 14));
		init();		
	}

	private void init() {
		setLayout(null);
		setSize(VPCarrera.ANCHO - 15, VPCarrera.ALTO - 70);
		
		JLabel lblConsultar = new JLabel("Consultar Corredores");
		lblConsultar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblConsultar.setBounds(62, 41, 271, 34);
		add(lblConsultar);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSexo.setBounds(103, 125, 57, 22);
		add(lblSexo);
		
		rdbtnHombres = new JRadioButton(RDBTN_HOMBRES);
		buttonGroup.add(rdbtnHombres);
		rdbtnHombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnHombres.setBounds(166, 129, 81, 21);
		add(rdbtnHombres);
		
		rdbtnMujeres = new JRadioButton(RDBTN_MUJERES);
		buttonGroup.add(rdbtnMujeres);
		rdbtnMujeres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnMujeres.setBounds(252, 129, 75, 21);
		add(rdbtnMujeres);
		
		rdbtnTodos = new JRadioButton(RDBTN_TODOS);
		buttonGroup.add(rdbtnTodos);
		rdbtnTodos.setSelected(true);
		rdbtnTodos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnTodos.setBounds(329, 129, 81, 21);
		add(rdbtnTodos);
		
		btnConsultar = new JButton(BTN_CONSULTAR);
		btnConsultar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnConsultar.setBounds(472, 119, 246, 34);
		add(btnConsultar);
		
		
	}

	public void configurarTabla() {
		
		JScrollPane scrpContenedor = new JScrollPane();
		scrpContenedor.setBounds(62, 205, 657, 256);
		add(scrpContenedor);
		
		tblCorredores = new JTable();
		scrpContenedor.setViewportView(tblCorredores);
		
		dtm = new DefaultTableModel() {
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		};
		
		tblCorredores.setModel(dtm);
		
		dtm.addColumn(COLUMN_NOM);
		dtm.addColumn(COLUMN_DORSAL);
		dtm.addColumn(COLUMN_SEXO);
		dtm.addColumn(COLUMN_EDAD);
		dtm.addColumn(COLUMN_MODAL);
		
		tblCorredores.getColumn(COLUMN_NOM).setPreferredWidth(175); //TAMAÑO DE LA CERDA
		tblCorredores.getColumn(COLUMN_DORSAL).setPreferredWidth(50);
		tblCorredores.getColumn(COLUMN_SEXO).setPreferredWidth(50);
		tblCorredores.getColumn(COLUMN_EDAD).setPreferredWidth(50);
		tblCorredores.getColumn(COLUMN_MODAL).setPreferredWidth(150);
		
		
	}
	
	public void rellenarTabla(ArrayList<Corredor> coleccion) {
		dtm.setRowCount(0);
		Object[]fila = new Object[5];
		for (Corredor co : coleccion) {
			fila[0] = co.getNombre();
			fila[1] = co.getDorsal();
			fila[2] = co.getSexo();
			fila[3] = co.getEdad();
			fila[4] = co.getModalidad();
			
			dtm.addRow(fila);
		}
	}
	
	public void setControlador(CorredorControl c) {
		btnConsultar.addActionListener(c);
	}
	
	public void mostrarError(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}
	
	public String obtenerRadioButton() {
		
		String valueRdbtn = null;
		
		if (rdbtnHombres.isSelected()) {
			valueRdbtn = rdbtnHombres.getText();
		} else if (rdbtnMujeres.isSelected()) {
			valueRdbtn = rdbtnMujeres.getText();
		} else if (rdbtnTodos.isSelected()) {
			valueRdbtn = rdbtnTodos.getText();
		}
		
		return valueRdbtn;
	}

}
