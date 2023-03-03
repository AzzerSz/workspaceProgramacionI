package dam.main;

import java.awt.EventQueue;

import dam.control.LoginControl;
import dam.db.persistencia.UsuariosPersistencia;
import dam.view.VLogin;
import dam.view.VPrincipal;

public class AdministrarUsuarios {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				VLogin vlogin = new VLogin();
				VPrincipal vPal = new VPrincipal();
				
				UsuariosPersistencia up = new UsuariosPersistencia();
				
				LoginControl control = new LoginControl(vlogin, vPal, up);
				
				vlogin.setControlador(control);
				
				vlogin.hacerVisible();
			}
		});

	}

}
