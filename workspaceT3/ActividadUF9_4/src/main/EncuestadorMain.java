package main;

import java.awt.EventQueue;

import control.EncuestadorControlador;
import model.ListaEncuestas;
import view.vEncuestador;

public class EncuestadorMain {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				vEncuestador v = new vEncuestador();
				ListaEncuestas list = new ListaEncuestas();
				
				EncuestadorControlador e = new EncuestadorControlador(v, list);
				
				v.setControlador(e);
				
				v.hacerVisible();
				
			}
		});

	}

}
