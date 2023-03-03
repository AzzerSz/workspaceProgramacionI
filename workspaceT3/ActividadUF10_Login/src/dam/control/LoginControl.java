package dam.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import dam.db.persistencia.UsuariosPersistencia;
import dam.model.Usuario;
import dam.view.VLogin;
import dam.view.VPrincipal;

public class LoginControl implements ActionListener {

	private VLogin vlogin;
	private VPrincipal VPpal;
	private UsuariosPersistencia up;
	
	public LoginControl(VLogin vlogin, VPrincipal vPpal, UsuariosPersistencia up) {
		this.vlogin = vlogin;
		VPpal = vPpal;
		this.up = up;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getActionCommand().equals(VLogin.BTN_ACCEDER)) {
				Usuario user = vlogin.obtenerUsuario();
				
				if (user != null) {
					String pwd = up.consultarPasswordPorUsuario(user.getNomUser());
					
					if (pwd != null) {
						
						if (pwd.equals(user.getPwd())) {
							vlogin.dispose();
							VPpal.hacerVisible();
						} else {
							vlogin.mostrarError("La password introducida es incorrecta");
						}
						
					} else {
						vlogin.mostrarError("El usuario introducido no existe");
					}
				}
			}
		}

	}

}
