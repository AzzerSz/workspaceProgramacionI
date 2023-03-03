package dam.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

import dam.control.PilotoControlador;
import dam.db.persistencia.CorredoresContract;
import dam.model.Corredor;

import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;

public class VPConsultaPiloto extends JPanel {
	
	public static final String BTN_MODIFICAR = "Modificar Piloto";
	public static final String BTN_BORRAR = "Borrar";
	private JTable tblPilotos;
	private JScrollPane scrpTabla;
	private DefaultTableModel dtm;
	private JButton btnBorrar;
	private JButton btnModificar;

public VPConsultaPiloto() {
		
		initComponents();
	}

	private void initComponents() {
		setSize(VPrincipalPiloto.ANCHO - 15, VPrincipalPiloto.ALTO - 70);
		setLayout(null);
		
		btnModificar = new JButton(BTN_MODIFICAR);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnModificar.setBounds(72, 403, 203, 36);
		add(btnModificar);
		
		btnBorrar = new JButton(BTN_BORRAR);
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBorrar.setBounds(472, 403, 203, 36);
		add(btnBorrar);
		
		scrpTabla = new JScrollPane();
		scrpTabla.setBounds(72, 115, 607, 243);
		add(scrpTabla);
		
		JLabel lblLista = new JLabel("Lista Pilotos");
		lblLista.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblLista.setBounds(46, 71, 107, 15);
		add(lblLista);
		
		configurarTabla();
	}

	private void configurarTabla() {
		
		tblPilotos = new JTable();
		tblPilotos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrpTabla.setViewportView(tblPilotos);
		
		dtm = new DefaultTableModel() { public boolean isCellEditable(int row, int column) {
			return false;}};
		
		dtm.addColumn(CorredoresContract.COL_NUMERO);
		dtm.addColumn(CorredoresContract.COL_NOMBRE);
		dtm.addColumn(CorredoresContract.COL_NACIONALIDAD);
		dtm.addColumn(CorredoresContract.COL_EDAD);
		dtm.addColumn(CorredoresContract.COL_ESCUDERIA);
		
		tblPilotos.setModel(dtm);
		
		tblPilotos.getColumn(CorredoresContract.COL_NUMERO).setPreferredWidth(10);
		tblPilotos.getColumn(CorredoresContract.COL_NOMBRE).setPreferredWidth(50);
		tblPilotos.getColumn(CorredoresContract.COL_NACIONALIDAD).setPreferredWidth(40);
		tblPilotos.getColumn(CorredoresContract.COL_EDAD).setPreferredWidth(10);
		tblPilotos.getColumn(CorredoresContract.COL_ESCUDERIA).setPreferredWidth(40);
		
		
	}
	
	public void rellenarTabla(ArrayList<Corredor> coleccion) {
		
		dtm.setRowCount(0);
		
		Object[]fila = new Object[5];
		for (Corredor cor : coleccion) {
			fila[0] = cor.getNumero();
			fila[1] = cor.getNombre();
			fila[2] = cor.getNacionalidad();
			fila[3] = cor.getEdad();
			fila[4] = cor.getEscuderia();
			
			dtm.addRow(fila);
		} 
	}
	
	public void addControlador(PilotoControlador e) {
		btnModificar.addActionListener(e);
		btnBorrar.addActionListener(e);
	}
	
	public int getNumeroFila() {
		int numero = 0;
		
		if (tblPilotos.getSelectedRow() != -1) {
			numero = (int) tblPilotos.getModel().getValueAt(tblPilotos.getSelectedRow(), 0);
		} else {
			numero = -1;
		}
		return numero;
	}
	
}
