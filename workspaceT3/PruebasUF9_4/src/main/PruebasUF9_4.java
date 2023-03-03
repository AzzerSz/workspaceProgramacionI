package main;

import java.awt.EventQueue;

import view.VPruebasComponentes;
public class PruebasUF9_4 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPruebasComponentes v = new VPruebasComponentes();
				
				v.hacerVisible();
			}
		});
	}

}
