package main;

import control.CPIControlador;
import view.VComprobarParImpar;

public class ComprobarParImpar {

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater (new Runnable() {
			public void run() {
			    VComprobarParImpar v = new VComprobarParImpar();
			    
			    CPIControlador c = new CPIControlador(v);
			    
			    v.setControlador(c);
			    
			    v.hacerVisible();
			}
		});

	}

}
