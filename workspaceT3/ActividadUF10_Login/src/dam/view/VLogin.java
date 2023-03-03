package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import dam.control.LoginControl;
import dam.model.Usuario;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class VLogin extends JFrame {
	
	private static final int ANCHO = 400;
	private static final int ALTO = 250;
	
	public static final String BTN_ACCEDER = "ACCEDER";
	
	private JTextField txtUsuario;
	private JButton btnAcceder;
	
	private String pwd;
	private JFormattedTextField txtPwd;

	public VLogin() {
		initComponents();
	}

	private void initComponents() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(35, 36, 87, 29);
		getContentPane().add(lblUsuario);
		
		JLabel lblPwd = new JLabel("Contrase\u00F1a:");
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPwd.setBounds(35, 75, 87, 29);
		getContentPane().add(lblPwd);
		
		txtUsuario = new JTextField();
		txtUsuario.setToolTipText("Introduce el usuario");
		txtUsuario.setBounds(113, 41, 234, 19);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnAcceder = new JButton(BTN_ACCEDER);
		btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAcceder.setBounds(35, 127, 109, 29);
		getContentPane().add(btnAcceder);
		
		txtPwd = new JFormattedTextField();
		txtPwd.setBounds(128, 82, 230, 19);
		getContentPane().add(txtPwd);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRegistrar.setBounds(252, 127, 109, 29);
		getContentPane().add(btnRegistrar);
		
		setSize(ANCHO, ALTO);
		centrarVentana();
	}
	
	private void centrarVentana() {
		setPreferredSize(new Dimension(ANCHO, ALTO)); 
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();               
		Dimension ventana = this.getPreferredSize();               
		setLocation((pantalla.width - ventana.width) / 2,  (pantalla.height - ventana.height) / 2);
	}
	
	public void setControlador(LoginControl e) {
		btnAcceder.addActionListener(e);
	}
	
	public void hacerVisible() {
		setVisible(true);
	}

	public Usuario obtenerUsuario() {
		Usuario user = null;
		
		if (!txtUsuario.getText().isEmpty()) {
			
			String nomUser = txtUsuario.getText().trim();
			
				pwd = txtPwd.getText();
				
				String error = validarPassword();
				
				if (!error.isEmpty()) {
					mostrarError(error);
				} else {
					user = new Usuario(nomUser, pwd);
				}
				
		} else {
			mostrarError("Debe introducir el nombre de usuario");
		}
		
		return user;
	}
	
		private String validarPassword() {
			String error = "";
			
			if (pwd.isEmpty()) {
				error = "Debe introducir la password";
			} else if (pwd.length() < 8 || pwd.length() > 20) {
				error = "La password debe contener entre 8 y 20 caracteres";
			} else if (!contieneMayus()) {
				error = "La password debe contener al menos una mayúscula";
			} else if (!contieneNum()) {
				error = "La password debe contener al menos un número";
			} else if (contieneCarEsp()) {
				error = "La password no puede contener caracteres especiales";
			}
			
			return error;
	}

		private boolean contieneCarEsp() {
			boolean contieneCE = false;
			String pwdMayus = pwd.toUpperCase();
			
			for (int i = 0; i < pwdMayus.length() && !contieneCE; i++) {
				if ((pwdMayus.codePointAt(i) < 65 || pwdMayus.codePointAt(i) > 90) 
						&& !Character.isDigit(pwdMayus.charAt(i))) {
					contieneCE = true;
				}
			}
			
			return contieneCE;
		}

	private boolean contieneNum() {
		boolean contiene = false;
		
		for (int i = 0; i < pwd.length() && !contiene; i++) {
			if (Character.isDigit(pwd.charAt(i))) {
				contiene = true;
			}
		}
		
		return contiene;
	}

	private boolean contieneMayus() {
		boolean contiene = false;
		
		for (int i = 0; i < pwd.length() && contiene == false; i++) {
			if (pwd.charAt(i) == pwd.toUpperCase().charAt(i)) {
				contiene = true;
			}
		}
		
		return contiene;
	}

	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error,"Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}
}
