package main;

import java.awt.EventQueue;

import control.CCEscuchador;
import view.VComprobarCapicua;

public class ComprobarCapicua {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VComprobarCapicua v = new VComprobarCapicua();
				
				CCEscuchador c = new CCEscuchador(v);
				
				v.setControlador(c);
				
				v.hacerVisible();
				
			}
		});

	}

}
