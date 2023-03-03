package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import dam.control.RestauranteControlador;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

public class VPrincipalRestaurante extends JFrame {
	
	public static final String MNTM_MODIFICACION = "Modificaci\u00F3n de restaurante";
	public static final String MNTM_REGISTRO = "Registro de restaurante";
	public static final String MNTM_CONSULTA = "Consulta de restaurantes";
	public static final String MNTM_SALIR = "Salir";
	
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	
	private JMenuItem mntmConsulta;
	private JMenuItem mntmRegistro;
	private JMenuItem mntmModificacion;
	private JMenuItem mntmSalir;
	private JScrollPane scrpContenedor;
	
	public VPrincipalRestaurante() {
		initComponents();
	}

	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("* * *  G U I A  M I C H E L I N  * * *");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento Restaurantes");
		menuBar.add(mnMantenimiento);
		
		mntmConsulta = new JMenuItem(MNTM_CONSULTA);
		mnMantenimiento.add(mntmConsulta);
		
		mntmRegistro = new JMenuItem(MNTM_REGISTRO);
		mnMantenimiento.add(mntmRegistro);
		
		mntmModificacion = new JMenuItem(MNTM_MODIFICACION);
		mnMantenimiento.add(mntmModificacion);
		
		mntmSalir = new JMenuItem(MNTM_SALIR);
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
	
	public void addControlador(RestauranteControlador e) {
		mntmConsulta.addActionListener(e);
		mntmModificacion.addActionListener(e);
		mntmRegistro.addActionListener(e);
		mntmSalir.addActionListener(e);
	}
	
	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}

}
