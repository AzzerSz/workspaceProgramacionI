package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import control.CorredorControl;

public class VPCarrera extends JFrame{
	
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	
	public static final String MNTM_ADD = "Añadir Corredor";
	public static final String MNTM_CONSULTA = "Consultar Corredores";
	public static final String MNTM_SALIR = "Salir";
	
	private JMenuItem mntmSalir;
	private JMenuItem mntmAdd;
	private JMenuItem mntmConsultar;
	private JScrollPane scrpContenedor;
	
	public VPCarrera() {
		init();
	}

	private void init() {
		setTitle("Gestor Corredores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
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
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmAdd = new JMenuItem(MNTM_ADD);
		menuBar.add(mntmAdd);
		
		mntmConsultar = new JMenuItem(MNTM_CONSULTA);
		menuBar.add(mntmConsultar);
		
		mntmSalir = new JMenuItem(MNTM_SALIR);
		menuBar.add(mntmSalir);
		
	}

	public void hacerVisible() {
		setVisible(true);
	}

	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}
	
	public void setControlador(CorredorControl c) {
		mntmAdd.addActionListener(c);
		mntmConsultar.addActionListener(c);
		mntmSalir.addActionListener(c);
	}

}
