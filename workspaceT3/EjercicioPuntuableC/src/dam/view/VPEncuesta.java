package dam.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import dam.control.ControlEncuesta;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JMenuBar;

public class VPEncuesta extends JFrame {
	
	public static final String MENU_SALIR = "Salir";
	public static final String MENU_CONSULTAR = "Consultar Encuesta";
	public static final String MENU_ANYADIR = "A\u00F1adir Encuesta";
	
	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	
	private JMenuItem mntmAnyadir;
	private JMenuItem mntmConsultar;
	private JMenuItem mntmSalir;
	private JScrollPane scrpContenedor;
	
	public VPEncuesta() {
		initComponents();
	}
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Censo Electoral");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmAnyadir = new JMenuItem(MENU_ANYADIR);
		menuBar.add(mntmAnyadir);
		
		mntmConsultar = new JMenuItem(MENU_CONSULTAR);
		menuBar.add(mntmConsultar);
		
		mntmSalir = new JMenuItem(MENU_SALIR);
		menuBar.add(mntmSalir);
		
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
		
		setSize(ANCHO, ALTO);
		centrarVentana();
	}
	
	private void centrarVentana() {
		setPreferredSize(new Dimension(ANCHO, ALTO)); 
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               
		Dimension ventana = this.getPreferredSize();               
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}
	
	public void setControlador(ControlEncuesta e) {
		mntmAnyadir.addActionListener(e);
		mntmConsultar.addActionListener(e);
		mntmSalir.addActionListener(e);
	}

}
