package dam.view;

import java.awt.Dimension;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import dam.control.PruebasUF9_6Control;

import javax.swing.ListSelectionModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VPruebasUF9_6 extends JFrame {
	
	private static final int ALTO = 600;
	private static final int ANCHO = 800;
	public static final String MN_1 = "Menu 1";
	public static final String MN_2 = "Menu 2";
	public static final String OPC_11 = "Opcion 11";
	public static final String OPC_12 = "Opcion 12";
	public static final String OPC_13 = "Opcion 13";
	public static final String OPC_14 = "Opcion 14";
	private JMenuItem mnMenu2;
	private JMenuItem mntmOpcion14;
	private JMenuItem mntmOpcion13;
	private JMenuItem mntmOpcion12;
	private JMenuItem mntmOpcion11;
	private JScrollPane scrpContenedor;
	
	public VPruebasUF9_6() {
		initComponents();
	}

	private void initComponents() {
		setTitle("PruebasUF9_6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		scrpContenedor = new JScrollPane();
		scrpContenedor.setBounds(81, 48, 513, 195);
		getContentPane().add(scrpContenedor);
		
		setSize(ANCHO, ALTO);
		centrarVentana();
		
		crearMenu();
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

	private void crearMenu() {
		JMenuBar mnbPrueba = new JMenuBar();
		setJMenuBar(mnbPrueba);
		
		JMenu mnMenu1 = new JMenu(MN_1);
		mnbPrueba.add(mnMenu1);
		
		mntmOpcion11 = new JMenuItem(OPC_11);
		mnMenu1.add(mntmOpcion11);
		
		mntmOpcion12 = new JMenuItem(OPC_12);
		mnMenu1.add(mntmOpcion12);
		
		mntmOpcion13 = new JMenuItem(OPC_13);
		mnMenu1.add(mntmOpcion13);
		
		mntmOpcion14 = new JMenuItem(OPC_14);
		mnMenu1.add(mntmOpcion14);
		
		mnMenu2 = new JMenu(MN_2);
		mnbPrueba.add(mnMenu2);
	}
	
	public void setControlador(PruebasUF9_6Control c) {
		mnMenu2.addActionListener(c);
		mntmOpcion11.addActionListener(c);
		mntmOpcion12.addActionListener(c);
		mntmOpcion13.addActionListener(c);
		mntmOpcion14.addActionListener(c);
	}
	
}
