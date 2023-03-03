package dam.view;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import dam.control.EurovisionControlador;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

public class VPrincipal extends JFrame {
	
	public static final String MNTM_SALIR = "Salir";
	public static final String MNTM_REGISTRO = "Registrar Resultado";
	public static final String MNTM_CONSULTA = "Consulta de Resultados";
	
	static final int ALTO = 650;
	static final int ANCHO = 650;
	
	private JMenuItem mntmConsulta;
	private JMenuItem mntmRegistro;
	private JMenuItem mntmSalir;
	private JScrollPane scrpContenedor;
	
	public VPrincipal() {
		init();
		
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("** RESULTADOS EUROVISI\u00D3N 22 **");
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mntmConsulta = new JMenuItem(MNTM_CONSULTA);
		menuBar.add(mntmConsulta);
		
		mntmRegistro = new JMenuItem(MNTM_REGISTRO);
		menuBar.add(mntmRegistro);
		
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
	
	public void hacerVisible () {
		setVisible(true);
	}
	
	public void addControlador(EurovisionControlador e) {
		mntmConsulta.addActionListener(e);
		mntmRegistro.addActionListener(e);
		mntmSalir.addActionListener(e);
	}
	
	public void mostrarPanel(JPanel panel) {
		scrpContenedor.setViewportView(panel);
	}

}
