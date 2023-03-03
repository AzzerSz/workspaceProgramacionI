package main;

import java.awt.EventQueue;

import control.RE2Controlador;
import view.VResolverEc;

public class ResolverEcuacion {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VResolverEc v = new VResolverEc();
				
				RE2Controlador c = new RE2Controlador(v);
				
				v.setControlador(c);
				v.hacerVisible();
				
			}
		});

	}

}
