package dam.view;

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import dam.control.GestionVideojuegosControl;
import dam.model.FuenteDatos;
import dam.model.Videojuego;

import javax.swing.table.DefaultTableModel;

public class PConsultaVideojuegos extends JPanel {
	
	private static final Object COLUMN_TIT = "Título";
	private static final Object COLUMN_PLAT = "Plataforma";
	private static final Object COLUMN_COD = "Cod_Pegi";
	private static final Object COLUMN_PREST = "Prestado a";
	
	public static final String BTN_CONSULTAR = "Consultar Colecci\u00F3n";
	
	private DefaultTableModel dtm;
	private JButton btnConsultar;
	private JTable tblVideoJuegos;
	
	public PConsultaVideojuegos() {
		initComponents();
	}

	private void initComponents() {
		setLayout(null);
		
		setSize(VPGestorVideojuegos.RESTA_ANCHO, VPGestorVideojuegos.RESTA_ALTO);
		
		JLabel lblConsultarVideojuegos = new JLabel("Consultar videojuegos");
		lblConsultarVideojuegos.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblConsultarVideojuegos.setBounds(47, 42, 306, 30);
		add(lblConsultarVideojuegos);
		
		btnConsultar = new JButton(BTN_CONSULTAR);
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnConsultar.setBounds(287, 108, 211, 21);
		add(btnConsultar);
		
		JScrollPane scrpTabla = new JScrollPane();
		scrpTabla.setBounds(64, 168, 647, 311);
		add(scrpTabla);
		
		tblVideoJuegos = new JTable();
		configurarTablar();
		scrpTabla.setViewportView(tblVideoJuegos);
	}
	
	private void configurarTablar() {
		dtm = new DefaultTableModel() { public boolean isCellEditable(int row, int column) {
			return false;}};
		
		dtm.addColumn(COLUMN_TIT);
		dtm.addColumn(COLUMN_PLAT);
		dtm.addColumn(COLUMN_COD);
		dtm.addColumn(COLUMN_PREST);
		
		tblVideoJuegos.setModel(dtm);
		
		tblVideoJuegos.getColumn(COLUMN_TIT).setPreferredWidth(100);
		tblVideoJuegos.getColumn(COLUMN_PLAT).setPreferredWidth(50);
		tblVideoJuegos.getColumn(COLUMN_COD).setPreferredWidth(25);
		tblVideoJuegos.getColumn(COLUMN_PREST).setPreferredWidth(100);
		
		
	}

	public void setControlador(GestionVideojuegosControl e) {
		btnConsultar.addActionListener(e);
	}
	
	public void rellenarTabla(FuenteDatos fd) {
		
		if (!fd.getColeccion().isEmpty()) {
			Object[] datos = new Object[4];
			
			for (Videojuego vj : fd.getColeccion()) {
				datos[0] = vj.getTitulo();
				datos[1] = vj.getPlataforma();
				datos[2] = vj.getCodPegi();
				datos[3] = vj.getPrestado();
				
				dtm.addRow(datos);
			}
		}
		
	}
	
}
