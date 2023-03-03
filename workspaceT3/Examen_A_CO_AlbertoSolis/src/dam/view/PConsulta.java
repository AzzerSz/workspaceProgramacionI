package dam.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import dam.db.persistencia.ParticipantesContract;
import dam.model.Participante;

public class PConsulta extends JPanel {
	
	private JTable tblPaises;
	private DefaultTableModel dtm;
	private JScrollPane scrpContenedor;
	
	public PConsulta() {
		
		setSize(VPrincipal.ANCHO - 15, VPrincipal.ALTO - 70);
		setLayout(null);
		
		JLabel lblTitulo = new JLabel("Consulta de Resultados");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTitulo.setBounds(56, 49, 253, 30);
		add(lblTitulo);
		
		JLabel lblListado = new JLabel("Listado de Pa\u00EDses");
		lblListado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblListado.setBounds(98, 102, 179, 18);
		add(lblListado);
		
		scrpContenedor = new JScrollPane();
		scrpContenedor.setBounds(98, 151, 480, 386);
		add(scrpContenedor);
		
		tblPaises = new JTable();
		scrpContenedor.setViewportView(tblPaises);
		
		configurarTabla();
	}
	
	private void configurarTabla() {
		
		tblPaises = new JTable();
		tblPaises.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpContenedor.setViewportView(tblPaises);
		
		dtm = new DefaultTableModel() { public boolean isCellEditable(int row, int column) {
			return false;}};
		
		dtm.addColumn("POS.");
		dtm.addColumn(ParticipantesContract.COL_CANCION);
		dtm.addColumn(ParticipantesContract.COL_INTERPRETE);
		dtm.addColumn(ParticipantesContract.COL_PAIS);
		dtm.addColumn("PTOS");
		
		tblPaises.setModel(dtm);
		
		tblPaises.getColumn("POS.").setPreferredWidth(10);
		tblPaises.getColumn(ParticipantesContract.COL_CANCION).setPreferredWidth(50);
		tblPaises.getColumn(ParticipantesContract.COL_INTERPRETE).setPreferredWidth(40);
		tblPaises.getColumn(ParticipantesContract.COL_PAIS).setPreferredWidth(30);
		tblPaises.getColumn("PTOS").setPreferredWidth(10);
		
	}
	
	public void rellenarTabla(ArrayList<Participante> coleccion) {
		
		dtm.setRowCount(0);
		int cont = 0;
		
		Object[]fila = new Object[5];
		for (Participante par : coleccion) {
			cont = cont + 1;
			fila[0] = cont;
			fila[1] = par.getCancion();
			fila[2] = par.getInterprete();
			fila[3] = par.getPais();
			fila[4] = par.getPuntosTot();
			
			dtm.addRow(fila);
		} 
	}
}
