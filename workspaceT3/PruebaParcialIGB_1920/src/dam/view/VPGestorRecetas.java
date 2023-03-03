package dam.view;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import dam.control.GestorRecetasControl;
import dam.model.Receta;

import java.awt.BorderLayout;

public class VPGestorRecetas extends JFrame {
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	public static final int PANEL_ANCHO = ANCHO - 15;
	public static final int PANEL_ALTO = ALTO - 70;
	
	public static final String MNTM_ADD = "Añadir Receta";
	public static final String MNTM_CONSULTA = "Consultar Recetas";
	public static final String MNTM_SALIR = "Salir";
	
	private JMenuItem mntmAddReceta;
	private JMenuItem mntmConsultarRecetas;
	private JMenuItem mntmSalir;
	private JScrollPane scrpContenedor;
	
	public VPGestorRecetas() {
		init();
	}

	private void init() {
		setTitle("Gestión de Recetas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		crearMenu();
		
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

	private void crearMenu() {
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmAddReceta = new JMenuItem(MNTM_ADD);
		menuBar.add(mntmAddReceta);
		
		mntmConsultarRecetas = new JMenuItem(MNTM_CONSULTA);
		menuBar.add(mntmConsultarRecetas);
		
		mntmSalir = new JMenuItem(MNTM_SALIR);
		menuBar.add(mntmSalir);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}
	
	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}

	public void setControlador(GestorRecetasControl c) {
		mntmAddReceta.addActionListener(c);
		mntmConsultarRecetas.addActionListener(c);
		mntmSalir.addActionListener(c);
	}

}
