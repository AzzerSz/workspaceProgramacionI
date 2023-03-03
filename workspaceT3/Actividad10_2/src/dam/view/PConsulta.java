package dam.view;

import javax.swing.JPanel;

import dam.control.RestauranteControlador;
import dam.db.persistencia.RestaurantesContract;
import dam.db.persistencia.RestaurantesPersistencia;
import dam.model.Restaurante;

import javax.swing.JLabel;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import java.awt.BorderLayout;

public class PConsulta extends JPanel {
	
	public static final String BTN_ELIMINAR = "Eliminar";

	public static final String PRECIO = "PRECIO";

	public static final String BTN_CONSULTAR = "Consultar";
	
	private JComboBox<String> cmbRegion;
	private JComboBox<String> cmbDistincion;
	private JButton btnConsultar;
	private JTable tblRestaurantes;
	private DefaultTableModel dtm;
	private JButton btnEliminar;
	private JScrollPane scrpContenedor;
	
	public PConsulta() {
		
		initComponents();
	}

	private void initComponents() {
		setSize(VPrincipalRestaurante.ANCHO - 15, VPrincipalRestaurante.ALTO - 70);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Consulta de restaurantes");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblTitulo.setBounds(33, 26, 334, 32);
		add(lblTitulo);
		
		JLabel lblFiltro = new JLabel("Filtro:");
		lblFiltro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFiltro.setBounds(67, 129, 83, 13);
		add(lblFiltro);
		
		JLabel lblRegion = new JLabel("Regi\u00F3n:");
		lblRegion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRegion.setBounds(108, 154, 65, 19);
		add(lblRegion);
		
		JLabel lblDistincion = new JLabel("Distinci\u00F3n:");
		lblDistincion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDistincion.setBounds(330, 154, 94, 19);
		add(lblDistincion);
		
		cmbDistincion = new JComboBox<String>();
		cmbDistincion.setModel(new DefaultComboBoxModel<String>(new String[] {"TODAS", "1 estrella", "2 estrellas", "3 estrellas"}));
		cmbDistincion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cmbDistincion.setBounds(424, 153, 117, 21);
		add(cmbDistincion);
		
		btnConsultar = new JButton(BTN_CONSULTAR);
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnConsultar.setBounds(433, 196, 108, 19);
		add(btnConsultar);
		
		btnEliminar = new JButton(BTN_ELIMINAR);
		btnEliminar.setVisible(false);
		btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEliminar.setBounds(592, 479, 108, 19);
		add(btnEliminar);
		
		scrpContenedor = new JScrollPane();
		scrpContenedor.setVisible(false);
		scrpContenedor.setBounds(67, 247, 633, 222);
		add(scrpContenedor);
		
		cmbRegion = new JComboBox<String>();
		cmbRegion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cmbRegion.setModel(new DefaultComboBoxModel<String>());
		cmbRegion.setBounds(180, 153, 117, 21);
		add(cmbRegion);
		
		configurarConsulta();
		
	}
	
	public void addControlador(RestauranteControlador e) {
		btnConsultar.addActionListener(e);
		btnEliminar.addActionListener(e);
	}
	
	public void mostrarOculto(boolean mostrar) {
		
		btnEliminar.setVisible(mostrar);
		scrpContenedor.setVisible(mostrar);
		
	}
	
	public void configurarConsulta() {
		
		tblRestaurantes = new JTable();
		tblRestaurantes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpContenedor.setViewportView(tblRestaurantes);
		
		dtm = new DefaultTableModel() { public boolean isCellEditable(int row, int column) {
			return false;}};
		
		dtm.addColumn(RestaurantesContract.COL_NOMBRE);
		dtm.addColumn(RestaurantesContract.COL_CIU);
		dtm.addColumn(RestaurantesContract.COL_DISTINCION);
		dtm.addColumn(RestaurantesContract.COL_COCINA);
		dtm.addColumn(PRECIO);
		
		tblRestaurantes.setModel(dtm);
		
		tblRestaurantes.getColumn(RestaurantesContract.COL_NOMBRE).setPreferredWidth(50);
		tblRestaurantes.getColumn(RestaurantesContract.COL_CIU).setPreferredWidth(50);
		tblRestaurantes.getColumn(RestaurantesContract.COL_DISTINCION).setPreferredWidth(5);
		tblRestaurantes.getColumn(RestaurantesContract.COL_COCINA).setPreferredWidth(20);
		tblRestaurantes.getColumn(PRECIO).setPreferredWidth(10);

	}
	
	public void rellenarTabla(ArrayList<Restaurante> coleccion) {
		
		dtm.setRowCount(0);
		
		String precio = "";
		
		Object[]fila = new Object[5];
		for (Restaurante res : coleccion) {
			fila[0] = res.getNombre();
			fila[1] = res.getCiudad();
			fila[2] = traducirDistincionEstrellas(res.getDistincion());
			fila[3] = res.getCocina();
			
			if (res.getPrecioMax() == 0.0) {
				precio = String.valueOf(res.getPrecioMin());
			} else {
				precio = String.valueOf(res.getPrecioMin() + " - " + res.getPrecioMax());
			}
			
			fila[4] = precio;
			
			dtm.addRow(fila);
		} 
	}

	private String traducirDistincionEstrellas(int distincion) {
		String estrellas = ""; 
		
		if (distincion == 1) {
			
			estrellas = "*";
			
		} else if (distincion == 2) {
			
			estrellas = "**";
			
		} else if (distincion == 3) {
			
			estrellas = "***";
			
		}
		
		return estrellas;
	}

	public void rellenarComboRegion(ArrayList<String> listaReg) {
		cmbRegion.removeAllItems();
		for (String reg : listaReg) {
			cmbRegion.addItem(reg);
		}
		
	}
	
	public String[] getRegionGetDist() {
		
		String[] regionDist = {devolverNumDist(), (String) cmbRegion.getSelectedItem()};
		
		return regionDist;
		
	}

	private String devolverNumDist() {
		
		String num = "";
		
		if (cmbDistincion.getSelectedIndex() == 0) {
			
			num = "0";
			
		} else if (cmbDistincion.getSelectedIndex() == 1) {
			
			num = "1";
			
		} else if (cmbDistincion.getSelectedIndex() == 2) {
			
			num = "2";
			
		} else if (cmbDistincion.getSelectedIndex() == 3) {
			
			num = "3";
			
		}
		
		return num;
	}
	
	public String getNombreFila() {
		String nombre = "";
		
		// TODO
		
		if (tblRestaurantes.getSelectedRow() != -1) {
			nombre = (String) tblRestaurantes.getModel().getValueAt(tblRestaurantes.getSelectedRow(), 0);
		} else {
			nombre = null;
		}
		return nombre;
	}
}
