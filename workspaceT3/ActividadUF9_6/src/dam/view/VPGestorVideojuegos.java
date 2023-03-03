package dam.view;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import dam.control.GestionVideojuegosControl;

public class VPGestorVideojuegos extends JFrame {
	
	public static final int RESTA_ANCHO = VPGestorVideojuegos.ANCHO - 15;
	public static final int RESTA_ALTO = VPGestorVideojuegos.ALTO - 70;
	
	public static final String MNTM_SALIR = "Salir";
	public static final String MNTM_CONSULTA = "Consultar videjuegos";
	public static final String MNTM_ADD = "A\u00F1adir videojuego";
	
	public static final int ANCHO = 800;
	public static final int ALTO = 600;
	private JScrollPane scrpContenedor;
	private JMenuItem mntmAddVideojuego;
	private JMenuItem mntmConsultarVideojuegos;
	private JMenuItem mntmSalir;

	public VPGestorVideojuegos() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Gestión de videojuegos");
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		scrpContenedor = new JScrollPane();
		getContentPane().add(scrpContenedor, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmAddVideojuego = new JMenuItem(MNTM_ADD);
		menuBar.add(mntmAddVideojuego);
		
		mntmConsultarVideojuegos = new JMenuItem(MNTM_CONSULTA);
		menuBar.add(mntmConsultarVideojuegos);
		
		mntmSalir = new JMenuItem(MNTM_SALIR);
		menuBar.add(mntmSalir);
		
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
	
	public void setControlador(GestionVideojuegosControl e) {
		mntmAddVideojuego.addActionListener(e);
		mntmConsultarVideojuegos.addActionListener(e);
		mntmSalir.addActionListener(e);
		
	}
	
	

}
