package dam.view;

import javax.swing.JPanel;



import dam.control.RecetasControl;
import dam.model.DatosRecetas;
import dam.model.Receta;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Iterator;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class PConsultaReceta extends JPanel {
	
	public static final String BTN_MOSTRAR_LIST = "Mostrar Lista";
	public static final String BTN_DESC = "Mostrar Descripci\u00F3n";
	
	private static final Object COLUMN_NOMBRE = "Nombre";
	private static final Object COLUMN_TIEMPO_EJEC = "Tiempo Ejec";
	private static final Object COLUMN_DIFICULTAD = "Dificultad";
	
	private JButton btnMostrar;
	private JTable tblRecetas;
	private DefaultTableModel dtm;
	private JButton btnDescrip;
	private JScrollPane scrollPane;
	private JTextArea txtDesc;
	
	public PConsultaReceta() {
		setLayout(null);
		
		btnMostrar = new JButton(BTN_MOSTRAR_LIST);
		btnMostrar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnMostrar.setBounds(150, 32, 149, 21);
		add(btnMostrar);
		
		JScrollPane scrpTabla = new JScrollPane();
		scrpTabla.setBounds(36, 68, 378, 105);
		add(scrpTabla);
		
		tblRecetas = new JTable();
		tblRecetas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		configurarTabla();
		scrpTabla.setViewportView(tblRecetas);
		
		btnDescrip = new JButton(BTN_DESC);
		btnDescrip.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnDescrip.setBounds(124, 193, 202, 21);
		add(btnDescrip);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 224, 387, 66);
		add(scrollPane);
		
		txtDesc = new JTextArea();
		txtDesc.setEditable(false);
		scrollPane.setViewportView(txtDesc);
	}

	private void configurarTabla() {
		dtm = new DefaultTableModel() { public boolean isCellEditable(int row, int column) {
			return false;}};
		
		dtm.addColumn(COLUMN_NOMBRE);
		dtm.addColumn(COLUMN_TIEMPO_EJEC);
		dtm.addColumn(COLUMN_DIFICULTAD);
		
		tblRecetas.setModel(dtm);
		
		tblRecetas.getColumn(COLUMN_NOMBRE).setPreferredWidth(100);
		tblRecetas.getColumn(COLUMN_TIEMPO_EJEC).setPreferredWidth(100);
		tblRecetas.getColumn(COLUMN_DIFICULTAD).setPreferredWidth(100);
		
	}
	
	public void vaciarTabla() {
		dtm.setRowCount(0);
	}
	
	public void rellenarTabla(DatosRecetas dr) {
		
		if (!dr.getRecetas().isEmpty()) {
			Object[] datos = new Object[3];
			
			for (Receta rc : dr.getRecetas()) {
				datos[0] = rc.getNombre();
				datos[1] = rc.getTiempoEjec();
				datos[2] = rc.getDificultad();
				
				dtm.addRow(datos);
			}
		} else {
			JOptionPane.showMessageDialog(this, "La lista de recetas está vacía"
					, "Atención", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void setControlador(RecetasControl e) {
		btnMostrar.addActionListener(e);
		btnDescrip.addActionListener(e);
	}
	
	public void setTxt (DatosRecetas dr) {
		if (tblRecetas.getSelectedColumn() != -1) {

			String nombre = dr.getRecetas().get(tblRecetas.getSelectedRow()).getNombre();
			
			for (Receta rc : dr.getRecetas()) {
				if (nombre.equals(rc.getNombre())) {
					txtDesc.setText(rc.getDescripcion());
				}
			}
		} else {
			JOptionPane.showMessageDialog(this, "No hay seleccionada ninguna fila"
					, "Atención", JOptionPane.WARNING_MESSAGE);
		}
	}
}
