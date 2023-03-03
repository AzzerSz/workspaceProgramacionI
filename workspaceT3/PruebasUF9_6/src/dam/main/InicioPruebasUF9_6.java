package dam.main;

import java.awt.EventQueue;

import dam.control.PruebasUF9_6Control;
import dam.view.VPruebasUF9_6;

public class InicioPruebasUF9_6 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				VPruebasUF9_6 v = new VPruebasUF9_6();
				
				PruebasUF9_6Control e = new PruebasUF9_6Control();
				
				v.setControlador(e);
				
				v.hacerVisible();
				
			}
		});

	}

}
