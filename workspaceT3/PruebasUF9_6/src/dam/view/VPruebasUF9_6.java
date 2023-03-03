package dam.view;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dam.control.PruebasUF9_6Control;
import dam.model.*;
import javax.swing.ListSelectionModel;
import javax.swing.Icon;
import javax.swing.JButton;

public class VPruebasUF9_6 extends JFrame {
	
	private static final int ALTO = 600;
	private static final int ANCHO = 800;
	
	private static final Object COLUMN_DNI = "DNI";
	private static final Object COLUMN_NOM = "NOMBRE";
	private static final Object COLUMN_APE = "APELLIDO";
	private static final Object COLUMN_EDAD = "EDAD";
	
	public static final String BTN_INFO = "Mostrar Info";
	public static final String BTN_ERROR = "Mostrar Error";
	public static final String BTN_WARNING = "Mostrar Warning";
	public static final String BTN_TEXTO = "Mostrar Texto";
	public static final String BTN_CONFIRM = "Mostrar Confirmación";
	
	private DefaultTableModel dtm;
	private JTable tblPrueba2;
	private JButton btnInfo;
	private JButton btnError;
	private JButton btnWarning;
	private JButton btnTexto;
	private JButton btnConfirmacion;
	
	public VPruebasUF9_6() {
		initComponents();
	}

	private void initComponents() {
		setTitle("PruebasUF9_6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JScrollPane scrpTabla = new JScrollPane();
		scrpTabla.setBounds(45, 43, 651, 157);
		getContentPane().add(scrpTabla);
		
		JTable tblPrueba = new JTable();
		tblPrueba.setModel(new DefaultTableModel(
			new Object[][] {
				{"12345678Z", "Pedro", "L\u00F3pez", 22},
				{"12345679X", "Alicia", "Santos", 28},
			},
			new String[] {
				"DNI", "NOMBRE", "APELLIDOS", "EDAD"
			}
		) {
			Class[] columnTypes = new Class[] {
				Object.class, Object.class, Object.class, Integer.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, true, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrpTabla.setViewportView(tblPrueba);
		
		JScrollPane scrpTabla2 = new JScrollPane();
		scrpTabla2.setBounds(45, 242, 651, 157);
		getContentPane().add(scrpTabla2);
		
		tblPrueba2 = new JTable();
		tblPrueba2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		configurarTabla();
		scrpTabla2.setViewportView(tblPrueba2);
		
		btnInfo = new JButton(BTN_INFO);
		btnInfo.setBounds(45, 442, 129, 21);
		getContentPane().add(btnInfo);
		
		btnError = new JButton(BTN_ERROR);
		btnError.setBounds(227, 442, 129, 21);
		getContentPane().add(btnError);
		
		btnWarning = new JButton(BTN_WARNING);
		btnWarning.setBounds(418, 442, 129, 21);
		getContentPane().add(btnWarning);
		
		btnTexto = new JButton(BTN_TEXTO);
		btnTexto.setBounds(594, 442, 129, 21);
		getContentPane().add(btnTexto);
		
		btnConfirmacion = new JButton(BTN_CONFIRM);
		btnConfirmacion.setBounds(312, 491, 147, 21);
		getContentPane().add(btnConfirmacion);
		
		setSize(ANCHO, ALTO);
		centrarVentana();
		hacerVisible();
	}

	private void configurarTabla() {
		dtm = new DefaultTableModel() {
			@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}};
		
		dtm.addColumn(COLUMN_DNI);
		dtm.addColumn(COLUMN_NOM);
		dtm.addColumn(COLUMN_APE);
		dtm.addColumn(COLUMN_EDAD);
		
		tblPrueba2.setModel(dtm);
		
		tblPrueba2.getColumn(COLUMN_DNI).setPreferredWidth(75);
		tblPrueba2.getColumn(COLUMN_NOM).setPreferredWidth(150);
		tblPrueba2.getColumn(COLUMN_APE).setPreferredWidth(150);
		tblPrueba2.getColumn(COLUMN_EDAD).setPreferredWidth(50);
		
		// rellenar la tabla
		
		DatosPersonas personas = new DatosPersonas();
		
		Object[] datos = new Object[4];
		
		for (Persona p : personas.getListaPersonas()) {
			datos[0] = p.getDni();
			datos[1] = p.getNombre();
			datos[2] = p.getApellido();
			datos[3] = p.getEdad();
			
			dtm.addRow(datos);
		}
	}

	public void hacerVisible() {
		setVisible(true);
		
	}

	private void centrarVentana() {
		setPreferredSize(new Dimension(ANCHO, ALTO)); 
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               
		Dimension ventana = this.getPreferredSize();               
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
	}
	
	public void setControlador(PruebasUF9_6Control c) {
		btnInfo.addActionListener(c);
		btnError.addActionListener(c);
		btnWarning.addActionListener(c);
		btnTexto.addActionListener(c);
		btnConfirmacion.addActionListener(c);
	}

	public void mostrarError() {
		JOptionPane.showMessageDialog(this, "Este es un mensaje de error"
				, "Error", JOptionPane.ERROR_MESSAGE);
		
	}
}
