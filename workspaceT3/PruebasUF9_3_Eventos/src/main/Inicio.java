package main;

import control.Escuchador;
import view.VentanaPrincipal;

public class Inicio {

	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
			VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
			
			Escuchador controlador = new Escuchador(ventanaPrincipal);
			
			ventanaPrincipal.setListener(controlador);
			
			ventanaPrincipal.hacerVisible();

				}
			});

	

	}

}
