package dam.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import dam.control.PilotoControlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class VPrincipalPiloto extends JFrame {
	
	public static final String MNTM_SALIR = "Salir";
	public static final String MNTM_CONSULTA = "Consultar Pilotos";
	public static final String MNTM_REGISTRO = "Registrar Piloto";
	
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	
	private JScrollPane scrpContenedor;
	private JMenuItem mntmRegistro;
	private JMenuItem mntmConsulta;
	private JMenuItem mntmSalir;
	
	public VPrincipalPiloto() {
		
		initComponents();
	}

	private void initComponents() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GESTI\u00D3N DE PILOTOS");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmRegistro = new JMenuItem(MNTM_REGISTRO);
		menuBar.add(mntmRegistro);
		
		mntmConsulta = new JMenuItem(MNTM_CONSULTA);
		menuBar.add(mntmConsulta);
		
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
	
	public void addControlador(PilotoControlador e) {
		mntmConsulta.addActionListener(e);
		mntmRegistro.addActionListener(e);
		mntmSalir.addActionListener(e);
	}
	
	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}

}
