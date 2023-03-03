package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dam.control.GestorRecetasControl;
import dam.model.Receta;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class PConsultaRecetas extends JPanel {
	public static final String BTN_CONSULTAR = "Consultar Recetas";
	public static final String BTN_VER = "Ver Descripción";

	private static final String COLUMN_NOM = "NOMBRE";
	private static final String COLUMN_TPO = "TIEMPO EJECUCIÓN";
	private static final String COLUMN_DIF = "DIFICULTAD";
	
	private JTable tblRecetas;
	private JButton btnConsultar;
	private DefaultTableModel dtm;
	private JTextArea txtaDescripcion;
	private JButton btnDescripcion;
	private JScrollPane scrpTabla;
	private JScrollPane scrpDescripcion;
	
	public PConsultaRecetas() {
		init();
	}

	private void init() {
		setLayout(null);
		
		setSize(VPGestorRecetas.PANEL_ANCHO, VPGestorRecetas.PANEL_ALTO);
		
		JLabel lblConsultarRecetas = new JLabel("Consultar Recetas");
		lblConsultarRecetas.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConsultarRecetas.setBounds(45, 45, 319, 29);
		add(lblConsultarRecetas);
		
		btnConsultar = new JButton(BTN_CONSULTAR);
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConsultar.setBounds(504, 50, 217, 25);
		add(btnConsultar);
		
		scrpTabla = new JScrollPane();
		scrpTabla.setBounds(64, 101, 657, 152);
		add(scrpTabla);
		
		tblRecetas = new JTable();
		tblRecetas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tblRecetas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrpTabla.setViewportView(tblRecetas);
		
		configurarTabla();
		
		btnDescripcion = new JButton(BTN_VER);
		btnDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDescripcion.setBounds(504, 280, 217, 25);
		add(btnDescripcion);
		
		scrpDescripcion = new JScrollPane();
		scrpDescripcion.setBounds(64, 335, 657, 117);
		add(scrpDescripcion);
		
		txtaDescripcion = new JTextArea();
		txtaDescripcion.setLineWrap(true);
		txtaDescripcion.setEditable(false);
		txtaDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		scrpDescripcion.setViewportView(txtaDescripcion);
		
		
		
	}
	
	private void configurarTabla() {
		dtm = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		dtm.addColumn(COLUMN_NOM);
		dtm.addColumn(COLUMN_TPO);
		dtm.addColumn(COLUMN_DIF);
		
		tblRecetas.setModel(dtm);
		
		tblRecetas.getColumn(COLUMN_NOM).setPreferredWidth(100);
		tblRecetas.getColumn(COLUMN_TPO).setPreferredWidth(100);
		tblRecetas.getColumn(COLUMN_DIF).setPreferredWidth(100);
		
	}
	
	public void rellenarTabla(ArrayList<Receta> lista) {
		dtm.setRowCount(0);
		// otra forma de vaciar la tabla
		// dtm.getDataVector().clear();
		
		Object[] fila = new Object[3];
		
		for (Receta r : lista) {
			fila[0] = r.getNombre();
			fila[1] = r.getTiempo() + " min";
			fila[2] = r.getDificultad();
			
			dtm.addRow(fila);
		}
	}

	public void setControlador(GestorRecetasControl c) {
		btnConsultar.addActionListener(c);
		btnDescripcion.addActionListener(c);
	}

	public int obtnerRecetaSel() {
		return tblRecetas.getSelectedRow();
	}
	
	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}

	public void mostrarDescripcion(String descripcion) {
		txtaDescripcion.setText(descripcion);
		
	}
	
	public void mostrarComponentesConsulta(boolean b) {
		scrpTabla.setVisible(b);
		btnDescripcion.setVisible(b);
		btnDescripcion.setEnabled(b);
		scrpDescripcion.setVisible(b);
		
		if (!b) {
			txtaDescripcion.setText("");
		}
	}
}
