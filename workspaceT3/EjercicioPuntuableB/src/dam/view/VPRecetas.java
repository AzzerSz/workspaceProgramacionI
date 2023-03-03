package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import dam.control.RecetasControl;

import java.awt.BorderLayout;

public class VPRecetas extends JFrame {
	
	public static final String MENU_SALIR = "Salir";
	public static final String MENU_CONSULTA = "Consultar Recetas";
	public static final String MENU_ANYADIR = "A\u00F1adir receta";
	
	private static final int ALTO = 400;
	private static final int ANCHO = 600;
	
	private JScrollPane scrpContenedor;
	private JMenuItem mntmAddReceta;
	private JMenuItem mntmConsultarRec;
	private JMenuItem mntmSalir;

	public VPRecetas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
	}

	private void initComponents() {
		setTitle("Gestion Recetas");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmAddReceta = new JMenuItem(MENU_ANYADIR);
		menuBar.add(mntmAddReceta);
		
		mntmConsultarRec = new JMenuItem(MENU_CONSULTA);
		menuBar.add(mntmConsultarRec);
		
		mntmSalir = new JMenuItem(MENU_SALIR);
		menuBar.add(mntmSalir);
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
		
	}

	public void hacerVisible() {
		setVisible(true);

	}
	
	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}
	
	public void setControlador(RecetasControl e) {
		mntmAddReceta.addActionListener(e);
		mntmConsultarRec.addActionListener(e);
		mntmSalir.addActionListener(e);
	}
}
