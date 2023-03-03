package dam.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import dam.control.LoginControl;
import dam.model.Usuario;

import javax.swing.JPasswordField;
import javax.swing.Icon;
import javax.swing.JButton;

public class VRegistro extends JFrame {
	private static final int ANCHO = 400;
	private static final int ALTO = 300;
	public static final String BTN_ACEPTAR = "Aceptar";
	public static final String BTN_CANCELAR = "Cancelar";
	
	private JTextField txtUsuario;
	private JPasswordField txtPwd;
	private JButton btnAceptar;
	private String pwd;
	private JButton btnCancelar;
	private JPasswordField txtPwdC;

	public VRegistro() {
		init();
	}

	private void init() {
		setTitle("Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(35, 35, 86, 20);
		getContentPane().add(lblUsuario);
		
		JLabel lblPwd = new JLabel("Password:");
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPwd.setBounds(35, 85, 86, 20);
		getContentPane().add(lblPwd);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtUsuario.setBounds(197, 35, 147, 22);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPwd = new JPasswordField();
		txtPwd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPwd.setToolTipText("Introduce la password");
		txtPwd.setBounds(197, 84, 147, 22);
		getContentPane().add(txtPwd);
		
		btnAceptar = new JButton(BTN_ACEPTAR);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBounds(54, 196, 111, 22);
		getContentPane().add(btnAceptar);
		
		btnCancelar = new JButton(BTN_CANCELAR);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCancelar.setBounds(219, 196, 111, 22);
		getContentPane().add(btnCancelar);
		
		JLabel lblPwdC = new JLabel("Confirmar Password:");
		lblPwdC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPwdC.setBounds(35, 132, 165, 20);
		getContentPane().add(lblPwdC);
		
		txtPwdC = new JPasswordField();
		txtPwdC.setToolTipText("Introduce la password");
		txtPwdC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPwdC.setBounds(197, 131, 147, 22);
		getContentPane().add(txtPwdC);
		
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

	public void setControlador(LoginControl control) {
		btnAceptar.addActionListener(control);
		btnCancelar.addActionListener(control);
		
	}
	
	public void limpiarDatos() {
		txtUsuario.setText("");
		txtPwd.setText("");
		txtPwdC.setText("");
	}

	public Usuario obtenerUsuario() {
		Usuario user = null;
		
		String nomUser = txtUsuario.getText().trim();
		
		if (nomUser.isEmpty()) {
			mostrarError("Debe introducir el nombre de usuario");
		} else {
			pwd = txtPwd.getText();
			
			String error = validarPassword();
			
			if (!error.isEmpty()) {
				mostrarError(error);
			} else {
				
				String pwdC = txtPwdC.getText();
				
				if (pwd.equals(pwdC)) {
					user = new Usuario(nomUser, pwd);
				} else {
					mostrarError("La password y la confirmación no coinciden");
				}
			}
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
		boolean contieneNum = false;
		
		for (int i = 0; i < pwd.length() && !contieneNum; i++) {
			if (Character.isDigit(pwd.charAt(i))) {
				contieneNum = true;
			}
		}
		
		return contieneNum;
	}

	private boolean contieneMayus() {
		boolean contieneMayus = false;
		String pwdMayus = pwd.toUpperCase();
		
		for (int i = 0; i < pwd.length() && !contieneMayus; i++) {
			if (pwd.charAt(i) == pwdMayus.charAt(i)) {
				contieneMayus = true;
			}
		}
		
		return contieneMayus;
	}

	public void mostrarError(String error) {
		JOptionPane.showMessageDialog(this, error, "Error de datos", JOptionPane.ERROR_MESSAGE);
		
	}

	public void mostrarInformacion(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje, "Información de operación", 
				JOptionPane.INFORMATION_MESSAGE);
		
	}
}
